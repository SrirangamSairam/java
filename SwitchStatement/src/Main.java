public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        char var = 'A';
        switch (var) {
            case 'A':
                System.out.println("Found " + var);
                break;
            case 'B':
                System.out.println("second " + var);
                break;
            case 'C':
                System.out.println("secondaa " + var);
                break;
            case 'D':
                System.out.println("secondfd " + var);
                break;
            case 'E':
                System.out.println("secondtr " + var);
                break;
            default:
                System.out.println("Found nothing");
                break;
        }
        System.out.println("End of Switch statement");
    }
}