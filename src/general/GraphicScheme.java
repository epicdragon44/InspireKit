package general;

import javax.swing.*;
import java.awt.*;

/** Simple class just holding essential Color and Font constants to be used in reference by other classes for drawing colors on the screen<br>
 *  As well as methods defining the Look and Feel of the application
 *
 *  NOTE:   Segoe UI is the standard font used for everything, from Documentation to the Application itself. It's clear, readable, looks modern, and integrates smoothly into the Windows Operating System (it's a Microsoft Font).
 *          Occasionally, Consolas is used where a Monospaced font is appropriate.
 */
public class GraphicScheme {
    public static final Color BACKGROUND = new Color(255, 255, 255);
    public static final Color NONINTERACTABLE = new Color(230, 230, 230);
    public static final Color FOREGROUND = new Color(46, 119, 182);
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(0, 168, 0);
    public static final Color WHITE = new Color(255, 255, 255);

    public static final Font INTERFACE = new Font("Segoe UI", Font.PLAIN, 15);
    public static final Font SMALLINTERFACE = new Font("Segoe UI", Font.PLAIN, 12);
    public static final Font BOLDINTERFACE = new Font("Segoe UI", Font.BOLD, 15);;
    public static final Font ITALICINTERFACE = new Font("Segoe UI", Font.ITALIC, 15);
    public static final Font MONOSPACED = new Font("Consolas", Font.PLAIN, 15);

    /** Sets Look and Feel of Java Swing to "Nimbus", and if Nimbus isn't found, defaults to the Operating System-provided theme
     */
    public static void setLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());

                    UIManager.put("Button.background", WHITE);
                    setFont();

                    break;
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        }
    }

    /** Sets default font to BOLDINTERFACE and Color to FOREGROUND for all text (should be overruled as necessary)
     */
    private static void setFont() {
        UIManager.put("text", FOREGROUND);
        UIManager.put("info", WHITE);
    }
}
