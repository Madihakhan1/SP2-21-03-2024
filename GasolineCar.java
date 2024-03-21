//4.   Klasse GasolineCar.
// Denne klasse nedarver fra FuelCar og skal implementere de to abstrakte metoder getFuelType() og getRegistrationFee().
// Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.
public class GasolineCar extends AFuelCar {

    //Kalder konstruktor fra superklassen ACar
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }


    @Override
    public String getRegistrationNumber() {
        return "";
    }

    @Override
    public int getNumberOfDoors() {
        return 0;
    }

    //1. For en Benzinbil er afgiften afhængig af kilometer pr liter.
    // Hvis den kører mellem 20 km/l og 50 km/l er prisen 330 kr,
    // mellem 15 km/l og 20 km/l er prisen 1050 kr,
    // mellem 10 km/l og 15 km/l er prisen 2340 kr,
    // mellem 5 km/l og 10 km/l er prisen 5500kr, og under 5 km/l er prisen 10470 kr.
    @Override
    public int getRegistrationFee() {
        //Benzinbil afgift Hvis den kører mellem 20 km/l og 50 km/l er prisen 330 kr,
        if (super.getKmPrLitre() >= 20 && super.getKmPrLitre() <= 50) {
            return 330;
            //mellem 15 km/l og 20 km/l er prisen 1050 kr,
        } else if (super.getKmPrLitre() <= 15 && super.getKmPrLitre() >= 10) {
            return 1050;
            //mellem 10 km/l og 15 km/l er prisen 2340 kr,
        } else if (super.getKmPrLitre() < 10 && super.getKmPrLitre() >= 5) {
            return 2340;
            //mellem 5 km/l og 10 km/l er prisen 5500kr, og under 5 km/l er prisen 10470 kr.
        } else if (super.getKmPrLitre() < 5) {
            return 5500;
        }
        return 0;
    }

    @Override

    public String toString(){

        return super.toString() + " kmPrLitre: " + getKmPrLitre() + " Fueltype: " + getFuelType();
    }
}
