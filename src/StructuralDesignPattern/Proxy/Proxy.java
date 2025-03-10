package StructuralDesignPattern.Proxy;

public class Proxy implements Attendance{
private RealAttendance realAttendance;
private String name;
public Proxy(String name){
    this.name=name;
}
    @Override
    public void attendClass() {
        if (realAttendance==null){
            realAttendance=new RealAttendance(name);
        }
        realAttendance.attendClass();
    }
}
