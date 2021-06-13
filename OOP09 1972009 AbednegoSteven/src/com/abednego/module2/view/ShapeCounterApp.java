package com.abednego.module2.view;
/**
 * @author AbednegoSteven - 1972009
 */
import javax.swing.*;


public class ShapeCounterApp {
    private JPanel rootPanel;
    private JPanel layeredPanel;
    private JButton ballButton;
    private JButton tubeButton;
    private JButton squareButton;

    public ShapeCounterApp(){
        BallPanel tes2 = new BallPanel();
        layeredPanel.removeAll();
        layeredPanel.add(tes2.rootPanel);
        layeredPanel.repaint();
        layeredPanel.revalidate();

        squareButton.addActionListener(e -> {
            SquarePanel tes = new SquarePanel();
            layeredPanel.removeAll();
            layeredPanel.add(tes.rootPanel);
            layeredPanel.repaint();
            layeredPanel.revalidate();
        });
        ballButton.addActionListener(e -> {
            layeredPanel.removeAll();
            layeredPanel.add(tes2.rootPanel);
            layeredPanel.repaint();
            layeredPanel.revalidate();
        });
        tubeButton.addActionListener(e -> {
            TubePanel tes3 = new TubePanel();
            layeredPanel.removeAll();
            layeredPanel.add(tes3.rootPanel);
            layeredPanel.repaint();
            layeredPanel.revalidate();
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Penghitung Luas & Keliling");
        frame.setContentPane(new ShapeCounterApp().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
