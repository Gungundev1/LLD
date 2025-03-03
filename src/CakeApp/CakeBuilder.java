package CakeApp;

public  class CakeBuilder {
    private final Cake cake;
    public CakeBuilder(){

        this.cake=new Cake();
    }
//    public CakeBuilder addBreadTYpe(String breadType){
//        cake.setBreadType(breadType);
//        return this;
//    }
//    public CakeBuilder setCreamFlavour(String creamFlavour){
//        cake.setCreamFlavour(creamFlavour);
//        return this;
//    }
//    public CakeBuilder setDecorationType(String decorateType){
//        cake.setDecorateType(decorateType);
//        return this;
//    }
//    public CakeBuilder setBakeTime(int bakeType){
//        cake.setBakeTime(bakeType);
//        return this;
//    }

  public Cake build(){
        return cake;
  }

}
