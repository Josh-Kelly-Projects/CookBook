/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;
/**
 *inventory screen
 * @author kelly
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *inventory screen
 * @author kelly
 */

public class InventoryGUI extends javax.swing.JFrame
{

    /**
     * Creates new form InventoryGUI
     */
    private static User user;
    private DB db = new DB();
    private InventoryArr inventArr;
    private Inventory[] invenArr = new Inventory[2000];
    private int invtArrSize = 0;
    private String list = "";
    private String pool;

    public InventoryGUI(User u)
    {
        initComponents();
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

        pnlBackG = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblFridge = new javax.swing.JLabel();
        lblList = new javax.swing.JLabel();
        sclInvent = new javax.swing.JScrollPane();
        tblInventoryDisply = new javax.swing.JTable();
        sclList = new javax.swing.JScrollPane();
        txaList = new javax.swing.JTextArea();
        btnLow = new javax.swing.JButton();
        btnExpr = new javax.swing.JButton();
        btnGenList = new javax.swing.JButton();
        btnUpdateInvent = new javax.swing.JButton();
        btnSavePDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventory");
        setBackground(new java.awt.Color(255, 255, 153));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        pnlBackG.setBackground(new java.awt.Color(204, 255, 255));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Kelly's Recipes Inventory Manager");

        lblFridge.setBackground(new java.awt.Color(204, 0, 51));
        lblFridge.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFridge.setForeground(new java.awt.Color(0, 0, 204));
        lblFridge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFridge.setText("Your Fidge Contains");

        lblList.setBackground(new java.awt.Color(204, 0, 51));
        lblList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblList.setForeground(new java.awt.Color(0, 0, 204));
        lblList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblList.setText("Shopping List");

        tblInventoryDisply.setBackground(new java.awt.Color(255, 153, 153));
        tblInventoryDisply.setForeground(new java.awt.Color(255, 255, 255));
        tblInventoryDisply.setModel(new javax.swing.table.DefaultTableModel(
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
                "Ingredient ", "Quantity", "Expiry Date", "Shopping List"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        tblInventoryDisply.setToolTipText("Click box to manualy add ingredient to shopping list");
        sclInvent.setViewportView(tblInventoryDisply);

        txaList.setEditable(false);
        txaList.setBackground(new java.awt.Color(102, 255, 255));
        txaList.setColumns(20);
        txaList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txaList.setRows(5);
        txaList.setToolTipText("This is your shopping list");
        sclList.setViewportView(txaList);

        btnLow.setBackground(new java.awt.Color(102, 255, 255));
        btnLow.setText("Select Low");
        btnLow.setToolTipText("Click to add all low items to shopping list");
        btnLow.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLowActionPerformed(evt);
            }
        });

