public class TransportationTester {
    public static void main(String[] args) {

    Tricycle tricycle = new Tricycle("SUZUKI", 4,155, "AMB141");
    Airplane plane1 = new Airplane("Boeing 737", 235, "White and Red stripes");
    Ship ship1 = new Ship("Star of the Sea", " White-Silverish ", 5610, 5.610, "Cruise Ship");
    Boat boat1 = new Boat("100lbs", "Brownish", 5);
    Helicopter heli1 = new Helicopter("Sikorsky UH-60 Black Hawk", 11, "Silver-Black");
    SUV suv = new SUV("Toyota - Fortuner", 9, " 2.8L 4-Cylinder diesel engines", "KWK1241");
    Truck truck = new Truck("Toyota-Hilux", "6", "2.4L 2GD-FTV turbodiesel engine", "KWK 1231");
    Kariton kariton = new Kariton("70lbs", "10", "Anonymous");
    Motorcycle motorcycle = new Motorcycle("Raider Fi", 2, "SZK10", "Diesel/Gasoline");

  
    kariton.displayInfo();
    motorcycle.displayInfo();
    tricycle.displayInfo();
    suv.displayInfo();
    truck.displayInfo();
    heli1.displayInfo();
    plane1.displayInfo();
    boat1.displayInfo();
    ship1.displayInfo();
    System.out.println(ship1.displayInfo());
    System.out.println(boat1.displayInfo());
    System.out.println(plane1.displayInfo());
    System.out.println(heli1.displayInfo());
    System.out.println(truck.displayInfo());
    System.out.println(suv.displayInfo());
    System.out.println(tricycle.displayInfo());
    System.out.println(motorcycle.displayInfo());
    System.out.println(kariton.displayInfo());
  



     


    }
  }
