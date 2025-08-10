import java.io.*;

interface Animal
{
    void sound();
}

interface pet
{
    void pet();
}

public class multipleinheritance implements Animal,pet {

    public void sound()
    {
        System.out.println("Animal makes a sound");
    }
 
    public void pet()
    {
        System.out.println("This is a pet");
    }

    public static void main(String[] args)
    {
        multipleinheritance obj=new multipleinheritance();
        obj.sound();
        obj.pet();
        System.out.println("Multiple inheritance example in Java");
    }

}
