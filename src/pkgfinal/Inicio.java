/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgfinal;

import java.awt.Color;
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
import javax.swing.JPanel;
import javax.swing.JLabel;



/**
 *
 * @author Acer
 */
public class Inicio extends JFrame{
    // Clase para tu panel personalizado
    class DegradadoPanel extends JPanel {
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Convierte el contexto gráfico a Graphics2D
            Graphics2D g2d = (Graphics2D) g;
            // Definir colores para el degradado
            Color color1 = new Color(33, 97, 140); // Color inicial (naranja)
            Color color2 = new Color(88, 214, 141);   // Color final (azul)
            // Crear un degradado lineal de arriba a abajo
            GradientPaint gradient = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
            // Establecer el degradado en el contexto gráfico
            g2d.setPaint(gradient);

            // Rellenar el fondo del panel con el degradado
            g2d.fillRect(0, 0, getWidth(), getHeight());
        }
    }

    public Inicio() {
        // ...

        // Crea un objeto DegradadoPanel en lugar de JPanel
        DegradadoPanel panel = new DegradadoPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);
        variables llamar = new variables();
        setResizable(false);
        setSize(1000,700);
        setTitle("Maquinas de Turing");
        //setBounds(600, 300, 500, 400);//primer dos tamaño y tercer y cuarto lugar de la ventana
        setLocationRelativeTo(null);//para ubicar la ventana em cualquier lugar de la pantalla
        
        //this.getContentPane().setBackground(Color.green);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        //JPanel panel = new JPanel();// creacion del panel
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);//color panel0
        
        //Creacion de la etiquetas
        JLabel etiqueta1 = new JLabel();
        JLabel etiqueta2 = new JLabel();
        JLabel etiqueta5 = new JLabel();
        
        //Creacion de los botones
        JButton Iniciar = new JButton();
        JButton Salir = new JButton();
        JButton English = new JButton();
        JButton espanol = new JButton();
        
        
        if(variables.idioma == 0){
            etiqueta1.setText(llamar.titulo_ini);
            etiqueta2.setText(llamar.inte_ini);
            etiqueta5.setText(llamar.doce_ini);
            Iniciar.setText(llamar.botonCont_cont);
            Salir.setText(llamar.botonFin_ini);
            English.setText(llamar.ingles);
            espanol.setText(llamar.espanol);
        } else {
            etiqueta1.setText(llamar.titulo_iniEng);
            etiqueta2.setText(llamar.inte_iniENG);
            etiqueta5.setText(llamar.doce_iniENG);
            Iniciar.setText(llamar.botonCont_contENG);
            Salir.setText(llamar.botonFin_iniENG);
            English.setText(llamar.inglesENG);
            espanol.setText(llamar.espanolENG);            
        }
        
        //Configuracion de la etiqueta1
        etiqueta1.setFont(new Font("Arial",Font.ITALIC | Font.BOLD, 40));
        etiqueta1.setBounds(100, 50, 680,50);
        //etiqueta1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));//Agregar borde
        etiqueta1.setOpaque(false);
        etiqueta1.setBackground(Color.BLUE);
        
        //Configuracion de la etiqueta2
        etiqueta2.setFont(new Font("Arial",Font.BOLD | Font.ITALIC,30));
        etiqueta2.setBounds(100, 150, 250, 100);
        etiqueta2.setOpaque(false);
        etiqueta2.setBackground(Color.BLUE);
        
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("→ Samuel Andres Celis Lizcano");
        etiqueta3.setBounds(120, 200, 500, 100);
        etiqueta3.setFont(new Font("Arial",Font.ITALIC,20));
        etiqueta3.setOpaque(false);
        etiqueta3.setBackground(Color.LIGHT_GRAY);
        
        JLabel etiqueta7 = new JLabel();
        //etiqueta2.setText("Integrantes: \n → Samuel Andres Celis Lizcano \n → Juan Pablo Marquez Sanchez \n → Yorman Rodolfo Rodriguez Jaimes \n DOCENTE: \n ........");
        etiqueta7.setText("→ Juan Pablo Marquez Sanchez");
        etiqueta7.setBounds(120, 250, 500, 100);
        etiqueta7.setFont(new Font("Arial",Font.ITALIC,20));
        etiqueta7.setOpaque(false);
        etiqueta7.setBackground(Color.GRAY);
        
        JLabel etiqueta8 = new JLabel();
        //etiqueta2.setText("Integrantes: \n → Samuel Andres Celis Lizcano \n → Juan Pablo Marquez Sanchez \n → Yorman Rodolfo Rodriguez Jaimes \n DOCENTE: \n ........");
        etiqueta8.setText("→ Yorman Rodolfo Rodriguez Jaimes");
        etiqueta8.setBounds(120, 300, 500, 100);
        etiqueta8.setFont(new Font("Arial",Font.ITALIC,20));
        etiqueta8.setOpaque(false);
        etiqueta8.setBackground(Color.LIGHT_GRAY);
        
        
        //Configuracion de la etiqueta 5
        etiqueta5.setFont(new Font("Arial",Font.ITALIC | Font.BOLD,30));
        etiqueta5.setBounds(100, 400, 250, 100);
        etiqueta5.setOpaque(false);
        etiqueta5.setBackground(Color.BLUE);
        
        JLabel etiqueta6 = new JLabel();
        etiqueta6.setFont(new Font("Arial",Font.ITALIC,20));
        etiqueta6.setText("→ Eduardo Rueda Fajardo");
        etiqueta6.setBounds(120, 450, 500, 100);
        etiqueta6.setOpaque(false);
        etiqueta6.setBackground(Color.RED);
        
        ImageIcon Imagen2 = new ImageIcon("logoup_63_png.png");//llamado de imagen
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(780,20,200,200);
        etiqueta4.setIcon(new ImageIcon(Imagen2.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
        
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(etiqueta3);
        panel.add(etiqueta4);
        panel.add(etiqueta5);
        panel.add(etiqueta6);
        panel.add(etiqueta7);
        panel.add(etiqueta8);
        
        
        //Accionee para el boton Iniciar 
        
        MouseListener Eve = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                contexto next = new contexto();
                setVisible(false);
                next.setVisible(true);
                
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
        
        //Accionee para el boton Salir 
        
        MouseListener Eve2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
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
        
        MouseListener EveENG;
        EveENG = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                etiqueta1.setText(llamar.titulo_iniEng);
                etiqueta2.setText(llamar.inte_iniENG);
                etiqueta5.setText(llamar.doce_iniENG);
                Iniciar.setText(llamar.botonCont_contENG);
                Salir.setText(llamar.botonFin_iniENG);
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
                etiqueta1.setText(llamar.titulo_ini);
                etiqueta2.setText(llamar.inte_ini);
                etiqueta5.setText(llamar.doce_ini);
                Iniciar.setText(llamar.botonCont_cont);
                Salir.setText(llamar.botonFin_ini);
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
        //Propuedades de los botones
        //Boton siguiente
        Iniciar.setBounds(200, 600 , 100, 30);
        Iniciar.addMouseListener(Eve);
        
        //Boton Salir
        Salir.setBounds(80, 600, 100, 30);
        Salir.addMouseListener(Eve2);
        
        //Boton de ingles
        English.setBounds(850, 600, 100, 30);
        English.addMouseListener(EveENG);
        
        //Boton español
        espanol.setBounds(730, 600, 100, 30);
        espanol.addMouseListener(Eveesp);
        
        panel.add(Iniciar);
        panel.add(Salir);
        panel.add(English);
        panel.add(espanol);
        
                
        ImageIcon Imagen4 = new ImageIcon("ondas.png");//llamado de imagen
        JLabel etiquetaI4 = new JLabel();
        etiquetaI4.setBounds(0,-5,1000,700);
        etiquetaI4.setIcon(new ImageIcon(Imagen4.getImage().getScaledInstance(1000,700,Image.SCALE_SMOOTH)));
        panel.add(etiquetaI4);
        
    }
    
}
