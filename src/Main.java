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

        displayCar(car1);
        System.out.println();
        displayCar(car2);
    }
    public static void displayCar(Cars car) {
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Mileage: " + car.mileage);
    }
}
