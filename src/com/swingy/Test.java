package com.swingy;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame();
        frame.setTitle("text");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("go");
        button.setBounds(20,30, 40,50);
      //  button.setBackground(Color.blue);
        button.setForeground(Color.black);
        frame.setLayout(null);

        frame.add(button);

        frame.setVisible(true);
    }



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
