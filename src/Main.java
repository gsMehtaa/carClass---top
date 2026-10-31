public class Main {

    public static void main(String[] args){

       Cars car1 = new Cars("HONDA", "CRV", 2024, 53000);
       car1.drive(100);
       car1.displayInfo();
        System.out.println(car1.getMileage());



        System.out.println("Total cars: " + Cars.totalCars);

    }



}
