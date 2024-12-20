/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author armed
 */
public class Resep {

    private String idResep;
    private String nama, ketegori, bahan, langkah, penulis;

    public Resep(String idResep, String nama, String ketegori, String bahan, String langkah, String penulis) {
        this.idResep = idResep;
        this.nama = nama;
        this.ketegori = ketegori;
        this.bahan = bahan;
        this.langkah = langkah;
        this.penulis = penulis;
    }

    public String getIdResep() {
        return idResep;
    }

    public String getNama() {
        return nama;
    }

    public String getKetegori() {
        return ketegori;
    }

    public String getBahan() {
        return bahan;
    }

    public String getLangkah() {
        return langkah;
    }

    public String getPenulis() {
        return penulis;
    }
}
