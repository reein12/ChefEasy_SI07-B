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

    private int idResep;
    private String gambar;
    private String nama, kategori, bahan, langkah, penulis;

    public Resep(String nama, String kategori, String bahan, String langkah, String penulis) throws ValidasiInputException {

        if (nama == null || nama.isEmpty()) {
            throw new ValidasiInputException("nama tidak boleh kosong!");
        }
        if (bahan == null || bahan.isEmpty()) {
            throw new ValidasiInputException("bahan tidak boleh kosong!");
        }
        if (langkah == null || langkah.isEmpty()) {
            throw new ValidasiInputException("langkah tidak boleh kosong!");
        }
        if (penulis == null || penulis.isEmpty()) {
            throw new ValidasiInputException("penulis tidak boleh kosong!");
        }
        this.idResep = idResep;
        this.nama = nama;
        this.kategori = kategori;
        this.bahan = bahan;
        this.langkah = langkah;
        this.penulis = penulis;
    }

    public int getIdResep() {
        return idResep;
    }

    public void setIdResep(int id) {
        this.idResep = id;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
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

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
