/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projek;
import java.sql.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Apk extends javax.swing.JFrame {

    /**
     * Creates new form Apk
     */
    public Apk() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idMember = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tb_simpan = new javax.swing.JButton();
        tb_edit = new javax.swing.JButton();
        tb_hapus = new javax.swing.JButton();
        tb_cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        usia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DATA MEMBER MINIMARKET");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("id_member");

        idMember.setText(" ");
        idMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMemberActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nama");

        nama.setText(" ");
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        email.setText(" ");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Alamat Email");

        tb_simpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_simpan.setText("simpan");
        tb_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_simpanActionPerformed(evt);
            }
        });

        tb_edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_edit.setText("edit");
        tb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_editActionPerformed(evt);
            }
        });

        tb_hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_hapus.setText("hapus");
        tb_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_hapusActionPerformed(evt);
            }
        });

        tb_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_cancel.setText("batal");
        tb_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_cancelActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        usia.setText(" ");
        usia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usiaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Usia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(66, 66, 66)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(30, 30, 30)
                                    .addComponent(idMember, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(usia, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(tb_simpan)
                                .addGap(36, 36, 36)
                                .addComponent(tb_edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tb_hapus)
                                .addGap(32, 32, 32)
                                .addComponent(tb_cancel)))))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_simpan)
                    .addComponent(tb_edit)
                    .addComponent(tb_hapus)
                    .addComponent(tb_cancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idMemberActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void tb_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_simpanActionPerformed
        try{
            String sql = "insert into member values('"
                   +idMember.getText()+"','"
                    +nama.getText()+"','"
                     +email.getText()+"','"
                      +usia.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)projek.Koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "berhasil disimpan");
                    tampilData();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "gagal disimpan");
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_tb_simpanActionPerformed

    private void tb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_editActionPerformed
        try{
            String sql="insert into member values('"
                    +idMember.getText()+"','"
                    +nama.getText()+"','"
                    +email.getText()+"','"
                    +usia.getText()+"')";
                 java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampilData();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_tb_editActionPerformed

    private void tb_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_hapusActionPerformed
        try{
    java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
    String sql = "delete from member where id_member='"+idMember.getText()+"' ";
    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
    pst.executeUpdate(); JOptionPane.showMessageDialog(null,"Data berhasil di hapus");
    tampilData();
    }
catch (Exception e){
JOptionPane.showMessageDialog(null,"Proses Penghapusan Gagal");
System.out.println(e.getMessage());
}

    }//GEN-LAST:event_tb_hapusActionPerformed

    private void tb_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_cancelActionPerformed
        idMember.setText("");
        nama.setText("");
        email.setText("");
        usia.setText("");  
    }//GEN-LAST:event_tb_cancelActionPerformed

    private void usiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usiaActionPerformed
    
    public void tampilData(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("id member");
        tabel.addColumn("nama");
        tabel.addColumn("email");
        tabel.addColumn("usia");
        try{
            java.sql.Connection conn=(java.sql.Connection)projek.Koneksi.koneksiDB();
            String sql = "select * from member";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            while(rs.next())
            {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                     rs.getString(2),
                      rs.getString(3),
                       rs.getString(4)});
                }
            jTable1.setModel(tabel);
            }
        catch (Exception e){
        
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
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField idMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nama;
    private javax.swing.JButton tb_cancel;
    private javax.swing.JButton tb_edit;
    private javax.swing.JButton tb_hapus;
    private javax.swing.JButton tb_simpan;
    private javax.swing.JTextField usia;
    // End of variables declaration//GEN-END:variables
}