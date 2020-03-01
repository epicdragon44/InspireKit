package general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Runs the program
 */
public class Main {

    /** This function is the first called in order to start the program. It simply creates the window.
     * @param args Leave as null; unused.
     */
    public static void main(String[] args) {
        makeAllExec();
        new WindowFrame();
    }

    private static void makeAllExec() {
        String projPath = System.getProperty("user.dir");

        Process p;
        try {
            String[] cmd = { "bash", "-c", "pkexec chmod +x "+projPath+"/*.sh"};
            p = Runtime.getRuntime().exec(cmd);
            p.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
