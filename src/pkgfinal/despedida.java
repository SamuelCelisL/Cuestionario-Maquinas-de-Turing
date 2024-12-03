/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author USUARIO
 */
public class despedida extends JFrame{
    
    public class DegradadoPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;
            Color color1 = new Color(33, 97, 140);
            Color color2 = new Color(88, 214, 141);
            GradientPaint gradient = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
            g2d.setPaint(gradient);
            g2d.fillRect(0, 0, getWidth(), getHeight());
        }
    }
    
    public despedida(){
        variables llamar = new variables();
        
        //Propiedades de la Ventana
        setResizable(false);
        setSize(1000,700);
        setTitle("Maquinas de Turing");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Propiedades del Panel
        DegradadoPanel panel = new DegradadoPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);
        
        JLabel gracias = new JLabel();
        JLabel creditos = new JLabel();
        JButton salir = new JButton();
        JButton English = new JButton();        
        JButton espanol = new JButton();
        
        if(variables.idioma == 0){
            gracias.setText(llamar.gracias);
            creditos.setText(llamar.creditos);
            salir.setText(llamar.botonFin_ini);
            English.setText(llamar.ingles);
            espanol.setText(llamar.espanol);
        } else {
            gracias.setText(llamar.gracias_ENG);
            creditos.setText(llamar.creditos_ENG);
            salir.setText(llamar.botonFin_iniENG);
            English.setText(llamar.inglesENG);
            espanol.setText(llamar.espanolENG);
        }
        
        gracias.setBounds(100, 50, 700,200);
        gracias.setPreferredSize(new Dimension(700, 200));
        gracias.setFont(new Font("Arial",Font.ROMAN_BASELINE | Font.BOLD, 60));
        gracias.setHorizontalAlignment((SwingConstants.LEFT));
        gracias.setOpaque(false);
        gracias.setBackground(Color.red);
        panel.add(gracias);
        
        creditos.setBounds(100, 250, 200,50);
        creditos.setFont(new Font("Arial",Font.BOLD, 20));
        creditos.setHorizontalAlignment((SwingConstants.LEFT));
        creditos.setOpaque(false);
        creditos.setBackground(Color.red);
        panel.add(creditos);
        
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("→ Samuel Andres Celis Lizcano");
        etiqueta3.setHorizontalAlignment((SwingConstants.LEFT));
        etiqueta3.setBounds(100, 270, 500, 100);
        etiqueta3.setFont(new Font("Arial",Font.ITALIC,20));
        etiqueta3.setOpaque(false);
        etiqueta3.setBackground(Color.LIGHT_GRAY);
        panel.add(etiqueta3);
        
        JLabel etiqueta7 = new JLabel();
        etiqueta7.setText("→ Juan Pablo Marquez Sanchez");
        etiqueta7.setHorizontalAlignment((SwingConstants.LEFT));
        etiqueta7.setBounds(100, 320, 500, 100);
        etiqueta7.setFont(new Font("Arial",Font.ITALIC,20));
        etiqueta7.setOpaque(false);
        etiqueta7.setBackground(Color.GRAY);
        panel.add(etiqueta7);
        
        JLabel etiqueta8 = new JLabel();
        etiqueta8.setText("→ Yorman Rodolfo Rodriguez Jaimes");
        etiqueta8.setHorizontalAlignment((SwingConstants.LEFT));
        etiqueta8.setBounds(100, 370, 500, 100);
        etiqueta8.setFont(new Font("Arial",Font.ITALIC,20));
        etiqueta8.setOpaque(false);
        etiqueta8.setBackground(Color.LIGHT_GRAY);
        panel.add(etiqueta8);
        
        MouseListener Eve = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
            
        };
        
        MouseListener EveENG;
        EveENG = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                gracias.setText(llamar.gracias_ENG);
                creditos.setText(llamar.creditos_ENG);
                salir.setText(llamar.botonFin_iniENG);
                English.setText(llamar.inglesENG);
                espanol.setText(llamar.espanolENG);
                llamar.idioma = 1;
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        
        MouseListener Eveesp = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
 
            }

            @Override
            public void mousePressed(MouseEvent e) {
                gracias.setText(llamar.gracias);
                creditos.setText(llamar.creditos);
                salir.setText(llamar.botonFin_ini);
                English.setText(llamar.ingles);
                espanol.setText(llamar.espanol);
                llamar.idioma = 0;
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        
        //Boton Siguiente
        salir.setBounds(80, 600, 100, 30);
        salir.addMouseListener(Eve);
        
        //Boton de ingles
        English.setBounds(850, 600, 100, 30);
        English.addMouseListener(EveENG);
        
        //Boton español
        espanol.setBounds(730, 600, 100, 30);
        espanol.addMouseListener(Eveesp);
        
        ImageIcon Imagen2 = new ImageIcon("logoup_63_png.png");//llamado de imagen
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(880,20,100,100);
        etiqueta4.setIcon(new ImageIcon(Imagen2.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
        panel.add(etiqueta4);
        
        ImageIcon Imagen3 = new ImageIcon("examen.png");//llamado de imagen
        JLabel etiquetaI3 = new JLabel();
        etiquetaI3.setBounds(620,260,200,200);
        etiquetaI3.setIcon(new ImageIcon(Imagen3.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)));
        panel.add(etiquetaI3);
        
        panel.add(salir);
        panel.add(English);
        panel.add(espanol);

        ImageIcon Imagen4 = new ImageIcon("ondas.png");//llamado de imagen
        JLabel etiquetaI4 = new JLabel();
        etiquetaI4.setBounds(0,-5,1000,700);
        etiquetaI4.setIcon(new ImageIcon(Imagen4.getImage().getScaledInstance(1000,700,Image.SCALE_SMOOTH)));
        panel.add(etiquetaI4);
    }
}
