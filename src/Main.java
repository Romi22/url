

import java.net.*;
import java.io.*;
public class Main
{
    public static void main (String args[])
    {
        String data;
        try
        {
            URL url = new URL("http://localhost:8087/stu-app/check?id=RN1");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            data = br.readLine();

            System.out.println(data);

            br.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}