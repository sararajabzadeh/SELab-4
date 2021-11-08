package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class IranianGardenCreator extends GardenCreator {
    private List<Tree> trees  = new ArrayList<>();
    private List<Flower> flowers = new ArrayList<>();

    @Override
    Tree creatTree() {
        Tree newTree = new IranianTree();
        trees.add(newTree);
        return newTree;
    }

    @Override
    Flower creatFlower() {
        Flower newFlower = new IranianFlower();
        flowers.add(newFlower);
        return newFlower;
    }

    @Override
    List<Tree> getTrees() {
        return this.trees;
    }

    @Override
    List<Flower> getFlowers() {
        return this.flowers;
    }
}
