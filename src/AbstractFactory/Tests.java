package AbstractFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testClientIran() {
        GardenCreator gardenCreator = Client.makeCreator("Iranian");
        assertTrue(gardenCreator.creatFlower() instanceof IranianFlower);
        assertTrue(gardenCreator.creatTree() instanceof IranianTree);
    }

    @Test
    public void testClientJapan() {
        GardenCreator gardenCreator = Client.makeCreator("Japanese");
        assertTrue(gardenCreator.creatFlower() instanceof JapaneseFlower);
        assertTrue(gardenCreator.creatTree() instanceof JapaneseTree);
    }
}
