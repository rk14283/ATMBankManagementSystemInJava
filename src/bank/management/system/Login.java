package bank.management.system;

import javax.swing.*;

import java.awt.Image;
import java.io.File;
import java.awt.*; 
public class Login extends JFrame {
	
	Login() {
		

        setTitle("Automated Teller Machine");
        //Without this, the image would be in center 
        setLayout(null); 


        ImageIcon i1 = null; // Initialize to null

     
     
        	// And you run the application from 'YourProjectRoot'
            String userDir = System.getProperty("user.dir");
            // Construct the path relative to the user.dir
            // Assuming 'src/icons/logo.jpg' relative to the project root
            String absoluteImagePath = userDir + File.separator + "src" + File.separator + "icons" + File.separator + "logo.jpg";

           //Very common pattern, file not in the right place 
            File imageFile = new File(absoluteImagePath);
            if (imageFile.exists()) {
                i1 = new ImageIcon(absoluteImagePath);
                
                Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT); 
                ImageIcon i3 = new ImageIcon(i2); 
                JLabel label = new JLabel(i3); 
                //Without this image stays in centre 
                label.setBounds(60,50,100,100);
                add(label); 
                
                JLabel text = new JLabel("Welcome to ATM"); 
                text.setBounds(200,40,100,40);
                add(text); 
                
                getContentPane().setBackground(Color.white);
                //Extra stuff
                
                System.out.println("Image found using user.dir: " + absoluteImagePath);
            } else {
                System.err.println("Error: Image NOT FOUND at absolute path: " + absoluteImagePath);
                System.err.println("Please ensure 'logo.jpg' is in 'YourProjectRoot/src/icons/' and run from 'YourProjectRoot'.");
                // Handle case where image is still not found (e.g., display a blank icon, or exit)
                //JOptionPane.showMessageDialog(this, "Image not found! Application may not display correctly.", "Error", JOptionPane.ERROR_MESSAGE);
                i1 = new ImageIcon(); // Create an empty ImageIcon to prevent NPE further down
            }
        

        // top left origin of frame
        setSize(800, 480);
        setVisible(true);
        // Change location of frame 350=left to right(x) 400=top to bottom (y)
        setLocation(350,200);

    }

	public static void main(String args[]) {
		new Login(); 
		
		
		
	}

}
