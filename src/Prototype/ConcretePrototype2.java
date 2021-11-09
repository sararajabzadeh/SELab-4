package Prototype;

public class ConcretePrototype2 extends Prototype{

    public ConcretePrototype2(int serialNumber, String name) {
        super(serialNumber, name);
    }

    public Prototype prototypeClone() throws CloneNotSupportedException {
        return (ConcretePrototype2)this.clone();
    }
}