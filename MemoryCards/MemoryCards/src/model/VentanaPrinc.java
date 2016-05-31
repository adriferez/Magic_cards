package model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import model.Panel;
import model.Ventana2;
import model.Ventana3;
import model.Ventana4;

public class VentanaPrinc
extends JFrame {
    private JPanel contentPane = null;
    JButton boton1;
    JButton boton2;

    JLabel imageLabel = new JLabel();
    JLabel imageLabel2 = new JLabel();


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                try {
                    VentanaPrinc frame = new VentanaPrinc();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
       
    }

    public VentanaPrinc() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 900, 506);
        this.setResizable(false);
        this.contentPane = new Panel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setTitle("Memory Cards");
        this.setContentPane(this.contentPane);
   
        this.boton1 = new JButton("Intentos");
        this.boton1.setBounds(400, 150, 150, 60);
        this.contentPane.add(this.boton1);
        this.boton2 = new JButton("Contrarreloj");
        this.boton2.setBounds(400, 230, 150, 60);
        this.contentPane.add(this.boton2);
        this.contentPane.setLayout(null);
        JLabel Texto1 = new JLabel("Memory");
        Texto1.setBounds(255, 30, 454, 45);
        Texto1.setFont(new Font("Tahoma", 1, 36));
        Texto1.setForeground(Color.WHITE);
        this.contentPane.add(Texto1);
        JLabel Texto3 = new JLabel("Cards");
        Texto3.setBounds(417, 30, 454, 45);
        Texto3.setFont(new Font("Tahoma", 1, 36));
        Texto3.setForeground(Color.BLACK);
        this.contentPane.add(Texto3);
        JLabel Texto4 = new JLabel("Game");
        Texto4.setBounds(530, 30, 454, 45);
        Texto4.setFont(new Font("Tahoma", 1, 36));
        Texto4.setForeground(Color.WHITE);
        this.contentPane.add(Texto4);
        JLabel Texto2 = new JLabel("Pon a prueba tu memoria!!");
        Texto2.setBounds(310, 360, 454, 45);
        Texto2.setFont(new Font("Serif", 2, 22));
        Texto2.setForeground(Color.YELLOW);
        this.contentPane.add(Texto2);
        JLabel Texto5 = new JLabel("Elige el MODO DE JUEGO:");
        Texto5.setBounds(350, 90, 454, 45);
        Texto5.setFont(new Font("Arial", 2, 19));
        Texto5.setForeground(Color.WHITE);
        this.contentPane.add(Texto5);
        ImageIcon ii = new ImageIcon(this.getClass().getResource("/imagenesBasic/cartasinicio2.gif"));
        this.imageLabel.setIcon(ii);
        this.imageLabel.setBounds(150, 100, 149, 245);
        this.contentPane.add(this.imageLabel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon ii2 = new ImageIcon(this.getClass().getResource("/imagenesBasic/cartasinicio2.gif"));
        this.imageLabel2.setIcon(ii2);
        this.imageLabel2.setBounds(620, 100, 149, 245);
        this.contentPane.add(this.imageLabel2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.boton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana v2 = new Ventana();
                setVisible(false);
                v2.setVisible(true);
            }
        });
        this.boton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaContra v3 = new VentanaContra();
                setVisible(false);
                v3.setVisible(true);
            }
        });

    }

}