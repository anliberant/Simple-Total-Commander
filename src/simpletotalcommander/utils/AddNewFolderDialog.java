package simpletotalcommander.utils;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddNewFolderDialog extends JDialog {

    private JTextField nameOfNewFolder = new JTextField(10);
    private final JButton okButton = new JButton("Create");
    private final JButton cancelButton = new JButton("Cancel");
    private String newFolderName;
    private final JLabel nameFolderWait = new JLabel("New Directory Name: ");
    private boolean ready = false;

    public AddNewFolderDialog(JFrame jframe) {

        super(jframe, "Create New Directory", true);
        this.setLayout(new GridLayout(2, 2, 5, 5));
        this.setSize(400, 200);

        this.okButton.addActionListener((ActionEvent e) -> {
            newFolderName = nameOfNewFolder.getText();
            setVisible(false);
            ready = true;
        });

        this.cancelButton.addActionListener((ActionEvent e) -> {
            setVisible(false);
            ready = false;
        });

        this.getContentPane().add(nameFolderWait);
        this.getContentPane().add(nameOfNewFolder);
        this.getContentPane().add(okButton);
        this.getContentPane().add(cancelButton);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public String getNewName() {
        return newFolderName;
    }

    public boolean getReady() {
        return ready;
    }

    public void Waiting() {
        while (!ready) {
        }
    }
}
