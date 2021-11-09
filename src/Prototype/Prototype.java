package Prototype;

public abstract class Prototype implements Cloneable{
    private int serialNumber;
    private String name;

    protected Prototype(int serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    public abstract Prototype prototypeClone() throws CloneNotSupportedException;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}