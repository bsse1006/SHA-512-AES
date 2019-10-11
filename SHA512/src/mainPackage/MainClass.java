package mainPackage;

import othersPackage.PreProcessor;
import othersPackage.Round;
import othersPackage.SHA;

public class MainClass
{
    public static void main(String[] args) throws Exception {

        SHA hasher = new SHA("C:\\Users\\ASUS\\Desktop\\SHA512\\src\\files\\input.txt");

        System.out.println(hasher.getHashResult());
    }
}
