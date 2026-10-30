import java.util.ArrayList;
import java.util.Scanner;


public class Cars {

    String make;
    String model;
    int year;
    int mileage;

    static int totalCars = 0;

//CAR CONSTRUCTOR

    public Cars(String make, String model, int year, int mileage){

        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        totalCars++;

    }
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
    public void drive(int distance){
        mileage = mileage + distance;
    }
}
