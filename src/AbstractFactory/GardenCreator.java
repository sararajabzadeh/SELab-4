package AbstractFactory;

public abstract class GardenCreator {
    abstract Tree creatTree();
    abstract Flower creatFlower();
    abstract Tree[] getTrees();
    abstract Flower[] getFlowers();
}
