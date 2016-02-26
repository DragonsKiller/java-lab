package com.company;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.*;

public class Frame5 extends JPanel{
    JButton b1;
    JButton b2;
    JButton b3;
    JTextField t;
    int n=1;
    JTable tb;


    public Frame5() {
        setLayout(new FlowLayout());
        t = new JTextField(10);
        b1 = new JButton("Занести");
        add(t);
        b1.setPreferredSize(new Dimension(100, 20));
        add(b1);
        b1.addActionListener(new Moove1());

        tb = new JTable(11, 2);
        add(tb);

        b2 = new JButton("Перенести в 2");
        b2.setPreferredSize(new Dimension(150, 20));
        add(b2);
        b2.addActionListener(new Moove2());

        b3 = new JButton("Перенести в 1");
        b3.setPreferredSize(new Dimension(150, 20));
        add(b3);
        b3.addActionListener(new Moove3());

    }

    public class Moove1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
                for (int i = n - 1; i < n; i++) {
                    tb.setValueAt(t.getText(), i, 0);
                }
                n++;
        }
    }

    public class Moove2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int[] selectedRows1 = tb.getSelectedRows();
            for (int k = 0; k < selectedRows1.length; k++) {
                String result1 = "";
                int selIndex = selectedRows1[k];
                TableModel model = tb.getModel();
                Object value = model.getValueAt(selIndex, 0);
                result1 = result1 + value;
                tb.setValueAt(result1, selIndex, 1);
                tb.setValueAt("", selIndex, 0);
            }
        }
    }

    public class Moove3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int[] selectedRows2 = tb.getSelectedRows();
            for (int k = 0; k < selectedRows2.length; k++) {
                String result2 = "";
                int selIndex = selectedRows2[k];
                TableModel model = tb.getModel();
                Object value = model.getValueAt(selIndex, 1);
                result2 = result2 + value;
                tb.setValueAt(result2, selIndex, 0);
                tb.setValueAt("", selIndex, 1);
            }
        }
    }


}

