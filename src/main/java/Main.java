public class Main {

    public static void main(String[] args) {

        Moped pad1 = new Moped();
        pad1.setColor("Green");
        pad1.setNumberOfPassengers(2);
        pad1.setCargoCapacity(20);
        pad1.setFuelCapacity(40);

        Car car1 = new Car();
        car1.setColor("Black");
        car1.setNumberOfPassengers(5);
        car1.setCargoCapacity(25);
        car1.setFuelCapacity(50);

        Semitruck truck1 = new Semitruck();
        truck1.setColor("Gray");
        truck1.setNumberOfPassengers(4);
        truck1.setCargoCapacity(200);
        truck1.setFuelCapacity(100);

        HoverCraft craft1 = new HoverCraft();
        craft1.setColor("White");
        craft1.setNumberOfPassengers(1);
        craft1.setCargoCapacity(10);
        craft1.setFuelCapacity(30);



        ///System.out.println("=== MOPED ==="); SYSTEM TEST
        ///         System.out.println("Color: " + pad1.getColor());
        ///         System.out.println("Passengers: " + pad1.getNumberOfPassengers());
        ///         System.out.println("Cargo Capacity: " + pad1.getCargoCapacity());
        ///         System.out.println("Fuel Capacity: " + pad1.getFuelCapacity());
        ///
        ///         System.out.println("\n=== CAR ===");
        ///         System.out.println("Color: " + car1.getColor());
        ///         System.out.println("Passengers: " + car1.getNumberOfPassengers());
        ///         System.out.println("Cargo Capacity: " + car1.getCargoCapacity());
        ///         System.out.println("Fuel Capacity: " + car1.getFuelCapacity());
        ///
        ///         System.out.println("\n=== SEMI TRUCK ===");
        ///         System.out.println("Color: " + truck1.getColor());
        ///         System.out.println("Passengers: " + truck1.getNumberOfPassengers());
        ///         System.out.println("Cargo Capacity: " + truck1.getCargoCapacity());
        ///         System.out.println("Fuel Capacity: " + truck1.getFuelCapacity());
        ///
        ///         System.out.println("\n=== HOVERCRAFT ===");
        ///         System.out.println("Color: " + craft1.getColor());
        ///         System.out.println("Passengers: " + craft1.getNumberOfPassengers());
        ///         System.out.println("Cargo Capacity: " + craft1.getCargoCapacity());
        ///         System.out.println("Fuel Capacity: " + craft1.getFuelCapacity());
    }
}
