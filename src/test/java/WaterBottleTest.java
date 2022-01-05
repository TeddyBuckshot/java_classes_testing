import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle fullBottle = new WaterBottle(100);
    WaterBottle emptyBottle = new WaterBottle(0);

    @Test
    public void canDrink(){
        System.out.println("full bottle: " +fullBottle.getVolume());
        fullBottle.drink();
        fullBottle.drink();
        System.out.println("full bottle after 2 drinks: " +fullBottle.getVolume());
        assertEquals(80,fullBottle.getVolume());
    }

    @Test
    public void canEmpty(){
        System.out.println("full bottle: " +fullBottle.getVolume());
        fullBottle.empty();
        System.out.println("bottle has been emptied: " +fullBottle.getVolume());
        assertEquals(0, fullBottle.getVolume());
    }

    @Test
    public void canRefill(){
        System.out.println("bottle is full: "+fullBottle.getVolume());
        fullBottle.empty();
        System.out.println("bottle is empty: "+fullBottle.getVolume());
        fullBottle.refill();
        System.out.println("bottle has been refilled: "+fullBottle.getVolume());
        assertEquals(100, fullBottle.getVolume());
    }

    @Test
    public void canRefillAlt(){
        System.out.println("bottle starts empty: "+emptyBottle.getVolume());
        emptyBottle.refill();
        System.out.println("bottle has been refilled: "+emptyBottle.getVolume());
        assertEquals(100, emptyBottle.getVolume());
    }
}
