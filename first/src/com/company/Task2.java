package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task2 extends JPanel {
    JButton b1;
    JButton b2;
    JTextField t;
    String boof;


    public Task2() {
        setLayout(new FlowLayout());
        t = new JTextField(10);
        b1 = new JButton("изменить");
        b1.setPreferredSize(new Dimension(100, 20));
        b2 = new JButton("перемешать");
        b2.setPreferredSize(new Dimension(150, 20));

        add(t);
        add(b1);
        add(b2);

        b1.addActionListener(new Moove1());
        b2.addActionListener(new Moove2());
    }

    public class Moove1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            b2.setText(t.getText());
        }
    }

    public class Moove2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            boof = b1.getText();
            b1.setText(b2.getText());
            b2.setText(boof);
        }
    }
}