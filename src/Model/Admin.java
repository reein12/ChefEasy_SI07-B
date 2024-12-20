/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author armed
 */
public class Admin extends Person {

    public Admin(String username, String password, String role) throws ValidasiInputException {
        super(username, password, "admin");
    }
}
