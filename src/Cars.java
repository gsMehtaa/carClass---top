import java.util.ArrayList;
import java.util.Scanner;


public class Cars {

    String make;
    String model;
    int year;
    int mileage;

//CAR CONSTRUCTOR

    public Cars(String make, String model, int year, int mileage){

        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;

    }
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
}
