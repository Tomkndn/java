package BTech;
import java.io.*;
public class bufferReader{
    public static void main(String args[])throws IOException{             
        InputStreamReader so = new InputStreamReader(System.in);    
        BufferedReader mu = new BufferedReader(so);  
        System.out.print("Enter your name: ");         
        String name = mu.readLine();
        int leng = name.length();
        System.out.println("Your name - "+ name + " has " + leng + " letters.");
        
        so.close();     
        mu.close();    
           
       } 

}