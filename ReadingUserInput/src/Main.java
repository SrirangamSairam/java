import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printUserAgeAndName();
    }
    public static void printUserAgeAndName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int age = scanner.nextInt();
            if (age < 18 || age >= 100) {
                System.out.println("Please enter correct age");
                age = scanner.nextInt();
            }

            System.out.println("Enter your name");
            String name = scanner.next();
            System.out.println("Your name is " + name + " and you are " + age + " years old");
        } else {
            System.out.println("Enter age in proper format");
        }
        //OR

//        System.out.println("Enter your age: ");
//        int age1 = scanner.nextInt();
//        scanner.nextLine();// To solve enter key issue
//        System.out.println("Enter your name");
//        String name1 = scanner.nextLine();
//        System.out.println("Your name is " + name1 + " and you are " + age1 + " years old");
        scanner.close();
    }
}