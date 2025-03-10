package StructuralDesignPattern.Proxy;

public class RealAttendance implements Attendance {
    private String name;
    public RealAttendance(String name){
        this.name=  name;
    }

    @Override
    public void attendClass() {
        System.out.println("Attending the class "+name);
    }
}
