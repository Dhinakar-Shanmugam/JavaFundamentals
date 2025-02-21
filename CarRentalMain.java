public class CarRentalMain {
    public static void main(String[] args) {
        CarRental car = new CarRental();
        car.getCar(1,"suv");
        car.getRent("suv");
        car.showCar();
    }
}
