package general;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/** A Cell held inside the general.CellPanel that links to a specific tool<br><br>
 *
 * {@inheritDoc}
 */
class GridCell extends JPanel {

    /** The button that allows a user to access the respective tool window
     */
    private JButton button;

    /** Constructs a general.GridCell with an icon image<br>
     *
     * @param text The Title of the Cell
     * @param iconPath The relative path to the icon
     */
    GridCell(String text, String iconPath) {

        setLayout(new BorderLayout());
        setBackground(GraphicScheme.BACKGROUND);

        Border border = BorderFactory.createEmptyBorder();
        TitledBorder titledBorder = BorderFactory.createTitledBorder(border, text);
        titledBorder.setTitleJustification(TitledBorder.CENTER);
        this.setBorder(titledBorder);

        addComponents();

        try {
            BufferedImage bufferedImage = ImageIO.read(new File(iconPath));
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            button.setIcon(imageIcon);
        } catch (IOException e) { System.err.println("Image wasn't found"); }

        setVisible(true);
    }

    /** Constructs a general.GridCell with a text label<br>
     *
     * @param text The Title of the Cell
     */
    GridCell(String text) {
        setLayout(new BorderLayout());
        setBackground(GraphicScheme.BACKGROUND);

        addComponents();

        button.setText(text);

        setVisible(true);
    }

    /** Adds an action listener to the button<br>
     * @param a the ActionListener
     */
    void addActionListener(ActionListener a) {
        button.addActionListener(a);
    }

    /** Adds the necessary components to the cell
     */
    private void addComponents() {
        button = new JButton();
        this.add(button, BorderLayout.CENTER);
    }
}
