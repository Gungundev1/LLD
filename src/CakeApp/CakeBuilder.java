package CakeApp;

public  class CakeBuilder {
    private final Cake cake;
    public CakeBuilder(){
        this.cake=new Cake();
    }
    public CakeBuilder addBreadTYpe(String breadType){
        cake.setBread(breadType);
        return this;
    }
    public CakeBuilder addCreamFlavour(String creamFlavour){
        cake.addCreamFlavour(creamFlavour);
        return this;
    }
    public CakeBuilder addDecorationType(String decorateType){
        cake.addDecorationType(decorateType);
        return this;
    }
    public CakeBuilder takeBakeTime(int bakeType){
        cake.takeBakeTime(bakeType);
        return this;
    }

  public Cake build(){
        return cake;
  }

}
