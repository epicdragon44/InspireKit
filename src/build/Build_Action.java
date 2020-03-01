package build;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Build_Action implements ActionListener {
    private String scriptName;

    public Build_Action(String title) {
        scriptName = title.toLowerCase()+".sh";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String projPath = System.getProperty("user.dir");

        Process q;
        try {
            String[] cmd = { "bash", "-c", "cd "+projPath};
            q = Runtime.getRuntime().exec(cmd);
            q.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(
                    q.getInputStream()));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        Process pr;
        try {
            pr = Runtime.getRuntime().exec("/usr/bin/x-terminal-emulator --disable-factory -e sudo ./"+scriptName);
            pr.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(
                    pr.getInputStream()));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ae) {
            ae.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
