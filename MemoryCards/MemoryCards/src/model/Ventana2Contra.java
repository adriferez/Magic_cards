package model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import model.Panel2;

public class Ventana2Contra extends JFrame {
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
    static JLabel timer = new JLabel();
    Font fuenteTemp=new Font(timer.getFont().getName(),timer.getFont().getStyle(),30);
    
    static void countDown(int numero, int s) {
        
        while (numero > 0 -1 ) {
           
            timer.setText("");
            timer.setText(String.valueOf(numero));
          
            if(numero < 21 && numero > 10){
            	timer.setForeground(Color.yellow);
            }
            if(numero < 11){
            	timer.setForeground(Color.red);
            }
            if(numero == 0){
            JOptionPane.showMessageDialog(null,"¡Se acabó el tiempo!"); 
           
            }
            try {
                Thread.sleep(s*1000);
            } catch (Exception e) {}
            numero--;
        }  
  
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                try {
                    Ventana2Contra frame = new Ventana2Contra();
                    frame.setVisible(true);
                    
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        countDown(25, 1); 
    }

    public Ventana2Contra() {
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setBounds(0, 0, 900, 620);
        this.setResizable(false);
        this.setExtendedState(6);
        this.contentPane = new Panel2();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setTitle("Nivel B\u00e1sico");
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(this.getClass().getResource("/imagenesBasic/reverso2.png"));
        this.imageLabel.setIcon(i1);
        this.imageLabel.setBounds(100, 100, 173, 240);
        this.contentPane.add(this.imageLabel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i2 = new ImageIcon(this.getClass().getResource("/imagenesBasic/reverso2.png"));
        this.imageLabel2.setIcon(i2);
        this.imageLabel2.setBounds(350, 100, 173, 240);
        this.contentPane.add(this.imageLabel2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i3 = new ImageIcon(this.getClass().getResource("/imagenesBasic/reverso2.png"));
        this.imageLabel3.setIcon(i3);
        this.imageLabel3.setBounds(600, 100, 173, 240);
        this.contentPane.add(this.imageLabel3);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i4 = new ImageIcon(this.getClass().getResource("/imagenesBasic/reverso2.png"));
        this.imageLabel4.setIcon(i4);
        this.imageLabel4.setBounds(850, 100, 173, 240);
        this.contentPane.add(this.imageLabel4);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i5 = new ImageIcon(this.getClass().getResource("/imagenesBasic/reverso2.png"));
        this.imageLabel5.setIcon(i5);
        this.imageLabel5.setBounds(1100, 100, 173, 240);
        this.contentPane.add(this.imageLabel5);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i6 = new ImageIcon(this.getClass().getResource("/imagenesBasic/reverso2.png"));
        this.imageLabel6.setIcon(i6);
        this.imageLabel6.setBounds(100, 400, 173, 240);
        this.contentPane.add(this.imageLabel6);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i7 = new ImageIcon(this.getClass().getResource("/imagenesBasic/reverso2.png"));
        this.imageLabel7.setIcon(i7);
        this.imageLabel7.setBounds(350, 400, 173, 240);
        this.contentPane.add(this.imageLabel7);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i8 = new ImageIcon(this.getClass().getResource("/imagenesBasic/reverso2.png"));
        this.imageLabel8.setIcon(i8);
        this.imageLabel8.setBounds(600, 400, 173, 240);
        this.contentPane.add(this.imageLabel8);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i9 = new ImageIcon(this.getClass().getResource("/imagenesBasic/reverso2.png"));
        this.imageLabel9.setIcon(i9);
        this.imageLabel9.setBounds(850, 400, 173, 240);
        this.contentPane.add(this.imageLabel9);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon i10 = new ImageIcon(this.getClass().getResource("/imagenesBasic/reverso2.png"));
        this.imageLabel10.setIcon(i10);
        this.imageLabel10.setBounds(1100, 400, 173, 240);
        this.contentPane.add(this.imageLabel10);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.timer.setBounds(70, 10, 80, 80);
        this.timer.setForeground(Color.white);
        this.timer.setFont(fuenteTemp);
        this.contentPane.add(timer);
        
    //    this.setVisible(true);
        
        
        

        this.imageLabel.addMouseListener(new MouseAdapter(){
          	 double nAleatorio1 = (Math.random() * 48) + 1;
           	 int nAleatorioEntero1 = (int) nAleatorio1;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i11 = new ImageIcon(this.getClass().getResource("/imagenesBasic/" + nAleatorioEntero1 + ".png"));
                Ventana2Contra.this.imageLabel.setIcon(i11);
            }
        });
        this.imageLabel2.addMouseListener(new MouseAdapter(){
         	 double nAleatorio2 = (Math.random() * 48) + 1;
           	 int nAleatorioEntero2 = (int) nAleatorio2;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i12 = new ImageIcon(this.getClass().getResource("/imagenesBasic/" + nAleatorioEntero2 + ".png"));
                Ventana2Contra.this.imageLabel2.setIcon(i12);
            }
        });
        this.imageLabel3.addMouseListener(new MouseAdapter(){
         	 double nAleatorio3 = (Math.random() * 48) + 1;
           	 int nAleatorioEntero3 = (int) nAleatorio3;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i13 = new ImageIcon(this.getClass().getResource("/imagenesBasic/" + nAleatorioEntero3 + ".png"));
                Ventana2Contra.this.imageLabel3.setIcon(i13);
            }
        });
        this.imageLabel4.addMouseListener(new MouseAdapter(){
         	 double nAleatorio4 = (Math.random() * 48) + 1;
           	 int nAleatorioEntero4 = (int) nAleatorio4;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i14 = new ImageIcon(this.getClass().getResource("/imagenesBasic/" + nAleatorioEntero4 + ".png"));
                Ventana2Contra.this.imageLabel4.setIcon(i14);
            }
        });
        this.imageLabel5.addMouseListener(new MouseAdapter(){
         	 double nAleatorio5 = (Math.random() * 48) + 1;
           	 int nAleatorioEntero5 = (int) nAleatorio5;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i15 = new ImageIcon(this.getClass().getResource("/imagenesBasic/" + nAleatorioEntero5 + ".png"));
                Ventana2Contra.this.imageLabel5.setIcon(i15);
            }
        });
        this.imageLabel6.addMouseListener(new MouseAdapter(){
         	 double nAleatorio6 = (Math.random() * 48) + 1;
           	 int nAleatorioEntero6 = (int) nAleatorio6;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i16 = new ImageIcon(this.getClass().getResource("/imagenesBasic/" + nAleatorioEntero6 + ".png"));
                Ventana2Contra.this.imageLabel6.setIcon(i16);
            }
        });
        this.imageLabel7.addMouseListener(new MouseAdapter(){
         	 double nAleatorio7 = (Math.random() * 48) + 1;
           	 int nAleatorioEntero7 = (int) nAleatorio7;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i17 = new ImageIcon(this.getClass().getResource("/imagenesBasic/" + nAleatorioEntero7 + ".png"));
                Ventana2Contra.this.imageLabel7.setIcon(i17);
            }
        });
        this.imageLabel8.addMouseListener(new MouseAdapter(){
         	 double nAleatorio8 = (Math.random() * 48) + 1;
           	 int nAleatorioEntero8 = (int) nAleatorio8;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i18 = new ImageIcon(this.getClass().getResource("/imagenesBasic/" + nAleatorioEntero8 + ".png"));
                Ventana2Contra.this.imageLabel8.setIcon(i18);
            }
        });
        this.imageLabel9.addMouseListener(new MouseAdapter(){
         	 double nAleatorio9 = (Math.random() * 48) + 1;
           	 int nAleatorioEntero9 = (int) nAleatorio9;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i19 = new ImageIcon(this.getClass().getResource("/imagenesBasic/" + nAleatorioEntero9 + ".png"));
                Ventana2Contra.this.imageLabel9.setIcon(i19);
            }
        });
        this.imageLabel10.addMouseListener(new MouseAdapter(){
         	 double nAleatorio10 = (Math.random() * 48) + 1;
           	 int nAleatorioEntero10 = (int) nAleatorio10;

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon i20 = new ImageIcon(this.getClass().getResource("/imagenesBasic/" + nAleatorioEntero10 + ".png"));
                Ventana2Contra.this.imageLabel10.setIcon(i20);
            }
        });
    }

}
