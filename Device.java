public interface Device 
{
    //default constructor
    default void turnOn() 
    {
        System.out.println("The device is now on.");
    }    
}
