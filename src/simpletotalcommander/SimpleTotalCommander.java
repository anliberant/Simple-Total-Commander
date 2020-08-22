
package simpletotalcommander;
import javax.swing.JFrame;

/**
 *
 * @author useR
 */
public class SimpleTotalCommander {

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            GUICommander commander = new GUICommander();
            commander.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            commander.setResizable(true);
            commander.setLocationRelativeTo(null);
            commander.pack();
            commander.setVisible(true);
        });
    }
    
}
