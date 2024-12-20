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
public class Notifikasi {

    private String idNotifiakasi;
    private Date waktuNotif;
    private String pesanNotif, Pengguna;

    public Notifikasi(String idNotifiakasi, Date waktuNotif, String pesanNotif, String Pengguna) {
        this.idNotifiakasi = idNotifiakasi;
        this.waktuNotif = waktuNotif;
        this.pesanNotif = pesanNotif;
        this.Pengguna = Pengguna;
    }

    public String getIdNotifiakasi() {
        return idNotifiakasi;
    }

    public Date getWaktuNotif() {
        return waktuNotif;
    }

    public String getPesanNotif() {
        return pesanNotif;
    }

    public String getPengguna() {
        return Pengguna;
    }
}
