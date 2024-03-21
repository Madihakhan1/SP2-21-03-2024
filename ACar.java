public abstract class  ACar implements Car {


    //2.    Abstrakt klasse ACar. Skal implementere Car interfacet og alle metoderne i dette, undtagen getRegistrationFee().
    // Lav klasse attributter til at holde styr på registreringsnummer (nummerplade), mærke, model og antal døre.
    // (Husk at bruge engelske navne til alt). Overvej hvilke attributter det giver mening at lave final.
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {

        this.registrationNumber = registrationNumber;
        this.make = make;
        this.numberOfDoors = numberOfDoors;
        this.model = model;


    }

    //Metoder fra interface klassen
    public String getRegistrationNuber(){

        return registrationNumber;
    }
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getNumberOfDoor(){
        return 0;
    }

    @Override

    public String toString(){

        return " \n Make: " + make + " Model: " + model + " Registration Number: " + registrationNumber;


    }
}
