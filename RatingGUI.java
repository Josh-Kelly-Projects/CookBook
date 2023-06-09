/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;
/**
 *rating screen
 * @author kelly
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.*;
/**
 *rating screen
 * @author kelly
 */

public class RatingGUI extends javax.swing.JFrame
{

    /**
     * Creates new form RatingGUI
     */
    private DB db = new DB();
    private static Recipe recipe;
    private static User user;

    public RatingGUI(Recipe n, User u)
    {
        initComponents();
        recipe = n;
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
        lblRate = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        btnScore1 = new javax.swing.JButton();
        btnScore2 = new javax.swing.JButton();
        btnScore3 = new javax.swing.JButton();
        btnScore4 = new javax.swing.JButton();
        btnScore5 = new javax.swing.JButton();
        btnTooLittle = new javax.swing.JButton();
        btnJustRight = new javax.swing.JButton();
        btnTooMuch = new javax.swing.JButton();
        lblDescr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rating");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblRate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblRate.setForeground(new java.awt.Color(255, 51, 51));
        lblRate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRate.setText("Rate The Recipe");

        lblRating.setBackground(new java.awt.Color(255, 255, 0));
        lblRating.setForeground(new java.awt.Color(0, 0, 204));
        lblRating.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRating.setText("click a button to rate the meal");

        btnScore1.setBackground(new java.awt.Color(0, 204, 153));
        btnScore1.setText("1");
        btnScore1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnScore1ActionPerformed(evt);
            }
        });

        btnScore2.setBackground(new java.awt.Color(255, 255, 0));
        btnScore2.setText("2");
        btnScore2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnScore1ActionPerformed(evt);
            }
        });

        btnScore3.setBackground(new java.awt.Color(255, 204, 0));
        btnScore3.setText("3");
        btnScore3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnScore1ActionPerformed(evt);
            }
        });

        btnScore4.setBackground(new java.awt.Color(255, 102, 0));
        btnScore4.setText("4");
        btnScore4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnScore1ActionPerformed(evt);
            }
        });

        btnScore5.setBackground(new java.awt.Color(255, 0, 51));
        btnScore5.setText("5");
        btnScore5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnScore1ActionPerformed(evt);
            }
        });

        btnTooLittle.setText("Too Little");
        btnTooLittle.setToolTipText("click this if there wasn't enogh");
        btnTooLittle.setEnabled(false);
        btnTooLittle.setMaximumSize(new java.awt.Dimension(80, 23));
        btnTooLittle.setMinimumSize(new java.awt.Dimension(80, 23));
        btnTooLittle.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTooLittleActionPerformed(evt);
            }
        });

        btnJustRight.setText("Just Right");
        btnJustRight.setToolTipText("click this if the amount was perfect");
        btnJustRight.setEnabled(false);
        btnJustRight.setMaximumSize(new java.awt.Dimension(80, 23));
        btnJustRight.setMinimumSize(new java.awt.Dimension(80, 23));
        btnJustRight.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTooLittleActionPerformed(evt);
            }
        });

        btnTooMuch.setText("Too Much");
        btnTooMuch.setToolTipText("click this if there were too many leftovers");
        btnTooMuch.setEnabled(false);
        btnTooMuch.setMaximumSize(new java.awt.Dimension(80, 23));
        btnTooMuch.setMinimumSize(new java.awt.Dimension(80, 23));
        btnTooMuch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTooLittleActionPerformed(evt);
            }
        });

        lblDescr.setForeground(new java.awt.Color(0, 0, 255));
        lblDescr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescr.setText("now click the most acurate desctiption");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRating, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTooLittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJustRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTooMuch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnScore1)
                                .addGap(12, 12, 12)
                                .addComponent(btnScore2)
                                .addGap(12, 12, 12)
                                .addComponent(btnScore3)
                                .addGap(12, 12, 12)
                                .addComponent(btnScore4)
                                .addGap(12, 12, 12)
                                .addComponent(btnScore5))
                            .addComponent(lblDescr, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblRate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnScore1)
                    .addComponent(btnScore2)
                    .addComponent(btnScore3)
                    .addComponent(btnScore4)
                    .addComponent(btnScore5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTooLittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJustRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTooMuch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDescr))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(277, 189));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnScore1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnScore1ActionPerformed
    {//GEN-HEADEREND:event_btnScore1ActionPerformed
        try
        {
            lblRating.setText("You just rated the recipe a: " + evt.getActionCommand());
            btnScore1.setEnabled(false);
            btnScore2.setEnabled(false);
            btnScore3.setEnabled(false);
            btnScore4.setEnabled(false);
            btnScore5.setEnabled(false);

            db.update("UPDATE tblratings SET rating = " + Integer.parseInt(evt.getActionCommand()) + " WHERE tblratings.user LIKE '" + user.getUserName() + "' AND recipe LIKE '" + recipe.getResName() + "'");

            ResultSet rs = db.query("SELECT numtimescooked FROM tblratings WHERE tblratings.user LIKE '" + user.getUserName() + "' AND recipe LIKE '" + recipe.getResName() + "'");
            rs.next();
            int numCooked = rs.getInt("numtimescooked") + 1;

            db.update("UPDATE tblratings SET numtimescooked = " + numCooked + " WHERE tblratings.user LIKE '" + user.getUserName() + "' AND recipe LIKE '" + recipe.getResName() + "'");
        } catch (SQLException ex)
        {
            try
            {
                db.update("INSERT INTO tblratings VALUES ('" + user.getUserName() + "','" + recipe.getResName() + "'," + Integer.parseInt(evt.getActionCommand()) + ", 1)");
            } catch (SQLException ex1)
            {
                Logger.getLogger(RatingGUI.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        btnTooLittle.setEnabled(true);
        btnTooMuch.setEnabled(true);
        btnJustRight.setEnabled(true);
    }//GEN-LAST:event_btnScore1ActionPerformed

    private void btnTooLittleActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTooLittleActionPerformed
    {//GEN-HEADEREND:event_btnTooLittleActionPerformed
        try
        {
            ResultSet rs = db.query("SELECT ratio FROM tbluserratios WHERE recipeID = " + recipe.getResID() + " AND userID LIKE '" + user.getUserName() + "'");
            double rat;
            rs.next();
            if (evt.getActionCommand().equalsIgnoreCase("Too Little"))
            {
                rat = rs.getDouble("ratio") + 0.1;
            } else if (evt.getActionCommand().equalsIgnoreCase("Too Much"))
            {
                rat = rs.getDouble("ratio") - 0.1;
            } else
            {
                rat = rs.getDouble("ratio");
            }
            db.update("UPDATE tbluserratios SET ratio = " + rat + " WHERE recipeID = " + recipe.getResID() + " AND userID LIKE '" + user.getUserName() + "'");
        } catch (SQLException ex)
        {
            Logger.getLogger(RatingGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnTooLittleActionPerformed

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
            java.util.logging.Logger.getLogger(RatingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RatingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RatingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RatingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RatingGUI(recipe, user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnJustRight;
    javax.swing.JButton btnScore1;
    javax.swing.JButton btnScore2;
    javax.swing.JButton btnScore3;
    javax.swing.JButton btnScore4;
    javax.swing.JButton btnScore5;
    javax.swing.JButton btnTooLittle;
    javax.swing.JButton btnTooMuch;
    javax.swing.JPanel jPanel1;
    javax.swing.JLabel lblDescr;
    javax.swing.JLabel lblRate;
    javax.swing.JLabel lblRating;
    // End of variables declaration//GEN-END:variables
}
