package CodingExercises;


public class OddEvenCounterinArray {
    static int odd = 0, even = 0;

    public static void main(String[] args){
        int[] arr = {1, 2 ,3 ,4 ,5 };

        OddEvenCounter(arr);



    }

    public static void OddEvenCounter(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Odd : " + odd);
        System.out.println("Even : " + even);
    }



}
