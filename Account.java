import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class PassBook {
    private String id;
    private String name, password;
    private String accNum, mobile;
    private String gmail, occuption, ifscCode;

    public PassBook() {
    }

    public PassBook(String id, String name, String password, String accNum, String mobile, String gmail,
            String occuption,
            String ifscCode) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.accNum = accNum;
        this.mobile = mobile;
        this.gmail = gmail;
        this.occuption = occuption;
        this.ifscCode = ifscCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAccnum() {
        return accNum;
    }

    public String getMobile() {
        return mobile;
    }

    public String getGmail() {
        return gmail;
    }

    public String getOccuption() {
        return occuption;
    }

    public String getIfscCode() {
        return ifscCode;
    }
}

class Transaction {
    private String description;
    private double amount;
    private Date timestamp;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return dateFormat.format(timestamp);
    }
}

class Customer {
    private String accountno;
    private String password;
    private String name;
    private String contact;
    private double balance;
    private boolean isBlocked;
    private List<Transaction> transactionHistory;
    private double loanBalance;

    public Customer(String accountno, String password, String name, String contact, double balance) {
        this.accountno = accountno;
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.balance = balance;
        this.isBlocked = false;
        this.transactionHistory = new ArrayList<>();
        this.loanBalance = 0;
    }

    public String getaccountno() {
        return accountno;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public void updateContact(String newContact) {
        this.contact = newContact;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction("Deposite", amount);
        }
    }

    public boolean withdraw(double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            balance -= amount;
            recordTransaction("Withdrawal", -amount);
            return true;
        }
        return false;
    }

    public void block() {
        isBlocked = true;
    }

    public void unblock() {
        isBlocked = false;
    }

    public void transferMoney(Customer recipient, double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
            recordTransaction("Transfer to " + recipient.getaccountno(), -amount);
            recipient.recordTransaction("Received from " + getaccountno(), amount);
        }
    }

    public void applyForLoan(double amount) {
        if (!isBlocked && amount > 0 && loanBalance == 0) {
            loanBalance += amount;
            System.out.println("Balance : " + balance);
            balance += amount;
            System.out.println("Loan Amount : " + balance);
            recordTransaction("Loan Received", amount);
        }
    }

    public void repayLoan(double amount) {
        if (!isBlocked && amount > 0 && loanBalance > 0) {
            loanBalance -= amount;
            balance -= amount;
            recordTransaction("Loan Repayment", -amount);
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println("Description: " + transaction.getDescription());
            System.out.println("Amount: " + transaction.getAmount());
            System.out.println("Timestamp: " + transaction.getTimestamp());
            System.out.println();
        }
    }

    private void recordTransaction(String description, double amount) {
        Transaction transaction = new Transaction(description, amount);
        transactionHistory.add(transaction);
    }

    public String toFileString() {
        return accountno + "," + password + "," + name + "," + contact + "," + balance + "," + isBlocked + ","
                + loanBalance;
    }
}

class CustomerManager {
    private static final int MAX_CUSTOMERS = 100;
    private Customer[] customers;
    private int customerCount;
    private static final String CUSTOMER_FILE = "customers.txt";

    public CustomerManager() {
        customers = new Customer[MAX_CUSTOMERS];
        customerCount = 0;
        loadCustomersFromFile();
    }

