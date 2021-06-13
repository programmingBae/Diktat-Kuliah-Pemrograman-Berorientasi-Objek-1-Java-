package com.abednego.module2.view;
/**
 * @author AbednegoSteven - 1972009
 */
import com.abednego.module2.entity.Ball;
import javax.swing.*;

public class BallPanel {
    private Ball ball;
    public JPanel rootPanel;
    private JTextField radius;
    private JButton countButton;


    public BallPanel() {
        countButton.addActionListener(e -> {
            if (radius.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPanel,"Please fill in all field","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                String text = radius.getText();
                text = text.replaceAll(",", ".");
                double doubleRadius = Double.parseDouble(text);
                ball = new Ball(doubleRadius);
                JOptionPane.showMessageDialog(rootPanel,ball.getDescription(),"Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
