package CodingExercises;

public class ArrayElementsMultiplier {


    public static void main(String[] args){

        //Array1
        int[] arr1 = {1, 3, -5, 4};
        int[] arr2 = {1, 4, 5, 2};

        arrayMultiplier(arr1, arr2);
    }

    public static void arrayMultiplier(int[] arr1, int[] arr2){

        int[] newArray = new int[arr1.length];

        if(arr1.length == arr2.length){
            for(int i =0; i <arr1.length; i++) {
                int product = arr1[i] *= arr2[i];
                for (int j = 0; j < newArray.length; j++) {
                    newArray[i] = product;
                }
            }
            for(int k = 0; k < newArray.length; k++){
                System.out.print(newArray[k] + " ");
            }

        }else{
            System.out.print("String length not equal");

        }

    }

    public static void arrayMultiplierByGPT(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) {  // Check if arrays have the same length
            System.out.println("Array lengths are not equal.");
            return;
        }

        int[] newArray = new int[arr1.length];  // Initialize newArray to store results

        // Loop to multiply elements and store in newArray
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i] * arr2[i];  // Multiply and store in newArray
        }

        // Print the resulting array
        for (int k = 0; k < newArray.length; k++) {
            System.out.print(newArray[k] + " ");
        }
    }
}
