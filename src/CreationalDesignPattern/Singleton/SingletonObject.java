package CreationalDesignPattern.Singleton;

public class SingletonObject {
    private static SingletonObject instance;
    private SingletonObject(){}
    public static synchronized SingletonObject getInstance(){
        if (instance==null){
            instance=new SingletonObject();
        }
        return instance;
    }
    public void object(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        SingletonObject object1=SingletonObject.getInstance();
        object1.object("This is the first object:\n "+object1.hashCode());
        SingletonObject object2=SingletonObject.getInstance();
        object2.object("This is the second object:\n"+object2.hashCode());
        if (object1==object2){
            System.out.println("This is the singleton method");
        }
    }
}
