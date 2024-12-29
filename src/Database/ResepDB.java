/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author armed
 */
import Controller.ResepController;
import Model.Resep;
import Model.ResepInternasional;
import Model.ResepNasional;
import Model.ValidasiInputException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResepDB implements ResepController {

    @Override
    public void tambaData(Resep resep, String gambar) {
        String query = "INSERT INTO resep (nama, kategori, bahan, langkah, penulis, negaraAsal, asalDaerah, gambar) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {

            st.setString(1, resep.getNama());
            st.setString(2, resep.getKategori());
            st.setString(3, resep.getBahan());
            st.setString(4, resep.getLangkah());
            st.setString(5, resep.getPenulis());
            st.setString(8, gambar);

            if (resep instanceof ResepInternasional) {
                st.setString(6, ((ResepInternasional) resep).getNegaraAsal());
                st.setNull(7, Types.VARCHAR);
            } else if (resep instanceof ResepNasional) {
                st.setNull(6, Types.VARCHAR);
                st.setString(7, ((ResepNasional) resep).getAsalDaerah());
            } else {
                st.setNull(6, Types.VARCHAR);
                st.setNull(7, Types.VARCHAR);
            }

            st.executeUpdate();
            System.out.println("Data berhasil ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(Resep resep, String gambar, int idResep) {
        String query = "UPDATE resep SET nama = ?, kategori = ?, bahan = ?, langkah = ?, penulis = ?, negaraAsal = ?, asalDaerah = ?, gambar = ? WHERE idResep = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {

            st.setString(1, resep.getNama());
            st.setString(2, resep.getKategori());
            st.setString(3, resep.getBahan());
            st.setString(4, resep.getLangkah());
            st.setString(5, resep.getPenulis());
            st.setString(8, gambar);

            if (resep instanceof ResepInternasional) {
                st.setString(6, ((ResepInternasional) resep).getNegaraAsal());
                st.setNull(7, Types.VARCHAR);
            } else if (resep instanceof ResepNasional) {
                st.setNull(6, Types.VARCHAR);
                st.setString(7, ((ResepNasional) resep).getAsalDaerah());
            } else {
                st.setNull(6, Types.VARCHAR);
                st.setNull(7, Types.VARCHAR);
            }

            st.setInt(9, idResep);
            st.executeUpdate();
            System.out.println("Data berhasil diperbarui.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteData(int idResep) {
        String query = "DELETE FROM resep WHERE idResep = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {

            st.setInt(1, idResep);
            st.executeUpdate();
            System.out.println("Data berhasil dihapus.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Resep> showData() {
        List<Resep> resepList = new ArrayList<>();
        String query = "SELECT * FROM resep";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
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
                    if (negaraAsal != null) {
                        // Jika negaraAsal tidak null, maka ini adalah ResepInternasional
                        resep = new ResepInternasional(nama, kategori, bahan, langkah, penulis, negaraAsal);
                    } else {
                        // Jika negaraAsal null, maka ini adalah ResepNasional
                        resep = new ResepNasional(nama, kategori, bahan, langkah, penulis, asalDaerah);
                    }
                    resepList.add(resep);
                    resep.setIdResep(idResep);
                    resep.setGambar(gambar);
                }
            }
        } catch (SQLException | ValidasiInputException e) {
            e.printStackTrace();
        }
        return resepList;
    }

    @Override
    public List<Resep> showDataByKategori(String kategori) {
        List<Resep> resepList = new ArrayList<>();
        String query;

        if ("nasional".equalsIgnoreCase(kategori)) {
            query = "SELECT * FROM resep WHERE asalDaerah IS NOT NULL";
        } else if ("Internasional".equalsIgnoreCase(kategori)) {
            query = "SELECT * FROM resep WHERE negaraAsal IS NOT NULL";
        } else {
            throw new IllegalArgumentException("Kategori tidak valid: " + kategori);
        }

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    if ("nasional".equalsIgnoreCase(kategori)) {
                        ResepNasional resep = new ResepNasional(
                                rs.getString("nama"),
                                rs.getString("kategori"),
                                rs.getString("bahan"),
                                rs.getString("langkah"),
                                rs.getString("penulis"),
                                rs.getString("asalDaerah")
                        );
                        resep.setIdResep(rs.getInt("idResep"));
                        resep.setGambar(rs.getString("gambar"));
                        resepList.add(resep);
                    } else {
                        ResepInternasional resep = new ResepInternasional(
                                rs.getString("nama"),
                                rs.getString("kategori"),
                                rs.getString("bahan"),
                                rs.getString("langkah"),
                                rs.getString("penulis"),
                                rs.getString("negaraAsal")
                        );
                        resep.setIdResep(rs.getInt("idResep"));
                        resep.setGambar(rs.getString("gambar"));
                        resepList.add(resep);
                    }
                }
            }
        } catch (SQLException | ValidasiInputException e) {
            e.printStackTrace();
        }
        return resepList;
    }

    @Override
    public List<Resep> showDataById(int idResep) {
        List<Resep> resepList = new ArrayList<>();
        String query = "SELECT * FROM resep WHERE idResep = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement st = conn.prepareStatement(query)) {
            st.setInt(1, idResep);

            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
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
                        resep = new ResepInternasional(
                                nama, kategori, bahan, langkah, penulis, negaraAsal);
                    } else {
                        // Jika negaraAsal null atau kosong, maka ini adalah ResepNasional
                        resep = new ResepNasional(
                                nama, kategori, bahan, langkah, penulis, asalDaerah);
                    }
                    resep.setGambar(gambar); // Set gambar jika ada
                    resepList.add(resep);
                }
            }
        } catch (SQLException | ValidasiInputException e) {
            e.printStackTrace();
        }
        return resepList;
    }

}
