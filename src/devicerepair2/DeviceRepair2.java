package devicerepair2;


public class DeviceRepair2 {

    
    public static void main(String[] args) {
        device myNewDevice = new device("12345", "Lenovo 3", "Julie", "Smashed Screen", "Not started yet", 1);
        System.out.println(myNewDevice.toString());
        String thing = myNewDevice.toString();
                
        String[] Device = thing.split(". ");
        System.out.println(Device[2]);
    }
    
}
