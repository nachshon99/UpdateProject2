import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        printTheNumbersAreGreaterThanAverage();
    }
    public static final int SIZE_ARRAY=10;
    public static void printTheNumbersAreGreaterThanAverage(){
        Scanner scanner = new Scanner(System.in);
        int[]numbers = new int[SIZE_ARRAY];
        double avg = 0, sum = 0;
        for (int i = 0; i < SIZE_ARRAY; i++){
            System.out.println("Enter a num: ");
            numbers[i] = scanner.nextInt();
            sum+=numbers[i];
        }
        avg = sum/10F;
        System.out.println("The average is:  = "+avg);
        for (int j = 0; j < SIZE_ARRAY; j++){
            if(numbers[j]>avg){
                System.out.print(numbers[j] + ", ");
            }
        }
    }
}
