package com.mycompany.brick;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        JFrame obj = new JFrame();
        com.mycompany.brick.GamePlay gameplay = new com.mycompany.brick.GamePlay();
        obj.setBounds(10 , 15 , 725 , 600);
        obj.setTitle("Brick_Breaker");
        obj.setResizable(false);
        obj.add(gameplay);
        obj.setVisible(true);

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}