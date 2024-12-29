/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Resep;
import Model.ResepInternasional;
import Model.ResepNasional;
import java.util.List;

/**
 *
 * @author armed
 */
public interface ResepController {

    void tambaData(Resep resep, String gambar);

    void updateData(Resep resep, String gambar, int idResep);

    void deleteData(int idResep);

    List<Resep> showData();

    List<Resep> showDataById(int idResep);

    List<Resep> showDataByKategori(String kategori);
}
