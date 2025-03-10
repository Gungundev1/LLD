package CreationalDesignPattern.Builder;

public  class CakeBuilder {

    private String breadType;
    private String creamFlavour;
    private String decorateType;
    private int bakeTime;

Cake cake=new Cake();

    public void setBreadType(String breadType){
        this.breadType=breadType;
    }
    public CakeBuilder setCreamFlavour(String creamFlavour){
        this.creamFlavour=creamFlavour;
        return this;
    }
    public CakeBuilder setDecorateType(String decorateType){
       this.decorateType=decorateType;
        return this;
    }
    public CakeBuilder setBakeTime(int bakeTime){
        this.bakeTime=bakeTime;
        return this;
    }


  public Cake build(){

   return cake;
//                breadType,creamFlavour,decorateType,bakeTime

  }


}
