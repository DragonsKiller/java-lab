package com.company;

        import javax.swing.*;
        import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Additional task");

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();

        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);


        frame.setLayout(new GridLayout(3, 2));
        frame.add(task1);
        frame.add(task2);
        frame.add(task3);
        frame.add(task4);
        frame.add(task5);
        
    }
}


