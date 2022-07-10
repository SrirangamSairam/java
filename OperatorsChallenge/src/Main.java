public class Main {
    public static void main(String[] args) {
        double variableOne = 20.0d;
        double variableTwo = 80.0d;
        double resultOne = (variableOne + variableTwo) * 100.0d;
        //boolean resulTwo = resultOne % 40.0d == 0 ? true : false;
        boolean resulTwo = resultOne % 40.0d == 0;
        System.out.println(resulTwo);
        if(!resulTwo) {
            System.out.println("Got some remainder");
        }
        System.out.println("hello " +
                "how " +
                "are you");
        if(variableOne > 10) {
            variableTwo += 20.d;
        }
        System.out.println(variableTwo);
    }
}