package CodingExercises;
import java.util.*;

public class Remainder {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dividend = 0, divisor = 0;


        dividend = sc.nextInt();
        divisor = sc.nextInt();

        int remainder = dividend % divisor;
        System.out.print(remainder);

    }

}
