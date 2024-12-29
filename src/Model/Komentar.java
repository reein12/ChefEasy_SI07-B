/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author armed
 */
public class Komentar {

    private String Isi, Penulis;
    private int idResep;

    public Komentar(String Isi, String Penulis) throws ValidasiInputException {
        if (Isi == null || Isi.isEmpty()) {
            throw new ValidasiInputException("Isi tidak boleh kosong!");
        }
        if (Penulis == null || Penulis.isEmpty()) {
            throw new ValidasiInputException("Penulis tidak boleh kosong!");
        }

        this.Isi = Isi;
        this.Penulis = Penulis;
    }

    public String getIsi() {
        return Isi;
    }

    public String getPenulis() {
        return Penulis;
    }

    public int getIdResep() {
        return idResep;
    }

    public void setIdResep(int idResep) {
        this.idResep = idResep;
    }
}
