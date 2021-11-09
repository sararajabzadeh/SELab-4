package Prototype;

public class ConcretePrototype1 extends Prototype{

    public ConcretePrototype1(int serialNumber, String name) {
        super(serialNumber, name);
    }

    public Prototype prototypeClone() throws CloneNotSupportedException {
        return (ConcretePrototype1)this.clone();
    }
}