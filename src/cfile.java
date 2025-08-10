
import java.io.*;

public class cfile {
    public static void main(String[] args) throws IOException
    {
        FileReader in=null;
        FileWriter out=null;

        try
        {
            in=new FileReader("input1.txt");
            out=new FileWriter("output1.txt");

            int c;

            while((c=in.read()) != -1)
            {
                System.out.println("Reading character: " + (char)c);
                out.write(c);
                System.out.println("The character read is: " + (char)c);
            }
        }

        finally
        {
            in.close();
            out.close();
            
        }
    }
    
}
