/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on 23 avr. 2009, 09:49:58
 */

package rmiage.framework.client.gui;

/**
 *
 * @author gcarrier
 */
public class MainWindow extends javax.swing.JFrame {

    /** Creates new form MainWindow */
    public MainWindow() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSplitPane1 = new javax.swing.JSplitPane();
        navigScrollPane = new javax.swing.JScrollPane();
        navigTree = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        searchIcon = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(150);

        navigScrollPane.setViewportView(navigTree);

        jSplitPane1.setLeftComponent(navigScrollPane);

        jPanel1.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        topPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmiage/framework/client/resources/search.png"))); // NOI18N
        topPanel.add(searchIcon);

        searchField.setPreferredSize(new java.awt.Dimension(200, 28));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        topPanel.add(searchField);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmiage/framework/client/resources/disconnect.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        topPanel.add(jButton1);

        getContentPane().add(topPanel, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_searchFieldActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JScrollPane navigScrollPane;
    private javax.swing.JTree navigTree;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables

}
