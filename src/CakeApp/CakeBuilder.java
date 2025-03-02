package CakeApp;

public class CakeBuilder {
    private String breadType;
    private String creamFlavour;
    private String decorateType;
    private int bakeTime;

    public CakeBuilder setBreadType(String breadType) {
        this.breadType = breadType;
        return this;
    }

    public CakeBuilder setCreamFlavour(String creamFlavour) {
        this.creamFlavour = creamFlavour;
        return this;
    }

    public CakeBuilder setDecorateType(String decorateType) {
        this.decorateType = decorateType;
        return this;
    }

    public CakeBuilder setBakeTime(int bakeTime) {
        this.bakeTime = bakeTime;
        return this;
    }

    public Cake build() {
        return new Cake(breadType, creamFlavour, decorateType, bakeTime);
}
}