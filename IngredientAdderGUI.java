/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

/**
 *ingredient adder screen
 * @author kelly
 */
public class IngredientAdderGUI extends javax.swing.JFrame
{

    /**
     * Creates new form IngredientAdderGUI
     */
    private javax.swing.JCheckBox[] cbArr = new javax.swing.JCheckBox[2000];
    private IngredientsArr ingrsArr = new IngredientsArr();
    private int a = 0;
    private static User user;
    private static String pool;

    public IngredientAdderGUI(User u, String p)
    {
        user = u;
        pool = p;
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

        pnlBackG = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        pnlSclIngrs = new javax.swing.JScrollPane();
        pnlIngrs = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Ingredients");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        pnlBackG.setBackground(new java.awt.Color(204, 255, 255));

        btnAdd.setText("Add selected");
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        pnlSclIngrs.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlIngrs.setBackground(new java.awt.Color(255, 255, 0));
        pnlIngrs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlSclIngrs.setViewportView(pnlIngrs);

        javax.swing.GroupLayout pnlBackGLayout = new javax.swing.GroupLayout(pnlBackG);
        pnlBackG.setLayout(pnlBackGLayout);
        pnlBackGLayout.setHorizontalGroup(
            pnlBackGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSclIngrs, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlBackGLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackGLayout.setVerticalGroup(
            pnlBackGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSclIngrs, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(245, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        Ingredients[] ingr = ingrsArr.getIngArr();
        Ingredients[] ingr2 = new Ingredients[ingrsArr.getSize()];
        int b = 0, c = 0;

        for (int i = 0; i < a; i++)
        {
            if (cbArr[b].isSelected() == true)
            {
                ingr2[c] = ingr[b];
                b++;
                c++;
            } else
            {
                b++;
            }
        }
        ingrsArr = new IngredientsArr(ingr2, c);
        new InventoryUpdaterGUI(user, pool, ingrsArr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        Ingredients[] ingrs;
        ingrs = ingrsArr.getIngArr();

        while (a < ingrsArr.getSize())
        {
            String d = ingrs[a].getIngName();
            cbArr[a] = new javax.swing.JCheckBox(d);
            pnlIngrs.add(cbArr[a], new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25 * (a), 200, 20));
            a++;
        }
        pnlIngrs.updateUI();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(IngredientAdderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(IngredientAdderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(IngredientAdderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(IngredientAdderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new IngredientAdderGUI(user, pool).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnAdd;
    javax.swing.JPanel pnlBackG;
    javax.swing.JPanel pnlIngrs;
    javax.swing.JScrollPane pnlSclIngrs;
    // End of variables declaration//GEN-END:variables
}