    private void loadCustomersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CUSTOMER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" , ");
                if (data.length == 7) {
                    Customer customer = new Customer(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
                    customer.block();
                    customer.applyForLoan(Double.parseDouble(data[6]));
                    customers[customerCount++] = customer;
                } else if (data.length == 6) {
                    Customer customer = new Customer(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
                    boolean isBlocked = Boolean.parseBoolean(data[5]);
                    customer.setBlocked(isBlocked);
                    customers[customerCount++] = customer;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createCustomer(String accountno, String password, String name, String contact, double balance) {
        if (customerCount < MAX_CUSTOMERS) {
            Customer newCustomer = new Customer(accountno, password, name, contact, balance);
            customers[customerCount++] = newCustomer;
            saveCustomersToFile();
        } else {
            System.out.println("Cannot create a new customer. Maximum limit is reached");
        }
    }

    public Customer[] getAllCustomers() {
        Customer[] allCustomers = new Customer[customerCount];
        System.arraycopy(customers, 0, allCustomers, 0, customerCount);
        return allCustomers;
    }

    private void saveCustomersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CUSTOMER_FILE))) {
            for (int i = 0; i < customerCount; i++) {
                writer.write(customers[i].toFileString());
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Customer getCustomerByaccountno(String accountnoToFind) {
        for (int i = 0; i <= customerCount; i++) {
            if (customers[i].getaccountno().equals(accountnoToFind)) {
                return customers[i];
            }
        }
        return null;
    }

    public void blockCustomer(String accountno) {
        for (int i = 0; i <= customerCount; i++) {
            if (customers[i].getaccountno().equals(accountno)) {
                customers[i].block();
                saveCustomersToFile();
                return;
            }
        }
    }

    public void unblockCustomer(String accountno) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getaccountno().equals(accountno)) {
                customers[i].unblock();
                saveCustomersToFile();
                return;
            }
        }
    }

    public boolean transferMoney(String senderaccountno, String recipientaccountno, double amount) {
        Customer sender = getCustomerByaccountno(senderaccountno);
        Customer recipient = getCustomerByaccountno(recipientaccountno);

        if (sender != null && recipient != null) {
            sender.transferMoney(recipient, amount);
            saveCustomersToFile();
            return true;
        }

        return false;
    }

    public void applyForLoan(String accountno, double amount) {
        Customer customer = getCustomerByaccountno(accountno);
        if (customer != null) {
            customer.applyForLoan(amount);

            saveCustomersToFile();
        }
    }

    public void repayLoan(String accountno, double amount) {
        Customer customer = getCustomerByaccountno(accountno);
        if (customer != null) {
            customer.repayLoan(amount);
            saveCustomersToFile();
        }
    }
}

class Admin {
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";

    private static final String ADMIN_accountno = "code";
    private static final String ADMIN_PASSWORD = "1234";

    public boolean login(String accountno, String password) {
        return ADMIN_accountno.equals(accountno) && ADMIN_PASSWORD.equals(password);
    }

    public void viewAllCustomerAccounts(CustomerManager customerManager) {

        Customer[] customers = customerManager.getAllCustomers();
        System.out.println("All Customer Accounts:");
        for (Customer customer : customers) {
            System.out.println("accountno: " + customer.getaccountno() + ", Name: " + customer.getName());
        }
    }

    public Customer viewCustomerAccount(CustomerManager customerManager, String accountno) {
        return customerManager.getCustomerByaccountno(accountno);
    }

    public void blockCustomerAccount(CustomerManager customerManager, String accountno) {
        customerManager.blockCustomer(accountno);
        System.out.println(RED + "\n\t\t\t\t\t\tCustomer account blocked successfully!" + RESET);
    }

    public void unblockCustomerAccount(CustomerManager customerManager, String accountno) {
        customerManager.unblockCustomer(accountno);
        System.out.println(GREEN + "\n\t\t\t\t\t\tCustomer account unblocked successfully!" + RESET);
    }

    public void createNewAccount(CustomerManager customerManager, String accountno, String password, String name,
            String contact, double balance) {
        customerManager.createCustomer(accountno, password, name, contact, balance);
        if (balance > 100) {
            System.out.println(BLUE + "\n\t\t\t\t\t\tNew customer account created successfully");
        } else {
            System.out.println(RED + "\n\t\t\t\t\t\tNew Customer Account Not Created ! " + RESET);
        }
    }
}

