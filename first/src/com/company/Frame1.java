package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends JPanel {
    private static final long serialVersionUID = 1L;
   private JButton b;
    private JTextField t;
    private JTextArea tA;
    private JScrollPane sP;
    private JComboBox cB;


    Frame1() {
        add(Box.createVerticalStrut(75));
        setLayout(new FlowLayout());
        t = new JTextField(10);
        b = new JButton("Клик");
        add(t);
        b.setPreferredSize(new Dimension(100, 20));
        add(b);

        tA = new JTextArea(5, 20);
        sP = new JScrollPane(tA);
        tA.setEditable(false);
        add(tA);
        cB = new JComboBox();
        add(cB);

        b.addActionListener(new Moove());
    }

    public class Moove implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
                for (int i=0; i<cB.getItemCount(); i++) {
                    if (0==t.getText().compareTo(cB.getItemAt(i).toString())){
                        JOptionPane.showMessageDialog(null, "Данные уже существуют");
                        return;
                    }
                }
                tA.append(t.getText() + "\n");
                cB.addItem(t.getText());
                cB.setSelectedIndex(0);
        }
    }
}




