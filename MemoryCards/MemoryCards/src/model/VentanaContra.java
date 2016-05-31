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

public class VentanaContra
extends JFrame {
    private JPanel contentPane = null;
    JButton boton_basico;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JLabel imageLabel = new JLabel();
    JLabel imageLabel2 = new JLabel();


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                try {
                    VentanaContra frame = new VentanaContra();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
       
    }

    public VentanaContra() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 900, 506);
        this.setResizable(false);
        this.contentPane = new Panel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setTitle("Memory Cards");
        this.setContentPane(this.contentPane);
   
        this.boton_basico = new JButton("Básico");
        this.boton_basico.setBounds(400, 150, 120, 30);
        this.contentPane.add(this.boton_basico);
        this.boton2 = new JButton("Intermedio");
        this.boton2.setBounds(400, 200, 120, 30);
        this.contentPane.add(this.boton2);
        this.boton3 = new JButton("Avanzado");
        this.boton3.setBounds(400, 250, 120, 30);
        this.contentPane.add(this.boton3);
        this.boton4 = new JButton("<html><p>Menú<br>Principal</p></html>");
        this.boton4.setBounds(730, 390, 90, 40);
        this.contentPane.add(this.boton4);
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
        JLabel Texto5 = new JLabel("Elige el NIVEL:");
        Texto5.setBounds(390, 90, 454, 45);
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
        this.boton_basico.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana2Contra v2c = new Ventana2Contra();
                 v2c.setVisible(true);
//                v2c.countDown(25, 1);
            }
        });
        this.boton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana3 v3c= new Ventana3();
                v3c.setVisible(true);
            }
        });
        this.boton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana4 v4 = new Ventana4();
                v4.setVisible(true);
            }
        });
        
        this.boton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaPrinc vp = new VentanaPrinc();
                setVisible(false);
                vp.setVisible(true);
                
            }
        });
    }

}