class Banking {
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String WHITE_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\033[0;37m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin();
        CustomerManager customerManager = new CustomerManager();
        System.out.println(YELLOW
                + "\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|WELCOME TO THE BANK|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + RESET);

        while (true) {
            try {
                System.out.println(GREEN + "\n\t\t\t\t\t\t\tPlease select an option:");
                System.out.println(WHITE + "\n\t\t\t\t\t\t\t1. Admin Login.");
                System.out.println(WHITE + "\t\t\t\t\t\t\t2. Customer login.");
                System.out.println(WHITE + "\t\t\t\t\t\t\t3. Exit.");
            } catch (Exception e) {
                System.out.println(RED + "Please Enter Valid Choice.1" + RESET);
            }
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print(WHITE + "Enter Admin UserName : ");
                    String adminaccountno = scanner.nextLine();
                    System.out.print(WHITE + "Enter Admin Login Password: ");
                    Console console = System.console();
                    char[] chars = console.readPassword();
                    String j = new String(chars);
                    String adminPassword = j;
                    System.out.print("****");

                    if (admin.login(adminaccountno, adminPassword)) {
                        adminMenu(admin, customerManager, scanner);
                    } else {
                        System.out.println(RED + "\n\t\t\t\t\t\tAdmin login failed. Please try again.");
                    }
                    break;

                case 2:
                    try {
                        System.out.print(WHITE + "Enter Customer Accountno: ");
                        String customeraccountno = scanner.nextLine();
                        System.out.print(WHITE + "Enter Customer Password: ");
                        Console console1 = System.console();
                        char[] c = console1.readPassword();
                        String s = new String(c);
                        String customerPassword = s;
                        System.out.print("****");

                        Customer customer = customerManager.getCustomerByaccountno(customeraccountno);

                        if (customer != null && customer.getPassword().equals(customerPassword)) {
                            customerMenu(customerManager, customer, scanner);
                        } else {
                            System.out.println(RED + "Customer login failed. Please try again.");
                        }
                    } catch (Exception e) {
                        System.out.println(RED + "\nAccount Not Found !." + RESET);
                    }
                    break;

                case 3:
                    System.out.println(YELLOW
                            + "\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|Thank you for using the Banking Application|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                            + RESET);

                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println(RED + "Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void adminMenu(Admin admin, CustomerManager customerManager, Scanner scanner) {
        while (true) {
            System.out.println(YELLOW
                    + "\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|ADMIN MENUE|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                    + RESET);

            System.out.println(WHITE
                    + "\n1. Create New Customer Account         2. View All Customer Accounts        3. View Customer Account Information");
            System.out.println(WHITE
                    + "\n4. Block Customer Account              5. UnBlock Customer Account          6.Exit Admin Menu");
            int adminChoice = scanner.nextInt();
            scanner.nextLine();

            switch (adminChoice) {
                case 1:
                    try {
                        System.out.print(WHITE + "\t\t\t\t\t\tEnter new customer's Accountno: ");
                        String newaccountno = scanner.nextLine();
                        System.out.print(WHITE + "\t\t\t\t\t\tEnter new customer's ID : ");
                        String newId = scanner.nextLine();
                        System.out.print(WHITE + "\t\t\t\t\t\tEnter new customer's Password: ");
                        String newPassword = scanner.nextLine();
                        System.out.print(WHITE + "\t\t\t\t\t\tEnter new customer's Name: ");
                        String newName = scanner.nextLine();
                        System.out.print(WHITE + "\t\t\t\t\t\tEnter new customer's Contact: ");
                        String newContact = scanner.nextLine();
                        System.out.print(WHITE + "\t\t\t\t\t\tEnter new customer's Gmail Id: ");
                        String newGmail = scanner.nextLine();
                        System.out.print(WHITE + "\t\t\t\t\t\tEnter new customer's Occuption: ");
                        String occuption = scanner.nextLine();
                        System.out.print(WHITE + "\t\t\t\t\t\tEnter new customer's IFSC Code: ");
                        String ifscCode = scanner.nextLine();

                        System.out.print(WHITE + "\t\t\t\t\t\tEnter balance for the new customer: ");
                        double initialBalance = scanner.nextDouble();
                        scanner.nextLine();
                        admin.createNewAccount(customerManager, newaccountno, newPassword, newName, newContact,
                                initialBalance);
                        if (initialBalance > 1000) {
                            System.out.println(" ");
                        } else {
                            System.out.println(RED + "\n\t\t\t\t\t\tPlease Enter Amount Greater than 1000rs" + RESET);
                        }

                        PassBook obj = new PassBook(newId, newName, newPassword, newaccountno, newContact,
                                newGmail, occuption, ifscCode);

                        System.out.println(YELLOW
                                + "\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                + RESET);

                        System.out.println(GREEN
                                + "\n\t\t\t\t\t\t  Your Account Succesfully Created\n\n\t\t\t\t\t\t  You Are New Customer Of Our Bank"
                                + RESET);
                        System.out.println(
                                "______________________________________________________________________________________________________________________________");
                        System.out.println(BLUE + "|\t\t\t\t\t\t\tBANK PASS BOOK" + RESET + "\t\t\t\t\t\t\t\t|");
                        System.out.println(
                                "|                                                                                                                             |");
                        System.out.println(
                                "|_____________________________________________________________________________________________________________________________|");
                        System.out.println("|\t\tName : " + obj.getName() + "\t\t\tCustomer Id : " + obj.getId()
                                + "\t\t\t\t\t\t\t   |");
                        System.out.println(
                                "|_____________________________________________________________________________________________________________________________|");
                        System.out.println("|\t\tPassword : " + obj.getPassword() + "\t\t\t\tAccount Num : "
                                + obj.getAccnum() + "\t\t\t\t\t\t   |");
                        System.out.println(
                                "|_____________________________________________________________________________________________________________________________|");
                        System.out.println("|\t\tMobile No. : " + obj.getMobile() + "\t\t\tgmail Id : " + obj.getGmail()
                                + "\t\t\t\t\t   |");
                        System.out.println(
                                "|_____________________________________________________________________________________________________________________________|");
                        System.out.println("|\t\tOccupation : " + obj.getOccuption() + "\t\t\tIfscCode : "
                                + obj.getIfscCode() + "\t\t\t\t\t\t      |");
                        System.out.println(
                                "|_____________________________________________________________________________________________________________________________|");
                        System.out.println(
                                "|\t\tAddress : Sanvid Nagar Bangali Chouraha,452015                                                                |");
                        System.out.println(
                                "|_____________________________________________________________________________________________________________________________|");
                        System.out.println(
                                "|\t\tFor Your Queries / Inquiry                                                                                    |");
                        System.out.println(
                                "|\t\tToll-Free Number Of Our Center : 1800220229, 18001031906                                                      |");
                        System.out.println(
                                "|_____________________________________________________________________________________________________________________________|");
                        System.out.println(YELLOW +
                                "\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                + RESET);

                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 2:
                    try {
                        admin.viewAllCustomerAccounts(customerManager);
                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 3:
                    try {
                        System.out.print(WHITE + "Enter the accountno of the account to view: ");
                        String accountnoToView = scanner.nextLine();
                        Customer accountToView = admin.viewCustomerAccount(customerManager, accountnoToView);
                        if (accountToView != null) {
                            System.out.println(YELLOW
                                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|ACCOUNT INFORMATION|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                    + RESET);
                            System.out.println(WHITE + "\n\t\t\t\t\t\t\tAccountno  ~ " + accountToView.getaccountno());
                            System.out.println(WHITE + "\t\t\t\t\t\t\tName        ~ " + accountToView.getName());
                            System.out.println(WHITE + "\t\t\t\t\t\t\tContact     ~ " + accountToView.getContact());
                            System.out.println(WHITE + "\t\t\t\t\t\t\tBalance     ~ " + accountToView.getBalance());

                        } else {
                            System.out.println(RED + "\t\tAccount not found." + RESET);
                        }
                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 4:
                    try {
                        System.out.print(WHITE + "\t\t\t\t\t\tEnter the accountno of the account to block: ");
                        String accountnoToBlock = scanner.nextLine();
                        admin.blockCustomerAccount(customerManager, accountnoToBlock);
                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 5:
                    try {
                        System.out.print(WHITE + "\t\t\t\t\t\tEnter the Accountno of the account to unblock: ");
                        String accountnoToUnblock = scanner.nextLine();
                        admin.unblockCustomerAccount(customerManager, accountnoToUnblock);
                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 6:
                    return;

                default:

                    System.out.println(RED + "\t\t\t\t\tInvalid choice. Please select a valid option.");
            }
        }
    }

    private static void customerMenu(CustomerManager customerManager, Customer customer, Scanner scanner) {
        while (true) {
            System.out.println(YELLOW
                    + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|CUSTOMER MENUE|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                    + RESET);
            System.out.println(WHITE + "\n\t\t\t\t\t\t\t\t1. Deposit Money");
            System.out.println(WHITE + "\t\t\t\t\t\t\t\t2. Withdraw Money");
            System.out.println(WHITE + "\t\t\t\t\t\t\t\t3. View Balance");
            System.out.println(WHITE + "\t\t\t\t\t\t\t\t4. View Transaction History");
            System.out.println(WHITE + "\t\t\t\t\t\t\t\t5. Transfer Money");
            System.out.println(WHITE + "\t\t\t\t\t\t\t\t6. Apply for Loan");
            System.out.println(WHITE + "\t\t\t\t\t\t\t\t7. Repay Loan");
            System.out.println(WHITE + "\t\t\t\t\t\t\t\t8. Exit Customer Menu");

            int customerChoice = scanner.nextInt();
            scanner.nextLine();

            switch (customerChoice) {

                case 1:
                    try {

                        if (customer.isBlocked()) {
                            System.out.println(RED + "your account is blocked" + RESET);
                        } else {
                            System.out.print("Enter the amount to deposit: ");
                            double depositAmount = scanner.nextDouble();
                            customer.deposit(depositAmount);
                            System.out.println(GREEN + "Deposit successful!" + RESET);
                        }
                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 2:
                    try {
                        if (customer.isBlocked()) {
                            System.out.println(RED + "your account is blocked" + RESET);
                        } else {
                            System.out.print("Enter the amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            scanner.nextLine();

                            if (customer.withdraw(withdrawAmount)) {
                                System.out.println(GREEN + "Withdrawal successful!" + RESET);
                            } else {
                                System.out.println(RED + "Withdrawal failed, Insufficient balance." + RESET);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 3:
                    try {
                        if (customer.isBlocked()) {
                            System.out.println(RED + "Your account is blocked." + RESET);
                        } else {
                            System.out.println(BLUE + "Your balance is : " + customer.getBalance() + RESET);
                        }
                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 4:

                    if (customer.isBlocked()) {
                        System.out.println(RED + "Your account is blocked." + RESET);
                    } else {
                        customer.printTransactionHistory();
                    }

                    break;

                case 5:
                    try {
                        if (customer.isBlocked()) {
                            System.out.println(RED + "Your account is blocked." + RESET);
                        } else {
                            System.out.print("Enter recipient accountno: ");
                            String recipientaccountno = scanner.nextLine();
                            System.out.print("Enter the amount to transfer: ");
                            double transferAmount = scanner.nextDouble();
                            scanner.nextLine();

                            boolean success = customerManager.transferMoney(customer.getaccountno(), recipientaccountno,
                                    transferAmount);
                            if (success) {
                                System.out.println(GREEN + "Transfer successful!" + RESET);
                            } else {
                                System.out.println(
                                        RED + "Transfer failed. Check recipient accountno or insufficient balance.");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 6:
                    try {
                        if (customer.isBlocked()) {
                            System.out.println(RED + "Your account is blocked." + RESET);
                        } else {
                            System.out.print("Enter the loan amount: ");
                            double loanAmount = scanner.nextDouble();
                            scanner.nextLine();
                            customerManager.applyForLoan(customer.getaccountno(), loanAmount);
                            System.out.println(GREEN + "Your loan Application is Approved" + RESET);
                        }
                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 7:
                    try {
                        if (customer.isBlocked()) {
                            System.out.println(RED + "Your account is blocked." + RESET);
                        } else {
                            System.out.print("Enter the loan repayment amount: ");
                            double repaymentAmount = scanner.nextDouble();
                            scanner.nextLine();
                            customerManager.repayLoan(customer.getaccountno(), repaymentAmount);
                            System.out.println(GREEN + "Loan repayment successful!" + RESET);
                        }
                    } catch (Exception e) {
                        System.out.println(RED + "Please Enter Correct Option." + RESET);
                    }
                    break;

                case 8:

                    return;

                default:
                    System.out.println(RED + "Invalid choice. Please select a valid option." + RESET);

            }
        }
    }
}