package com.example.daftar_pura_bali;

import java.io.Serializable;

class DaftarPura implements Serializable {
    private String namaPura, lokasiPura, Deskripsi;
    private int foto;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNamaPura() {
        return namaPura;
    }

    public void setNamaPura(String namaPura) {
        this.namaPura = namaPura;
    }

    public String getLokasiPura() {
        return lokasiPura;
    }

    public void setLokasiPura(String lokasiPura) {
        this.lokasiPura = lokasiPura;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }
}
