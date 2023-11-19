package ndsgui;


import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class MyFrame extends JFrame{
    
    MyFrame(){
        
        JLabel label = new JLabel();
        
        this.setTitle("Háttérképek");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,500);
        this.setVisible(true);
        this.add(label);
        
        ImageIcon image = new ImageIcon("hatter2.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
        
        ImageIcon image2 = new ImageIcon("hatter3.jpg");
        
        
        label.setText("Választható háttérképek");
        label.setForeground(Color.WHITE);
        label.setIcon(image2);
    }
    
    
}
