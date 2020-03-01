package build;

import general.GetToolDescr;
import general.GraphicScheme;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class Build_Window extends JFrame {
    private static final int windowWidth = 450, windowHeight = 400;

    private static final  String WARNING = "Please make sure you have a working internet connection.\nA terminal window will appear; when prompted, please enter your root password. \nInstallation may take a few minutes to complete.";

    private String title;

    private static final int vertBuffer = 10;

    private static JTextArea txtConsole;

    private JPanel buttonPanel;

    Build_Window(String title) {
        super("Install " + title + " Tools");

        this.title = title;

        setSize(new Dimension(windowWidth,windowHeight));
        getContentPane().setLayout(
                new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)
        );
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponents();

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public String getCustomTitle() {
        return title;
    }

    private void addComponents() {
        add(Box.createRigidArea(new Dimension(0, vertBuffer)));

        buttonPanel = new Build_Button(this);

        add(buttonPanel);

        JTextPane description = new JTextPane();
        description.setEditable(false);
        description.setText(GetToolDescr.retrieve(this.getCustomTitle()));
        StyledDocument doc = description.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        description.setMargin(new Insets(0, 20, 0,20));

        add(description);

        JTextPane warning = new JTextPane();
        StyledDocument doc2 = warning.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_CENTER);
        Style style = warning.addStyle("I'm a Style", null);
        StyleConstants.setForeground(style, GraphicScheme.RED);
        doc2.setParagraphAttributes(0, doc.getLength(), center, false);
        warning.setEditable(false);
        try { doc2.insertString(doc2.getLength(), WARNING,style); }
        catch (BadLocationException e){}
        warning.setMargin(new Insets(0, 20, 0,20));

        add(warning);
    }
}
