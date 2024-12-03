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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author USUARIO
 */
public class cuestionario2 extends JFrame{
    
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
    
    public cuestionario2(){
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
        
        JLabel tituloP1 = new JLabel();
        JLabel preguntaP1 = new JLabel();
        JRadioButton respuestaA = new JRadioButton();
        JRadioButton respuestaB = new JRadioButton();
        JRadioButton respuestaC = new JRadioButton();
        JButton siguiente = new JButton();
        JButton English = new JButton();        
        JButton espanol = new JButton();
        
        if(variables.idioma == 0){
            tituloP1.setText(llamar.pregunta2);
            preguntaP1.setText(llamar.pregunta2_pre);
            respuestaA.setText(llamar.pregunta2OpcA_pre);
            respuestaB.setText(llamar.pregunta2OpcB_pre);
            respuestaC.setText(llamar.pregunta2OpcC_pre);
            siguiente.setText(llamar.botonCont_cont);
            English.setText(llamar.ingles);
            espanol.setText(llamar.espanol);
        } else {
            tituloP1.setText(llamar.pregunta2_ENG);
            preguntaP1.setText(llamar.pregunta2_preENG);
            respuestaA.setText(llamar.pregunta2OpcA_preENG);
            respuestaB.setText(llamar.pregunta2OpcB_preENG);
            respuestaC.setText(llamar.pregunta2OpcC_preENG);
            siguiente.setText(llamar.botonCont_contENG);
            English.setText(llamar.inglesENG);
            espanol.setText(llamar.espanolENG);            
        }
        
        //Propiedades para el Titulo de la Pregunta
        tituloP1.setFont(new Font("Arial",Font.ITALIC | Font.BOLD, 40));
        tituloP1.setBounds(380, 50, 240,50);
        tituloP1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        tituloP1.setOpaque(false);
        tituloP1.setBackground(Color.red);
        panel.add(tituloP1);
        
        //Propiedades para el enunciado de la Pregunta
        preguntaP1.setBounds(100, 150, 800, 100);
        preguntaP1.setPreferredSize(new Dimension(800, 100));
        preguntaP1.setFont(new Font("Arial", Font.PLAIN, 25));
        preguntaP1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        preguntaP1.setOpaque(false);
        preguntaP1.setBackground(Color.red);
        panel.add(preguntaP1);
        
        respuestaA.setBounds(150, 260, 700, 50);
        respuestaA.setFont(new Font("Arial", Font.PLAIN, 20));
        respuestaA.setOpaque(false);
        
        respuestaB.setBounds(150, 310, 700, 50);
        respuestaB.setFont(new Font("Arial", Font.PLAIN, 20));
        respuestaB.setOpaque(false);
        
        respuestaC.setBounds(150, 360, 700, 50);
        respuestaC.setFont(new Font("Arial", Font.PLAIN, 20));
        respuestaC.setOpaque(false);
        
        ButtonGroup respuestas = new ButtonGroup();
        respuestas.add(respuestaA);
        respuestas.add(respuestaB);
        respuestas.add(respuestaC);
        
        panel.add(respuestaA);
        panel.add(respuestaB);
        panel.add(respuestaC);
        
        MouseListener Eve = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                cuestionario3 next = new cuestionario3();
                if (respuestaA.isSelected()) {
                    setVisible(false);
                    next.setVisible(true);
                } else if (respuestaB.isSelected()) {
                    variables.nota++;
                    variables.respuestaC[1] = 1;
                    setVisible(false);
                    next.setVisible(true);
                } else if (respuestaC.isSelected()) {
                    setVisible(false);
                    next.setVisible(true);
                } else {
                    if (variables.idioma == 0){
                        JOptionPane.showMessageDialog(null, llamar.avisoText, llamar.aviso, 1);
                    }else{
                        JOptionPane.showMessageDialog(null, llamar.avisoText_ENG, llamar.aviso_ENG, 1);
                    }
                }
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
                tituloP1.setText(llamar.pregunta2_ENG);
                preguntaP1.setText(llamar.pregunta2_preENG);
                respuestaA.setText(llamar.pregunta2OpcA_preENG);
                respuestaB.setText(llamar.pregunta2OpcB_preENG);
                respuestaC.setText(llamar.pregunta2OpcC_preENG);
                siguiente.setText(llamar.botonCont_contENG);
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
                tituloP1.setText(llamar.pregunta2);
                preguntaP1.setText(llamar.pregunta2_pre);
                respuestaA.setText(llamar.pregunta2OpcA_pre);
                respuestaB.setText(llamar.pregunta2OpcB_pre);
                respuestaC.setText(llamar.pregunta2OpcC_pre);
                siguiente.setText(llamar.botonCont_cont);
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
        siguiente.setBounds(80, 600, 100, 30);
        siguiente.addMouseListener(Eve);
        
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
        
        panel.add(siguiente);
        panel.add(English);
        panel.add(espanol);
    
        ImageIcon Imagen4 = new ImageIcon("ondas.png");//llamado de imagen
        JLabel etiquetaI4 = new JLabel();
        etiquetaI4.setBounds(0,-5,1000,700);
        etiquetaI4.setIcon(new ImageIcon(Imagen4.getImage().getScaledInstance(1000,700,Image.SCALE_SMOOTH)));
        panel.add(etiquetaI4);
    }
    
    
    
    
    
}
