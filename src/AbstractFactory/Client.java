package AbstractFactory;

public class Client {
   public static GardenCreator makeCreator(String type) {
       if (type.equals("Iranian")){
           return new IranianGardenCreator();
       }
       else if (type.equals("Japanese")){
           return new JapaneseGardenCreator();
       }
       else {
           throw new IllegalArgumentException("Garden not supported.");
       }
   }

    public void creatGarden(String type){
       GardenCreator gardenCreator = makeCreator(type);
       gardenCreator.creatFlower();
       gardenCreator.creatTree();
    }

}
