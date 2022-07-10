public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while((number<=finishNumber) && (count != 5)){
           // number++;
            if(!isEvenNumber(number++)){
                continue;
            }
            count++;
            System.out.println("Even number is " + (number-1));
        }
        System.out.println("Total number of even numbers found is " + count);
    }
    public static boolean isEvenNumber(int number) {
        if(number<=0){
            return false;
        }
        return number%2==0;
    }
}