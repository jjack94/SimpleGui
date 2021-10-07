package com.java.james;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    private JPanel panel;
    private JLabel label0;
    private JLabel label1;
    private ImageIcon icon0;
    private ImageIcon icon1;

//main for executing tasks
    public static void main(String[] args) {
        Display gui = new Display();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(50,50);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Dogs");
    }

    public Display(){

        setLayout(new FlowLayout());
        setSize(50,50);

        //label 0 assignment to image0
        icon0 = new ImageIcon(getClass().getResource("WhatsApp Image 2021-08-17 at 09.48.07.jpeg"));
        label0.setIcon(icon0);
        panel.add(label0);

        //label 1 assigned image 1
        icon1 = new ImageIcon(getClass().getResource("WhatsApp Image 2021-09-17 at 13.56.12.jpeg"));
        label1.setIcon(icon1);
        panel.add(label1);

        add(panel);
        validate();
    }
}

