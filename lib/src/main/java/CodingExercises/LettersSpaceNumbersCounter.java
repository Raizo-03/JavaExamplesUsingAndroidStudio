package CodingExercises;
import java.util.*;

public class LettersSpaceNumbersCounter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        counterFunc(input);

    }


    public static void counterFunc(String input){
        char[] chars = input.toCharArray();
        int letters = 0, numbers = 0, spaces = 0, others = 0;


        for(int i = 0; i < chars.length; i++){

            if(Character.isLetter(chars[i])){
                letters++;
            }else if(Character.isSpaceChar(chars[i])){
                spaces++;
            }else if(Character.isDigit(chars[i])) {
                numbers++;
            }else{
                others++;
            }

        }
        System.out.println("Letters : " + letters);
        System.out.println("Numbers : " + numbers);
        System.out.println("Spaces : " + spaces);
        System.out.println("Others : " + others);

    }

}
