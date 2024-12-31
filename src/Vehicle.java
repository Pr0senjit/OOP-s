public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirecction;


    public Vehicle(String name){
        this.name=name;
        this.currentSpeed=0;
        this.currentDirecction=0;
    }
    public int getCurrentDirecction() {
        return currentDirecction;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public String getName() {
        return name;
    }


    public void steer(int direction){
        this.currentDirecction=direction;
        System.out.println("steer at: "+direction);
    }

    public void move(int speed, int direction){
        this.currentDirecction=direction;
        this.currentSpeed=speed;
        System.out.println("move at speed: "+speed+"in direction: "+direction);
    }

    public void stop(){
        this.currentDirecction=0;
        System.out.println("stopping!");
    }


}
