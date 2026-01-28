/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konektor;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Struk {
    
    public static void cetak(
            String idTransaksi,
            String namaKasir,
            String total,
            String diskon,
            String bayar,
            String kembali,
            DefaultTableModel model
    ) {

        StringBuilder sb = new StringBuilder();

        // ================= HEADER =================
        sb.append("===============================================\n");
        sb.append("              MINUS ELECTRIC                   \n");
        sb.append("        Elektronik • Aksesoris • Service        \n");
        sb.append("===============================================\n");

        String tgl = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new Date());
        sb.append("No Transaksi : ").append(idTransaksi).append("\n");
        sb.append("Tanggal      : ").append(tgl).append("\n");
        sb.append("Kasir        : ").append(namaKasir).append("\n");
        sb.append("-----------------------------------------------\n");

        // ================= ITEM =================
        sb.append("DAFTAR BELANJA:\n");

        int totalItem = model.getRowCount(); // jumlah jenis barang
        int totalQty = 0;                    // total qty semua barang

        for (int i = 0; i < totalItem; i++) {
            String namaBarang = model.getValueAt(i, 2).toString();
            String harga = model.getValueAt(i, 3).toString();
            int qty = Integer.parseInt(model.getValueAt(i, 4).toString());
            String subtotal = model.getValueAt(i, 5).toString();

            totalQty += qty;

            sb.append((i + 1)).append(". ").append(namaBarang).append("\n");
            sb.append("    ").append(qty)
             .append(" x ").append(harga)
             .append(" = Rp ").append(subtotal).append("\n");
        }

        sb.append("-----------------------------------------------\n");

        // ================= RINGKASAN =================
        sb.append("TOTAL ITEM   : ").append(totalItem).append(" item\n");
        sb.append("TOTAL QTY    : ").append(totalQty).append(" pcs\n");
        sb.append("-----------------------------------------------\n");

        // ================= TOTAL =================
        sb.append("TOTAL        : Rp ").append(total).append("\n");
        sb.append("DISKON       : Rp ").append(diskon).append("\n");
        sb.append("ANDA HEMAT   : Rp ").append(diskon).append("\n");
        sb.append("BAYAR        : Rp ").append(bayar).append("\n");
        sb.append("KEMBALIAN    : Rp ").append(kembali).append("\n");

        sb.append("===============================================\n");
        sb.append("         TERIMA KASIH TELAH BERBELANJA          \n");
        sb.append("===============================================\n");

        // ================= POPUP =================
        JTextArea area = new JTextArea(sb.toString());
        area.setEditable(false);
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));

        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new Dimension(420, 540));

        JOptionPane.showMessageDialog(
                null,
                scroll,
                "Struk Pembayaran - Minus Electric",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    
}
