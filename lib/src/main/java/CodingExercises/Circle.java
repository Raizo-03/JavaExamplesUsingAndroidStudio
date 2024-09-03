package CodingExercises;
import java.util.*;
public class Circle {
    static float area, perimeter;
    final static float pi = 3.14f;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int radius = 0;


        radius = sc.nextInt();

        calculateArea(radius);
        calculatePerimeter(radius);



    }

    public static void calculateArea(int radius){
        area = pi * radius * radius;
        System.out.println(area);
    }

    public static void calculatePerimeter(int radius){
        perimeter = 2 * pi * radius;
        System.out.println(perimeter);
    }
}
