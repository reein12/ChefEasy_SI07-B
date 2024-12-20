/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author armed
 */
public class Person {

    private String username;
    private String password;
    private String hakAkses;

    public Person(String username, String password, String hakAkses) throws ValidasiInputException {

        if (username == null || username.isEmpty()) {
            throw new ValidasiInputException("Username tidak boleh kosong!");
        }
        if (password == null || password.isEmpty()) {
            throw new ValidasiInputException("Password tidak boleh kosong!");
        }

        this.username = username;
        this.password = password;
        this.hakAkses = hakAkses;
    }

    // Getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHakAkses() {
        return hakAkses;
    }
}
