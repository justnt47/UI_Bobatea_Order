/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main extends javax.swing.JFrame {
    
    String price[] = {"50","60","75","55","60","85","65","60","70","80"};
    
    DefaultTableModel model;
    
    int selected;
    public Main() {
        initComponents();
        String[] columnNames = {"Menu" , "Quantity" , "Price" , "Total Price" };
        model = new DefaultTableModel(columnNames, 0);
        jTable1.setModel(model);
        
        //Price
        jTextPrice.setText(price[0]);
        
        double money = Double.valueOf(jTextPrice.getText())*Double.valueOf(jComboBoxQty.getSelectedItem().toString());
        String s = String.valueOf(money);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboMenu = new javax.swing.JComboBox<>();
        jBadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxQty = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextPrice = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        showTotal = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Menu", "Quantity", "Price", "Total Price"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setEnabled(false);
        jTable1.setShowGrid(false);
        jTable1.setShowVerticalLines(false);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTable1);

        jComboMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboMenu.setForeground(new java.awt.Color(255, 0, 51));
        jComboMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milk tea", "Brown sugar milk tea", "Thai tea", "Iced milk tea", "Green tea", "Chaneste", "Chocolate", "Cocoa", "Mocha", "Latte" }));
        jComboMenu.setAutoscrolls(true);
        jComboMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMenuActionPerformed(evt);
            }
        });

        jBadd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBadd.setText("Add");
        jBadd.setAutoscrolls(true);
        jBadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setText("Welcome to Amtaro");

        jComboBoxQty.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxQty.setForeground(new java.awt.Color(255, 0, 51));
        jComboBoxQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBoxQty.setAutoscrolls(true);
        jComboBoxQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxQtyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        jLabel2.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quantity");
        jLabel3.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Price");
        jLabel4.setAutoscrolls(true);

        jTextPrice.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPrice.setEnabled(false);
        jTextPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPriceActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setAutoscrolls(true);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setText("Bill");
        jButton2.setAutoscrolls(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        showTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showTotal.setText(" ");
        showTotal.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(350, 350, 350))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextPrice)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxQty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(23, 23, 23)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBadd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBadd, jButton2, jButton3, jComboBoxQty, jComboMenu, jLabel2, jLabel3, jLabel4, jTextPrice});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMenuActionPerformed
        // TODO add your handling code here:
        jTextPrice.setText(price[jComboMenu.getSelectedIndex()]);
    }//GEN-LAST:event_jComboMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxQtyActionPerformed

    private void jBaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddActionPerformed
        // TODO add your handling code here:
        
        double money = Double.valueOf(jTextPrice.getText())*Double.valueOf(jComboBoxQty.getSelectedItem().toString());
        String s = String.valueOf(money);
        String[] rowData = {jComboMenu.getSelectedItem().toString() , jComboBoxQty.getSelectedItem().toString(),price[jComboMenu.getSelectedIndex()],s};
        model.addRow(rowData);
        double total = 0;
        
        //jBaddActionPerformed
        for(int i = 0 ; i < model.getRowCount() ; i++){
            Object value = model.getValueAt(i, 3);
            String str = value.toString(); 
            double d = Double.parseDouble(str);
            total = total + d;
        }
        String sTotal = String.valueOf(total);
        showTotal.setText(sTotal);
        
        
        
        //Crash
        /*
        String checkMenu = jComboMenu.getSelectedItem().toString();
        try{
            if (model.getRowCount()!= 0)
            {
                for(int i = 0 ; i < model.getRowCount() ; i++){
                    if(checkMenu == jComboMenu.getSelectedItem().toString())
                    {
                       double newQty ;
                       newQty = Double.valueOf(jComboBoxQty.getSelectedItem().toString()) + Double.valueOf(model.getValueAt(i, 1).toString());
                       String showNewQty = String.valueOf(newQty);
                       money = Double.valueOf(jTextPrice.getText()) * newQty;
                       s = String.valueOf(money);
                       String[] newRowData = {jComboMenu.getSelectedItem().toString() , showNewQty ,price[jComboMenu.getSelectedIndex()],s};
                       model.addRow(newRowData);
                    }
                }
            }
            else
            {

                showTotal.setText(sTotal);
            }
        }
        catch(Exception e)
        {
            System.out.println("0");
        }
        */
       
       
        
        
        
        
    }//GEN-LAST:event_jBaddActionPerformed

    private void jTextPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPriceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try{
            model.removeRow(model.getRowCount() - 1);
        }
        catch(Exception e) {
            System.out.println("no item");
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LocalDate date = LocalDate.now();
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String timeFormat = time.format(timeformat);
        String dateFormat = date.format(dateformat);
        double total = 0;
        for(int i = 0 ; i < model.getRowCount() ; i++){
            Object value = model.getValueAt(i, 3);
            String str = value.toString(); 
            double d = Double.parseDouble(str);
            total = total + d;
        }
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("                        Amtaro\n");
            myWriter.write(dateFormat + "                                    " + timeFormat);
            myWriter.write("\n------------------------------------------------------");
            myWriter.write("\n             Menu            Qty            Total");
            myWriter.write("\n------------------------------------------------------");
            for(int i = 0 ; i < model.getRowCount() ; i++){
                myWriter.write("\n" + String.format("%-20s",model.getValueAt(i, 0)) + "          " + model.getValueAt(i, 1) + "             " + model.getValueAt(i, 3));
            }
            myWriter.write("\n------------------------------------------------------");
            myWriter.write("\nTotal : " + total);
//          myWriter.write("\nTotal Recived : ");
//          myWriter.write("\nTotal Balance : ");
            myWriter.write("\n------------------------------------------------------");
            myWriter.write("\n");
            myWriter.write("\n------------------------------------------------------");
            myWriter.write("\nPlease come back to our cafe again :)");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBadd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxQty;
    private javax.swing.JComboBox<String> jComboMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JLabel showTotal;
    // End of variables declaration//GEN-END:variables
}
