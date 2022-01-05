import org.omg.CORBA.INTERNAL;

public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int newVolume){
        this.volume = newVolume;
    }

    public int drink(){
        int volume = this.getVolume();
        int newVolume = volume -10;
        this.setVolume(newVolume);
        return this.volume;
    }

    public int empty(){
        int newVolume = 0;
        this.setVolume(newVolume);
        return this.volume;
    }

    public int refill(){
        int newVolume = 100;
        this.setVolume((newVolume));
        return this.volume;
    }

}
