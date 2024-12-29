/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Notifikasi;
import java.util.List;

/**
 *
 * @author armed
 */
public interface NotifController {

    void addKomentar(Notifikasi notif);

    List<Notifikasi> showKomentar(String username);
}
