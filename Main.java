public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

       fleet.addCar((Car) new DieselCar("CE74247", "Audi A3", "Sportsback", 5, 28, true));
        fleet.addCar((Car) new GasolineCar("DE656578", "Mercedes", "C-klasse", 5, 14));
       fleet.addCar((Car) new ElectricCar("RE3000203", "Tesla", "Y", 5, 10000, 100));

        System.out.println("Biler i flåden");

        System.out.println(fleet);

        //Regner ud og udskriver den samlede registeringsafgift på bilerne i flåden.
        int totalFee = fleet.getTotalRegistrationFeeForFleet();
        System.out.println("Den samlede registreringsafgift for flåden: " + totalFee + " kr");

    }

    }