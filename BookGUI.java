/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;
/**
 *cooking screen 
 * @author kelly
 */
import java.sql.*;
import java.util.logging.*;
/**
 *cooking screen 
 * @author kelly
 */

public class BookGUI extends javax.swing.JFrame
{

    /**
     * Creates new form BookGUI
     */
    private DB db = new DB();
    private static User user;
    private static Recipe recipe;

    public BookGUI(User u, Recipe r)
    {
        initComponents();
        recipe = r;
        user = u;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaMethScrn = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInged = new javax.swing.JTable();
        menBar = new javax.swing.JMenuBar();
        help = new javax.swing.JMenu();
        menHelpMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelly's Recipes");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Salmon");

        btnDone.setBackground(new java.awt.Color(102, 255, 255));
        btnDone.setText("Cook Completed");
        btnDone.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDoneActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtaMethScrn.setBackground(new java.awt.Color(102, 255, 255));
        jtaMethScrn.setColumns(20);
        jtaMethScrn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtaMethScrn.setLineWrap(true);
        jtaMethScrn.setRows(5);
        jtaMethScrn.setText("Sorry\nWe don't have a salmon recipe yet\nWe appologise for the inconvenience ");
        jScrollPane2.setViewportView(jtaMethScrn);

        tblInged.setBackground(new java.awt.Color(255, 204, 204));
        tblInged.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Ing", "Qyt", "Food Group", "Empty"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblInged.setToolTipText("click the check box if an ingredient runs out");
        jScrollPane1.setViewportView(tblInged);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDone)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDone))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        help.setText("Help");

        menHelpMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        menHelpMenu.setText("Help Menu");
        menHelpMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menHelpMenuActionPerformed(evt);
            }
        });
        help.add(menHelpMenu);

        menBar.add(help);

        setJMenuBar(menBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(778, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        lblTitle.setText(recipe.getResName());
        try
        {
            ResultSet rs = db.query("SELECT id FROM tblrecipies WHERE recipe LIKE '" + recipe.getResName() + "'");
            rs.next();
            int id = rs.getInt("id");
            rs = db.query("SELECT ingredients,quantity,foodGroup FROM tblingrediants INNER JOIN tbllink ON ingredientID = id WHERE recipeID = " + id);
            int a = 0;
            while (rs.next())
            {
                String d = rs.getString("ingredients");
                String e = rs.getString("quantity");
                String f = rs.getString("foodGroup");

                e = recipe.applyRatio(e, user.getUserName());

                tblInged.setValueAt(d, a, 0);
                tblInged.setValueAt(e, a, 1);
                tblInged.setValueAt(f, a, 2);
                a++;
            }
            rs = db.query("SELECT descr,tblrecipies.`method` FROM tblrecipies WHERE id = " + id);
            rs.next();
            String g = rs.getString("descr");
            String h = rs.getString("method");
            jtaMethScrn.setText(g + "\n\n\nMETHOD\n" + h);
        } catch (SQLException ex)
        {
            Logger.getLogger(CookingSummaryGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDoneActionPerformed
    {//GEN-HEADEREND:event_btnDoneActionPerformed
        this.dispose();
        new RatingGUI(recipe, user).setVisible(true);
    }//GEN-LAST:event_btnDoneActionPerformed

    private void menHelpMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menHelpMenuActionPerformed
    {//GEN-HEADEREND:event_menHelpMenuActionPerformed
        new HelpGUI().setVisible(true);
    }//GEN-LAST:event_menHelpMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(BookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(BookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(BookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(BookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new BookGUI(user, recipe).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JMenu help;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtaMethScrn;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JMenuBar menBar;
    private javax.swing.JMenuItem menHelpMenu;
    private javax.swing.JTable tblInged;
    // End of variables declaration//GEN-END:variables
}
