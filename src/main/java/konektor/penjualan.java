/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konektor;

/**
 *
 * @author LENOVO
 */
public class penjualan {

    private int id_penjualan;
    private String tanggal;
    private String kasir;
    private double total;

    public int getIdPenjualan() {
        return id_penjualan;
    }

    public void setIdPenjualan(int id_penjualan) {
        this.id_penjualan = id_penjualan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKasir() {
        return kasir;
    }

    public void setKasir(String kasir) {
        this.kasir = kasir;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
