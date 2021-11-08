package AbstractFactory;

public class JapaneseGardenCreator extends GardenCreator {
    private Tree[] trees;
    private Flower[] flowers;

    @Override
    Tree creatTree() {
        return null;
    }

    @Override
    Flower creatFlower() {
        return null;
    }

    @Override
    Tree[] getTrees() {
        return this.trees;
    }

    @Override
    Flower[] getFlowers() {
        return this.flowers;
    }
}
