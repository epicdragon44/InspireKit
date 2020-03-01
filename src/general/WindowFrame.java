package general;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WindowFrame extends JFrame {

    /** Defines the name of the window
     */
    private static final String windowName = "Inspire Kit";

    /** Defines the dimensions of the window
     */
    private static final int windowWidth = 600, windowHeight = 800;

    /** Constructs a general.WindowFrame<br>
     *  Uses a null (manually defined) layout to hold the components<br>
     */
    public WindowFrame() {
        super(windowName);
        setSize(new Dimension(windowWidth,windowHeight));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(GraphicScheme.BACKGROUND);

        addComponents();

        GraphicScheme.setLookAndFeel();

        setVisible(true);
        setResizable(false);
    }

    /** Adds the components to the frame
     */
    private void addComponents() {
        LogoPanel logoPanel = new LogoPanel();
        logoPanel.setBounds(0, 0, logoPanel.getPreferredSize().width, logoPanel.getPreferredSize().height);
        CellPanel cellPanel = new CellPanel(this);
        cellPanel.setBounds(CellPanel.marginFromWindowSides/2, logoPanel.getPreferredSize().height, cellPanel.getPreferredSize().width, cellPanel.getPreferredSize().height);

        add(logoPanel);
        add(cellPanel);
    }
}
