/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Controller.NotifController;
import Model.Notifikasi;
import Model.ValidasiInputException;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author armed
 */
public class NotifDB implements NotifController {

    @Override
    public void addKomentar(Notifikasi notif) {
        String sql = "INSERT INTO notifikasi (isi_notif, username) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, notif.getPesanNotif());
            st.setString(2, notif.getPengguna());

            st.executeUpdate();
            System.out.println("notifikasi berhasil ditambahkan.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Notifikasi> showKomentar(String username) {
        List<Notifikasi> notifList = new ArrayList<>();
        String sql = "SELECT * FROM notifikasi WHERE username = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, username);

            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    String isi = rs.getString("isi_notif");
                    String pengguna = rs.getString("username");

                    notifList.add(new Notifikasi(isi, pengguna));
                }
            }
            System.out.println("Komentar berhasil diambil.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return notifList;
    }

}
