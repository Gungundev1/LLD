package StructuralDesignPattern.Adapter;

public class Driver {
    public static void main(String[] args) {
        USBCharger usbCharger=new USBCharger();
        TypeCPhone phone=new TypeCAdapter(usbCharger);
        phone.chargeWithTypeC();
    }
}
