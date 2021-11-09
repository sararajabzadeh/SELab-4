package Prototype;

public class ConcretePrototype2 implements Prototype{

    public static void Clone(){
        return new this.Clone();
    }
}