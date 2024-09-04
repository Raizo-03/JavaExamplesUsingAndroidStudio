package CodingExercises;

public class DecimalToBinary {

    public static void main(String[] args) {
        int number = 10;  // Example number to convert
        String binaryRepresentation = decimalToBinary(number);
        System.out.println("Binary representation of " + number + " is: " + binaryRepresentation);


        //Second way
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binaryString);

    }


    //First way
    public static String decimalToBinary(int n) {
        StringBuilder binaryNumber = new StringBuilder();

        while (n > 0) {
            int remainder = n % 2;      // Get the remainder (0 or 1)
            binaryNumber.append(remainder); // Append remainder to the binary number
            n = n / 2;                  // Update n to be the quotient
        }

        return binaryNumber.reverse().toString(); // Reverse the binary number to correct the order
    }

}
