/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konektor;

/**
 *
 * @author LENOVO
 */
public class detail_penjualan {
    private int id_detail;
    private int id_penjualan;
    private int id_produk;
    private String nama_produk;
    private double harga;
    private int qty;
    private double subtotal;

    public int getIddetail() {
        return id_detail;
    }

    public void setIddetail(int id_detail) {
        this.id_detail = id_detail;
    }

    public int getIdpenjualan() {
        return id_penjualan;
    }

    public void setIdpenjualan(int id_penjualan) {
        this.id_penjualan = id_penjualan;
    }

    public int getIdproduk() {
        return id_produk;
    }

    public void setIdproduk(int id_produk) {
        this.id_produk = id_produk;
    }

    public String getNamaproduk() {
        return nama_produk;
    }

    public void setNamaproduk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

}
