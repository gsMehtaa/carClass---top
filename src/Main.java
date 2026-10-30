public class Main {

    public static void main(String[] args){

       Cars car1 = new Cars("HONDA", "CRV", 2024, 53000);
       car1.drive(100);
       car1.displayInfo();

        System.out.println();

       Cars car2 = new Cars("Toyota", "RAV", 2021, 34500);
       car2.displayInfo();

        System.out.println("Total cars: " + Cars.totalCars);

    }



}
