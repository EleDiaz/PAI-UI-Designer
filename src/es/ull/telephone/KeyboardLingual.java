package es.ull.telephone;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.util.function.Function;

/**
 * Keyboard with several numpad keys and a field to see input
 */
public class KeyboardLingual extends JPanel {
    private JPanel container;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JTextField textValue;

    public KeyboardLingual() {
        Function<String, MouseAdapter> dispatch = (String value) -> (new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                appendValueToPassField(value);
            }
        });

        add(container);

        a1Button.addMouseListener(dispatch.apply("1"));
        a2Button.addMouseListener(dispatch.apply("2"));
        a3Button.addMouseListener(dispatch.apply("3"));
        a4Button.addMouseListener(dispatch.apply("4"));
        a5Button.addMouseListener(dispatch.apply("5"));
        a6Button.addMouseListener(dispatch.apply("6"));
        a7Button.addMouseListener(dispatch.apply("7"));
        a8Button.addMouseListener(dispatch.apply("8"));
        a9Button.addMouseListener(dispatch.apply("9"));
    }

    private void appendValueToPassField(String str) {
        textValue.setText(textValue.getText() + str);
    }
}
