/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.InvertedIndex;
import model.SearchingResult;
import model.TableModelDokumen;

/**
 *
 * @author yosrio
 */
public class Home extends javax.swing.JFrame {

    int xMouse;

    int yMouse;
InvertedIndex index;
    TableModelDokumen model;
    /**
     * Creates new form Home
     */
    public Home() {
        setUndecorated(true);
        initComponents();
        positionFrame();
        index = new InvertedIndex();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        addFileDocument = new javax.swing.JLabel();
        addFileIcon1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        showLyrics = new javax.swing.JLabel();
        showLyricsIcon = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        addFolderDocument = new javax.swing.JLabel();
        addFolderIcon = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        showLyrics1 = new javax.swing.JLabel();
        showLyricsIcon1 = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchingTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dokumenTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 176, 228));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tango Lyrics");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 25, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 184, 10));

        jPanel5.setBackground(new java.awt.Color(102, 176, 228));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addFileDocument.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addFileDocument.setForeground(new java.awt.Color(255, 255, 255));
        addFileDocument.setText("Add File Document");
        addFileDocument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFileDocumentMouseClicked(evt);
            }
        });
        jPanel5.add(addFileDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 11, 130, 26));

        addFileIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-file-26.png"))); // NOI18N
        addFileIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFileIcon1MouseClicked(evt);
            }
        });
        jPanel5.add(addFileIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 11, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 50));

        jPanel6.setBackground(new java.awt.Color(102, 176, 228));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showLyrics.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showLyrics.setForeground(new java.awt.Color(255, 255, 255));
        showLyrics.setText("Show Lyrics");
        showLyrics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showLyricsMouseClicked(evt);
            }
        });
        jPanel6.add(showLyrics, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 11, 150, 26));

        showLyricsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-show-property-26.png"))); // NOI18N
        showLyricsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showLyricsIconMouseClicked(evt);
            }
        });
        jPanel6.add(showLyricsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 11, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 50));

        jPanel7.setBackground(new java.awt.Color(102, 176, 228));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addFolderDocument.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addFolderDocument.setForeground(new java.awt.Color(255, 255, 255));
        addFolderDocument.setText("Add Folder Document");
        addFolderDocument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFolderDocumentMouseClicked(evt);
            }
        });
        jPanel7.add(addFolderDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 11, 150, 26));

        addFolderIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-folder-26.png"))); // NOI18N
        addFolderIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFolderIconMouseClicked(evt);
            }
        });
        jPanel7.add(addFolderIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 11, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 50));

        jPanel8.setBackground(new java.awt.Color(102, 176, 228));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showLyrics1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showLyrics1.setForeground(new java.awt.Color(255, 255, 255));
        showLyrics1.setText("Help?");
        showLyrics1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showLyrics1MouseClicked(evt);
            }
        });
        jPanel8.add(showLyrics1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 11, 150, 26));

        showLyricsIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-help-26.png"))); // NOI18N
        showLyricsIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showLyricsIcon1MouseClicked(evt);
            }
        });
        jPanel8.add(showLyricsIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 11, -1, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 100, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 574));

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-32.png"))); // NOI18N
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });
        exitIcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exitIconKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                exitIconKeyReleased(evt);
            }
        });
        jPanel1.add(exitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 11, -1, -1));

        jPanel3.setBackground(new java.awt.Color(82, 179, 217));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search Lyrics: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        searchingTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchingTextField.setForeground(new java.awt.Color(102, 176, 228));
        searchingTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        searchingTextField.setCaretColor(new java.awt.Color(102, 176, 228));
        searchingTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchingTextField.setMinimumSize(new java.awt.Dimension(0, 17));
        searchingTextField.setPreferredSize(new java.awt.Dimension(0, 17));
        searchingTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchingTextFieldActionPerformed(evt);
            }
        });
        searchingTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchingTextFieldKeyReleased(evt);
            }
        });
        jPanel3.add(searchingTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 24, 360, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 176, 228));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search-26(1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 26, 30, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 680, 120));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        dokumenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        dokumenTable.setGridColor(new java.awt.Color(255, 255, 255));
        dokumenTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dokumenTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dokumenTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitIconKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitIconKeyReleased

    }//GEN-LAST:event_exitIconKeyReleased

    private void exitIconKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitIconKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitIconKeyPressed

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exitIconMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse  = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void addFileDocumentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFileDocumentMouseClicked
        JOptionPane.showMessageDialog(this, "Pastikan nama file seperti berikut: 'author-title' (tanpa tanda kutip)");
        JFileChooser fc = new JFileChooser();
        
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File dir = fc.getSelectedFile();
            index.readOneFile(dir);
        }
    }//GEN-LAST:event_addFileDocumentMouseClicked

    private void searchingTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchingTextFieldActionPerformed
        searching();
    }//GEN-LAST:event_searchingTextFieldActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        searching();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void searchingTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchingTextFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchingTextFieldKeyReleased

    private void showLyricsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showLyricsMouseClicked
        
    }//GEN-LAST:event_showLyricsMouseClicked

    private void showLyricsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showLyricsIconMouseClicked
        
    }//GEN-LAST:event_showLyricsIconMouseClicked

    private void addFolderDocumentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFolderDocumentMouseClicked
        JOptionPane.showMessageDialog(this, "Pastikan nama file seperti berikut: 'author-title' (tanpa tanda kutip)");
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File dir = fc.getSelectedFile();
            index.readDirectory(dir);
        }
    }//GEN-LAST:event_addFolderDocumentMouseClicked

    private void addFolderIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFolderIconMouseClicked
        JOptionPane.showMessageDialog(this, "Pastikan nama file seperti berikut: 'author-title' (tanpa tanda kutip)");
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File dir = fc.getSelectedFile();
            index.readDirectory(dir);
        }
    }//GEN-LAST:event_addFolderIconMouseClicked

    private void addFileIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFileIcon1MouseClicked
        JOptionPane.showMessageDialog(this, "Pastikan nama file seperti berikut: 'author-title' (tanpa tanda kutip)");
        JFileChooser fc = new JFileChooser();
        
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File dir = fc.getSelectedFile();
            index.readOneFile(dir);
        }
    }//GEN-LAST:event_addFileIcon1MouseClicked

    private void dokumenTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dokumenTableMouseClicked
        int row = dokumenTable.getSelectedRow();
        int idDoc = Integer.parseInt(dokumenTable.getValueAt(row, 0).toString())-1;
        int id = index.getListOfDocument().get(idDoc).getId();
        String author = index.getListOfDocument().get(idDoc).getAuthor();
        String title = index.getListOfDocument().get(idDoc).getTitle();
        String content = index.getListOfDocument().get(idDoc).getRealContent();
        ShowLyricsInTable show = new ShowLyricsInTable(this, true, id, author, title, content);
        show.setVisible(true);
    }//GEN-LAST:event_dokumenTableMouseClicked

    private void showLyrics1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showLyrics1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_showLyrics1MouseClicked

    private void showLyricsIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showLyricsIcon1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_showLyricsIcon1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addFileDocument;
    private javax.swing.JLabel addFileIcon1;
    private javax.swing.JLabel addFolderDocument;
    private javax.swing.JLabel addFolderIcon;
    private javax.swing.JTable dokumenTable;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField searchingTextField;
    private javax.swing.JLabel showLyrics;
    private javax.swing.JLabel showLyrics1;
    private javax.swing.JLabel showLyricsIcon;
    private javax.swing.JLabel showLyricsIcon1;
    // End of variables declaration//GEN-END:variables

    public void positionFrame() {
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
    }
    
    public void searching() {
        String query = searchingTextField.getText();
        ArrayList<SearchingResult> hasilCari = index.searchCosineSimilarity(query);
        model = new TableModelDokumen(hasilCari);
        dokumenTable.setModel(model);
    }

    public void loadData() {
        File dir = new File("F:\\smstr 6\\SearchingSystem\\dokumen");
        index.readDirectory(dir);
    }
}
