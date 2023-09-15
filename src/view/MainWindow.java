package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{
    public MainWindow(){
        this.setTitle("First User Interface Program");
        this.setSize(500, 200);
        this.setResizable(false);
        /*This method "setDefaultCloseOperation" will tell java what to do when the window is closed, if you do not use
        it, when you close the window the program will continue running.*/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());

        //JTextField will receive a user input. The argument size of the text field, each unit is the size of one character
        JTextField inputText = new JTextField(30);

        JButton okButton = new JButton("Ok");
        JLabel label = new JLabel();
        this.add(inputText);
        this.add(okButton);

        okButton.addActionListener(e -> {
            label.setText(inputText.getText());
            this.remove(inputText);
            this.remove(okButton);
            this.add(label);
            this.revalidate(); //without this line, the inputBox still in the window
            this.repaint(); //this one will repaint the window, without it, the textbox removed still there, but without interaction
        });

        this.getContentPane().setBackground(new Color(60,0,120));

        ImageIcon image = new ImageIcon("/assets/image.png");
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }
}
