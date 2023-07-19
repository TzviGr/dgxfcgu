public class Car {
    private int fuel;
    private int fuelCapacity;
    private float litersPerKm;

    public int getFuel() {
        return fuel;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public float getLitersPerKm() {
        return litersPerKm;
    }

    float percent(){
        float percent = 100 / fuelCapacity * fuel;
        return percent;
    }
    boolean urgentGasStation(){
        boolean urgentGasStation=false;
        if (percent()<10||getFuel()<20){
            urgentGasStation=true;
        }
        return urgentGasStation;
    }
    boolean drive(int km){
        boolean drive=false;
        if (fuel>=litersPerKm*km) {
            fuel-=litersPerKm*km;
            drive = true;
        }
        return drive;
    }
}
