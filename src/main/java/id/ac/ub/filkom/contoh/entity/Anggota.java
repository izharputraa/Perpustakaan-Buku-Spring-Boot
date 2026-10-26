package id.ac.ub.filkom.contoh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "anggota")
public class Anggota {
    @Id
    private String idAnggota;
    private String nama;
    private String telepon;

    public Anggota() {}

    public Anggota(String idAnggota, String nama, String telepon) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.telepon = telepon;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}