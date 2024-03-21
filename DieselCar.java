public class DieselCar extends AFuelCar {
    private final boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
   public String getFuelType() {
        return "Diesel" ;
    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getNumberOfDoors() {
        return 0;
    }


    @Override
    public int getRegistrationFee() {
        int baseFee;
        if (super.getKmPrLitre() >= 20 && super.getKmPrLitre() <= 50) {
            baseFee = 330;
        } else if (super.getKmPrLitre() >= 15 && super.getKmPrLitre() < 20) {
            baseFee = 1050;
        } else if (super.getKmPrLitre() >= 10 && super.getKmPrLitre() < 15) {
            baseFee = 2340;
        } else if (super.getKmPrLitre() >= 5 && super.getKmPrLitre() < 10) {
            baseFee = 5500;
        } else if (super.getKmPrLitre() < 5) {
            baseFee = 10470;
        } else
            baseFee = 0;

        //Dette er udligningsafgiften
        int equalizationFee;
        if (super.getKmPrLitre() >= 20 && super.getKmPrLitre() <= 50) {
            equalizationFee = 130;
        } else if (super.getKmPrLitre() >= 15 && super.getKmPrLitre() < 20) {
            equalizationFee = 1390;
        } else if (super.getKmPrLitre() <= 10 && super.getKmPrLitre() < 15) {
            equalizationFee = 1850;
        } else if (super.getKmPrLitre() >= 5 && super.getKmPrLitre() < 10) {
            equalizationFee = 2770;
        } else if (super.getKmPrLitre() < 5) {
            equalizationFee = 15260;
        } else {
            equalizationFee = 0;
        }
        int particleEmissioonFee = hasParticleFilter ? 0 : 1000;

        return baseFee + equalizationFee + particleEmissioonFee;
    }


    @Override
    public String toString () {
        return super.toString() + ", Fuel Type: " + getFuelType() + ", Particle Filter: " + hasParticleFilter;

    }
}