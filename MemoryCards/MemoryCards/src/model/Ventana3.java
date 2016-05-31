package model;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import model.Panel2;

public class Ventana3
extends JFrame {
    private JPanel contentPane;
    JLabel imageLabel = new JLabel();
    JLabel imageLabel2 = new JLabel();
    JLabel imageLabel3 = new JLabel();
    JLabel imageLabel4 = new JLabel();
    JLabel imageLabel5 = new JLabel();
    JLabel imageLabel6 = new JLabel();
    JLabel imageLabel7 = new JLabel();
    JLabel imageLabel8 = new JLabel();
    JLabel imageLabel9 = new JLabel();
    JLabel imageLabel10 = new JLabel();
    JLabel imageLabel11 = new JLabel();
    JLabel imageLabel12 = new JLabel();
    JLabel imageLabel13 = new JLabel();
    JLabel imageLabel14 = new JLabel();
    JLabel imageLabel15 = new JLabel();
    JLabel imageLabel16 = new JLabel();
    JLabel imageLabel17 = new JLabel();
    JLabel imageLabel18 = new JLabel();
    JLabel imageLabel19 = new JLabel();
    JLabel imageLabel20 = new JLabel();
    JLabel imageLabel21 = new JLabel();
    JLabel imageLabel22 = new JLabel();
    JLabel imageLabel23 = new JLabel();
    JLabel imageLabel24 = new JLabel();
    


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                try {
                    Ventana3 frame = new Ventana3();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Ventana3() {
        this.setDefaultCloseOperation(1);
        this.setBounds(0, 0, 900, 620);
        this.setResizable(false);
        this.setExtendedState(6);
        this.contentPane = new Panel2();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setTitle("Nivel Intermedio");
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        ImageIcon i1 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel.setIcon(i1);
        this.imageLabel.setBounds(20, 5, 173, 240);
        this.contentPane.add(this.imageLabel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i2 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel2.setIcon(i2);
        this.imageLabel2.setBounds(190, 5, 173, 240);
        this.contentPane.add(this.imageLabel2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i3 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel3.setIcon(i3);
        this.imageLabel3.setBounds(360, 5, 173, 240);
        this.contentPane.add(this.imageLabel3);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i4 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel4.setIcon(i4);
        this.imageLabel4.setBounds(530, 5, 173, 240);
        this.contentPane.add(this.imageLabel4);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i5 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel5.setIcon(i5);
        this.imageLabel5.setBounds(700, 5, 173, 240);
        this.contentPane.add(this.imageLabel5);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i6 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel6.setIcon(i6);
        this.imageLabel6.setBounds(870, 5, 173, 240);
        this.contentPane.add(this.imageLabel6);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i7 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel7.setIcon(i7);
        this.imageLabel7.setBounds(1040, 5, 173, 240);
        this.contentPane.add(this.imageLabel7);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i8 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel8.setIcon(i8);
        this.imageLabel8.setBounds(1210, 5, 173, 240);
        this.contentPane.add(this.imageLabel8);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i9 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel9.setIcon(i9);
        this.imageLabel9.setBounds(20, 235, 173, 240);
        this.contentPane.add(this.imageLabel9);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i10 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel10.setIcon(i10);
        this.imageLabel10.setBounds(190, 235, 173, 240);
        this.contentPane.add(this.imageLabel10);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i11 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel11.setIcon(i11);
        this.imageLabel11.setBounds(360, 235, 173, 240);
        this.contentPane.add(this.imageLabel11);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i12 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel12.setIcon(i12);
        this.imageLabel12.setBounds(530, 235, 173, 240);
        this.contentPane.add(this.imageLabel12);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i13 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel13.setIcon(i13);
        this.imageLabel13.setBounds(700, 235, 173, 240);
        this.contentPane.add(this.imageLabel13);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i14 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel14.setIcon(i14);
        this.imageLabel14.setBounds(870, 235, 173, 240);
        this.contentPane.add(this.imageLabel14);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i15 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel15.setIcon(i15);
        this.imageLabel15.setBounds(1040, 235, 173, 240);
        this.contentPane.add(this.imageLabel15);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i16 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel16.setIcon(i16);
        this.imageLabel16.setBounds(1210, 235, 173, 240);
        this.contentPane.add(this.imageLabel16);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i17 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel17.setIcon(i17);
        this.imageLabel17.setBounds(20, 470, 173, 240);
        this.contentPane.add(this.imageLabel17);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i18 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel18.setIcon(i18);
        this.imageLabel18.setBounds(190, 470, 173, 240);
        this.contentPane.add(this.imageLabel18);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i19 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel19.setIcon(i19);
        this.imageLabel19.setBounds(360, 470, 173, 240);
        this.contentPane.add(this.imageLabel19);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i20 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel20.setIcon(i20);
        this.imageLabel20.setBounds(530, 470, 173, 240);
        this.contentPane.add(this.imageLabel20);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i21 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel21.setIcon(i21);
        this.imageLabel21.setBounds(700, 470, 173, 240);
        this.contentPane.add(this.imageLabel21);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i22 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel22.setIcon(i22);
        this.imageLabel22.setBounds(870, 470, 173, 240);
        this.contentPane.add(this.imageLabel22);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i23 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel23.setIcon(i23);
        this.imageLabel23.setBounds(1040, 470, 173, 240);
        this.contentPane.add(this.imageLabel23);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i24 = new ImageIcon(this.getClass().getResource("/imagenesInter/reverso2.png"));
        this.imageLabel24.setIcon(i24);
        this.imageLabel24.setBounds(1210, 470, 173, 240);
        this.contentPane.add(this.imageLabel24);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.imageLabel.addMouseListener(new MouseAdapter(){
         double nAleatorio = (Math.random() * 48) + 1;
         int nAleatorioEntero = (int) nAleatorio;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i11 = new ImageIcon(this.getClass().getResource("/imagenesInter/" + nAleatorioEntero + ".png"));
                Ventana3.this.imageLabel.setIcon(i11);
            }
        });
        this.imageLabel2.addMouseListener(new MouseAdapter(){
            double nAleatorio = (Math.random() * 48) + 1;
            int nAleatorioEntero = (int) nAleatorio;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i12 = new ImageIcon(this.getClass().getResource("/imagenesInter/" + nAleatorioEntero + ".png"));
                Ventana3.this.imageLabel2.setIcon(i12);
            }
        });
        this.imageLabel3.addMouseListener(new MouseAdapter(){
            double nAleatorio = (Math.random() * 48) + 1;
            int nAleatorioEntero = (int) nAleatorio;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i13 = new ImageIcon(this.getClass().getResource("/imagenesInter/" + nAleatorioEntero + ".png"));
                Ventana3.this.imageLabel3.setIcon(i13);
            }
        });
        this.imageLabel4.addMouseListener(new MouseAdapter(){
            double nAleatorio = (Math.random() * 48) + 1;
            int nAleatorioEntero = (int) nAleatorio;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i14 = new ImageIcon(this.getClass().getResource("/imagenesInter/" + nAleatorioEntero + ".png"));
                Ventana3.this.imageLabel4.setIcon(i14);
            }
        });
        this.imageLabel5.addMouseListener(new MouseAdapter(){
            double nAleatorio = (Math.random() * 48) + 1;
            int nAleatorioEntero = (int) nAleatorio;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i15 = new ImageIcon(this.getClass().getResource("/imagenesInter/" + nAleatorioEntero + ".png"));
                Ventana3.this.imageLabel5.setIcon(i15);
            }
        });
        this.imageLabel6.addMouseListener(new MouseAdapter(){
            double nAleatorio = (Math.random() * 48) + 1;
            int nAleatorioEntero = (int) nAleatorio;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i16 = new ImageIcon(this.getClass().getResource("/imagenesInter/" + nAleatorioEntero + ".png"));
                Ventana3.this.imageLabel6.setIcon(i16);
            }
        });
        this.imageLabel7.addMouseListener(new MouseAdapter(){
            double nAleatorio = (Math.random() * 48) + 1;
            int nAleatorioEntero = (int) nAleatorio;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i17 = new ImageIcon(this.getClass().getResource("/imagenesInter/" + nAleatorioEntero + ".png"));
                Ventana3.this.imageLabel7.setIcon(i17);
            }
        });
        this.imageLabel8.addMouseListener(new MouseAdapter(){
            double nAleatorio = (Math.random() * 48) + 1;
            int nAleatorioEntero = (int) nAleatorio;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i18 = new ImageIcon(this.getClass().getResource("/imagenesInter/" + nAleatorioEntero + ".png"));
                Ventana3.this.imageLabel8.setIcon(i18);
            }
        });
        this.imageLabel9.addMouseListener(new MouseAdapter(){
            double nAleatorio = (Math.random() * 48) + 1;
            int nAleatorioEntero = (int) nAleatorio;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i19 = new ImageIcon(this.getClass().getResource("/imagenesInter/" + nAleatorioEntero + ".png"));
                Ventana3.this.imageLabel9.setIcon(i19);
            }
        });
        this.imageLabel10.addMouseListener(new MouseAdapter(){
            double nAleatorio = (Math.random() * 48) + 1;
            int nAleatorioEntero = (int) nAleatorio;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i20 = new ImageIcon(this.getClass().getResource("/imagenesInter/" + nAleatorioEntero + ".png"));
                Ventana3.this.imageLabel10.setIcon(i20);
            }
        });
    }

}
