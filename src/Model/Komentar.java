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

    private String idKomentar;
    private String Isi, Penulis, Resep;

    public Komentar(String idKomentar, String Isi, String Penulis, String Resep) {
        this.idKomentar = idKomentar;
        this.Isi = Isi;
        this.Penulis = Penulis;
        this.Resep = Resep;
    }

    public String getIdKomentar() {
        return idKomentar;
    }

    public String getIsi() {
        return Isi;
    }

    public String getPenulis() {
        return Penulis;
    }

    public String getResep() {
        return Resep;
    }
}
