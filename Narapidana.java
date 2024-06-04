package model;

import java.util.Date;

public class Narapidana {
    private String namaLengkap;
    private String namaSamaran;
    private int umur;
    private int sisaMasaTahanan;
    private String pelanggaran;
    private Date tanggalMulai;
    private Date tanggalKeluar;

    public Narapidana(String namaLengkap, String namaSamaran, int umur, int sisaMasaTahanan, String pelanggaran, Date tanggalMulai, Date tanggalKeluar) {
        this.namaLengkap = namaLengkap;
        this.namaSamaran = namaSamaran;
        this.umur = umur;
        this.sisaMasaTahanan = sisaMasaTahanan;
        this.pelanggaran = pelanggaran;
        this.tanggalMulai = tanggalMulai;
        this.tanggalKeluar = tanggalKeluar;
    }

    // Getters and Setters
    public String getNamaLengkap() { return namaLengkap; }
    public void setNamaLengkap(String namaLengkap) { this.namaLengkap = namaLengkap; }

    public String getNamaSamaran() { return namaSamaran; }
    public void setNamaSamaran(String namaSamaran) { this.namaSamaran = namaSamaran; }

    public int getUmur() { return umur; }
    public void setUmur(int umur) { this.umur = umur; }

    public int getSisaMasaTahanan() { return sisaMasaTahanan; }
    public void setSisaMasaTahanan(int sisaMasaTahanan) { this.sisaMasaTahanan = sisaMasaTahanan; }

    public String getPelanggaran() { return pelanggaran; }
    public void setPelanggaran(String pelanggaran) { this.pelanggaran = pelanggaran; }

    public Date getTanggalMulai() { return tanggalMulai; }
    public void setTanggalMulai(Date tanggalMulai) { this.tanggalMulai = tanggalMulai; }

    public Date getTanggalKeluar() { return tanggalKeluar; }
    public void setTanggalKeluar(Date tanggalKeluar) { this.tanggalKeluar = tanggalKeluar; }

    public boolean isAdult() {
        // Assuming adulthood is defined as being 18 years or older
        return umur >= 18;
    }

    public boolean isMale() {
        // Assuming gender is determined by checking if the name contains common male names
        String[] maleNames = {"John", "Michael", "William", "David", "James", "Robert", "Joseph"};
        for (String name : maleNames) {
            if (namaLengkap.toLowerCase().contains(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    boolean isDewasa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean isLakiLaki() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
