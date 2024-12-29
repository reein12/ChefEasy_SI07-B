/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Database.ResepDB;
import Model.Resep;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author armed
 */
public class ResepNasional extends javax.swing.JFrame {

    /**
     * Creates new form ResepNasional
     */
    private String username;

    public ResepNasional(String username) {
        this.username = username;
        initComponents();
        loadKonten();
    }

    public ResepNasional() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kontenMakanan = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblMakan = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblPenulis = new javax.swing.JLabel();
        lblBahan = new javax.swing.JLabel();
        btnDetail = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblGambar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tampilanMakanan = new javax.swing.JPanel();
        btnKembali = new javax.swing.JButton();

        kontenMakanan.setBackground(new java.awt.Color(180, 188, 172));
        kontenMakanan.setPreferredSize(new java.awt.Dimension(304, 160));
        kontenMakanan.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(180, 188, 172));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 30, 10));
        jPanel6.setMinimumSize(new java.awt.Dimension(164, 160));
        jPanel6.setPreferredSize(new java.awt.Dimension(164, 160));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        lblMakan.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        lblMakan.setForeground(new java.awt.Color(51, 51, 51));
        lblMakan.setText("tes");
        jPanel6.add(lblMakan);

        jPanel7.setBackground(new java.awt.Color(180, 188, 172));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel7.setLayout(new java.awt.BorderLayout());

        lblPenulis.setForeground(new java.awt.Color(51, 51, 51));
        lblPenulis.setText("Penulis");
        jPanel7.add(lblPenulis, java.awt.BorderLayout.PAGE_START);

        lblBahan.setForeground(new java.awt.Color(51, 51, 51));
        lblBahan.setText("Bahan bahan");
        jPanel7.add(lblBahan, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7);

        btnDetail.setText("Selengkapnya");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });
        jPanel6.add(btnDetail);

        kontenMakanan.add(jPanel6, java.awt.BorderLayout.WEST);

        jPanel5.setBackground(new java.awt.Color(180, 188, 172));
        jPanel5.setPreferredSize(new java.awt.Dimension(140, 160));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        lblGambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/Folder/pisang grg.jpeg"))); // NOI18N
        jPanel5.add(lblGambar);

        kontenMakanan.add(jPanel5, java.awt.BorderLayout.EAST);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 68, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RESEP NASIONAL");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tampilanMakanan.setBackground(new java.awt.Color(50, 68, 50));
        tampilanMakanan.setPreferredSize(new java.awt.Dimension(345, 1000));
        tampilanMakanan.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 12));
        jScrollPane1.setViewportView(tampilanMakanan);

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKembali)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKembali)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        DashboardFrame df = new DashboardFrame(username);
        df.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tambahKonten(Resep resep) {
        // Panel utama untuk konten makanan
        JPanel kontenMakanan = new JPanel();
        kontenMakanan.setBackground(new java.awt.Color(180, 188, 172));
        kontenMakanan.setPreferredSize(new java.awt.Dimension(304, 160));
        kontenMakanan.setLayout(new java.awt.BorderLayout());

        // Panel kiri untuk teks
        JPanel jPanel6 = new JPanel();
        jPanel6.setBackground(new java.awt.Color(180, 188, 172));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 30, 10));
        jPanel6.setMinimumSize(new java.awt.Dimension(164, 160));
        jPanel6.setPreferredSize(new java.awt.Dimension(164, 160));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 10));

        JLabel lblMakan = new JLabel();
        lblMakan.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        lblMakan.setForeground(new java.awt.Color(51, 51, 51));
        lblMakan.setText(resep.getNama());
        jPanel6.add(lblMakan);

        JPanel jPanel7 = new JPanel();
        jPanel7.setBackground(new java.awt.Color(180, 188, 172));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel7.setLayout(new java.awt.BorderLayout());

        JLabel lblPenulis = new JLabel();
        lblPenulis.setForeground(new java.awt.Color(51, 51, 51));
        lblPenulis.setText(resep.getPenulis());
        jPanel7.add(lblPenulis, java.awt.BorderLayout.PAGE_START);

        JLabel lblBahan = new JLabel();
        lblBahan.setForeground(new java.awt.Color(51, 51, 51));
        lblBahan.setText(resep.getBahan());
        jPanel7.add(lblBahan, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7);

        JButton btnDetail = new JButton("Selengkapnya");
        btnDetail.addActionListener(evt -> {
            new DetailResepNasional(resep.getIdResep(), username).setVisible(true);
        });
        jPanel6.add(btnDetail);

        kontenMakanan.add(jPanel6, java.awt.BorderLayout.WEST);

        // Panel kanan untuk gambar
        JPanel jPanel5 = new JPanel();
        jPanel5.setBackground(new java.awt.Color(180, 188, 172));
        jPanel5.setPreferredSize(new java.awt.Dimension(140, 160));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        JLabel lblGambar = new JLabel();
        tampilGambar(resep.getGambar(), lblGambar);
        jPanel5.add(lblGambar);

        kontenMakanan.add(jPanel5, java.awt.BorderLayout.EAST);

        // Tambahkan kartu ke panel utama
        tampilanMakanan.add(kontenMakanan);

        // Refresh panel utama
        tampilanMakanan.revalidate();
        tampilanMakanan.repaint();
    }

    private void tampilGambar(String path, JLabel lblGambar) {
        File file = new File(path);

        // Validasi apakah file ada
        if (!file.exists()) {
            lblGambar.setIcon(null);
            lblGambar.setText("Gambar tidak ditemukan");
            return;
        }

        try {
            // Membaca file gambar dari path
            byte[] img = Files.readAllBytes(file.toPath());
            ImageIcon imageIcon = new ImageIcon(img);

            // Dimensi label
            int labelWidth = 117;
            int labelHeight = 89;

            // Menghitung skala gambar agar sesuai dengan label
            int imageWidth = imageIcon.getIconWidth();
            int imageHeight = imageIcon.getIconHeight();

            double scaleX = (double) labelWidth / (double) imageWidth;
            double scaleY = (double) labelHeight / (double) imageHeight;
            double scale = Math.min(scaleX, scaleY);

            // Melakukan scaling pada gambar
            Image scaledImage = imageIcon.getImage().getScaledInstance((int) (scale * imageWidth), (int) (scale * imageHeight), Image.SCALE_SMOOTH);

            // Menampilkan gambar ke label
            lblGambar.setIcon(new ImageIcon(scaledImage));
            lblGambar.setText(""); // Hapus teks jika gambar berhasil ditampilkan
        } catch (IOException ex) {
            ex.printStackTrace();
            lblGambar.setIcon(null);
            lblGambar.setText("Gagal memuat gambar");
        }
    }

    private void loadKonten() {
        tampilanMakanan.removeAll();

        ResepDB resepDB = new ResepDB();

        List<Resep> resepList = resepDB.showDataByKategori("nasional");

        for (Resep resep : resepList) {
            tambahKonten(resep);
        }

        tampilanMakanan.revalidate();
        tampilanMakanan.repaint();
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
            java.util.logging.Logger.getLogger(ResepNasional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResepNasional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResepNasional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResepNasional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResepNasional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel kontenMakanan;
    private javax.swing.JLabel lblBahan;
    private javax.swing.JLabel lblGambar;
    private javax.swing.JLabel lblMakan;
    private javax.swing.JLabel lblPenulis;
    private javax.swing.JPanel tampilanMakanan;
    // End of variables declaration//GEN-END:variables
}
