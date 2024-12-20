/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author armed
 */
public class Pengguna extends Person {
    private String nama;
    private String noHp;

    public Pengguna(String nama, String username, String password, String noHp, String hakAkses) throws ValidasiInputException {
        
        super(username, password, "pengguna");

        if (nama == null || nama.isEmpty()) {
            throw new ValidasiInputException("Username tidak boleh kosong!");
        }
        if (username == null || username.isEmpty()) {
            throw new ValidasiInputException("Username tidak boleh kosong!");
        }
        if (password == null || password.isEmpty()) {
            throw new ValidasiInputException("Password tidak boleh kosong!");
        }
        if (noHp == null || !noHp.matches("\\d{12}")) {
            throw new ValidasiInputException("Password tidak boleh kosong!");
        }

        this.nama = nama;
        this.noHp = noHp;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String noHp() {
        return noHp;
    }
}
