package com.swingy;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        Font titleFont = new Font("Time New Roma", Font.PLAIN, 40);
        Font ButtonFont = new Font("Time New Roma", Font.PLAIN, 20);
        Font statsFont = new Font("Time New Roma", Font.PLAIN, 15);

        JFrame frame = new JFrame();
        frame.setTitle("text");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel tittleNamePanel = new JPanel();
        tittleNamePanel.setBounds(100,100,600,100);
        tittleNamePanel.setBackground(Color.black);
        frame.add(tittleNamePanel);

        JLabel titleNameLabel = new JLabel("CHOOSE YOUR HERRO");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        tittleNamePanel.add(titleNameLabel);
        tittleNamePanel.setVisible(true);



        JPanel   herroButtunPanel = new JPanel();
        herroButtunPanel.setBounds(300, 400, 240, 100);
//      herroButtunPanel.setBackground(Color.white);
        herroButtunPanel.setVisible(true);

        frame.add(herroButtunPanel);

       JButton Hulk = new JButton("HULK");
        Hulk.setBackground(Color.black);
//        Hulk.setForeground(Color.black);
        Hulk.setFont(ButtonFont);
//        Hulk.addActionListener(tittleScreenHander);
        herroButtunPanel.add(Hulk);


        JButton captainAmerica = new JButton("CAPTAIN AMERICA");
        captainAmerica.setBackground(Color.black);
//        captainAmerica.setForeground(Color.black);
        captainAmerica.setFont(ButtonFont);

        herroButtunPanel.add(captainAmerica);


        frame.setVisible(true);
    }


//    public ChooseHerroFrame() {
//
//
//
//
//
//
//
//
//
//
//
//
//        titleNameLabel = new JLabel("CHOOSE YOUR HERRO");
//        titleNameLabel.setForeground(Color.white);
//        titleNameLabel.setFont(titleFont);
//        titleNamePanel.add(titleNameLabel);
//        titleNamePanel.setVisible(true);
//
//
//        herroButtunPanel = new JPanel();
//        herroButtunPanel.setBounds(300, 400, 200, 100);
//        herroButtunPanel.setBackground(Color.black);
//        herroButtunPanel.setVisible(true);
//
//        Hulk = new JButton("HULK");
//        Hulk.setBackground(Color.black);
//        Hulk.setForeground(Color.black);
//        Hulk.setFont(ButtonFont);
//        Hulk.addActionListener(tittleScreenHander);
//        herroButtunPanel.add(Hulk);
//
//
//        captainAmerica = new JButton("CAPTAIN AMERICA");
//        captainAmerica.setBackground(Color.black);
//        captainAmerica.setForeground(Color.black);
//        captainAmerica.setFont(ButtonFont);
//
//        herroButtunPanel.add(captainAmerica);
//
//
//        container.add(titleNamePanel);
//        container.add(herroButtunPanel);
//
//
//    }



//    public void TheFrame(){
//        // 1. You woke up this morning and decided to do construction on the 5th floor chill area
//        // 2. You knew about the construction and forgot to  inform us
//        // 3. You knew about the construction and decide you will not tell us.
//        // so which one is it?
//
//        JFrame frame = new JFrame();
//        frame.setTitle("text");
//        frame.setSize(700,500);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JButton button = new JButton("go");
//        button.setBounds(20,30, 40,50);
//        button.setBackground(Color.blue);
//        button.setForeground(Color.white);
//
//        frame.add(button);
//        frame.setVisible(true);
//
//    }
}
