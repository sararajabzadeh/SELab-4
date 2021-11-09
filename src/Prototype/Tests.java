package Prototype;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    client = new Client;
    @Test
    public void testConcrete1() {
        ConcretePrototype11 obj1 = new ConcretePrototype11();
        ConcretePrototype11 CopyObj1 = new ConcretePrototype11(obj1);
        CopyObj1 = client.Operation(obj1);
        assertTrue(CopyObj1 instanceof ConcretePrototype11);
    }

    @Test
    public void testConcrete2() {
        ConcretePrototype2 obj2 = new ConcretePrototype2();
        ConcretePrototype2 CopyObj2 = new ConcretePrototype2(obj2);
        CopyObj2 = client.Operation(obj2);
        assertTrue(CopyObj2 instanceof ConcretePrototype2);
    }

}
