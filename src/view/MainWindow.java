package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    //Jframe is the main windows, it's constructor receive an parameter that will be the title of the window.
    public void window(){
        JFrame frame = new JFrame("First User Interface Program");
        frame.setSize(500, 200);
        /*This method "setDefaultCloseOperation" will tell java what to do when the windows is closed, if you do not use
        it, when you close the window the program will continue running.*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        //JTextField will receive an user input. The argument size of the text field, each unit is the size of one caractere
        JTextField inputText = new JTextField(30);
        frame.add(inputText);

        String label = inputText.getText();

        frame.setVisible(true);
    }
}
