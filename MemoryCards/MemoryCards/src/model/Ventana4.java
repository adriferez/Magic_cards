package model;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import model.Panel2;

public class Ventana4
extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                try {
                    Ventana4 frame = new Ventana4();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Ventana4() {
        this.setDefaultCloseOperation(1);
        this.setBounds(100, 100, 900, 620);
        this.setResizable(false);
        this.setExtendedState(6);
        this.contentPane = new Panel2();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setTitle("Nivel Avanzado");
        this.setContentPane(this.contentPane);
    }

}