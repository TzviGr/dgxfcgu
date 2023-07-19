public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    int speedUp(int increment){
        speed+=increment;
        return speed;
    }
    int applyBrake(int decrement){
        speed-=decrement;
        return speed;
    }
}
