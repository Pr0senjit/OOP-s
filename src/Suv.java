public class Suv extends Car{
    public Suv(String name, boolean isManual) {
        super(name, 4, "SUV", 5, 6, isManual);
    }

    public void accelarate(int rate){
       int newSpeed= getCurrentSpeed()+rate;

       if(newSpeed==0){
           stop();
         changeGear(1);
       }else if(newSpeed>0 && newSpeed<10){
            changeGear(1);
        }
       else if(newSpeed>10 && newSpeed<20) {
           changeGear(2);
       }
       else if(newSpeed>20 && newSpeed<30){
           changeGear(3);
       }
       else if(newSpeed>30 && newSpeed<40){
           changeGear(4);
       }

        if(newSpeed>0){
            changeSpeed(newSpeed,getCurrentDirecction());
        }

    }


    }


