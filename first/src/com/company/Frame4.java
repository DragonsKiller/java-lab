package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame4 extends JPanel {
    JButton b1;
    JTextField t;
    JCheckBox cb1;
    JCheckBox cb2;
    JCheckBox cb3;


    public Frame4() {
        setLayout(new FlowLayout());
        t = new JTextField(10);
        add(t);

        b1 = new JButton("изменить");
        b1.setPreferredSize(new Dimension(100, 20));
        add(b1);

        cb1 = new JCheckBox("первая");
        cb2 = new JCheckBox("вторая");
        cb3 = new JCheckBox("третья");

        add(t);
        add(b1);
        add(cb1);
        add(cb2);
        add(cb3);


        b1.addActionListener(new Moove());
    }


    public class Moove implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                if (0 == t.getText().compareTo(cb1.getText())) {
                    cb1.setSelected(!cb1.isSelected());
                    return;
                }
                if (0 == t.getText().compareTo(cb2.getText())) {
                    cb2.setSelected(!cb2.isSelected());
                    return;
                }
                if (0 == t.getText().compareTo(cb3.getText())) {
                    cb3.setSelected(!cb3.isSelected());
                    return;
                }

                JOptionPane.showMessageDialog(null, "Такого переключателя не существует");
        }
    }
}