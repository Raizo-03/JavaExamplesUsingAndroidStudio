package CodingExercises;

public class ArrayAverage {

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0, ave = 0;

        for(int i = 0; i <= arr.length - 1; i++){
            sum = arr[i] + arr[i];
        }
        ave = sum /2;
        System.out.println("Sum : " + sum);
        System.out.println("Ave : " + ave);
    }
}
