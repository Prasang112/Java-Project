import java.util.Scanner;
import java.text.DecimalFormat;

class Marksheet {
        static String red = "\u001B[31m";
        static String reset = "\u001B[37m";

        static void degree(String name, String date, String division) {
                System.out.printf(
                                "\t\t__________________________________________________________________________________\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf(" \t\t|\t\t      DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n\n\n");
                System.out.printf("\t\t\t\t\tBachelor Of Computer Application \n");
                System.out.printf("\n\t\t\t\tCertified that %-20s\n", name);
                System.out.printf("\t\t\tobtained the Degree of BACHELOR OF COMPUTER APPLICATION in this\n");
                System.out.printf("\t\t\tUniversity at the Examination held in %-8s and was placed in\n", date);
                System.out.printf("\t\t\tthe %-6s Division.\n\n\n\n", division);
                System.out.printf("\t\t\tDated : %-8s\t\t\t\tVice-Chancellor\n", date);
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf(
                                "\t\t|________________________________________________________________________________|\n");
        }

        static void tC(String sname, String fname, String mname, String roll_num, String entN, String status,
                        String date,
                        String syear, String fyear) {
                System.out.printf(
                                "\t\t__________________________________________________________________________________\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf(" \t\t|\t\t      DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)\t\t |\n");
                System.out.printf(" \t\t|\t\t\tA.B. Road,Indore - 452 017\t\t\t\t |\n");
                System.out.printf(" \t\t\t    web site : www.davvcollege.org. E-mail : contact@davvcollege.com\n \n");
                System.out.printf(" \t\t\tBook No. 32\t\t\t\t\tSerial No. A \n");
                System.out.printf(" \n\n\t\t\t\t\tCOLLEGE LEAVING CERTIFICATE \n");
                System.out.printf("\n\t\t\tCollege Roll no.%-8s\t\t\tDate:%-8s\n", roll_num, date);
                System.out.printf(
                                "\n\n\t\t\tIt is to Certify that Ku. / Shri : %-20s \n\t\t\tFather Name :  Shri %-20s\n\t\t\tMother's Name Smt. : %-20s\n",
                                sname, fname, mname);
                System.out.printf(" \n\t\t\tDevi Ahilya Vishwavidyalaya, Indore Entollment No. : %-9s\n", entN);
                System.out.printf(" \t\t\tWas a %-9s student of this college from year %-7s to year\n", status, syear);
                System.out.printf(" \t\t\t%-7s in class BCA 1st sem to 6th sem .\n", fyear);
                System.out.printf("\n \t\t\tHis/her result of last examination held in the year %-7s class \n", fyear);
                System.out.printf(" \t\t\tB.C.A Passed.His / Her Conduct and Character during the period of \n");
                System.out.printf(" \t\t\tstudy in this college known to the undersigned was GOOD Reason \n");
                System.out.printf(" \t\t\tfor leaving this college . \n");
                System.out.printf("\n\n\t\t|\t\t\t\t\t\tPrincipal Registrar\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf(
                                "\t\t|________________________________________________________________________________|\n");
        }

        static void migrationC(String sname, String roll_num, String entN, String status, String session, String date) {
                String sutR = "passed";
                System.out.printf(
                                "\t\t__________________________________________________________________________________\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t\t  DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)\t\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t\t\tMIGRATION CERTIFICATE - %s\t\t\t\t |\n", session);
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t Shri/ku./Shrimati %-20s Entrolment No. %-10s \t |\n", sname, entN);
                System.out.printf("\t\t|\t is informed that this University has no Objection to his/ her\t\t |\n");
                System.out.printf("\t\t|\t migrating to another University.He/ She has %-6s as a %-8s\t |\n", sutR,
                                status);
                System.out.printf("\t\t|\t student  at Bachelor of Computer Application  Examination.\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t University House\t\t\t\t\tsing\t\t |\n");
                System.out.printf("\t\t|\t Indore-452001\t\t\t\t\t\t\t\t |\n\t\t|\t Date:%-8s\t\t\t\t\t\t\t\t |\n",
                                date);
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
                System.out.printf(
                                "\t\t|________________________________________________________________________________|\n");
        }

        static void semesterResult(String subjects[], String sname, String fname, String roll_num, String course,
                        int sem,
                        int marks[], int atkt) {
                DecimalFormat df2 = new DecimalFormat("0.00");
                DecimalFormat df1 = new DecimalFormat("0.0");
                String entN = "DX2007333";
                String status1 = "Regular";
                String mname1 = "Punita Tiwari";
                System.out.printf(" \n\n\t\t\t\t      DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)\n");
                System.out.printf(" \t\t\t\t\t\t\tRESULT \n");
                System.out.printf(" \t\t\t\t\t  MAIN EXAMINATION  B.C.A Sem- %d \n", sem);
                System.out.printf(
                                "  __________________________________________________________________________________________________________________\n");
                System.out.printf("  |\t\t\t\t\t\t\t\t\t\t\t\t\t\t   |\n");
                System.out.printf("  |\tEnrollment No. : %-9s\t\t\t\t\t\tRoll No. : %-8s\t \t   |\n", entN, roll_num);
                System.out.printf("  |\tStudent Name : %-20s\t\t\t\t\tFather's Name : %-19s|\n", sname, fname);
                System.out.printf("  |\tMother's Name : %-20s\t\t\t\t\tStatus : %-8s   \t\t   |\n", mname1, status1);
                System.out.printf(
                                "  |________________________________________________________________________________________________________________|\n");
                System.out.printf(
                                "\n  __________________________________________________________________________________________________________________\n");
                System.out.printf("  |\t\t\t\t\t\t\t\t\t\t\t\t\t\t   |\n");
                System.out.println(
                                "  |\tSubject_Name\t\t         Type_Paper        MaxMarks      MinMarks         ObtMark\t   \t   |");
                System.out.println(
                                "  |----------------------------------------------------------------------------------------------------------------|");
                int total_marks = 0;
                for (int i = 0; i < 6; i++) {
                        if (marks[i] > 17) {
                                System.out.printf(
                                                "  |\t%-17s      \t\t    T\t\t  50             17             %02d\t\t\t   |\n",
                                                subjects[i], marks[i]);
                                System.out.println(
                                                "  |----------------------------------------------------------------------------------------------------------------|");
                                total_marks += marks[i];
                        } else {
                                String result = "ATKT";
                                System.out.printf(
                                                "  |\t%-17s      \t\t    T\t\t  50             17             %02d\t\t"
                                                                + red + result + reset
                                                                + " \t   |\n",
                                                subjects[i], marks[i]);
                                System.out.println(
                                                "  |----------------------------------------------------------------------------------------------------------------|");
                                total_marks += marks[i];
                        }
                }
                for (int i = 6; i < 8; i++) {
                        if (marks[i] > 9) {
                                System.out.printf(
                                                "  |\t%-9s      \t\t    P\t\t  25             08             %02d\t\t\t   |\n",
                                                subjects[i], marks[i]);
                                System.out.println(
                                                "  |----------------------------------------------------------------------------------------------------------------|");
                                total_marks += marks[i];
                        } else {
                                String result = "ATKT";
                                System.out.printf(
                                                "  |\t%-9s      \t\t    P\t\t  25             08             %02d\t\t"
                                                                + red + result + reset
                                                                + " \t   |\n",
                                                subjects[i], marks[i]);
                                System.out.println(
                                                "  |----------------------------------------------------------------------------------------------------------------|");
                                total_marks += marks[i];
                        }

                }
                System.out.printf(
                                "  |________________________________________________________________________________________________________________|\n");
                System.out.printf("  |\t\t\t\t\t\t\t\t\t\t\t\t\t\t   |\n");
                System.out.printf("  |\t\t\t\t\t\t\tMaximum Marks    350\t|    Marks Obtained    %d\t   |\n",
                                total_marks);
                System.out.printf(
                                "  |________________________________________________________________________________________________________________|\n");

                float percentege = (total_marks * 50) / (550);
                float sgpa = percentege / 10;
                System.out.println("\n\tTotal ATKT          : " + atkt);
                System.out.println("\tTotal marks         : " + total_marks);
                System.out.println("\tPercentage          : " + df2.format(percentege));
                System.out.println("\tSGPA                : " + df1.format(sgpa));
                System.out.println(
                                "\n======================================================================================================================================");
                System.out.println(
                                "======================================================================================================================================\n\n");
        }

        static int atktExam(String subjects[], boolean atkt[], int marks[], int count_atkt) {
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < atkt.length; i++) {
                        if (atkt[i]) {
                                if (i < 6) {
                                        System.out.print("\tEnter " + subjects[i] + " atkt marks out of 50 : ");
                                        marks[i] = sc.nextInt();
                                        System.out.println(
                                                        "--------------------------------------------------------- ");
                                        if (marks[i] < 0 || marks[i] > 50) {
                                                System.out.println("--Invalid marks--Please Re-Enter--");
                                                i--;
                                                continue;
                                        }
                                        if (marks[i] >= 17) {
                                                count_atkt--;
                                                atkt[i] = false;
                                        }
                                        if (marks[i] < 17)
                                                atkt[i] = true;
                                } else {
                                        System.out.print("\tEnter " + subjects[i] + " atkt marks out of 25 : ");
                                        marks[i] = sc.nextInt();
                                        System.out.println(
                                                        "--------------------------------------------------------- ");
                                        if (marks[i] < 0 || marks[i] > 25) {
                                                System.out.println("--Invalid marks--Please Re-Enter--");
                                                i--;
                                                continue;
                                        }
                                        if (marks[i] >= 9) {
                                                count_atkt--;
                                                atkt[i] = false;
                                        }
                                        if (marks[i] < 9)
                                                atkt[i] = true;
                                }
                        }
                }
                return count_atkt;
        }

