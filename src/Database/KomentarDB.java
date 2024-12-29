/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Controller.KomentarController;
import Model.Komentar;
import Model.ValidasiInputException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author armed
 */
public class KomentarDB implements KomentarController {

    @Override
    public void addKomentar(int resepId, Komentar komentar) {
        String sql = "INSERT INTO komentar (isi, penulis, idResep) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, komentar.getIsi());
            st.setString(2, komentar.getPenulis());
            st.setInt(3, resepId);

            st.executeUpdate();
            System.out.println("Komentar berhasil ditambahkan.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Komentar> showKomentar(int resepId) {
        List<Komentar> Komentars = new ArrayList<>();
        String sql = "SELECT isi, penulis FROM komentar WHERE idResep = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, resepId);

            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    String isi = rs.getString("isi");
                    String penulis = rs.getString("penulis");

                    Komentars.add(new Komentar(isi, penulis));
                }
            } catch (ValidasiInputException ex) {
                ex.printStackTrace();
            }

            System.out.println("Komentar berhasil diambil.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Komentars;
    }

}
