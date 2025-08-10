package RMIDemo;
import java.rmi.*;
import java.rmi.registry.*;

public class Server
{
    public static void main(String[] args)
    {
        try
        {
            Registry registry=LocateRegistry.createRegistry(9000);
            CalcRemote obj=new CalcRemote();
            registry.rebind("multiply",obj);
            System.out.println("Server Ready");
        }
        catch(Exception e)
        {
            System.out.println("Exception caught"+e.getMessage());
        }
    }
}
