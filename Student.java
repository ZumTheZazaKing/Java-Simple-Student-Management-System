import java.util.Scanner;

public class Student{

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student last name:");
        this.lastName = scanner.nextLine();

        System.out.print("1 - Year 1\n2 - Year 2\n3 - Year 3\n4 - Year 4\nEnter student class level:");
        this.gradeYear = scanner.nextInt();

        setStudentID();

    }

    private void setStudentID(){

        id++;

        this.studentID =  gradeYear + "" + id;

    }

    public void enroll(){

        do{

            System.out.print("Enter course to enroll (Q to quit):");
            
            Scanner scanner = new Scanner(System.in);

            String course = scanner.nextLine();

            if (!course.equals("Q")){

            courses = courses + "\n  " + course;

            tuitionBalance += costOfCourse;

            } else {break;}
        
        } while (1 != 0);

    
    }

    public void viewBalance(){

        System.out.println("Your balance is: $" + tuitionBalance);

    }

    public void payTuition(){

        viewBalance();

        System.out.print("Please enter your payment: $");

        Scanner scanner = new Scanner(System.in);

        int payment = scanner.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();

    }

    public String showInfo(){

        return "Name: " + firstName + " " + lastName + 
        "\nGrade Level: " + gradeYear +
        "\nStudent ID: " + studentID +
        "\nCourses Enrolled: " + courses +
        "\nBalance: $" + tuitionBalance;

    }

}