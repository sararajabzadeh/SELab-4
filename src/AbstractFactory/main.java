package AbstractFactory;

public class main {
    public static void main(String[] args) {
        Client client = new Client();
        client.creatGarden("Iranian");
        client.creatGarden("Japanese");
        client.creatGarden("Indian");
    }
}
