package com.company;

        import javax.swing.*;
        import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Additional task");

        Frame1 frame1 = new Frame1();
        Frame2 frame2 = new Frame2();
        Frame3 frame3 = new Frame3();
        Frame4 frame4 = new Frame4();
        Frame5 frame5 = new Frame5();

        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);


        frame.setLayout(new GridLayout(3, 2));
        frame.add(frame1);
        frame.add(frame2);
        frame.add(frame3);
        frame.add(frame4);
        frame.add(frame5);
        
    }
}


