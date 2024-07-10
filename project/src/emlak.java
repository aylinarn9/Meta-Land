
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aylin
 */
public class emlak extends javax.swing.JFrame {

    /**
     * Creates new form emlak
     */
    public emlak() {
        initComponents();
        connection();
        idemlak();
        tabloemlak();
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
        jTemlak = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tx_emlak_komisyonu = new javax.swing.JTextField();
        tx_g_para_gideri = new javax.swing.JTextField();
        tx_isletme_id = new javax.swing.JTextField();
        jBEKLE = new javax.swing.JButton();
        jBGÜNCELLE = new javax.swing.JButton();
        jBDELETE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txteid = new javax.swing.JComboBox<>();
        jBara = new javax.swing.JButton();
        jBcıkıs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTemlak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "emlak_komisyonu", "g_para_gideri", "isletme_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTemlak);

        jLabel1.setText("emlak_komisy:");

        jLabel2.setText("g_para_gideri:");

        jLabel3.setText("isletme_id:");

        tx_g_para_gideri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_g_para_gideriActionPerformed(evt);
            }
        });

        jBEKLE.setText("EKLE");
        jBEKLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEKLEActionPerformed(evt);
            }
        });

        jBGÜNCELLE.setText("GÜNCELLE");
        jBGÜNCELLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGÜNCELLEActionPerformed(evt);
            }
        });

        jBDELETE.setText("DELETE");
        jBDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDELETEActionPerformed(evt);
            }
        });

        jLabel4.setText("emlakid:");

        txteid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBara.setText("ARA");
        jBara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaraActionPerformed(evt);
            }
        });

        jBcıkıs.setText("cıkıs");
        jBcıkıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcıkısActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tx_emlak_komisyonu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tx_g_para_gideri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tx_isletme_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txteid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBara)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jBEKLE)
                        .addGap(34, 34, 34)
                        .addComponent(jBGÜNCELLE)
                        .addGap(41, 41, 41)
                        .addComponent(jBDELETE)
                        .addGap(55, 55, 55)
                        .addComponent(jBcıkıs)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tx_emlak_komisyonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txteid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tx_g_para_gideri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBara))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tx_isletme_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEKLE)
                    .addComponent(jBGÜNCELLE)
                    .addComponent(jBDELETE)
                    .addComponent(jBcıkıs))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_g_para_gideriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_g_para_gideriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_g_para_gideriActionPerformed

    private void jBaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaraActionPerformed
        // TODO add your handling code here:
            try {
            // TODO add your handling code here:
            String marketid=txteid.getSelectedItem().toString();
            pat=baglan.prepareStatement("SELECT*FROM emlak WHERE id=?");
            pat.setString(1, marketid);
            
            rs=pat.executeQuery();
          
            if(rs.next()==true){
               tx_emlak_komisyonu.setText(rs.getString(2));
                tx_g_para_gideri.setText(rs.getString(3));
               tx_isletme_id.setText(rs.getString(4));
                
                 
                 
              
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(yontoyuncuekleme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBaraActionPerformed

    private void jBEKLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEKLEActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            String emlak_komisyonu=tx_emlak_komisyonu.getText();
            String g_para_gideri=tx_g_para_gideri.getText();
            String isletme_id=tx_isletme_id.getText();
   
           
      
            pat=baglan.prepareStatement("INSERT INTO emlak(emlak_komisyonu,g_para_gideri,isletme_id) VALUES(?,?,?)");
            pat.setString(1,emlak_komisyonu);
            pat.setString(2, g_para_gideri);
            pat.setString(3, isletme_id);
            
           
            int k=pat.executeUpdate();
             tabloemlak();
            if(k==1){
                JOptionPane.showMessageDialog(this, "veri tabani eklemesi basarili");
               
                tx_emlak_komisyonu.setText("");
                tx_g_para_gideri.setText("");
                tx_isletme_id.setText("");
             
             
                  
            }
            else{
                JOptionPane.showMessageDialog(this, "veri tabani eklemesi basarisiz");
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(yontoyuncuekleme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBEKLEActionPerformed

    private void jBGÜNCELLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGÜNCELLEActionPerformed
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
      String emlak_komisyonu=tx_emlak_komisyonu.getText();
            String g_para_gideri=tx_g_para_gideri.getText();
            String isletme_id=tx_isletme_id.getText();
            
            String marketid=txteid.getSelectedItem().toString();
            pat=baglan.prepareStatement("UPDATE emlak SET emlak_komisyonu=?,g_para_gideri=?,isletme_id=? WHERE id=?");
           pat.setString(1,emlak_komisyonu);
            pat.setString(2, g_para_gideri);
            pat.setString(3, isletme_id);
            pat.setString(4,marketid);
            
              int k=pat.executeUpdate();
            if(k==1){
              JOptionPane.showMessageDialog(this, "kayit basariyla guncellendi");
           tabloemlak();
               
                   tx_emlak_komisyonu.setText("");
                tx_g_para_gideri.setText("");
                tx_isletme_id.setText("");
                 tx_emlak_komisyonu.requestFocus();
                idemlak();
                
                  
            }
        } catch (SQLException ex) {
            Logger.getLogger(yontoyuncuekleme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBGÜNCELLEActionPerformed

    private void jBDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDELETEActionPerformed
        // TODO add your handling code here:
                  DefaultTableModel RecordTable=(DefaultTableModel)jTemlak.getModel();
        int satirSec=jTemlak.getSelectedRow();
      
      
              try {
             int id=Integer.parseInt(RecordTable.getValueAt(satirSec, 0).toString());
       int delete=JOptionPane.showConfirmDialog(null,"silinsin","silme islemi",JOptionPane.YES_NO_OPTION);
        if(delete==JOptionPane.YES_OPTION){
                  pat=baglan.prepareStatement("DELETE FROM emlak WHERE id=?");
                  pat.setInt(1, id);
                  pat.execute();
                  tabloemlak();
                   tx_emlak_komisyonu.setText("");
                tx_g_para_gideri.setText("");
                tx_isletme_id.setText("");
                
                  
                
        } 
              } catch (SQLException ex) {
                  Logger.getLogger(yontoyuncuekleme.class.getName()).log(Level.SEVERE, null, ex);
              }
    }//GEN-LAST:event_jBDELETEActionPerformed

    private void jBcıkısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcıkısActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jBcıkısActionPerformed
  Connection baglan; 
  PreparedStatement pat;
  ResultSet rs;
  int q,i;
          public void idemlak() {
        try {
            pat=baglan.prepareStatement("SELECT id FROM emlak");
            rs=pat.executeQuery();
            txteid.removeAllItems();
            while(rs.next()){
                txteid.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(yontoyuncuekleme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void connection(){
       try{
       Class.forName("com.mysql.jdbc.Driver");
     String bag="jdbc:mysql://localhost:3306/new_proje";
     String username="root";
     String sifre="684217";
     baglan= DriverManager.getConnection(bag,username,sifre);
    JOptionPane.showMessageDialog(null, "veri tabani baglantisi basarili");
   
       }
       catch (ClassNotFoundException ex) {
            Logger.getLogger(yontoyuncuekleme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(yontoyuncuekleme.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
   
     
     public void tabloemlak(){
        try {
            pat=baglan.prepareStatement("SELECT*FROM emlak");
 
              rs=pat.executeQuery();
            ResultSetMetaData stveri=rs.getMetaData();
            q=stveri.getColumnCount();
            DefaultTableModel RecordTable=(DefaultTableModel)jTemlak.getModel();
                    RecordTable.setRowCount(0);
             while(rs.next()){
                 Vector sutunVeri=new Vector();
                 for(i =1;i<=q;i++){
                     sutunVeri.add(rs.getString("id"));
                     sutunVeri.add(rs.getString("emlak_komisyonu"));
                     sutunVeri.add(rs.getString("g_para_gideri"));
                     sutunVeri.add(rs.getString("isletme_id"));
                    
                    
                 }
                 RecordTable.addRow(sutunVeri);
                 
             }       
            
            
        } catch (SQLException ex) {
            Logger.getLogger(yontoyuncuekleme.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(emlak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emlak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emlak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emlak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emlak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDELETE;
    private javax.swing.JButton jBEKLE;
    private javax.swing.JButton jBGÜNCELLE;
    private javax.swing.JButton jBara;
    private javax.swing.JButton jBcıkıs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTemlak;
    private javax.swing.JTextField tx_emlak_komisyonu;
    private javax.swing.JTextField tx_g_para_gideri;
    private javax.swing.JTextField tx_isletme_id;
    private javax.swing.JComboBox<String> txteid;
    // End of variables declaration//GEN-END:variables
}
