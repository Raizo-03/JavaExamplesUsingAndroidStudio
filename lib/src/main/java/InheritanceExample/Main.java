package InheritanceExample;

public class Main {

    public static void main (String[] args){

        Circle circleArea = new Circle(4);
        Rectangle rectangleArea = new Rectangle(5, 10);

        double cArea = circleArea.calculateArea();
        double cPerim = circleArea.calculatePerimeter();

        double rArea = rectangleArea.calculateArea();
        double rPerim = rectangleArea.calculatePerimeter();

        System.out.println(cArea);
        System.out.println(cPerim);

        System.out.println(rArea);
        System.out.println(rPerim);
    }
}
