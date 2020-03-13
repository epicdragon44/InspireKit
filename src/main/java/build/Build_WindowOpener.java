package build;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Build_WindowOpener implements ActionListener {
    private JFrame window;
    private String title;

    public Build_WindowOpener(JFrame window, String title) {
        this.window = window;
        this.title = title;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        window.setVisible(false);
        new Build_Window(title);
    }
}