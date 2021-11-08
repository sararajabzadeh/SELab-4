package AbstractFactory;

import java.util.List;

public abstract class GardenCreator {
    abstract Tree creatTree();
    abstract Flower creatFlower();
    abstract List<Tree> getTrees();
    abstract List<Flower> getFlowers();
}
