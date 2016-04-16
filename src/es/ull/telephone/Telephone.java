package es.ull.telephone;

import javax.swing.*;

/**
 * Layout class
 * Created by eleazardd on 15/04/16.
 */
public class Telephone extends JFrame {
    private final String TITLE = "Telephone";
    private JPanel rootPanel;

    public Telephone() {
        add(rootPanel);
        setTitle(TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }
}
