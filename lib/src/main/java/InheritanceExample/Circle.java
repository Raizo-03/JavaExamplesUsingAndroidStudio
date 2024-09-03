package InheritanceExample;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return radius *= radius * 3.14f;

    }

    public double calculatePerimeter(){
        return 2 * 3.14f * radius;
    }
}
