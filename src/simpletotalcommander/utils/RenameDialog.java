package simpletotalcommander.utils;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RenameDialog extends JDialog {
private JTextField nameOfNewFolder = new JTextField(10);
    private final JButton renameButton = new JButton("Rename");
    private final JButton cancelButton = new JButton("Cancel");
    private String newFolderName;
    private final JLabel nameFolderWait = new JLabel("New Name: ");
    private boolean ready = false;
    
    public RenameDialog(JFrame jframe) {
        
        super(jframe, "Rename", true);
        setLayout(new GridLayout(2, 2, 5, 5));
        setSize(400, 200);
           
        renameButton.addActionListener((ActionEvent e) -> {
            newFolderName = nameOfNewFolder.getText();
            setVisible(false);
            ready = true;
        });
        
        cancelButton.addActionListener((ActionEvent e) -> {
            setVisible(false);
            ready = false;
        });
        
        getContentPane().add(nameFolderWait);
        getContentPane().add(nameOfNewFolder);       
        getContentPane().add(renameButton); 
        getContentPane().add(cancelButton); 
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true); 
    }
    
    public String getNewName(){
        return newFolderName;
    }
    
    public boolean getReady (){
        return ready;
    }
    
    public void Waiting(){
        while(!ready){       
        }
    }
}