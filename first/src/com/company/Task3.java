package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task3 extends JPanel {
    JButton b1;
    JTextField t;
    JPanel bP;
    ButtonGroup gr;
    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;

    public Task3() {
        setLayout(new FlowLayout());
        t = new JTextField(10);
        add(t);

        b1 = new JButton("изменить");
        b1.setPreferredSize(new Dimension(100, 20));
        add(b1);

        bP = new JPanel();
        gr = new ButtonGroup();

        rb1 = new JRadioButton("1");
        rb2 = new JRadioButton("2");
        rb3 = new JRadioButton("3");

        gr.add(rb1);
        bP.add(rb1);

        gr.add(rb2);
        bP.add(rb2);

        gr.add(rb3);
        bP.add(rb3);

        add(bP, BorderLayout.SOUTH);

        b1.addActionListener(new Moove());
    }


    public class Moove implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
                if (0 == t.getText().compareTo(rb1.getText())) {
                    rb1.setSelected(true);
                    rb2.setSelected(false);
                    rb3.setSelected(false);
                    return;
                }
                if (0 == t.getText().compareTo(rb2.getText())) {
                    rb1.setSelected(false);
                    rb2.setSelected(true);
                    rb3.setSelected(false);
                    return;
                }
                if (0 == t.getText().compareTo(rb3.getText())) {
                    rb1.setSelected(false);
                    rb2.setSelected(false);
                    rb3.setSelected(true);
                    return;
                }
                JOptionPane.showMessageDialog(null, "Такого переключателя не существует");
        }
    }
}