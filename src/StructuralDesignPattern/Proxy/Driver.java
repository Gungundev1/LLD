package StructuralDesignPattern.Proxy;

public class Driver {
    public static void main(String[] args) {
        Attendance attendance=new Proxy("Gungun");
        attendance.attendClass();
    }
}
