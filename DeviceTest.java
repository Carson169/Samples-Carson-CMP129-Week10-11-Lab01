import java.util.ArrayList;
public class DeviceTest 
{
    public static void main(String[] args) 
    {
        //object creation
        Device phone1 = new Smartphone("Apple", "iPhone 17", 6.1);
        Device phone2 = new Smartphone("Samsung", "Galaxy S26", 6.7);
        Device laptop1 = new Laptop("Dell", "XPS", "Intel Core i7");
        Device laptop2 = new Laptop("Apple", "MacBook Air", "Apple M5");
        //arraylist creation
        ArrayList<Device> devices = new ArrayList<>();
        //adding devices to arraylist
        devices.add(phone1);
        devices.add(phone2);
        devices.add(laptop1);
        devices.add(laptop2);
        //using turnOn() method for each device object in device arraylist
        System.out.println("Devices Powered On:");
        for (Device device : devices)
        {
            device.turnOn();
        }
    }
}