package com.abednego.module1.view;
/**
 * @author AbednegoSteven - 1972009
 */


import com.abednego.module1.entity.Person;
import javax.swing.*;
import java.util.Random;


public class PSRGame {
    private int userChoice;
    private int compChoice;
    private Person user;
    public JPanel rootPanel;
    private JPanel test2;
    private JPanel test1;
    private JLabel userPict;
    private JLabel compPict;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel player;
    private JLabel player2;
    private JLabel statis;
    private JButton EXITButton;
    private JLabel tes2;
    private ImageIcon bgi;
    private ImageIcon bg2;
    private ImageIcon bg3;

    public PSRGame(){
        user = new Person();
        bgi = new ImageIcon(getClass().getResource("paper.png"));
        bg2 = new ImageIcon(getClass().getResource("rock1.png"));
        bg3 = new ImageIcon(getClass().getResource("scissors.jpg"));
        userPict.setSize(600,600);
        updateScore();




        button1.addActionListener(e -> {
            userPict.setIcon(bgi);
            userChoice=0;
            updateComp();
            if (compChoice==0){
                user.getUserStatistic().addDrawStatistic();
            }else if(compChoice==1){
                user.getUserStatistic().addWinStatistic();
            }else if(compChoice==2){
                user.getUserStatistic().addLoseStatistic();
            }
            updateScore();
        });
        button2.addActionListener(e -> {
            userPict.setIcon(bg2);
            userChoice=1;
            updateComp();
            if (compChoice==0){
                user.getUserStatistic().addLoseStatistic();
            }else if(compChoice==1){
                user.getUserStatistic().addDrawStatistic();
            }else if(compChoice==2){
                user.getUserStatistic().addWinStatistic();
            }
            updateScore();
        });
        button3.addActionListener(e -> {
            userPict.setIcon(bg3);
            userChoice=2;
            updateComp();
            if (compChoice==0){
                user.getUserStatistic().addWinStatistic();
            }else if(compChoice==1){
                user.getUserStatistic().addLoseStatistic();
            }else if(compChoice==2){
                user.getUserStatistic().addDrawStatistic();
            }
            updateScore();
        });
        EXITButton.addActionListener(e -> {
            System.exit(0);
        });
    }
    private void updateComp(){
        Random random = new Random();
        compChoice = random.nextInt(3);
        if(compChoice==0){
            compPict.setIcon(bgi);
        }else if(compChoice==1){
            compPict.setIcon(bg2);
        }else if(compChoice==2){
            compPict.setIcon(bg3);
        }
    }
    private void updateScore(){
        statis.setText(user.getUserStatistic().toString());
    }
    public Person getUser(){
        return user;
    }

    public void setUser(Person user) {
        player.setText(user.getFirstName()+" "+user.getLastName());
        this.user = new Person(user.getFirstName(),user.getLastName());


    }
}
