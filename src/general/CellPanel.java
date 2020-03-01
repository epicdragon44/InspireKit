package general;

import build.Build_WindowOpener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class CellPanel extends JPanel {

    /** Specifies the maximum number of rows and columns for the grid of cells
     */
    private static final int numRows = 9, numColumns = 1;

    /** Specifies the buffer distance between cells
     */
    private static final int gapSpace = 10;

    /** Helps position the panel in the frame
     */
    static final int marginFromWindowSides = 50;

    private JFrame masterFrame;

    /** Constructs a general.CellPanel<br>
     *  Uses a GridLayout to keep all the cells organized<br>
     * @param masterFrame the Frame in which this Panel is held
     */
    CellPanel(WindowFrame masterFrame) {
        int panelWidth = masterFrame.getWidth()-marginFromWindowSides, panelHeight = masterFrame.getHeight()-LogoPanel.panelHeight-marginFromWindowSides;

        setLayout(new GridLayout(numRows, numColumns, gapSpace, gapSpace));
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(GraphicScheme.BACKGROUND);

        this.masterFrame = masterFrame;

        addComponents();

        setVisible(true);
    }

    private void addComponents() {
        addCell("Build Tools", new Build_WindowOpener(masterFrame, "Build"));
        addCell("Commonly-installed Tools", new Build_WindowOpener(masterFrame, "Common"));
        addCell("Container Tools", new Build_WindowOpener(masterFrame, "Containers"));
        addCell("Java Development Tools", new Build_WindowOpener(masterFrame, "Java"));
        addCell("LAMP/Server/Database Tools", new Build_WindowOpener(masterFrame, "LAMP"));
        addCell("Networking Tools", new Build_WindowOpener(masterFrame, "Network"));
        addCell("Python Development Tools", new Build_WindowOpener(masterFrame, "Python"));
        addCell("Version Control System Tools", new Build_WindowOpener(masterFrame, "VCS"));
        addCell("Web Development Tools", new Build_WindowOpener(masterFrame, "Web"));
    }

    /** Adds a cell with icon to the panel
     *
     * @param cellTitle Title of the cell, shown above the cell
     * @param pathToIcon Relative Path to the icon. The icon should be no more than 45 pixels tall or wide
     * @param actionListener The ActionListener for the tool that will open the respective window
     */
    private void addCell(String cellTitle, String pathToIcon, ActionListener actionListener) {
        GridCell networkCell = new GridCell(cellTitle, pathToIcon);
        networkCell.addActionListener(actionListener);
        add(networkCell);
    }

    /** Adds a cell with text label to the panel
     *
     * @param cellTitle Title of the cell, shown above the cell
     * @param actionListener The ActionListener for the tool that will open the respective window
     */
    private void addCell(String cellTitle, ActionListener actionListener) {
        GridCell networkCell = new GridCell(cellTitle);
        networkCell.addActionListener(actionListener);
        add(networkCell);
    }
}