import com.swingy.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class jam {




        static Random random = new Random();

        static Scanner scanner = new Scanner(System.in);
        boolean running = true;
        static String input = scanner.nextLine();
        static Herros herro = HerroMaker.HerroMaker(input);
        static int score = 0;
        static int portionPower = 50;
        static int Numportion = 3;
        static int runningTries = 3;
        static int herroPower = herro.getHerroPower();
        static int herroHP = herro.getHerroHP();
        static  int herroDefense = herro.getDefense();
        static int herroExpiriance = herro.getHerroExpiriance();
        static int herroWeapon = herro.getWeapon();
        static int herroAmor = herro.getHerroAmor();
        static int herroHelm = herro.getHerroHelm();
        static int villenStreagth = 1;
        static int villenHit;
        static int herroHit;
        static int HerroLifes = 3;
        static int NumVillen = 2;
        static int level = 1;
        static int boardsize = (int) ((level - 1) * 5 + 10 - (level * (0.02)));



        static String payerName;
        static String Line = null;
        static BufferedReader reader = null;
        static String playerStatistics;
        static  String jay;
        static String splited[];
        static ArrayList<Object> playerStats = new ArrayList<>();
        static ArrayList<String> playerNames = new ArrayList<>();


        public static void theGame() {


            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            System.out.println("/**********************************\\");
            System.out.println("/*                                *\\");
            System.out.println("/* Welcome to The Avengers Game   *\\");
            System.out.println("/*                                *\\");
            System.out.println("/**********************************\\");

            System.out.println("Please Choose a Herro");
            System.out.println("1. Hulk");
            System.out.println("2. Captain  America");
            String input = scanner.nextLine();


            Herros herro =HerroMaker.HerroMaker(input);
//        System.out.println("you choose " + herro.getHerroName());
//        int score = 0;
//        int portionPower = 50;
//        int Numportion = 3;
//        int runningTries = 3;
//        int herroPower = herro.getHerroPower();
//        int herroHP = herro.getHerroHP();
//        int herroDefense = herro.getDefense();
//        int herroExpiriance = herro.getHerroExpiriance();
//        int herroWeapon = herro.getWeapon();
//        int herroAmor = herro.getHerroAmor();
//        int herroHelm = herro.getHerroHelm();
//        int villenStreagth = 1;
//        int villenHit;
//        int herroHit;
//        int HerroLifes = 3;
//        int NumVillen = 2;
//        int level = 1;
//        int boardsize = (int) ((level - 1) * 5 + 10 - (level * (0.02)));
//
//
//
//        String payerName;
//        String Line = null;
//        BufferedReader reader = null;
//        String playerStatistics;
//        String jay;
//        String splited[];
//        ArrayList<Object> playerStats = new ArrayList<>();
//        ArrayList<String> playerNames = new ArrayList<>();

            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.buildbord();

            System.out.println("Please insert your name");
            input = scanner.nextLine();

            try {
                reader = new BufferedReader(new FileReader("/goinfre/jdubula//Desktop/Swingy/" + "names" + ".txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            Game:
            while (true) {
                try {
                    if (!((Line = reader.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }

                splited = Line.split(" ");


//            int i = 0;
//            while (i < splited.length) {
//                playerNames.add(splited[i]);
//                i++;
//            }
//
                if (playerNames.contains(input)) {
                    System.out.println("the name is contained");
                    payerName = input;
                } else {
                    System.out.println("the name is not contained");
                    payerName = input;
                    playerStatistics = herroHP + " " + level + " " + score;
                    playerNames.add(input);
//            theSavingFuction();
//            dataBase();
//            ChooseHerroFrame();
                    break Game;
                }

            }
            mapBuilder.createCharArray(boardsize);
            mapBuilder.placePlayers();


            Game:
            while (running) {


                IVillen villen = VillenMaker.VillenMaker(random.nextInt(2) + 1);
                IVillen villenTwo = VillenMaker.VillenMaker(random.nextInt(2) + 1);

                if (score > 10) {
                    villenStreagth = 2;

                } else if (score > 30) {
                    villenStreagth = 3;
                }
                int villenPower = villen.getRobootPower();
                int villenHealth = villen.getRootHealth();

                int villenPowerTwo = villenTwo.getRobootPower();
                int villenHealthTwo = villenTwo.getRootHealth();


                System.out.println("\n************* " + villen.getVillenName() + " has appeard *************   " + level + " ");

                while (villenHealth >= 0) {
                    input = Choices.ChoicesOnTheMap();
                    boolean gamePlay = mapBuilder.movePlayer(input);
                    int i = mapBuilder.finishgame;
                    if (i == 0) {
                        System.out.println("\n");
                        System.out.println("\n************* " + villen.getVillenName() + " has appeard *************   ");
                        System.out.println("\nyou are now in level " + level);
                        mapBuilder.placePlayerAfterThelevelisComplete(level++);

                        break;
                    }
                    if (gamePlay) {
                        input = Choices.Choices();
                        if (input.equals("1")) {
                            villenHit = simulation.gameSimulationPlayerHit(herroAmor,herroDefense,herroWeapon,level,villen.getVillenAttack());
                            herroHit = (simulation.gameSimulationVillenHit(herroPower,herroExpiriance,herroWeapon,villen.getVillenDefense(),villen.getVillenWeapon(),level));
                            villenHealth = villenHealth - herroHit;
                            herroHP = herroHP - villenHit;

                            System.out.println();
                            System.out.println("you are fighting " + villen.getVillenName() + " ,you do " + herroHit + " damage to him, he does " + villenHit + " to you");
                            if (herroHP < 1) {
                                System.out.println("you died. \n 1. would you like to continue \n 2. start over");
                                input = scanner.nextLine();
                                if (input.equals("1")) {
                                    if (HerroLifes > 0) {
                                        herroPower = herro.getHerroPower();
                                        herroHP = herro.getHerroHP();
                                        Numportion = 3;
                                        HerroLifes--;
                                    } else {
                                        System.out.println("you do not have any lifes left");
                                        break Game;
                                    }
                                } else
                                    break Game;
                            }
                            if (villenHealth < 1) {

                                score++;
                                System.out.println(villen.getVillenName() + " died your health is " + herroHP + " your score is now " + score);
                                NumVillen--;
                                mapBuilder.movePlayer("5");
                                mapBuilder.placePlayerAfterTheVillenDies(level);
                                break;
                            } else
                                System.out.println(villen.getVillenName() + " is not dead, he still has " + villenHealth + " health left, and your health is " + herroHP);

                        } else if (input.equals("2")) {

                            if (Numportion > 0) {
                                herroHP = herroHP + portionPower;
                                System.out.println("you are drinking the portion, your health is now " + herroHP);
                                Numportion--;
                            } else
                                System.out.println("you are out of portionS");
                        } else if (input.equals("3")) {
                            if (runningTries > 0) {
                                System.out.println("you ran away");
                                mapBuilder.placePlayers();

                            } else {
                                System.out.println("you ran out of run running tries");
                                System.out.println("************* " + villen.getVillenName() + " has appeard *************");
                            }

                        } else
                            System.out.println("please choose 1, 2 or 3");


                    }
                }
            }

        }





    }

