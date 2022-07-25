import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of students in class that took exam");
        int noOfStudents = scanner.nextInt();
        int[] marks = studentMarks(noOfStudents);
        double avg = averageMark(marks);
        System.out.println("Average mark of class is " + avg);
    }
    public static int[] studentMarks(int noOfStudents) {
        int[] studentMarks = new int[noOfStudents];
        System.out.println("Enter students marks one by one to calculate the average mark");
        for(int i=0;i<noOfStudents;i++) {
            studentMarks[i] = scanner.nextInt();
        }
        return studentMarks;
    }
    public static double averageMark(int[] studentMarks) {
        double sum = 0;
        for(int studentMark : studentMarks) {
            sum += studentMark;
        }
        return sum/studentMarks.length;
    }
}