//3. Abstrakt Klasse AFuelCar.
// Denne klasse skal nedarve fra Acar.
// Den skal tilføje to metoder:

public abstract class AFuelCar extends ACar {

    private int kmPrLitre;


    //Lav en attribut til at gemme kilometer per liter og initialisér den i konstruktøren.
    //Kalder konstruktor fra superklassen ACar

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){

        super(registrationNumber, make, model, numberOfDoors);

        this.kmPrLitre = kmPrLitre;
}

//a. abstract String getFuelType();
// should return “Gasoline” or “Diesel”
    public abstract String getFuelType();


    //b.    int kmPrLitre();
    // should return how many kilometres the car can drive on 1 litre of fuel
    public int getKmPrLitre(){

        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + getKmPrLitre();
    }
}
