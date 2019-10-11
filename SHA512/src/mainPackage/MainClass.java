package mainPackage;

import othersPackage.PreProcessor;
import othersPackage.Round;
import othersPackage.SHA;

import java.io.FileOutputStream;

public class MainClass
{
    public static void main(String[] args) throws Exception {

        SHA hasher = new SHA("C:\\Users\\ASUS\\Desktop\\SHA512\\src\\files\\input.txt");

        String output = new String(hasher.getHashResult());

        System.out.println(output);

        FileOutputStream out = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\SHA512\\src\\files\\output.txt");

        for(int i = 0; i < 128; i++)
        {
            out.write(output.charAt(i));
        }
    }
}
