package Test;
import com.example.lib.Car;


public class Test {

    public static void main(String[] args){
        Car yellowCar = new Car(10, 10);

        yellowCar.accelerate(10);

        yellowCar.setSpeed(19);
        int speed = yellowCar.getSpeed();

        System.out.println(speed);
    }


}
