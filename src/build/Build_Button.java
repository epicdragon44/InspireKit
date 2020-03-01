package build;

import general.ReturnAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class Build_Button extends JPanel {

    private static final int height = 50, width = 600;

    private static final String saveText = "Install";

    private static final String returnText = "Return to Main Window";

    private ActionListener actionBundle;

    private Build_Window masterWindow;

    Build_Button(Build_Window masterWindow) {
        setPreferredSize(new Dimension(width,height));
        setLayout(new FlowLayout());
        UIManager.put("Button.background", Color.WHITE);
        setBackground(Color.WHITE);

        this.masterWindow = masterWindow;

        addComponents();

        setVisible(true);
    }

    private void addComponents() {
        actionBundle = new Build_Action(masterWindow.getCustomTitle());
        JButton sendButton = new JButton(saveText);
        sendButton.setForeground(Color.BLACK);
        sendButton.addActionListener(actionBundle);

        ReturnAction returnAction = new ReturnAction(masterWindow);
        JButton backButton = new JButton(returnText);
        backButton.setForeground(Color.BLACK);
        backButton.addActionListener(returnAction);

        add(backButton);
        add(sendButton);
    }
}