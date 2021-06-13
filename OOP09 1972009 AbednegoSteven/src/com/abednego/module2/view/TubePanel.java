package com.abednego.module2.view;
/**
 * @author AbednegoSteven - 1972009
 */

import com.abednego.module2.entity.Tube;

import javax.swing.*;


public class TubePanel {
    private Tube tube;
    private JTextField radius;
    private JTextField heigth;
    private JButton countButton;
    public JPanel rootPanel;

    public TubePanel() {
        countButton.addActionListener(e -> {
            if (radius.getText().isEmpty()||heigth.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPanel,"Please fill in all field","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                String text = radius.getText();
                text = text.replaceAll(",", ".");
                String text2 = heigth.getText();
                text2 = text2.replaceAll(",", ".");
                double doubleRadius = Double.parseDouble(text);
                double doubleHeigth = Double.parseDouble(text2);
                tube = new Tube(doubleRadius,doubleHeigth);
                JOptionPane.showMessageDialog(rootPanel,tube.getDescription(),"Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
