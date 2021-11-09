package Prototype;

public class Client {
    public void Operataion(Prototype obj) {
        return new obj.clone();
    }
    }