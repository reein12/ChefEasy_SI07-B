/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Komentar;
import java.util.List;

/**
 *
 * @author armed
 */
public interface KomentarController {

    void addKomentar(int resepId, Komentar komentar);

    List<Komentar> showKomentar(int resepId);

}
