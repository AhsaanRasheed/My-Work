package chat;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
//import static project.runner.input;

public class user extends Inputs implements Serializable{
    public static Scanner input = new Scanner(System.in);
    
    public user() {super();}
    
    public user(String FirstName, String LastName, String UserName, String Password, String Email, String PhoneNo, String CNIC, String city)
    {   super(FirstName, LastName, UserName, Password, Email, PhoneNo, CNIC);}
    

    public static void WriteToFile(user b)
    {
        ArrayList<user> list1 =  readFromFile1();
        list1.add(b);
        try
        {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("user"));
            output.writeObject(list1);
            output.close();
        }
        catch(IOException e)
        {       
        }
    }
    
    public static ArrayList<user> readFromFile1()
    {
        ArrayList<user> list1 = new ArrayList<user>();
        try
        {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("user"));

            list1 = (ArrayList<user>) input.readObject();
        }
        catch(ClassNotFoundException c)
        {        
        }
        catch(ClassCastException d)
        {        
        }
        catch(IOException i)
        {  
        }
        return list1;
    }
}