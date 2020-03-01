package general;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class LogoPanel extends JPanel {

    /** Defines preferred panel dimensions
     */
    static final int panelWidth = 600, panelHeight = 100;

    /** The relative path to the logo to be used
     */
    private static final String pathToLogo = "logo.png";

    /** Constructs a general.LogoPanel
     */
    LogoPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(GraphicScheme.BACKGROUND);

        addComponents();
        GraphicScheme.setLookAndFeel();

        setVisible(true);
    }

    /** Adds the necessary components to the panel
     */
    private void addComponents() {
        try {
            BufferedImage logoPicture = ImageIO.read(new File("logo.png"));

            JLabel picLabel = new JLabel(new ImageIcon(logoPicture));
            add(picLabel);
            picLabel.setBounds(0, -13, panelWidth, panelHeight);
        } catch (IOException e) { System.err.println("Logo Image not found");}
    }
}
