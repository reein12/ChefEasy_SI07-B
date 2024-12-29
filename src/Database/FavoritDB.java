/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Controller.FavoritController;
import Model.Resep;
import Model.ResepInternasional;
import Model.ResepNasional;
import Model.ValidasiInputException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author armed
 */
public class FavoritDB implements FavoritController {

    @Override
    public void tambahFavorit(int id_resep, String username) {

        String query = "INSERT INTO favorit (id_resep, username) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {

            st.setInt(1, id_resep);
            st.setString(2, username);

            st.executeUpdate();
            System.out.println("Data berhasil ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Resep> getFavorit(String username) {
        List<Resep> favoritList = new ArrayList<>();
        String query = "SELECT r.* FROM favorit f JOIN resep r ON f.id_resep = r.idResep WHERE f.username = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            st.setString(1, username);

            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    int idResep = rs.getInt("idResep");
                    String nama = rs.getString("nama");
                    String kategori = rs.getString("kategori");
                    String bahan = rs.getString("bahan");
                    String langkah = rs.getString("langkah");
                    String penulis = rs.getString("penulis");
                    String negaraAsal = rs.getString("negaraAsal");
                    String asalDaerah = rs.getString("asalDaerah");
                    String gambar = rs.getString("gambar");

                    Resep resep;
                    if (negaraAsal != null && !negaraAsal.isEmpty()) {
                        // Jika negaraAsal tidak null atau kosong, maka ini adalah ResepInternasional
                        resep = new ResepInternasional(nama, kategori, bahan, langkah, penulis, negaraAsal);
                    } else {
                        // Jika negaraAsal null atau kosong, maka ini adalah ResepNasional
                        resep = new ResepNasional(nama, kategori, bahan, langkah, penulis, asalDaerah);
                    }
                    resep.setGambar(gambar); // Set gambar jika ada
                    resep.setIdResep(idResep); // Set gambar jika ada
                    favoritList.add(resep);
                }
            } catch (ValidasiInputException ex) {
                ex.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return favoritList;
    }

    @Override
    public void deleteFavorit(int id_resep, String username) {
        String query = "DELETE FROM favorit WHERE id_resep = ? AND username = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            // Set parameters for the query
            st.setInt(1, id_resep);
            st.setString(2, username);

            // Execute the delete query
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data favorit berhasil dihapus.");
            } else {
                System.out.println("Data favorit tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Terjadi kesalahan saat menghapus data favorit.");
        }
    }

}
