package Prototype;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    private Client client = new Client();

    @Test
    public void testConcrete1() throws CloneNotSupportedException {
        ConcretePrototype1 obj1 = new ConcretePrototype1(1, "First");
        Prototype CopyObj1 = this.client.operataion(obj1);

        assertTrue(CopyObj1 instanceof ConcretePrototype1);
        assertEquals(CopyObj1.getSerialNumber(), obj1.getSerialNumber());
        assertEquals(CopyObj1.getName(), obj1.getName());
    }

    @Test
    public void testConcrete2() throws CloneNotSupportedException {
        ConcretePrototype2 obj2 = new ConcretePrototype2(2, "Second");
        Prototype CopyObj2 = client.operataion(obj2);

        assertTrue(CopyObj2 instanceof ConcretePrototype2);
        assertEquals(CopyObj2.getSerialNumber(), obj2.getSerialNumber());
        assertEquals(CopyObj2.getName(), obj2.getName());
    }

}
