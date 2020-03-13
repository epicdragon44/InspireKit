package welcome;

import general.GraphicScheme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WelcomeWindow extends JFrame {

    /** Defines the name of the window
     */
    private static final String windowName = "Welcome to InspireOS";

    /** Defines the dimensions of the window
     */
    private static final int windowWidth = 600, windowHeight = 750;

    /** Constructs a general.WindowFrame<br>
     *  Uses a null (manually defined) layout to hold the components<br>
     */
    public WelcomeWindow() {
        super(windowName);
        setSize(new Dimension(windowWidth,windowHeight));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(GraphicScheme.BACKGROUND);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                general.Main.main(null);
            }
        });

        addComponents();

        GraphicScheme.setLookAndFeel();

        setVisible(true);
        setResizable(false);
    }

    /** Adds the components to the frame
     */
    private void addComponents() {
        WelcomePanel logoPanel = new WelcomePanel();
        logoPanel.setBounds(0, 0, logoPanel.getPreferredSize().width, logoPanel.getPreferredSize().height);
        add(logoPanel);
    }
}
