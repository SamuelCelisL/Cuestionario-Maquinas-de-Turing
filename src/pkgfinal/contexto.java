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

/**
 *
 * @author Acer
 */
public class contexto extends JFrame {
    
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
  
    public contexto() {
        variables llamar = new variables();
        setResizable(false);
        setSize(1000, 700);
        setTitle("Maquinas de Turing");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Utiliza el panel personalizado DegradadoPanel
        DegradadoPanel panel = new DegradadoPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        //Creacion de las etiqetas
        JLabel etiqueta1 = new JLabel();
        JLabel etiqueta2 = new JLabel();
        
        //creacion de botones
        JButton Iniciar = new JButton("Iniciar :)");
        JButton English = new JButton();
        JButton espanol = new JButton();
        
        
        if(variables.idioma == 0){
            etiqueta1.setText(llamar.titulo_cont);
            etiqueta2.setText(llamar.Contexto_cont);
            Iniciar.setText(llamar.botonCont_cont);
            English.setText(llamar.ingles);
            espanol.setText(llamar.espanol);

        } else {
            etiqueta1.setText(llamar.titulo_contENG);
            etiqueta2.setText(llamar.contexto_contENG);
            Iniciar.setText(llamar.botonCont_contENG);
            English.setText(llamar.inglesENG);
            espanol.setText(llamar.espanolENG);          
        }
                
        //configuracion etiqueta1
       
        etiqueta1.setFont(new Font("Arial",Font.ITALIC | Font.BOLD, 40));
        etiqueta1.setBounds(320, 80, 400,50);
        //etiqueta1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));//Agregar borde
        etiqueta1.setOpaque(false);
        etiqueta1.setBackground(Color.BLUE);
        
        
        //configuracion etiqueta2
        etiqueta2.setFont(new Font("Arial",Font.ITALIC,30));
        etiqueta2.setBounds(100, 150, 800, 400);
        etiqueta2.setPreferredSize(new Dimension(800, 400));
        etiqueta2.setOpaque(false);
        etiqueta2.setBackground(Color.BLUE);

        ImageIcon Imagen2 = new ImageIcon("logoup_63_png.png");//llamado de imagen
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(880,20,100,100);
        etiqueta4.setIcon(new ImageIcon(Imagen2.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
        
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(etiqueta4);

        
        //Accionee para el boton Iniciar 
        
        MouseListener Eve = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                menu next = new menu();
                setVisible(false);
                next.setVisible(true);
                etiqueta1.setText(llamar.titulo_ini);
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
        
        //Accion para el boton de ingles
         MouseListener EveENG;
        EveENG = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                etiqueta1.setText(llamar.titulo_contENG);
                etiqueta2.setText(llamar.contexto_contENG);
                Iniciar.setText(llamar.botonCont_contENG);
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
        //Accion para el boton de español
        MouseListener Eveesp = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
 
            }

            @Override
            public void mousePressed(MouseEvent e) {
                etiqueta1.setText(llamar.titulo_cont);
                etiqueta2.setText(llamar.Contexto_cont);
                Iniciar.setText(llamar.botonCont_cont);
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
        
        //Botones de Movimiento de interfaz
        
       
        Iniciar.setBounds(200, 600 , 100, 30);
        Iniciar.addMouseListener(Eve);
        
        
        English.setBounds(850, 600, 100, 30);
        English.addMouseListener(EveENG);
        
        //Boton español
        espanol.setBounds(730, 600, 100, 30);
        espanol.addMouseListener(Eveesp);
        //Arreglar el boton de salir
        
        panel.add(Iniciar);
        panel.add(English);
        panel.add(espanol);

        ImageIcon Imagen4 = new ImageIcon("ondas.png");//llamado de imagen
        JLabel etiquetaI4 = new JLabel();
        etiquetaI4.setBounds(0,-5,1000,700);
        etiquetaI4.setIcon(new ImageIcon(Imagen4.getImage().getScaledInstance(1000,700,Image.SCALE_SMOOTH)));
        panel.add(etiquetaI4);
        
    }
    
}