        btnExpr.setBackground(new java.awt.Color(102, 255, 255));
        btnExpr.setText("Select Expired");
        btnExpr.setToolTipText("Click to add all ingredients that are past the expiry date to the shopping list");
        btnExpr.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExprActionPerformed(evt);
            }
        });

        btnGenList.setBackground(new java.awt.Color(102, 255, 255));
        btnGenList.setText("Generate List");
        btnGenList.setToolTipText("Click to generate a shopping list from selected items");
        btnGenList.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnGenListActionPerformed(evt);
            }
        });

        btnUpdateInvent.setBackground(new java.awt.Color(102, 255, 255));
        btnUpdateInvent.setText("Update Inventory");
        btnUpdateInvent.setToolTipText("When shopping is completed: sigh and click this button");
        btnUpdateInvent.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpdateInventActionPerformed(evt);
            }
        });

        btnSavePDF.setBackground(new java.awt.Color(102, 255, 255));
        btnSavePDF.setText("Save PDF");
        btnSavePDF.setToolTipText("Click to save this list as a PDF (aka text file) and return to home screen");
        btnSavePDF.setEnabled(false);
        btnSavePDF.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSavePDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackGLayout = new javax.swing.GroupLayout(pnlBackG);
        pnlBackG.setLayout(pnlBackGLayout);
        pnlBackGLayout.setHorizontalGroup(
            pnlBackGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
            .addGroup(pnlBackGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackGLayout.createSequentialGroup()
                        .addComponent(btnLow)
                        .addGap(92, 92, 92)
                        .addComponent(btnExpr)
                        .addGap(96, 96, 96)
                        .addComponent(btnGenList))
                    .addGroup(pnlBackGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sclInvent)
                        .addComponent(lblFridge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackGLayout.createSequentialGroup()
                        .addComponent(lblList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackGLayout.createSequentialGroup()
                        .addComponent(sclList, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlBackGLayout.createSequentialGroup()
                        .addComponent(btnUpdateInvent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSavePDF)
                        .addContainerGap())))
        );
        pnlBackGLayout.setVerticalGroup(
            pnlBackGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackGLayout.createSequentialGroup()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFridge)
                    .addComponent(lblList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sclList)
                    .addComponent(sclInvent, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLow)
                    .addComponent(btnExpr)
                    .addComponent(btnGenList)
                    .addComponent(btnUpdateInvent)
                    .addComponent(btnSavePDF))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnGenList.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(794, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenListActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGenListActionPerformed
    {//GEN-HEADEREND:event_btnGenListActionPerformed
        for (int i = 0; i < invtArrSize; i++)
        {
            if (tblInventoryDisply.getValueAt(i, 3).equals(true))
            {
                list += tblInventoryDisply.getValueAt(i, 0) + "\n";
                try
                {
                    db.update("UPDATE tblfridgeinventory SET `shoppinglistitem` = true WHERE `ingredientID` = " + invenArr[i].getIngID() + " AND poolID = '" + pool + "'");
                } catch (SQLException ex)
                {
                    Logger.getLogger(InventoryGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        txaList.setText(list);
        btnExpr.setEnabled(false);
        btnLow.setEnabled(false);
        btnGenList.setEnabled(false);
        tblInventoryDisply.setEnabled(false);
        btnSavePDF.setEnabled(true);
    }//GEN-LAST:event_btnGenListActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try
        {
            ResultSet rs = db.query("SELECT poolID FROM tblusers WHERE userName LIKE '" + user.getUserName() + "'");
            rs.next();
            pool = rs.getString("poolID");

            inventArr = new InventoryArr(pool);
            invtArrSize = inventArr.getSize();
            invenArr = inventArr.getInvenArr();

            for (int i = 0; i < invtArrSize; i++)
            {
                tblInventoryDisply.setValueAt(invenArr[i].getIngname(), i, 0);
                tblInventoryDisply.setValueAt(invenArr[i].getQty(), i, 1);
                tblInventoryDisply.setValueAt(invenArr[i].getExprDate(), i, 2);
                tblInventoryDisply.setValueAt(invenArr[i].isShopLis(), i, 3);
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(InventoryGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnExprActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExprActionPerformed
    {//GEN-HEADEREND:event_btnExprActionPerformed
        try
        {
            ResultSet rs = db.query("SELECT NOW() AS day");
            rs.next();
            String date = rs.getDate("day").toString();
            String[] spDate = date.split("-");
            int curyear = Integer.parseInt(spDate[0]);
            int curmonth = Integer.parseInt(spDate[1]);
            int curday = Integer.parseInt(spDate[2]);

            for (int i = 0; i < invtArrSize; i++)
            {
                String[] expdate = tblInventoryDisply.getValueAt(i, 2).toString().split("-");
                int expyear = Integer.parseInt(expdate[0]);
                int expmonth = Integer.parseInt(expdate[1]);
                int expday = Integer.parseInt(expdate[2]);

                if (expyear < curyear || (expyear == curyear && expmonth < curmonth) || (expyear == curyear && expmonth == curmonth && expday < curday))
                {
                    tblInventoryDisply.setValueAt(true, i, 3);
                    tblInventoryDisply.setValueAt("expired", i, 2);
                    tblInventoryDisply.setValueAt(tblInventoryDisply.getValueAt(i, 1).toString() + " Expired", i, 1);
                }
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(InventoryGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnExpr.setEnabled(false);
    }//GEN-LAST:event_btnExprActionPerformed

    private void btnLowActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLowActionPerformed
    {//GEN-HEADEREND:event_btnLowActionPerformed
        for (int i = 0; i < invtArrSize; i++)
        {
            if (Units.unitConverterToSmall(invenArr[i].getQty(), true) < 20 || invenArr[i].isEmpt() == true)
            {
                tblInventoryDisply.setValueAt(true, i, 3);
                tblInventoryDisply.setValueAt(tblInventoryDisply.getValueAt(i, 1).toString() + " Low", i, 1);
                if (invenArr[i].isEmpt() == true)
                {
                    String[] qtySp = tblInventoryDisply.getValueAt(i, 1).toString().split(" ");
                    String unit = qtySp[1];
                    tblInventoryDisply.setValueAt("0" + unit, i, 1);
                }
            }
        }
        btnLow.setEnabled(false);
    }//GEN-LAST:event_btnLowActionPerformed

    private void btnUpdateInventActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpdateInventActionPerformed
    {//GEN-HEADEREND:event_btnUpdateInventActionPerformed
        new InventoryUpdaterGUI(user, pool, new IngredientsArr(true)).setVisible(true);
    }//GEN-LAST:event_btnUpdateInventActionPerformed

    private void btnSavePDFActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSavePDFActionPerformed
    {//GEN-HEADEREND:event_btnSavePDFActionPerformed
        try
        {
            PrintWriter listLineWriter = new PrintWriter("list.txt");
            System.out.println(txaList.getText());
            listLineWriter.print(txaList.getText());
            listLineWriter.close();
        } catch (IOException ex)
        {
            Logger.getLogger(InventoryGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSavePDFActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(InventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(InventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(InventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new InventoryGUI(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExpr;
    private javax.swing.JButton btnGenList;
    private javax.swing.JButton btnLow;
    private javax.swing.JButton btnSavePDF;
    private javax.swing.JButton btnUpdateInvent;
    private javax.swing.JLabel lblFridge;
    private javax.swing.JLabel lblList;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBackG;
    private javax.swing.JScrollPane sclInvent;
    private javax.swing.JScrollPane sclList;
    private javax.swing.JTable tblInventoryDisply;
    private javax.swing.JTextArea txaList;
    // End of variables declaration//GEN-END:variables
}