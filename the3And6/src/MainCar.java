public class MainCar {
    public static void main(String[] args) {

    }
    public static int maxDistance(Car[] cars) {
        int maxDistance = 0;
        for (int i = 0; i <cars.length ; i++) {
            int distance = (int) (cars[i].getFuel() / cars[i].getLitersPerKm());
            if (distance < maxDistance || maxDistance == 0) {
                maxDistance = distance;
            }
        }
        return maxDistance;
    }

}
