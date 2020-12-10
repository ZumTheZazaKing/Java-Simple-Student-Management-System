import java.util.Scanner;

public class StudentManagementApp{

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students do you wish to enroll?");

        int numOfStudents = scanner.nextInt();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++){

            students[i] = new Student();

            students[i].enroll();

            students[i].payTuition();

            System.out.println(students[i].showInfo());

        }

    }

}