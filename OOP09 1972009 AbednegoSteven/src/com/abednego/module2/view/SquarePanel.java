package com.abednego.module2.view;
/**
 * @author AbednegoSteven - 1972009
 */
import com.abednego.module2.entity.Square;

import javax.swing.*;

public class SquarePanel {
    private Square square;
    public JPanel rootPanel;
    private JTextField width;
    private JButton countButton;
    private JTextField heigth;

    public SquarePanel() {
        countButton.addActionListener(e -> {
            if (width.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPanel,"Please fill in all field","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                String text = width.getText();
                text = text.replaceAll(",", ".");
                String text2 = heigth.getText();
                text2 = text2.replaceAll(",", ".");
                double doubleWidth = Double.parseDouble(text);
                double doubleHeigth = Double.parseDouble(text2);
                square = new Square(doubleWidth,doubleHeigth);
                JOptionPane.showMessageDialog(rootPanel,square.getDescription(),"Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
