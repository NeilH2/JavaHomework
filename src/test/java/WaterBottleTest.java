import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void fullBottle() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void takeDrink(){
        waterBottle.takeDrink();
        waterBottle.takeDrink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, waterBottle.getVolume());
    }


}

