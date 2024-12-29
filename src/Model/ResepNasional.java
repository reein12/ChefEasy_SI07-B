/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author armed
 */
public class ResepNasional extends Resep {

    private String asalDaerah;

    public ResepNasional(String nama, String ketegori, String bahan, String langkah, String penulis, String asalDaerah) throws ValidasiInputException {
        super(nama, ketegori, bahan, langkah, penulis);
        if (asalDaerah == null || asalDaerah.isEmpty()) {
            throw new ValidasiInputException("asalDaerah tidak boleh kosong!");
        }
        this.asalDaerah = asalDaerah;
    }

    public String getAsalDaerah() {
        return asalDaerah;
    }
}
