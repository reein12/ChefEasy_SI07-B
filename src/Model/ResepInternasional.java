/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author armed
 */
public class ResepInternasional extends Resep {

    private String negaraAsal;

    public ResepInternasional(String idResep, String nama, String ketegori, String bahan, String langkah, String penulis, String negaraAsal) {
        super(idResep, nama, "internasional", bahan, langkah, penulis);
        this.negaraAsal = negaraAsal;
    }

    public String getNegaraAsal() {
        return negaraAsal;
    }
}
