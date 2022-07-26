import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("Enter number of students in class that took exam");
//        int noOfStudents = scanner.nextInt();
//        int[] marks = studentMarks(noOfStudents);
//        double avg = averageMark(marks);
//        System.out.println("Average mark of class is " + avg);
        // test code below

        Test[] testers = new Test[10];
        Test testerOne = new Test("sai", "white box tester");
        Test testerTwo = new Test("ram", "black box tester");
        testers[0] = testerOne;
        testers[1] = testerOne;

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sai");
        arrayList.add("ram");
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add(1,"ccc");
        Iterator<String> i = arrayList.iterator();
//        ListIterator<String> j = arrayList.listIterator();
//        j.previous();
        while (i.hasNext())
            System.out.println(i.next());
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