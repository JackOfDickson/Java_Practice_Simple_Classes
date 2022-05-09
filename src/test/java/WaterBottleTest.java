import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myBottle = new WaterBottle();

    @Test
    public void hasStartingVolume(){
        assertEquals(100, myBottle.getVolume());}

    @Test
    public void canDrink(){
        myBottle.drink();
        assertEquals(90, myBottle.getVolume());
    }

    @Test
    public void canEmpty(){
        myBottle.empty();
        assertEquals(0, myBottle.getVolume());
    }

    @Test
    public void canFill(){
        myBottle.fill();
        assertEquals(100, myBottle.getVolume());
    }


}
