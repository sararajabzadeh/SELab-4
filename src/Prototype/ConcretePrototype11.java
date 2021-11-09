package Prototype;

public class ConcretePrototype11 implements Prototype{
    public static void Clone(){
        return new this.Clone();
    }
}