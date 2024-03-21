import java.util.ArrayList;

public class FleetOfCars {

    private ArrayList<Car>fleet = new ArrayList<>();

    public void addCar(Car car){

        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){

        int sum = 0;
        for (Car car : fleet) {
            sum += car.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Car c : fleet) {
            result.append(c.toString()).append("\n");
        }
        return result.toString();
    }


    }



