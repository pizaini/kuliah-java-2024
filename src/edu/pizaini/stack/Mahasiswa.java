package edu.pizaini.stack;

public class Mahasiswa {
    private String nama;
    private String alamat;
    private String noTelp;
    private Integer umur;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String alamat, String noTelp, Integer umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", noTelp='" + noTelp + '\'' +
                ", umur=" + umur +
                '}';
    }
}
