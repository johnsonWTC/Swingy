package com.swingy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChooseHerroFrame {

    public static void main(String[] args) {

        new ChooseHerroFrame();


    }


    int score = 0;
    Herros herro =HerroMaker.HerroMaker("1");
    int portionPower = 50;
    int Numportion = 3;
    int runningTries = 3;
    int herroPower = herro.getHerroPower();
    int herroHP = herro.getHerroHP();
    int herroDefense = herro.getDefense();
    int herroExpiriance = herro.getHerroExpiriance();
    int herroWeapon = herro.getWeapon();
    int herroAmor = herro.getHerroAmor();
    int herroHelm = herro.getHerroHelm();
    int villenStreagth = 1;
    int villenHit;
    int herroHit;
    int HerroLifes = 3;
    int NumVillen = 2;
    int level = 1;
    private static JFrame chooseHerro;
    private static Container container;
    private static JPanel titleNamePanel, herroButtunPanel,mainTextPanel,choiceButtonpanel,herroStatsPanel;
    private static JLabel titleNameLabel,playerHpLabel,playerScoreLabel,playerLevelLabel,playerWeponLebel;
    private static JTextArea mainTextArea,playerHp,playerScore,playerLevel,playerWepon;
    private static Font titleFont = new Font("Time New Roma",Font.PLAIN,40);
    private static Font ButtonFont = new Font("Time New Roma",Font.PLAIN,20);
    private static Font statsFont = new Font("Time New Roma",Font.PLAIN,15);
    private static JButton Hulk,captainAmerica,rightbotton,upbotton,downbotton,leftbotton,fightButton,runButton;
    HerroScreenHandler tittleScreenHander = new HerroScreenHandler();
    LeftMovement leftMovement = new LeftMovement();
    RightMovement rightMovement = new RightMovement();
    UpMovement upMovement = new UpMovement();
    DownMovement downMovement = new DownMovement();
    RunningMovement runningMovement = new RunningMovement();
    FightingMovement fightingMovement = new FightingMovement();




    public    ChooseHerroFrame (){


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
        herroButtunPanel.add(Hulk);


        captainAmerica = new JButton("CAPTAIN AMERICA");
        captainAmerica.setBackground(Color.black);
        captainAmerica.setForeground(Color.black);
        captainAmerica.setFont(ButtonFont);

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

        herroButtunPanel.setVisible(false);
        titleNamePanel.setVisible(false);


        herroStatsPanel = new JPanel();
        herroStatsPanel.setBounds(100,10,600,50);
        herroStatsPanel.setBackground(Color.black);
        container.add(herroStatsPanel);


        playerHpLabel = new JLabel("PlayerHP");
        playerHpLabel.setBounds(100,25,50,50);
        playerHpLabel.setBackground(Color.black);
        playerHpLabel.setForeground(Color.white);
        playerHpLabel.setFont(statsFont);
        herroStatsPanel.add(playerHpLabel);

        playerHp = new JTextArea("2000");
        playerHp.setBounds(100,50,50,50);
        playerHp.setBackground(Color.black);
        playerHp.setForeground(Color.white);
        playerHp.setFont(statsFont);
        herroStatsPanel.add(playerHp);




        playerLevelLabel = new JLabel("PlayerLevel");
        playerLevelLabel.setBounds(100,25,50,50);
        playerLevelLabel.setBackground(Color.black);
        playerLevelLabel.setForeground(Color.white);
        playerLevelLabel.setFont(statsFont);
        herroStatsPanel.add(playerLevelLabel);

        playerLevel = new JTextArea("2000");
        playerLevel.setBounds(100,50,50,50);
        playerLevel.setBackground(Color.black);
        playerLevel.setForeground(Color.white);
        playerLevel.setFont(statsFont);
        herroStatsPanel.add(playerLevel);







        playerScoreLabel = new JLabel("PlayerScore");
        playerScoreLabel.setBounds(100,25,50,50);
        playerScoreLabel.setBackground(Color.black);
        playerScoreLabel.setForeground(Color.white);
        playerScoreLabel.setFont(statsFont);
        herroStatsPanel.add(playerScoreLabel);

        playerLevel = new JTextArea("2000");
        playerLevel.setBounds(100,50,50,50);
        playerLevel.setBackground(Color.black);
        playerLevel.setForeground(Color.white);
        playerLevel.setFont(statsFont);
        herroStatsPanel.add(playerLevel);




        playerWeponLebel = new JLabel("PlayerWepon");
        playerWeponLebel.setBounds(100,25,50,50);
        playerWeponLebel.setBackground(Color.black);
        playerWeponLebel.setForeground(Color.white);
        playerWeponLebel.setFont(statsFont);
        herroStatsPanel.add(playerWeponLebel);

        playerWepon = new JTextArea("2000");
        playerWepon.setBounds(100,50,50,50);
        playerWepon.setBackground(Color.black);
        playerWepon.setForeground(Color.white);
        playerWepon.setFont(statsFont);
        herroStatsPanel.add(playerWepon);







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


        fightButton = new JButton("Fight");
        fightButton.setBackground(Color.black);
        fightButton.setForeground(Color.white);
        fightButton.setFont(ButtonFont);
        fightButton.setFocusPainted(false);
        fightButton.addActionListener(fightingMovement);
        choiceButtonpanel.add(fightButton);



        runButton = new JButton("Run");
        runButton.setBackground(Color.black);
        runButton.setForeground(Color.white);
        runButton.setFont(ButtonFont);
        runButton.setFocusPainted(false);
        runButton.addActionListener(runningMovement);
        choiceButtonpanel.add(runButton);



        leftbotton = new JButton("left");
        leftbotton.setBackground(Color.black);
        leftbotton.setForeground(Color.white);
        leftbotton.setFont(ButtonFont);
        leftbotton.setFocusPainted(false);
        leftbotton.addActionListener(leftMovement);
        choiceButtonpanel.add(leftbotton);


        rightbotton = new JButton("Right");
        rightbotton.setBackground(Color.black);
        rightbotton.setForeground(Color.white);
        rightbotton.setFont(ButtonFont);
        rightbotton.addActionListener(rightMovement);
        choiceButtonpanel.add(rightbotton);

        upbotton = new JButton("up");
        upbotton.setBackground(Color.black);
        upbotton.setForeground(Color.white);
        upbotton.setFont(ButtonFont);
        upbotton.setFocusPainted(false);
        upbotton.addActionListener(upMovement);
        choiceButtonpanel.add(upbotton);


        downbotton = new JButton("down");
        downbotton.setBackground(Color.black);
        downbotton.setForeground(Color.white);
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

    public class FightingMovement implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            playerHp.setText(""+ score);

        }
    }

    public class RunningMovement implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            mainTextArea.setText("you are running");

        }
    }
}

