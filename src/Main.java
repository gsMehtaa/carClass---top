public class Main {

    public static void main(String[] args){

        Cars car1 = new Cars();
        car1.make = "Honda";
        car1.model = "CRV";
        car1.year = 2024;
        car1.mileage = 54500;

        Cars car2 = new Cars();
        car2.make = "Toyota";
        car2.model = "RAV";
        car2.year = 2021;
        car2.mileage = 62500;

        displayCars(car1, car2);
    }
    public static void displayCars(Cars car1, Cars car2){
        System.out.println("Car 1: Make: " + car1.make + ", Model: " + car1.model + ", Year: " + car1.year + ", Mileage: " + car1.mileage);
        System.out.println("Car 2: Make: " + car2.make + ", Model: " + car2.model + ", Year: " + car2.year + ", Mileage: " + car2.mileage);

    }
}
