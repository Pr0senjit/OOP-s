public class Car extends Vehicle {

    int wheels;
    String type;
    int doors;
    int gears;
    boolean isManual;
    int currentGear;

    public Car(String name,int wheels,String type,int doors,int gears,boolean isManual) {
        super(name);
        this.wheels=wheels;
        this.type=type;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        currentGear=1;

    }

    public void changeGear(int newGear){
        this.currentGear=newGear;
        System.out.println("changeGear method is called gear is :"+this.currentGear);
    }

    public void changeSpeed(int speed, int direction){
        move(speed,direction);

    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
