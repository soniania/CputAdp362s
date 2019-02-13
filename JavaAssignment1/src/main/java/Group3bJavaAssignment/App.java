package Group3bJavaAssignment;

import javax.swing.*;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] arg)
    {
        //String name;
        //String surname = "";
        //int age = 0;

        //System.out.println( "Hello World!" );
        try {
            String name = JOptionPane.showInputDialog(null, "Enter name: ");
            String surname = JOptionPane.showInputDialog(null, "Enter surname: ");
            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter age: "));

            StringBuilder builder = new StringBuilder();
            JOptionPane.showMessageDialog(null, builder.append("First Name: " + name + "\n" + "Last Name: ") + surname + "\n" + "Age: " + age);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

}
