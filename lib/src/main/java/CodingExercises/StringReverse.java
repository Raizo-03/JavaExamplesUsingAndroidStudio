package CodingExercises;
import java.util.*;
public class StringReverse {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //First Way
        StringReverser(input);

        //Second way
        stringreverse(input);
    }


    //First Way
    public static void StringReverser(String input){
        char[] inp = input.toCharArray();
        StringBuilder newString = new StringBuilder();
        for(int i = inp.length - 1; i >= 0 ; i--){
            newString.append(inp[i]);
        }
        System.out.println("Input : " + input);
        System.out.println("Reversed : " + newString);

    }

    public static void stringreverse(String input){
        StringBuilder newString = new StringBuilder(input).reverse();
        System.out.println("Reversed : " + newString);
    }
}
