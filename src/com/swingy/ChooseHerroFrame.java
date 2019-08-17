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
    private static JScrollPane movementPanel;
    private static JTextArea mainTextArea;
    private static Font titleFont = new Font("Time New Roma",Font.PLAIN,40);
    private static Font ButtonFont = new Font("Time New Roma",Font.PLAIN,20);
    private static JButton Hulk,captainAmerica,rightbotton,upbotton,downbotton,leftbotton;
    HerroScreenHandler tittleScreenHander = new HerroScreenHandler();
    LeftMovement leftMovement = new LeftMovement();
    RightMovement rightMovement = new RightMovement();
    UpMovement upMovement = new UpMovement();
   DownMovement downMovement = new DownMovement();


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

    public class HerroScreenHandler implements ActionListener {


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
        movementPanel = new JScrollPane();
        movementPanel.setBounds(280,100,600,250);
        movementPanel.setBackground(Color.black);
        mainTextPanel.setBounds(280, 100, 600, 250);
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
        leftbotton.addActionListener(leftMovement);
        choiceButtonpanel.add(leftbotton);


        rightbotton = new JButton("Right");
        rightbotton.setBackground(Color.black);
        rightbotton.setForeground(Color.black);
        rightbotton.setFont(ButtonFont);
        rightbotton.addActionListener(rightMovement);
        choiceButtonpanel.add(rightbotton);

        upbotton = new JButton("up");
        upbotton.setBackground(Color.black);
        upbotton.setForeground(Color.black);
        upbotton.setFont(ButtonFont);
        upbotton.setFocusPainted(false);
        upbotton.addActionListener(upMovement);
        choiceButtonpanel.add(upbotton);


        downbotton = new JButton("down");
        downbotton.setBackground(Color.black);
        downbotton.setForeground(Color.black);
        downbotton.setFont(ButtonFont);
        downbotton.setFocusPainted(false);
        downbotton.addActionListener(downMovement);
        choiceButtonpanel.add(downbotton);


    }





    public class UpMovement implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            mainTextArea.setText("you move up");

        }
    }


    public class DownMovement implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            mainTextArea.setText("you move down");

        }
    }
    public class LeftMovement implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            mainTextArea.setText("you move left");

        }
    }

    public class RightMovement implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            mainTextArea.setText("you move right");

        }
    }




}

