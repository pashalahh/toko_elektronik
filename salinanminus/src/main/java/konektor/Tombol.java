/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konektor;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class Tombol extends JButton{
    private Color color1 = new Color(102, 153, 255); // biru muda
    private Color color2 = new Color(153, 102, 255); // ungu muda

    public Tombol(String text) {
        super(text);
        setContentAreaFilled(false);
        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", Font.BOLD, 18));
        setFocusPainted(false);
        setBorderPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        GradientPaint gp = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

        super.paintComponent(g);
        g2.dispose();
    }
    
    public void setGradient(Color c1, Color c2) {
        this.color1 = c1;
        this.color2 = c2;
        repaint();
    }
}
    