        static int semesterExam(String subjects[], boolean atkt[], int marks[], int count_atkt) {
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < subjects.length; i++) {
                        if (i < 6) {
                                System.out.print("\tEnter " + subjects[i] + " marks out of 50 : ");
                                marks[i] = sc.nextInt();
                                System.out.println("--------------------------------------------------------- ");
                                if (marks[i] < 0 || marks[i] > 50) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                }
                                if (marks[i] < 17) {
                                        count_atkt++;
                                        atkt[i] = true;
                                } else {
                                        atkt[i] = false;
                                }
                        } else {
                                System.out.print("\tEnter " + subjects[i] + " marks out of 25 : ");
                                marks[i] = sc.nextInt();
                                System.out.println("--------------------------------------------------------- ");
                                if (marks[i] < 0 || marks[i] > 25) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                }
                                if (marks[i] < 9) {
                                        count_atkt++;
                                        atkt[i] = true;
                                } else {
                                        atkt[i] = false;
                                }
                        }
                }
                return count_atkt;
        }

        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.println(reset + "");
                String sem1subjects[] = { "Mathematics-1", "Statistic-1", "C-progamming", "P.C.Software",
                                "Digital Computer",
                                "English", "C-practicale", "PC-practicale" };
                String sem2subjects[] = { "Mathematics-2", "Statistic-2", "C++ programing", "Operating System",
                                "Intro Info System", "Hindi", "C++ practicale", "OS-practicale" };
                String sem3subjects[] = { "Discretc Maths", "Unix Operating", "OOP & C++", "Acc.& Financial",
                                "Data Structures", "Comm. Skill", "OPP(practicale)", "DS-practicale" };
                String sem4subjects[] = { "Conm", "Software Engineer", "DBMS", "JAVA",
                                "Env. Awareness", "Enterpreneurship", "Conm-practicae", "DBMS-practicale" };
                String sem5subjects[] = { "Linear Algebra", "Computer Networks", "Human values ", "Information Techn",
                                "Intr.To cloud com", "Data Science", "DS-practicale", "Cloud-practicale" };
                String sem6subjects[] = { "PHP", "Op Research", "Computer Graphics",
                                "Management", "Graphics & Multi", "Project", "OR-practicale",
                                "PHP-Practicale" };

                int sem1marks[] = new int[8];
                int sem2marks[] = new int[8];
                int sem3marks[] = new int[8];
                int sem4marks[] = new int[8];
                int sem5marks[] = new int[8];
                int sem6marks[] = new int[8];

                boolean sem1atkt[] = new boolean[8];
                boolean sem2atkt[] = new boolean[8];
                boolean sem3atkt[] = new boolean[8];
                boolean sem4atkt[] = new boolean[8];
                boolean sem5atkt[] = new boolean[8];
                boolean sem6atkt[] = new boolean[8];

                String sname = "Prasang Tiwari";
                String course = "BCA Sem-1";
                String fname = "Mahesh Tiwari";
                String mname = "Punita Tiwari";
                String roll_num = "33700119";
                String entN = "DX2007333";
                String status = "Regular";
                int count_sem1atkt, count_sem2atkt, count_sem3atkt, count_sem4atkt, count_sem5atkt, count_sem6atkt;
                do {
                        count_sem1atkt = 0;

                        System.out.println("\n\tEnter marks of 1st semester :\n ");
                        count_sem1atkt = semesterExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
                        System.out.println("\n\tYou have " + count_sem1atkt + " ATKT in 1st Semester");

                        int s = 1;
                        semesterResult(sem1subjects, sname, fname, roll_num, course, s, sem1marks, count_sem1atkt);

                        if (count_sem1atkt >= 3) {
                                System.out.println(
                                                "\n\t!!!Warning!!!\n\t*Year Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n");
                                continue;
                        } else {
                                System.out.println("\n\t---: Congrats You are Promoted to 2nd Semester Exam :---\n");

                                if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                        System.out.println("\n\tPlease Enter Semester 1st ATKT Marks : ");
                                        count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
                                }
                                do {
                                        count_sem2atkt = 0;

                                        System.out.println("\n\tEnter marks of 2nd semester : ");
                                        count_sem2atkt = semesterExam(sem2subjects, sem2atkt, sem2marks,
                                                        count_sem2atkt);

                                        System.out.println("\n\tYou have " + count_sem2atkt + " ATKT in 2nd Semester");
                                        System.out.println("\tAfter 2nd semester You have " + count_sem1atkt
                                                        + " ATKT in 1st Semester\n");
                                        s = 1;
                                        semesterResult(sem1subjects, sname, fname, roll_num, course, s, sem1marks,
                                                        count_sem1atkt);
                                        s = 2;
                                        semesterResult(sem2subjects, sname, fname, roll_num, course, s, sem2marks,
                                                        count_sem2atkt);
                                        if (count_sem1atkt + count_sem2atkt >= 4) {
                                                System.out.println(
                                                                "\n\t!!!Warning!!!\n\t*Year Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n");
                                                continue;
                                        } else {

                                                System.out.println(
                                                                "\n\t---: Congrats You are Promoted to 3rd Semester Exam :---\n");

                                                if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                                        System.out.println(
                                                                        "\n\tPlease Enter Semester 1st ATKT Marks : ");
                                                        count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks,
                                                                        count_sem1atkt);
                                                }

                                                if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                                        System.out.println(
                                                                        "\n\tPlease Enter 2nd Semester ATKT Marks : ");
                                                        count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks,
                                                                        count_sem2atkt);
                                                }

                                                do {
                                                        count_sem3atkt = 0;
                                                        System.out.println(
                                                                        "\n\tPlease enter the marks of 3rd semester main exam : ");
                                                        count_sem3atkt = semesterExam(sem3subjects, sem3atkt, sem3marks,
                                                                        count_sem3atkt);
                                                        System.out.println("\n\tYou have " + count_sem3atkt
                                                                        + " ATKT in 3rd Semester");
                                                        System.out.println(
                                                                        "\tAfter 3rd semester You have "
                                                                                        + count_sem1atkt
                                                                                        + " ATKT in 1st Semester");
                                                        System.out.println(
                                                                        "\tAfter 3rd semester You have "
                                                                                        + count_sem2atkt
                                                                                        + " ATKT in 2nd Semester\n");

                                                        s = 1;
                                                        semesterResult(sem1subjects, sname, fname, roll_num, course, s,
                                                                        sem1marks, count_sem1atkt);
                                                        s = 2;
                                                        semesterResult(sem2subjects, sname, fname, roll_num, course, s,
                                                                        sem2marks, count_sem2atkt);
                                                        s = 3;
                                                        semesterResult(sem3subjects, sname, fname, roll_num, course, s,
                                                                        sem3marks, count_sem3atkt);
                                                        if (count_sem1atkt + count_sem2atkt + count_sem3atkt >= 4) {
                                                                System.out.println(
                                                                                "\n\t!!!Warning!!!\n\t*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n");
                                                                continue;
                                                        } else {
                                                                System.out.println(
                                                                                "\n\t---: Congrats You are Promoted to 4th Semester Exam :---\n");

                                                                if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                                                        System.out.println(
                                                                                        "\tPlease Enter 1st Semester ATKT Marks : ");
                                                                        count_sem1atkt = atktExam(sem1subjects,
                                                                                        sem1atkt, sem1marks,
                                                                                        count_sem1atkt);
                                                                }

                                                                if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                                                        System.out.println(
                                                                                        "\n\tPlease Enter 2nd Semester ATKT Marks : ");
                                                                        count_sem2atkt = atktExam(sem2subjects,
                                                                                        sem2atkt, sem2marks,
                                                                                        count_sem2atkt);
                                                                }

                                                                if (count_sem3atkt > 0 && count_sem3atkt <= 2) {
                                                                        System.out.println(
                                                                                        "\n\tPlease Enter 3rd Semester ATKT Marks : ");
                                                                        count_sem3atkt = atktExam(sem3subjects,
                                                                                        sem3atkt, sem3marks,
                                                                                        count_sem3atkt);
                                                                }

                                                                do {
                                                                        count_sem4atkt = 0;
                                                                        System.out.println(
                                                                                        "\n\tEnter marks of 4th semester main exam : ");
                                                                        count_sem4atkt = semesterExam(sem4subjects,
                                                                                        sem4atkt, sem4marks,
                                                                                        count_sem4atkt);

                                                                        System.out.println("\n\tYou have "
                                                                                        + count_sem4atkt
                                                                                        + " ATKT in 4th Semester");
                                                                        System.out.println(
                                                                                        "\tAfter 4th semester You have "
                                                                                                        + count_sem1atkt
                                                                                                        + " ATKT in 1st Semester");
                                                                        System.out.println(
                                                                                        "\tAfter 4th semester You have "
                                                                                                        + count_sem2atkt
                                                                                                        + " ATKT in 2nd Semester");
                                                                        System.out.println(
                                                                                        "\tAfter 4th semester You have "
                                                                                                        + count_sem3atkt
                                                                                                        + " ATKT in 3rd Semester\n");
                                                                        s = 1;
                                                                        semesterResult(sem1subjects, sname, fname,
                                                                                        roll_num, course, s, sem1marks,
                                                                                        count_sem1atkt);
                                                                        s = 2;
                                                                        semesterResult(sem2subjects, sname, fname,
                                                                                        roll_num, course, s, sem2marks,
                                                                                        count_sem2atkt);
                                                                        s = 3;
                                                                        semesterResult(sem3subjects, sname, fname,
                                                                                        roll_num, course, s, sem3marks,
                                                                                        count_sem3atkt);
                                                                        s = 4;
                                                                        semesterResult(sem4subjects, sname, fname,
                                                                                        roll_num, course, s, sem4marks,
                                                                                        count_sem4atkt);
                                                                        if (count_sem1atkt + count_sem2atkt
                                                                                        + count_sem3atkt
                                                                                        + count_sem4atkt >= 4) {
                                                                                System.out.println(
                                                                                                "\n\t!!!Warning!!!\n\t*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n");
                                                                                continue;
                                                                        } else {

                                                                                System.out
                                                                                                .println("\t---: Congrats You are prumoted for 5th Semester Exam :---");

                                                                                if (count_sem1atkt > 0
                                                                                                && count_sem1atkt <= 2) {
                                                                                        System.out.println(
                                                                                                        "\tPlease Enter 1st Semester ATKT Marks : ");
                                                                                        count_sem1atkt = atktExam(
                                                                                                        sem1subjects,
                                                                                                        sem1atkt,
                                                                                                        sem1marks,
                                                                                                        count_sem1atkt);
                                                                                }

                                                                                if (count_sem2atkt > 0
                                                                                                && count_sem2atkt <= 2) {
                                                                                        System.out.println(
                                                                                                        "\n\tPlease Enter 2nd Semester ATKT Marks : ");
                                                                                        count_sem2atkt = atktExam(
                                                                                                        sem2subjects,
                                                                                                        sem2atkt,
                                                                                                        sem2marks,
                                                                                                        count_sem2atkt);
                                                                                }

                                                                                if (count_sem3atkt > 0
                                                                                                && count_sem3atkt <= 2) {
                                                                                        System.out.println(
                                                                                                        "\n\tPlease Enter 3rd Semester ATKT Marks : ");
                                                                                        count_sem3atkt = atktExam(
                                                                                                        sem3subjects,
                                                                                                        sem3atkt,
                                                                                                        sem3marks,
                                                                                                        count_sem3atkt);
                                                                                }

                                                                                if (count_sem4atkt > 0
                                                                                                && count_sem4atkt <= 2) {
                                                                                        System.out.println(
                                                                                                        "\n\tPlease Enter 4th Semester ATKT Marks : ");
                                                                                        count_sem4atkt = atktExam(
                                                                                                        sem4subjects,
                                                                                                        sem4atkt,
                                                                                                        sem4marks,
                                                                                                        count_sem4atkt);
                                                                                }

                                                                                do {
                                                                                        count_sem5atkt = 0;
                                                                                        System.out
                                                                                                        .println("\n\tPlease enter the marks of 5th semester main exam : ");
                                                                                        count_sem5atkt = semesterExam(
                                                                                                        sem5subjects,
                                                                                                        sem5atkt,
                                                                                                        sem5marks,
                                                                                                        count_sem5atkt);

                                                                                        System.out.println(
                                                                                                        "\n\tYou have " + count_sem5atkt
                                                                                                                        + " ATKT in 5th Semester");
                                                                                        System.out.println(
                                                                                                        "\tAfter 5th semester You have "
                                                                                                                        + count_sem1atkt
                                                                                                                        + " ATKT in 1st Semester");
                                                                                        System.out.println(
                                                                                                        "\tAfter 5th semester You have "
                                                                                                                        + count_sem2atkt
                                                                                                                        + " ATKT in 2nd Semester");
                                                                                        System.out.println(
                                                                                                        "\tAfter 5th semester You have "
                                                                                                                        + count_sem3atkt
                                                                                                                        + " ATKT in 3rd Semester");
                                                                                        System.out.println(
                                                                                                        "\tAfter 5th semester You have "
                                                                                                                        + count_sem4atkt
                                                                                                                        + " ATKT in 4th Semester\n");

                                                                                        s = 1;
                                                                                        semesterResult(sem1subjects,
                                                                                                        sname, fname,
                                                                                                        roll_num,
                                                                                                        course, s,
                                                                                                        sem1marks,
                                                                                                        count_sem1atkt);
                                                                                        s = 2;
                                                                                        semesterResult(sem2subjects,
                                                                                                        sname, fname,
                                                                                                        roll_num,
                                                                                                        course, s,
                                                                                                        sem2marks,
                                                                                                        count_sem2atkt);
                                                                                        s = 3;
                                                                                        semesterResult(sem3subjects,
                                                                                                        sname, fname,
                                                                                                        roll_num,
                                                                                                        course, s,
                                                                                                        sem3marks,
                                                                                                        count_sem3atkt);
                                                                                        s = 4;
                                                                                        semesterResult(sem4subjects,
                                                                                                        sname, fname,
                                                                                                        roll_num,
                                                                                                        course, s,
                                                                                                        sem4marks,
                                                                                                        count_sem4atkt);
                                                                                        s = 5;
                                                                                        semesterResult(sem5subjects,
                                                                                                        sname, fname,
                                                                                                        roll_num,
                                                                                                        course, s,
                                                                                                        sem5marks,
                                                                                                        count_sem5atkt);
                                                                                        if (count_sem1atkt
                                                                                                        + count_sem2atkt
                                                                                                        + count_sem3atkt
                                                                                                        + count_sem4atkt
                                                                                                        + count_sem5atkt >= 4) {
                                                                                                System.out.println(
                                                                                                                "\n\t!!!Warning!!!\n*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n");
                                                                                                continue;
                                                                                        } else {
                                                                                                System.out.println(
                                                                                                                "\n\t---: Congrats You are Promoted to 6th Semester Exam :---\n");

                                                                                                if (count_sem1atkt > 0
                                                                                                                && count_sem1atkt <= 2) {
                                                                                                        System.out.println(
                                                                                                                        "\tPlease Enter 1st Semester ATKT Marks : ");
                                                                                                        count_sem1atkt = atktExam(
                                                                                                                        sem1subjects,
                                                                                                                        sem1atkt,
                                                                                                                        sem1marks,
                                                                                                                        count_sem1atkt);
                                                                                                }

                                                                                                if (count_sem2atkt > 0
                                                                                                                && count_sem2atkt <= 2) {
                                                                                                        System.out.println(
                                                                                                                        "\n\tPlease Enter 2nd Semester ATKT Marks : ");
                                                                                                        count_sem2atkt = atktExam(
                                                                                                                        sem2subjects,
                                                                                                                        sem2atkt,
                                                                                                                        sem2marks,
                                                                                                                        count_sem2atkt);
                                                                                                }

                                                                                                if (count_sem3atkt > 0
                                                                                                                && count_sem3atkt <= 2) {
                                                                                                        System.out.println(
                                                                                                                        "\n\tPlease Enter 3rd Semester ATKT Marks : ");
                                                                                                        count_sem3atkt = atktExam(
                                                                                                                        sem3subjects,
                                                                                                                        sem3atkt,
                                                                                                                        sem3marks,
                                                                                                                        count_sem3atkt);
                                                                                                }

                                                                                                if (count_sem4atkt > 0
                                                                                                                && count_sem4atkt <= 2) {
                                                                                                        System.out.println(
                                                                                                                        "\n\tPlease Enter 4th Semester ATKT Marks : ");
                                                                                                        count_sem4atkt = atktExam(
                                                                                                                        sem4subjects,
                                                                                                                        sem4atkt,
                                                                                                                        sem4marks,
                                                                                                                        count_sem4atkt);
                                                                                                }

                                                                                                if (count_sem5atkt > 0
                                                                                                                && count_sem5atkt <= 2) {
                                                                                                        System.out.println(
                                                                                                                        "\n\tPlease Enter 5th Semester ATKT Marks : ");
                                                                                                        count_sem5atkt = atktExam(
                                                                                                                        sem5subjects,
                                                                                                                        sem5atkt,
                                                                                                                        sem5marks,
                                                                                                                        count_sem5atkt);
                                                                                                }

                                                                                                do {
                                                                                                        count_sem6atkt = 0;
                                                                                                        System.out.println(
                                                                                                                        "\n\tEnter marks of 6th semester main exam : ");
                                                                                                        count_sem6atkt = semesterExam(
                                                                                                                        sem6subjects,
                                                                                                                        sem6atkt,
                                                                                                                        sem6marks,
                                                                                                                        count_sem6atkt);

                                                                                                        System.out.println(
                                                                                                                        "\n\tYou have " + count_sem6atkt
                                                                                                                                        + " ATKT in 6th Semester");
                                                                                                        System.out.println(
                                                                                                                        "\tAfter 6th semester You have "
                                                                                                                                        + count_sem1atkt
                                                                                                                                        + " ATKT in 1st Semester");
                                                                                                        System.out.println(
                                                                                                                        "\tAfter 6th semester You have "
                                                                                                                                        + count_sem2atkt
                                                                                                                                        + " ATKT in 2nd Semester");
                                                                                                        System.out.println(
                                                                                                                        "\tAfter 6th semester You have "
                                                                                                                                        + count_sem3atkt
                                                                                                                                        + " ATKT in 3rd Semester");
                                                                                                        System.out.println(
                                                                                                                        "\tAfter 6th semester You have "
                                                                                                                                        + count_sem4atkt
                                                                                                                                        + " ATKT in 4th Semester");
                                                                                                        System.out.println(
                                                                                                                        "\tAfter 6th semester You have "
                                                                                                                                        + count_sem5atkt
                                                                                                                                        + " ATKT in 5th Semester\n");
                                                                                                        s = 1;
                                                                                                        semesterResult(sem1subjects,
                                                                                                                        sname,
                                                                                                                        fname,
                                                                                                                        roll_num,
                                                                                                                        course,
                                                                                                                        s,
                                                                                                                        sem1marks,
                                                                                                                        count_sem1atkt);
                                                                                                        s = 2;
                                                                                                        semesterResult(sem2subjects,
                                                                                                                        sname,
                                                                                                                        fname,
                                                                                                                        roll_num,
                                                                                                                        course,
                                                                                                                        s,
                                                                                                                        sem2marks,
                                                                                                                        count_sem2atkt);
                                                                                                        s = 3;
                                                                                                        semesterResult(sem3subjects,
                                                                                                                        sname,
                                                                                                                        fname,
                                                                                                                        roll_num,
                                                                                                                        course,
                                                                                                                        s,
                                                                                                                        sem3marks,
                                                                                                                        count_sem3atkt);
                                                                                                        s = 4;
                                                                                                        semesterResult(sem4subjects,
                                                                                                                        sname,
                                                                                                                        fname,
                                                                                                                        roll_num,
                                                                                                                        course,
                                                                                                                        s,
                                                                                                                        sem4marks,
                                                                                                                        count_sem4atkt);
                                                                                                        s = 5;
                                                                                                        semesterResult(sem5subjects,
                                                                                                                        sname,
                                                                                                                        fname,
                                                                                                                        roll_num,
                                                                                                                        course,
                                                                                                                        s,
                                                                                                                        sem5marks,
                                                                                                                        count_sem5atkt);
                                                                                                        s = 6;
                                                                                                        semesterResult(sem6subjects,
                                                                                                                        sname,
                                                                                                                        fname,
                                                                                                                        roll_num,
                                                                                                                        course,
                                                                                                                        s,
                                                                                                                        sem6marks,
                                                                                                                        count_sem6atkt);
                                                                                                        if (count_sem1atkt
                                                                                                                        + count_sem2atkt
                                                                                                                        + count_sem3atkt
                                                                                                                        + count_sem4atkt
                                                                                                                        + count_sem5atkt
                                                                                                                        + count_sem6atkt >= 4) {
                                                                                                                System.out.println(
                                                                                                                                "\n\t!!!Warning!!!\n*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n");
                                                                                                                continue;
                                                                                                        } else {

                                                                                                                if (count_sem1atkt > 0
                                                                                                                                && count_sem1atkt <= 2) {
                                                                                                                        System.out.println(
                                                                                                                                        "\tPlease Enter 1st Semester ATKT Marks : ");
                                                                                                                        count_sem1atkt = atktExam(
                                                                                                                                        sem1subjects,
                                                                                                                                        sem1atkt,
                                                                                                                                        sem1marks,
                                                                                                                                        count_sem1atkt);
                                                                                                                }

                                                                                                                if (count_sem2atkt > 0
                                                                                                                                && count_sem2atkt <= 2) {
                                                                                                                        System.out.println(
                                                                                                                                        "\n\tPlease Enter 2nd Semester ATKT Marks : ");
                                                                                                                        count_sem2atkt = atktExam(
                                                                                                                                        sem2subjects,
                                                                                                                                        sem2atkt,
                                                                                                                                        sem2marks,
                                                                                                                                        count_sem2atkt);
                                                                                                                }

                                                                                                                if (count_sem3atkt > 0
                                                                                                                                && count_sem3atkt <= 2) {
                                                                                                                        System.out.println(
                                                                                                                                        "\n\tPlease Enter 3rd Semester ATKT Marks : ");
                                                                                                                        count_sem3atkt = atktExam(
                                                                                                                                        sem3subjects,
                                                                                                                                        sem3atkt,
                                                                                                                                        sem3marks,
                                                                                                                                        count_sem3atkt);
                                                                                                                }

                                                                                                                if (count_sem4atkt > 0
                                                                                                                                && count_sem4atkt <= 2) {
                                                                                                                        System.out.println(
                                                                                                                                        "\n\tPlease Enter 4th Semester ATKT Marks : ");
                                                                                                                        count_sem4atkt = atktExam(
                                                                                                                                        sem4subjects,
                                                                                                                                        sem4atkt,
                                                                                                                                        sem4marks,
                                                                                                                                        count_sem4atkt);
                                                                                                                }

                                                                                                                if (count_sem5atkt > 0
                                                                                                                                && count_sem5atkt <= 2) {
                                                                                                                        System.out.println(
                                                                                                                                        "\n\tPlease Enter 5th Semester ATKT Marks : ");
                                                                                                                        count_sem5atkt = atktExam(
                                                                                                                                        sem5subjects,
                                                                                                                                        sem5atkt,
                                                                                                                                        sem5marks,
                                                                                                                                        count_sem5atkt);
                                                                                                                }

                                                                                                                if (count_sem6atkt > 0
                                                                                                                                && count_sem6atkt <= 2) {
                                                                                                                        System.out.println(
                                                                                                                                        "\n\tPlease Enter 6th Semester ATKT Marks : ");
                                                                                                                        count_sem6atkt = atktExam(
                                                                                                                                        sem6subjects,
                                                                                                                                        sem6atkt,
                                                                                                                                        sem6marks,
                                                                                                                                        count_sem6atkt);
                                                                                                                }

                                                                                                                if (count_sem1atkt > 0
                                                                                                                                || count_sem2atkt > 0
                                                                                                                                || count_sem3atkt > 0
                                                                                                                                || count_sem4atkt > 0
                                                                                                                                || count_sem5atkt > 0
                                                                                                                                || count_sem6atkt > 0) {
                                                                                                                        System.out.println(
                                                                                                                                        "\tYou have so many ATKT's Thats why you are not eligible for Continue Course.\n\t*Principle be like :-\n\tRahne de beta, Ab tumse na ho payega.");
                                                                                                                } else {

                                                                                                                        String date1 = "";
                                                                                                                        String division1;
                                                                                                                        String session = "2023";
                                                                                                                        String syear;
                                                                                                                        String fyear;
                                                                                                                        String rN = String
                                                                                                                                        .valueOf(roll_num);
                                                                                                                        System.out.print(
                                                                                                                                        "\n\n\tDo You want Your Degree? (y/n) : ");
                                                                                                                        char reply = sc.next()
                                                                                                                                        .charAt(0);
                                                                                                                        if (reply == 'y' || reply == 'Y') {
                                                                                                                                System.out.print(
                                                                                                                                                "\tEnter date for Degree : ");
                                                                                                                                date1 = sc.next();
                                                                                                                                System.out.println(
                                                                                                                                                "--------------------------------------------------------- ");
                                                                                                                                System.out.print(
                                                                                                                                                "\tEnter division1 for Degree : ");
                                                                                                                                division1 = sc.next();
                                                                                                                                System.out.println(
                                                                                                                                                "--------------------------------------------------------- ");
                                                                                                                                degree(sname, date1,
                                                                                                                                                division1);
                                                                                                                        }

                                                                                                                        System.out.print(
                                                                                                                                        "\n\n\tDo You want Your TC? (y/n) : ");
                                                                                                                        reply = sc.next()
                                                                                                                                        .charAt(0);
                                                                                                                        if (reply == 'y' || reply == 'Y') {
                                                                                                                                System.out.print(
                                                                                                                                                "\tEnter starting year for TC : ");
                                                                                                                                syear = sc.next();
                                                                                                                                System.out.println(
                                                                                                                                                "--------------------------------------------------------- ");
                                                                                                                                System.out.print(
                                                                                                                                                "\tEnter ending year for TC : ");
                                                                                                                                fyear = sc.next();
                                                                                                                                System.out.println(
                                                                                                                                                "--------------------------------------------------------- ");
                                                                                                                                tC(sname, fname, mname,
                                                                                                                                                rN,
                                                                                                                                                entN,
                                                                                                                                                status,
                                                                                                                                                date1,
                                                                                                                                                syear,
                                                                                                                                                fyear);
                                                                                                                        }

                                                                                                                        System.out.print(
                                                                                                                                        "\n\n\tDo You want Your Migration? (y/n) : ");
                                                                                                                        reply = sc.next()
                                                                                                                                        .charAt(0);
                                                                                                                        if (reply == 'y' || reply == 'Y') {
                                                                                                                                System.out.print(
                                                                                                                                                "\tEnter session for Migration : ");
                                                                                                                                session = sc.next();
                                                                                                                                System.out.println(
                                                                                                                                                "--------------------------------------------------------- ");
                                                                                                                                migrationC(sname,
                                                                                                                                                roll_num,
                                                                                                                                                entN,
                                                                                                                                                status,
                                                                                                                                                session,
                                                                                                                                                date1);
                                                                                                                        } else {
                                                                                                                                System.out.println(
                                                                                                                                                " \tOk \n.....Thanks for Visiting.....");
                                                                                                                        }

                                                                                                                }

                                                                                                        }
                                                                                                } while (count_sem6atkt >= 1);
                                                                                        }
                                                                                } while (count_sem5atkt >= 1);
                                                                        }
                                                                } while (count_sem4atkt >= 1);
                                                        }
                                                } while (count_sem3atkt >= 1);
                                        }
                                } while (count_sem2atkt >= 1);
                        }
                } while (count_sem1atkt >= 1);
        }
}
