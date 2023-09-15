package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    //frame is the main windows, it's constructor receive a parameter that will be the title of the window.
    public void window(){
        JFrame frame = new JFrame("First User Interface Program");
        frame.setSize(500, 200);
        /*This method "setDefaultCloseOperation" will tell java what to do when the window is closed, if you do not use
        it, when you close the window the program will continue running.*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        //JTextField will receive a user input. The argument size of the text field, each unit is the size of one character
        JTextField inputText = new JTextField(30);

        JButton okButton = new JButton("Ok");

        frame.add(inputText);
        frame.add(okButton);

        JLabel label = new JLabel();

        okButton.addActionListener(e -> {
            label.setText(inputText.getText());
            frame.remove(inputText);
            frame.remove(okButton);
            frame.add(label);
            frame.revalidate(); //without this line, the inputBox still in the window
            frame.repaint(); //this one will repaint the window, without it, the textbox removed still there, but without interaction
        });

        frame.setVisible(true);
    }
}
