package com.swingy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChooseHerroFrame {

    public static void main(String[] args) {

        new ChooseHerroFrame();


    }

    private static JFrame chooseHerro;
    JFrame gameFrame = new JFrame();

    private static Container container;
    private static JPanel titleNamePanel, herroButtunPanel,mainTextPanel,choiceButtonpanel;
    private static JLabel titleNameLabel;
    private static JTextArea mainTextArea;
    private static Font titleFont = new Font("Time New Roma",Font.PLAIN,40);
    private static Font ButtonFont = new Font("Time New Roma",Font.PLAIN,20);
    private static JButton Hulk,captainAmerica,rightbotton,upbotton,downbotton,leftbotton;
    HerroScreenHander tittleScreenHander = new HerroScreenHander();
    Tittle Tittle = new Tittle();

    public  ChooseHerroFrame (){


        chooseHerro = new JFrame();
        chooseHerro.setSize(800, 600);
        chooseHerro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseHerro.getContentPane().setBackground(Color.black);
        chooseHerro.setLayout(null);
        chooseHerro.setVisible(true);
        container = chooseHerro.getContentPane();


        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,100);
        titleNamePanel.setBackground(Color.black);
        titleNamePanel.setVisible(true);

        titleNameLabel = new JLabel("CHOOSE YOUR HERRO");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        titleNamePanel.setVisible(true);


        herroButtunPanel = new JPanel();
        herroButtunPanel.setBounds(300,400,200,100);
        herroButtunPanel.setBackground(Color.black);
        herroButtunPanel.setVisible(true);

        Hulk = new JButton("HULK");
        Hulk.setBackground(Color.black);
        Hulk.setForeground(Color.black);
        Hulk.setFont(ButtonFont);
        Hulk.addActionListener(tittleScreenHander);


        captainAmerica = new JButton("CAPTAIN AMERICA");
        captainAmerica.setBackground(Color.black);
        captainAmerica.setForeground(Color.black);
        captainAmerica.setFont(ButtonFont);




        herroButtunPanel.add(Hulk);
        herroButtunPanel.add(captainAmerica);


        container.add(titleNamePanel);
        container.add(herroButtunPanel);



    }

    public class HerroScreenHander implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {



            createGameFrame();



        }
    }






    public void createGameFrame() {
        chooseHerro.setVisible(true);
        herroButtunPanel.setVisible(false);
        titleNamePanel.setVisible(false);
//        gameFrame.setSize(800, 600);
//        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        gameFrame.getContentPane().setBackground(Color.black);
//        gameFrame.setLayout(null);
//        gameFrame.setVisible(true);
//        container = gameFrame.getContentPane();


        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 100);
        titleNamePanel.setBackground(Color.black);
        container.add(titleNamePanel);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        container.add(mainTextPanel);


        mainTextArea = new JTextArea("");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(ButtonFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);



        choiceButtonpanel = new JPanel();
        choiceButtonpanel.setBounds(250, 350, 300, 150);
        choiceButtonpanel.setBackground(Color.black);
        choiceButtonpanel.setLayout(new GridLayout(4, 1));
        container.add(choiceButtonpanel);

        leftbotton = new JButton("left");
        leftbotton.setBackground(Color.black);
        leftbotton.setForeground(Color.black);
        leftbotton.setFont(ButtonFont);
        leftbotton.setFocusPainted(false);
        choiceButtonpanel.add(leftbotton);


        rightbotton = new JButton("Right");
        rightbotton.setBackground(Color.black);
        rightbotton.setForeground(Color.black);
        rightbotton.setFont(ButtonFont);
        choiceButtonpanel.add(rightbotton);

        upbotton = new JButton("up");
        upbotton.setBackground(Color.black);
        upbotton.setForeground(Color.black);
        upbotton.setFont(ButtonFont);
        upbotton.setFocusPainted(false);
        upbotton.addActionListener(tittleScreenHander);
        choiceButtonpanel.add(upbotton);


        downbotton = new JButton("down");
        downbotton.setBackground(Color.black);
        downbotton.setForeground(Color.black);
        downbotton.setFont(ButtonFont);
        downbotton.setFocusPainted(false);
        downbotton.addActionListener(Tittle);
        choiceButtonpanel.add(downbotton);


    }


    public void printNow(){
        String jam = "i am";
        mainTextArea.setText(jam);

    }

    public void printNowthis(){
        String jam = "i am jam";
        mainTextArea.setText(jam);

    }



    public class TittleScreenHander implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {


            printNow();


        }
    }

    public class Tittle implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            mainTextArea.append(" johnson");

        }
    }
}

