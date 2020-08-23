/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletotalcommander;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import simpletotalcommander.utils.AddNewFolderDialog;
import simpletotalcommander.utils.RenameDialog;

/**
 *
 * @author useR
 */
public class GUICommander extends javax.swing.JFrame {

    private final Image icon = new ImageIcon(getClass().getResource("/res/icons8_air_force_commander_male_48px.png")).getImage();
    private final ArrayList<String> pathCache = new ArrayList<>();
    private final File diskRoots[] = File.listRoots();

    public GUICommander() {
        super("Simple Total Commander");
        super.setIconImage(icon);
        JDialog dirDialog = new JDialog(this, "Create Dir", true);
        JPanel newDirPanel = new JPanel();
        dirDialog.add(newDirPanel);

        initComponents();

    }

    public String toFullPath(ArrayList<String> list) {
        String tmp = "";
        tmp = list.stream().map((s) -> s).reduce(tmp, String::concat);
        return tmp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        createFileButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        renameButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        createDirButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        pathLabel = new javax.swing.JLabel();
        jTextPath = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Total Commander");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        createFileButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        createFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_add_file_48px.png"))); // NOI18N
        createFileButton.setText("Create File");
        createFileButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        createFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFileButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 12, 0);
        jPanel1.add(createFileButton, gridBagConstraints);

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_rewind_48px.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = -12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 12, 0);
        jPanel1.add(backButton, gridBagConstraints);

        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_delete_bin_48px.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = -12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 12, 0);
        jPanel1.add(deleteButton, gridBagConstraints);

        renameButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        renameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_rename_48px.png"))); // NOI18N
        renameButton.setText("Rename");
        renameButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        renameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = -12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 12, 0);
        jPanel1.add(renameButton, gridBagConstraints);

        homeButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_home_48px_2.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 12, 0);
        jPanel1.add(homeButton, gridBagConstraints);

        exitButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_shutdown_48px.png"))); // NOI18N
        exitButton.setText("Exit");
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 12, 11);
        jPanel1.add(exitButton, gridBagConstraints);

        createDirButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        createDirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_add_folder_48px.png"))); // NOI18N
        createDirButton.setText("Create Dir");
        createDirButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        createDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDirButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 11, 12, 0);
        jPanel1.add(createDirButton, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jScrollPane2.setHorizontalScrollBar(null);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jScrollPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1178;
        gridBagConstraints.ipady = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        pathLabel.setFont(new java.awt.Font("Trebuchet MS", 3, 20)); // NOI18N
        pathLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_navigator_48px.png"))); // NOI18N
        pathLabel.setText("Current Path:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 10, 11, 0);
        jPanel3.add(pathLabel, gridBagConstraints);

        jTextPath.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 968;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 4, 0, 10);
        jPanel3.add(jTextPath, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if (pathCache.size() > 1) {
            pathCache.remove(pathCache.size() - 1);
            String backDir = toFullPath(pathCache);
            String[] objects = new File(backDir).list();
            DefaultListModel backListModel = new DefaultListModel();
            for (String s : objects) {
                File checkFile = new File(backDir, s);
                if (!checkFile.isHidden()) {
                    if (checkFile.isDirectory()) {
                        backListModel.addElement(s);
                        jTextPath.setText(backDir);
                    } else {
                        backListModel.addElement("File: " + s);
                    }
                }
            }
            jList1.setModel(backListModel);
        } else {
            pathCache.removeAll(pathCache);
            String[] tmp = new String[diskRoots.length];
            for (int i = 0; i < diskRoots.length; i++) {
                tmp[i] = diskRoots[i].getPath();
            }
            jList1.setListData(tmp);
            jTextPath.setText(tmp[0]);
            jTextPath.setEditable(false);
        }

    }//GEN-LAST:event_backButtonActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (evt.getClickCount() == 2) {
            DefaultListModel model = new DefaultListModel();
            String selectedObject = jList1.getSelectedValue();
            String fullPath = toFullPath(pathCache);
            File selectedFile;
            if (pathCache.size() > 1) {
                selectedFile = new File(fullPath, selectedObject);
            } else {
                selectedFile = new File(fullPath + selectedObject);
            }
            jTextPath.setText(selectedFile.getAbsolutePath());

            if (selectedFile.isDirectory()) {
                String[] rootStr = selectedFile.list();
                for (String str : rootStr) {
                    File checkObject = new File(selectedFile.getPath(), str);
                    if (!checkObject.isHidden()) {
                        if (checkObject.isDirectory()) {
                            model.addElement(str);
                        } else {
                            model.addElement(str);
                        }
                    }
                }
                if (pathCache.size() <= 1) {
                    pathCache.add(selectedObject);
                } else {
                    pathCache.add("\\" + selectedObject);
                }

                jList1.setModel(model);

            }
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        pathCache.removeAll(pathCache);
        String[] tmp = new String[10];
        for (int i = 0; i < diskRoots.length; i++) {
            tmp[i] = diskRoots[i].getPath();
        }
        jList1.setListData(tmp);
        jTextPath.setText(tmp[0]);
        jTextPath.setEditable(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void createDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDirButtonActionPerformed
        if (!pathCache.isEmpty()) {
            String currentPath;
            File newFolder;
            AddNewFolderDialog newFolderDialog = new AddNewFolderDialog(GUICommander.this);

            if (newFolderDialog.getReady()) {
                currentPath = toFullPath(pathCache);
                newFolder = new File(currentPath, newFolderDialog.getNewName());
                if (!newFolder.exists()) {
                    newFolder.mkdir();
                }

                File updateDir = new File(currentPath);
                String updateMas[] = updateDir.list();
                DefaultListModel updateModel = new DefaultListModel();
                for (String str : updateMas) {
                    File check = new File(updateDir.getPath(), str);
                    if (!check.isHidden()) {
                        updateModel.addElement(str);
                    }
                }
                jList1.setModel(updateModel);
            }
        }
    }//GEN-LAST:event_createDirButtonActionPerformed

    private void createFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFileButtonActionPerformed
        if (!pathCache.isEmpty()) {
            String currentPath;
            File newFile;
            AddNewFolderDialog newFolderDialog = new AddNewFolderDialog(GUICommander.this);

            if (newFolderDialog.getReady()) {
                currentPath = toFullPath(pathCache);
                newFile = new File(currentPath, newFolderDialog.getNewName());
                if (!newFile.exists() && !newFile.isDirectory()) {
                    try {
                        if (newFile.createNewFile()) {
                            System.out.println(newFile.getAbsolutePath() + " File Created");
                        } else {
                            System.out.println("File " + newFile.getAbsolutePath() + " already exists");
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(GUICommander.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                File updateDir = new File(currentPath);
                String updateMas[] = updateDir.list();
                DefaultListModel updateModel = new DefaultListModel();
                for (String str : updateMas) {
                    File check = new File(updateDir.getPath(), str);
                    if (!check.isHidden() && (!check.isDirectory())) {
                        updateModel.addElement(str);
                    } else {
                        JOptionPane.showMessageDialog(this, "Please select a File!");
                    }
                }
                jList1.setModel(updateModel);
            }
        }
    }//GEN-LAST:event_createFileButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String selectedFile = jList1.getSelectedValue();
        String currentPath = toFullPath(pathCache);
        if (!selectedFile.isEmpty()) {
            deleteDir(new File(currentPath, selectedFile));

            File updateDir = new File(currentPath);
            String updateMass[] = updateDir.list();
            DefaultListModel updateModel = new DefaultListModel();
            for (String s : updateMass) {
                File tmp = new File(updateDir.getPath(), s);
                if (!tmp.isHidden()) {
                    if (tmp.isDirectory()) {
                        updateModel.addElement(s);
                    } else {
                        updateModel.addElement("File: " + s);
                    }
                }
            }
            jList1.setModel(updateModel);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void renameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameButtonActionPerformed
        if (!pathCache.isEmpty() & jList1.getSelectedValue() != null) {

            String currentPath = toFullPath(pathCache);
            String selectedObject = jList1.getSelectedValue();
            RenameDialog renamer = new RenameDialog(this);
            if (renamer.getReady()) {
                File renameFile = new File(currentPath, selectedObject);
                renameFile.renameTo(new File(currentPath, renamer.getNewName()));

                File updateDir = new File(currentPath);
                String updateMas[] = updateDir.list();
                DefaultListModel updateModel = new DefaultListModel();
                for (String s : updateMas) {
                    File check = new File(updateDir.getPath(), s);
                    if (!check.isHidden()) {
                        if (check.isDirectory()) {
                            updateModel.addElement(s);
                        } else {
                            updateModel.addElement("Fail: " + s);
                        }
                    }
                }
                jList1.setModel(updateModel);
            }
        }
    }//GEN-LAST:event_renameButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createDirButton;
    private javax.swing.JButton createFileButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextPath;
    private javax.swing.JLabel pathLabel;
    private javax.swing.JButton renameButton;
    // End of variables declaration//GEN-END:variables

    private void deleteDir(File file) {
        File[] fileList = file.listFiles();
        if (fileList != null) {
            for (File f : fileList) {
                deleteDir(f);
            }
        }

        file.delete();
    }
}
