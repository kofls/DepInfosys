/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5_group58;

import static assignment5_group58.StartGUI.Itemfilename;
import static assignment5_group58.StartGUI.canDelete;
import static assignment5_group58.StartGUI.cashbook;
import static assignment5_group58.StartGUI.modifyItem;
import static assignment5_group58.StartGUI.modifyTransaction;
import static assignment5_group58.StartGUI.Transfilename;
import static assignment5_group58.StartGUI.itemList;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kaustubh
 */
@SuppressWarnings("serial")
public class ViewItemGUI extends javax.swing.JFrame implements Serializable{

    private Item modItem;

    /**
     * Creates new form ViewItemGUI
     * @param itemList
     * @param cashbook
     * @param canDelete
     * @param modifyItem
     * @param modifyTransaction
     */
    public ViewItemGUI(ArrayList<Item> itemList,ArrayList<Transaction> cashbook,
            int canDelete,Item modifyItem,Transaction modifyTransaction) {
        newinitComponents(itemList,cashbook,canDelete,modifyItem,modifyTransaction);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DeleteItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        DeleteItemButton.setText("Delete");
        DeleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(DeleteItemButton)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void newinitComponents(ArrayList<Item> itemList, ArrayList<Transaction> cashbook,
            int canDelete, Item modifyItem,Transaction modifyTransaction) {
        
        String[] columns = {"Name", "Location", "Price"};
	int size = itemList.size();
	Object[][] itemObject  = new String[size][3];
		
	int i;
	for(i = 0; i < size ; i++)
	{
		itemObject[i][0] = itemList.get(i).getname();
		itemObject[i][1] = itemList.get(i).getlocation();
		itemObject[i][2] = Double.toString(itemList.get(i).getprice());
	}
		
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(itemObject,columns);
        DeleteItemButton = new javax.swing.JButton();
        DeleteItemButton.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jScrollPane1.setViewportView(jTable1);
        
        switch (canDelete) {
            case 0:
                DeleteItemButton.setVisible(true);
                DeleteItemButton.setText("OK");
                DeleteItemButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                    dispose();
        }); break;
            case 1:
                DeleteItemButton.setVisible(true);
                DeleteItemButton.setText("Delete");
                DeleteItemButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                    DeleteItemButtonActionPerformed(evt);
        }); break;
        //modify
            case -1:
                DeleteItemButton.setVisible(true);
                DeleteItemButton.setText("Modify");
                DeleteItemButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                    DeleteItemButtonActionPerformed(evt);
        }); break;
            default:
                break;
        }
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(DeleteItemButton)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>    
    
    
    private void DeleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteItemButtonActionPerformed
        // TODO add your handling code here:
        
        int discard = jTable1.getSelectedRow();
	if(discard==-1)
	{
            JOptionPane.showMessageDialog(null, "Select an item first!");
	}
        else if(canDelete==1)
	{
            Item remove = itemList.remove(discard);
            JOptionPane.showMessageDialog(null,remove.getname()+" has been removed!");
            WriteItem newwrite = new WriteItem(itemList, Itemfilename);
            //WriteTrans neww = new WriteTrans(cashbook, Transfilename);
            dispose();
           // new ViewItemGUI(itemList,canDelete).setVisible(true);
        }
        else
        {
            modifyItem = itemList.get(discard);
           // WriteItem newwrite = new WriteItem(itemList, Itemfilename);
           // WriteTrans neww = new WriteTrans(cashbook, Transfilename);
            int m;
            for(m = 0;m <cashbook.size();m++)
            {
                if(cashbook.get(m).gettype().equals("Item"))
                {
                    if(cashbook.get(m).gettitle().equals(modifyItem.getname())
                       &&cashbook.get(m).getinvestment().equals(modifyItem.getprice()))
                    {
                        modifyTransaction = cashbook.get(m);
                        break;
                    }
                }
            }
            ModifyItemGUI newgui = new ModifyItemGUI(modifyItem,modifyTransaction);
            
            //updateCashbook(cashbook, Transfilename);
            newgui.setLocationRelativeTo(null);
            newgui.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_DeleteItemButtonActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewItemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewItemGUI(itemList,cashbook,canDelete,modifyItem,modifyTransaction).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteItemButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}