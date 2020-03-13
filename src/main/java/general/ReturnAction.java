package general;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnAction implements ActionListener {
    private JFrame windowToDelete;

    public ReturnAction(JFrame windowToDelete) {
        this.windowToDelete = windowToDelete;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        windowToDelete.setVisible(false);
        new WindowFrame();
    }
}
