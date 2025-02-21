public class CarRental {
    int carId;
    String carType = "";
    float carRent;

    void  getCar(int cid,String ctype){
        carId = cid;
        carType = ctype;
    }

    float getRent(String ctype){
        if(ctype.equals("smallcar")){
            carRent = 1000;
        } else if (ctype.equals("van")) {
            carRent = 800;
        } else if (ctype.equals("suv")) {
            carRent = 2500;
        }
        return  carRent;
    }

    void showCar(){
        System.out.println("Car ID: "+ carId);
        System.out.println("Car Type: "+ carType);
        System.out.println("Car Rent: "+carRent);
    }
}
