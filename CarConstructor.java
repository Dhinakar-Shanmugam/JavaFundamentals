public class CarConstructor {
    String brand;
    CarConstructor(){
        brand = "unknown";
    }
    String setBrand(String br){
        brand = br;
        return brand;
    }

    public static void main(String[] args) {
        CarConstructor car = new CarConstructor();
        System.out.println("Default: "+ car.brand);
        System.out.println("Brand name is: "+ car.setBrand("RollsRoyce"));
    }
}
