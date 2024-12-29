/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author armed
 */
import Controller.PenggunaController;
import Model.Person;
import Model.ValidasiInputException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PenggunaDB implements PenggunaController {

    @Override
    public void register(Person person) {
        String query = "INSERT INTO persons (nama, username, password, noHp, hakAkses) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, person.getNama());
            stmt.setString(2, person.getUsername());
            stmt.setString(3, person.getPassword());
            stmt.setString(4, person.getNoHp());
            stmt.setString(5, person.getHakAkses());
            stmt.executeUpdate();
            System.out.println("Registrasi berhasil.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Gagal mendaftarkan pengguna: " + e.getMessage());
        }
    }

    @Override
    public String login(String username, String password) {
        String query = "SELECT hakAkses FROM persons WHERE username = ? AND password = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("hakAkses");
            } else {
                throw new ValidasiInputException("Username atau Password salah!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Terjadi kesalahan saat login: " + e.getMessage());
        } catch (ValidasiInputException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
