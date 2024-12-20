/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author armed
 */
public class ResepNasional extends Resep{
     private String asalDaerah;

    public ResepNasional(String idResep, String nama, String ketegori, String bahan, String langkah, String penulis, String asalDaerah) {
        super(idResep, nama, "nasional", bahan, langkah, penulis);
        this.asalDaerah = asalDaerah;
    }

    public String getAsalDaerah() {
        return asalDaerah;
    }
}
