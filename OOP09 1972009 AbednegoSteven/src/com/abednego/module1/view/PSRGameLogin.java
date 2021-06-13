package com.abednego.module1.view;
/**
 * @author AbednegoSteven - 1972009
 */
import com.abednego.module1.entity.Person;
import com.abednego.module1.entity.UserStatistic;

import javax.swing.*;

public class PSRGameLogin {
    private PSRGame game;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JButton playButton;
    private JPanel rootPanel;


    public PSRGameLogin() {
        playButton.addActionListener(e -> {
            if (txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPanel,"Please fill in all field","Error",JOptionPane.ERROR_MESSAGE);
            }else {
                game = new PSRGame();
                Person player = new Person(txtFirstName.getText(),txtLastName.getText());
                player.setUserStatistic(new UserStatistic());
                game.setUser(player);
                JFrame frame = new JFrame("Paper Rock Scissors Game");
                frame.setContentPane(game.rootPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(800,600);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }


        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Game");
        frame.setContentPane(new PSRGameLogin().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
}
