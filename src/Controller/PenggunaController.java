/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Person;

/**
 *
 * @author armed
 */
public interface PenggunaController {

    void register(Person person);

    String login(String username, String password);
}
