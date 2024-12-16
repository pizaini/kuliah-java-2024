package edu.pizaini.task1;

import java.util.Date;

public class Task1Buku {
    private String judul;
    private String penerbit;
    private Date tangalTerbit;
    private Integer stokBarang;

    public Task1Buku() {
    }

    public Task1Buku(String judul, String penerbit, Date tangalTerbit, Integer stokBarang) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tangalTerbit = tangalTerbit;
        this.stokBarang = stokBarang;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Date getTangalTerbit() {
        return tangalTerbit;
    }

    public void setTangalTerbit(Date tangalTerbit) {
        this.tangalTerbit = tangalTerbit;
    }

    public Integer getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(Integer stokBarang) {
        this.stokBarang = stokBarang;
    }

    @Override
    public String toString() {
        return "Task1Buku{" +
                "judul='" + judul + '\'' +
                ", penerbit='" + penerbit + '\'' +
                ", tangalTerbit=" + tangalTerbit +
                ", stokBarang=" + stokBarang +
                '}';
    }
}
