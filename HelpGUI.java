/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;
/**
 *help screen
 * @author kelly
 */
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *help screen
 * @author kelly
 */

public class HelpGUI extends javax.swing.JFrame
{

    /**
     * Creates new form HelpGUI
     */
    DB db = new DB();

    public HelpGUI()
    {
        initComponents();
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
        btnSignUp = new javax.swing.JButton();
        btnEnterMeal = new javax.swing.JButton();
        btnSelectIngrs = new javax.swing.JButton();
        btnOpenBook = new javax.swing.JButton();
        btnOpenSummary = new javax.swing.JButton();
        btnOpenRatings = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOut = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btnSignUp.setBackground(new java.awt.Color(102, 255, 255));
        btnSignUp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.setToolTipText("Click Here To");
        btnSignUp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSignUpActionPerformed(evt);
            }
        });

        btnEnterMeal.setBackground(new java.awt.Color(102, 255, 255));
        btnEnterMeal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEnterMeal.setText("Enter Meal");
        btnEnterMeal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSignUpActionPerformed(evt);
            }
        });

        btnSelectIngrs.setBackground(new java.awt.Color(102, 255, 255));
        btnSelectIngrs.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSelectIngrs.setText("Selecting Ingrediants");
        btnSelectIngrs.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSignUpActionPerformed(evt);
            }
        });

        btnOpenBook.setBackground(new java.awt.Color(102, 255, 255));
        btnOpenBook.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnOpenBook.setText("Opening Book Screen");
        btnOpenBook.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSignUpActionPerformed(evt);
            }
        });

        btnOpenSummary.setBackground(new java.awt.Color(102, 255, 255));
        btnOpenSummary.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnOpenSummary.setText("Opening Summary");
        btnOpenSummary.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSignUpActionPerformed(evt);
            }
        });

        btnOpenRatings.setBackground(new java.awt.Color(102, 255, 255));
        btnOpenRatings.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnOpenRatings.setText("Opening Ratings");
        btnOpenRatings.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSignUpActionPerformed(evt);
            }
        });

        txaOut.setBackground(new java.awt.Color(102, 255, 255));
        txaOut.setColumns(20);
        txaOut.setLineWrap(true);
        txaOut.setRows(5);
        txaOut.setEnabled(false);
        jScrollPane1.setViewportView(txaOut);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnOpenSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpenRatings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpenBook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelectIngrs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnterMeal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSignUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEnterMeal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelectIngrs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOpenBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOpenSummary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOpenRatings)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(404, 275));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSignUpActionPerformed
    {//GEN-HEADEREND:event_btnSignUpActionPerformed
        try
        {
            txaOut.repaint();
            ResultSet rs = db.query("SELECT descr FROM tblhelp WHERE topic = '" + evt.getActionCommand() + "'");
            rs.next();
            String descr = rs.getString("descr");
            txaOut.setText(descr);
        } catch (SQLException ex)
        {
            System.out.println("Cannot Load Help");
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(HelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(HelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(HelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(HelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new HelpGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterMeal;
    private javax.swing.JButton btnOpenBook;
    private javax.swing.JButton btnOpenRatings;
    private javax.swing.JButton btnOpenSummary;
    private javax.swing.JButton btnSelectIngrs;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaOut;
    // End of variables declaration//GEN-END:variables
}