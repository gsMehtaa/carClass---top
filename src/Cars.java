import java.util.ArrayList;
import java.util.Scanner;


public class Cars {

    private String make;
    private String model;
    private int year;
    private int mileage;

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
        if(mileage >= 0){
            mileage = mileage + distance;
        }
        else{
            System.out.println("CANT HAVE A NEGATIVE MILEAGE");
        }
    }
    public int getMileage(){
        return mileage;
    }
}
