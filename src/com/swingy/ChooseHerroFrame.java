package com.swingy;

import javax.swing.*;
import java.awt.*;



public class ChooseHerroFrame {

    public static void main(String[] args) {

        new ChooseHerroFrame();


    }

    JFrame chooseHerro;
    Container con;
    JPanel titleNamePanel, startButtunPanel,mainTextPanel,choiceButtonpanel;
    JLabel titleNameLabel;
    JTextArea mainTextArea;
    Font titleFont = new Font("Time New Roma",Font.PLAIN,40);
    Font ButtonFont = new Font("Time New Roma",Font.PLAIN,20);
    JButton Hulk,captainAmerica,rightbotton,upbotton,downbotton;


    public ChooseHerroFrame (){


        chooseHerro = new JFrame();
        chooseHerro.setSize(800, 600);
        chooseHerro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseHerro.getContentPane().setBackground(Color.black);
        chooseHerro.setLayout(null);
        chooseHerro.setVisible(true);
        con = chooseHerro.getContentPane();


        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,100);
        titleNamePanel.setBackground(Color.black);

        titleNameLabel = new JLabel("CHOOSE YOUR HERRO");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);

        startButtunPanel = new JPanel();
        startButtunPanel.setBounds(300,400,200,100);
        startButtunPanel.setBackground(Color.black);

        Hulk = new JButton("HULK");
        Hulk.setBackground(Color.black);
        Hulk.setForeground(Color.black);
        Hulk.setFont(ButtonFont);

        captainAmerica = new JButton("CAPTAIN AMERICA");
        captainAmerica.setBackground(Color.black);
        captainAmerica.setForeground(Color.black);
        captainAmerica.setFont(ButtonFont);




        startButtunPanel.add(Hulk);
        startButtunPanel.add(captainAmerica);


        con.add(titleNamePanel);
        con.add(startButtunPanel);



    }

}
