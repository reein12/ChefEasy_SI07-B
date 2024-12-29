/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Resep;
import java.util.List;

/**
 *
 * @author armed
 */
public interface FavoritController {

    void tambahFavorit(int id_resep, String username);

    List<Resep> getFavorit(String username);

    void deleteFavorit(int id_resep, String username);
}
