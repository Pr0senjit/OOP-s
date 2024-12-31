public class Main {
    public static void main(String[] args) {
    Suv fortuner =new Suv("Fortuner",true);
    fortuner.move(20,0);
    //fortuner.accelarate(-20);
        fortuner.getCurrentSpeed();
        fortuner.steer(10);
        fortuner.getCurrentSpeed();
        fortuner.getCurrentDirecction();


    }
}