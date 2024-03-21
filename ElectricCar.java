public class ElectricCar extends ACar {

    private int batteryCapacity;
    private int maxRange;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRangeKm) {

        //Kalder konstruktor fra superklassen ACar
        super(registrationNumber, make, model, numberOfDoors);

        this.batteryCapacity = batteryCapacityKWh;
        this.maxRange = maxRangeKm;
    }

    public int getBatteryCapacityKwh() {

        return batteryCapacity;
    }

    public int getMaxRangeKm() {

        return maxRange;
    }

    public double getWhPrKm() {
        return ((double) batteryCapacity / maxRange) * 1000;
    }


    @Override
    public String getRegistrationNumber() {
        return "";
    }

    @Override
    public int getNumberOfDoors() {
        return 0;
    }

    //2. For en Elbil gælder de samme regler som for en benzinbil, blot skal man først omregne watt-timer pr kilometer til km/l.
    // Det gøres ved at dividere Wh/km med 91,25 og dernæst dividere 100 med dette tal.
    @Override
    public int getRegistrationFee() {
        //Omregner fra Wh/km til km/1
        double kmPrLitreEquivalent = 100 / (getWhPrKm() / 91.25);
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " MaxRange: " +  maxRange +" BatteryCapacity: "  + batteryCapacity + "\n";

        }
}