package welcome;

import general.GraphicScheme;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class WelcomePanel extends JPanel {

    /** Defines preferred panel dimensions
     */
    static final int panelWidth = 600, panelHeight = 750;

    /** Constructs a general.LogoPanel
     */
    WelcomePanel() {
        //setLayout(null);
        //setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(GraphicScheme.BACKGROUND);
        setAlignmentX(Component.CENTER_ALIGNMENT);

        addComponents();
        GraphicScheme.setLookAndFeel();

        setVisible(true);
    }

    /** Adds the necessary components to the panel
     */
    private void addComponents() {
        /*try {
            BufferedImage logoPicture = ImageIO.read(new File("welcome.png"));
            image = logoPicture;
*//*
            JLabel picLabel = new JLabel(new ImageIcon(logoPicture));
            add(picLabel);
            picLabel.setBounds(0, -13, panelWidth, panelHeight);*//*
        } catch (IOException e) { System.err.println("Logo Image not found");}*/

        JLabel welcome = new JLabel("     Welcome to InspireOS     ");
        welcome.setFont(new Font("Ubuntu", Font.BOLD, 25));
        welcome.setForeground(GraphicScheme.FOREGROUND);
        welcome.setHorizontalAlignment(JLabel.CENTER);
        add(welcome);

        JLabel text1 = new JLabel("An Operating System for the aspiring developer");
        text1.setFont(GraphicScheme.ITALICINTERFACE);
        text1.setForeground(GraphicScheme.FOREGROUND);
        text1.setHorizontalAlignment(JLabel.CENTER);
        add(text1);

        JLabel line1 = new JLabel("<html><br>___________________________________________________________________<br></html>");
        line1.setFont(GraphicScheme.INTERFACE);
        line1.setForeground(GraphicScheme.FOREGROUND);
        line1.setHorizontalAlignment(JLabel.CENTER);
        add(line1);

        JLabel empty1 = new JLabel("                                                                                                                    ");
        empty1.setFont(GraphicScheme.INTERFACE);
        empty1.setForeground(GraphicScheme.FOREGROUND);
        empty1.setHorizontalAlignment(JLabel.LEFT);
        add(empty1);

        JLabel text2 = new JLabel("<html>Our goal in creating this system has been to make the process of<br>learning to develop as easy and streamlined as possible, for both<br>the first-time computer user and the experienced Windows coder.<br><br>To that end, InspireOS has been designed to mimic the layout and<br>design of other major operating systems, and is fully usable as a<br>desktop operating system by itself.<br><br>Our work is based on Xubuntu 19.10, and is supported by InspireCS<br><br>Learn more about the nonprofit initiative InspireCS at inspirecs.site</html>");
        text2.setFont(GraphicScheme.INTERFACE);
        text2.setForeground(GraphicScheme.FOREGROUND);
        text2.setHorizontalAlignment(JLabel.LEFT);
        add(text2);

        JLabel line2 = new JLabel("<html><br>___________________________________________________________________<br></html>");
        line2.setFont(GraphicScheme.INTERFACE);
        line2.setForeground(GraphicScheme.FOREGROUND);
        line2.setHorizontalAlignment(JLabel.CENTER);
        add(line2);

        JLabel empty2 = new JLabel("                                                                                                                    ");
        empty2.setFont(GraphicScheme.INTERFACE);
        empty2.setForeground(GraphicScheme.FOREGROUND);
        empty2.setHorizontalAlignment(JLabel.LEFT);
        add(empty2);

        JLabel text3 = new JLabel("<html><b>To help you get started, we've developed InspireKit - an application<br> that will install common development tools for you.</b><br><br>When you close this window, you will be prompted to enter<br> your root password. After doing so, InspireKit will automatically launch.</html>");
        text3.setFont(GraphicScheme.INTERFACE);
        text3.setForeground(GraphicScheme.FOREGROUND);
        text3.setHorizontalAlignment(JLabel.LEFT);
        add(text3);

        JLabel line3 = new JLabel("<html><br>___________________________________________________________________<br></html>");
        line3.setFont(GraphicScheme.INTERFACE);
        line3.setForeground(GraphicScheme.FOREGROUND);
        line3.setHorizontalAlignment(JLabel.CENTER);
        add(line3);

        JLabel empty3 = new JLabel("                                                                                                                    ");
        empty3.setFont(GraphicScheme.INTERFACE);
        empty3.setForeground(GraphicScheme.FOREGROUND);
        empty3.setHorizontalAlignment(JLabel.LEFT);
        add(empty3);

        JLabel text4 = new JLabel("Thank you for choosing InspireOS");
        text4.setFont(GraphicScheme.BOLDINTERFACE);
        text4.setForeground(GraphicScheme.FOREGROUND);
        text4.setHorizontalAlignment(JLabel.CENTER);
        add(text4);
    }

    /*private BufferedImage image;

    @Override
    public void paintComponent(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }*/
}
