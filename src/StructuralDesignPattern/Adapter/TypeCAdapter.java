package StructuralDesignPattern.Adapter;

public class TypeCAdapter implements TypeCPhone{
    private USBCharger usbCharger;
    public TypeCAdapter(USBCharger usbCharger){
     this.usbCharger=usbCharger;
    }
    @Override
    public void chargeWithTypeC() {
        System.out.println("Adapter converts USB charger to Type-C");
        usbCharger.charge();
    }
}
