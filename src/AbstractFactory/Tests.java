package AbstractFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testClientIran() {
        GardenCreator gardenCreator = Client.makeCreator("Iranian");

        assertTrue(gardenCreator.creatFlower() instanceof IranianFlower);
        assertTrue(gardenCreator.creatTree() instanceof IranianTree);

        assertNotNull(gardenCreator.getTrees());
        assertNotNull(gardenCreator.getFlowers());

        assertTrue(gardenCreator.getTrees().get(0) instanceof IranianTree);
        assertTrue(gardenCreator.getFlowers().get(0) instanceof IranianFlower);
    }

    @Test
    public void testClientJapan() {
        GardenCreator gardenCreator = Client.makeCreator("Japanese");

        assertTrue(gardenCreator.creatFlower() instanceof JapaneseFlower);
        assertTrue(gardenCreator.creatTree() instanceof JapaneseTree);

        assertNotNull(gardenCreator.getTrees());
        assertNotNull(gardenCreator.getFlowers());

        assertTrue(gardenCreator.getTrees().get(0) instanceof JapaneseTree);
        assertTrue(gardenCreator.getFlowers().get(0) instanceof JapaneseFlower);
    }
}
