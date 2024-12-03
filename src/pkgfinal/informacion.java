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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Acer
 */
public class informacion extends JFrame {
    
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
    
    public static int contador_tema = 1;
    
    public informacion(){
        
        variables llamar = new variables();
        setResizable(false);
        setSize(1000,700);
        setTitle("Maquinas de Turing");
        //setBounds(600, 300, 500, 400);//primer dos tamaño y tercer y cuarto lugar de la ventana
        setLocationRelativeTo(null);//para ubicar la ventana em cualquier lugar de la pantalla
        
        //this.getContentPane().setBackground(Color.green);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        DegradadoPanel panel2 = new DegradadoPanel();
        panel2.setLayout(null);
        this.getContentPane().add(panel2);
        
        //Creacion de etiquetas
        JLabel etiqueta1 = new JLabel();
        JLabel etiquetaconte = new JLabel();
        JLabel etiquetainfo = new JLabel();
        
        //creacion de botones
        JButton tema1 = new JButton();
        JButton tema2 = new JButton();
        JButton tema3 = new JButton();
        JButton tema4 = new JButton();
        JButton tema5 = new JButton();
        JButton tema6 = new JButton();
        JButton cuestionario = new JButton();
        JButton English = new JButton();
        JButton espanol = new JButton();
        JButton Salir = new JButton();
        JButton sigue = new JButton();
        JButton regre = new JButton();
        
        
        if(variables.idioma == 0){
            etiqueta1.setText(llamar.tituloAlan_inf);
            etiquetainfo.setText(llamar.textoAlan_inf);
            tema1.setText(llamar.tema1);
            tema2.setText(llamar.tema2);
            tema3.setText(llamar.tema3);
            tema4.setText(llamar.tema4);
            tema5.setText(llamar.tema5);
            tema6.setText(llamar.tema6);
            cuestionario.setText(llamar.examen_menu);
            Salir.setText(llamar.titulo_menu);
            English.setText(llamar.ingles);
            espanol.setText(llamar.espanol);
            sigue.setText(llamar.sigue);
            regre.setText(llamar.anterior);

        } else {
            etiqueta1.setText(llamar.tituloAlan_infENG);
            etiquetainfo.setText(llamar.textoAlan_infENG);
            tema1.setText(llamar.tema1ENG);
            tema2.setText(llamar.tema2ENG);
            tema3.setText(llamar.tema3ENG);
            tema4.setText(llamar.tema4ENG);
            tema5.setText(llamar.tema5ENG);
            tema6.setText(llamar.tema6ENG);
            cuestionario.setText(llamar.examen_menuENG);
            Salir.setText(llamar.titulo_menuENG);
            English.setText(llamar.inglesENG);
            espanol.setText(llamar.espanolENG);
            sigue.setText(llamar.sigueENG);
            regre.setText(llamar.anteriorENG);
        }
        
        //Configuracion de la etiqueta1
        etiqueta1.setFont(new Font("Arial",Font.ITALIC | Font.BOLD, 40));
        etiqueta1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        etiqueta1.setBounds(250, 50, 600,100);
        //etiqueta1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));//Agregar borde
        etiqueta1.setOpaque(false);
        etiqueta1.setBackground(Color.BLUE);
    
        //Configuracion de la etiquetainfo
        etiquetainfo.setFont(new Font("Arial",Font.PLAIN, 20));
        etiquetainfo.setBounds(300, 150, 500,300);
        etiquetainfo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        //etiquetainfo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));//Agregar borde
        etiquetainfo.setOpaque(false);
        etiquetainfo.setBackground(Color.BLUE);
        
         //Configuracion de la etiquetaconte
        etiquetaconte.setFont(new Font("Arial",Font.PLAIN, 20));
        etiquetaconte.setBounds(-5, -5, 200,900);
        etiquetaconte.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));//Agregar borde
        etiquetaconte.setOpaque(false);
        etiquetaconte.setBackground(Color.GREEN);
    
        ImageIcon Imagen2 = new ImageIcon("logoup_63_png.png");//llamado de imagen
        JLabel etiquetaI = new JLabel();
        etiquetaI.setBounds(880,20,100,100);
        etiquetaI.setIcon(new ImageIcon(Imagen2.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
       
        ImageIcon Imagen = new ImageIcon("bombilla.png");//llamado de imagen
        JLabel etiquetaI2 = new JLabel();
        etiquetaI2.setBounds(50,50,100,100);
        etiquetaI2.setIcon(new ImageIcon(Imagen.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        
        //Evento de los botones de los temas
        MouseListener evetema1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                contador_tema = 1;
                if(variables.idioma == 0){
                etiqueta1.setText(llamar.tituloAlan_inf);
                etiquetainfo.setText(llamar.textoAlan_inf);
            } else {
                etiqueta1.setText(llamar.tituloAlan_infENG);
                etiquetainfo.setText(llamar.textoAlan_infENG);       
                }            
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };
        
        MouseListener evetema2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                contador_tema = 2;
                if(variables.idioma == 0){
                etiqueta1.setText(llamar.tituloLenguajes_inf);
                etiquetainfo.setText(llamar.textoLenguajes_inf);
            } else {
                etiqueta1.setText(llamar.tituloLenguajes_infENG);
                etiquetainfo.setText(llamar.textoLenguajes_infENG);       
                }            
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };
        
        MouseListener evetema3 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                contador_tema = 3;
                if(variables.idioma == 0){
                etiqueta1.setText(llamar.tituloIntro_inf);
                etiquetainfo.setText(llamar.textoIntro_inf);
            } else {
                etiqueta1.setText(llamar.tituloIntro_infEng);
                etiquetainfo.setText(llamar.textoIntro_infEng);       
                }            
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };
        
        MouseListener evetema4 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                contador_tema = 4;
                if(variables.idioma == 0){
                etiqueta1.setText(llamar.tituloAceptados_inf);
                etiquetainfo.setText(llamar.textoAceptados_inf);
            } else {
                etiqueta1.setText(llamar.tituloAceptados_infENG);
                etiquetainfo.setText(llamar.textoAceptados_infENG);       
                }            
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        MouseListener evetema5 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                contador_tema = 5;
                if(variables.idioma == 0){
                etiqueta1.setText(llamar.tituloExtensiones_inf);
                etiquetainfo.setText(llamar.textoExtensiones_inf);
            } else {
                etiqueta1.setText(llamar.tituloExtensiones_infENG);
                etiquetainfo.setText(llamar.textoExtensiones_infENG);       
                }            
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        MouseListener evetema6 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                contador_tema = 6;
                if(variables.idioma == 0){
                etiqueta1.setText(llamar.tituloAlgoritmos_inf);
                etiquetainfo.setText(llamar.textoAlgoritmos_inf);
            } else {
                etiqueta1.setText(llamar.tituloAlgoritmos_infENG);
                etiquetainfo.setText(llamar.textoAlgoritmos_infENG);       
                }            
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };        

        MouseListener evesigue = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                if(contador_tema == 6){
                    cuestionario1 next = new cuestionario1();
                    setVisible(false);
                    next.setVisible(true); 
                }
                if(contador_tema == 5){
                     contador_tema = 6;
                    if(variables.idioma == 0){
                    etiqueta1.setText(llamar.tituloAlgoritmos_inf);
                    etiquetainfo.setText(llamar.textoAlgoritmos_inf);
                } else {
                    etiqueta1.setText(llamar.tituloAlgoritmos_infENG);
                    etiquetainfo.setText(llamar.textoAlgoritmos_infENG);       
                    } 
                    
                }
                if(contador_tema == 4){
                     contador_tema = 5;
                    if(variables.idioma == 0){
                    etiqueta1.setText(llamar.tituloExtensiones_inf);
                    etiquetainfo.setText(llamar.textoExtensiones_inf);
                } else {
                    etiqueta1.setText(llamar.tituloExtensiones_infENG);
                    etiquetainfo.setText(llamar.textoExtensiones_infENG);       
                    }                       
                }
                if(contador_tema == 3){
                    contador_tema = 4;
                    if(variables.idioma == 0){
                    etiqueta1.setText(llamar.tituloAceptados_inf);
                    etiquetainfo.setText(llamar.textoAceptados_inf);
                } else {
                    etiqueta1.setText(llamar.tituloAceptados_infENG);
                    etiquetainfo.setText(llamar.textoAceptados_infENG);       
                    }                       
                }
                if(contador_tema == 2){
                    contador_tema = 3;
                    if(variables.idioma == 0){
                    etiqueta1.setText(llamar.tituloIntro_inf);
                    etiquetainfo.setText(llamar.textoIntro_inf);
                } else {
                    etiqueta1.setText(llamar.tituloIntro_infEng);
                    etiquetainfo.setText(llamar.textoIntro_infEng);       
                    }
                }                
                if(contador_tema == 1){
                    contador_tema =2;
                    if(variables.idioma == 0){
                    etiqueta1.setText(llamar.tituloLenguajes_inf);
                    etiquetainfo.setText(llamar.textoLenguajes_inf);
                } else {
                    etiqueta1.setText(llamar.tituloLenguajes_infENG);
                    etiquetainfo.setText(llamar.textoLenguajes_infENG);       
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
 
        MouseListener eveante = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                if(contador_tema == 1){
                    menu next = new menu();
                    setVisible(false);
                    next.setVisible(true);
                }
                if(contador_tema == 2){
                    contador_tema = 1;
                    if(variables.idioma == 0){
                    etiqueta1.setText(llamar.tituloAlan_inf);
                    etiquetainfo.setText(llamar.textoAlan_inf);
                } else {
                    etiqueta1.setText(llamar.tituloAlan_infENG);
                    etiquetainfo.setText(llamar.textoAlan_infENG);       
                    }
                }
                if(contador_tema == 3){
                    contador_tema =2;
                    if(variables.idioma == 0){
                    etiqueta1.setText(llamar.tituloLenguajes_inf);
                    etiquetainfo.setText(llamar.textoLenguajes_inf);
                } else {
                    etiqueta1.setText(llamar.tituloLenguajes_infENG);
                    etiquetainfo.setText(llamar.textoLenguajes_infENG);       
                    }        
                }
                if(contador_tema == 4){
                    contador_tema = 3;
                    if(variables.idioma == 0){
                    etiqueta1.setText(llamar.tituloIntro_inf);
                    etiquetainfo.setText(llamar.textoIntro_inf);
                } else {
                    etiqueta1.setText(llamar.tituloIntro_infEng);
                    etiquetainfo.setText(llamar.textoIntro_infEng);       
                    }    
                }
                if(contador_tema == 5){
                    contador_tema = 4;
                    if(variables.idioma == 0){
                    etiqueta1.setText(llamar.tituloAceptados_inf);
                    etiquetainfo.setText(llamar.textoAceptados_inf);
                } else {
                    etiqueta1.setText(llamar.tituloAceptados_infENG);
                    etiquetainfo.setText(llamar.textoAceptados_infENG);       
                    }
                    
                }
                if(contador_tema == 6){
                     contador_tema = 5;
                    if(variables.idioma == 0){
                    etiqueta1.setText(llamar.tituloExtensiones_inf);
                    etiquetainfo.setText(llamar.textoExtensiones_inf);
                } else {
                    etiqueta1.setText(llamar.tituloExtensiones_infENG);
                    etiquetainfo.setText(llamar.textoExtensiones_infENG);       
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
        
        MouseListener EveExam = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                cuestionario1 next = new cuestionario1();
                setVisible(false);
                next.setVisible(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };
        
        MouseListener EveAnt = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                menu next = new menu();
                setVisible(false);
                next.setVisible(true);
                
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
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                if(contador_tema == 1){
                    etiqueta1.setText(llamar.tituloAlan_infENG);
                    etiquetainfo.setText(llamar.textoAlan_infENG);                
                }
                if(contador_tema == 2){
                    etiqueta1.setText(llamar.tituloLenguajes_infENG);
                    etiquetainfo.setText(llamar.textoLenguajes_infENG);                
                }    
                if(contador_tema == 3){
                    etiqueta1.setText(llamar.tituloIntro_infEng);
                    etiquetainfo.setText(llamar.textoIntro_infEng);                   
                }
                if(contador_tema == 4){
                    etiqueta1.setText(llamar.tituloAceptados_infENG);
                    etiquetainfo.setText(llamar.textoAceptados_infENG);             
                }
                if(contador_tema == 5){
                    etiqueta1.setText(llamar.tituloExtensiones_infENG);
                    etiquetainfo.setText(llamar.textoExtensiones_infENG);                
                }
                if(contador_tema == 6){
                    etiqueta1.setText(llamar.tituloAlgoritmos_infENG);
                    etiquetainfo.setText(llamar.textoAlgoritmos_infENG);            
                }
                tema1.setText(llamar.tema1ENG);
                tema2.setText(llamar.tema2ENG);
                tema3.setText(llamar.tema3ENG);
                tema4.setText(llamar.tema4ENG);
                tema5.setText(llamar.tema5ENG);
                tema6.setText(llamar.tema6ENG);
                cuestionario.setText(llamar.examen_menuENG);
                Salir.setText(llamar.titulo_menuENG);
                English.setText(llamar.inglesENG);
                espanol.setText(llamar.espanolENG);
                sigue.setText(llamar.sigueENG);
                regre.setText(llamar.anteriorENG);
                llamar.idioma = 1;
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };
        //Accion para el boton de español
        MouseListener Eveesp = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
 
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(contador_tema == 1){
                    etiqueta1.setText(llamar.tituloAlan_inf);
                    etiquetainfo.setText(llamar.textoAlan_inf);                
                }
                if(contador_tema == 2){
                    etiqueta1.setText(llamar.tituloLenguajes_inf);
                    etiquetainfo.setText(llamar.textoLenguajes_inf);                
                }    
                if(contador_tema == 3){
                    etiqueta1.setText(llamar.tituloIntro_inf);
                    etiquetainfo.setText(llamar.textoIntro_inf);                   
                }
                if(contador_tema == 4){
                    etiqueta1.setText(llamar.tituloAceptados_inf);
                    etiquetainfo.setText(llamar.textoAceptados_inf);             
                }
                if(contador_tema == 5){
                    etiqueta1.setText(llamar.tituloExtensiones_inf);
                    etiquetainfo.setText(llamar.textoExtensiones_inf);                
                }
                if(contador_tema == 6){
                    etiqueta1.setText(llamar.tituloAlgoritmos_inf);
                    etiquetainfo.setText(llamar.textoAlgoritmos_inf);            
                }
                tema1.setText(llamar.tema1);
                tema2.setText(llamar.tema2);
                tema3.setText(llamar.tema3);
                tema4.setText(llamar.tema4);
                tema5.setText(llamar.tema5);
                tema6.setText(llamar.tema6);
                cuestionario.setText(llamar.examen_menu);
                Salir.setText(llamar.titulo_menu);
                English.setText(llamar.ingles);
                espanol.setText(llamar.espanol);
                sigue.setText(llamar.sigue);
                regre.setText(llamar.anterior);
                llamar.idioma = 0;
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };     
        
        panel2.add(etiqueta1);
        panel2.add(etiquetainfo);
        panel2.add(etiquetaI2);
        panel2.add(etiquetaI);
        //Propiedades de los botones
        //Boton Salir
        tema1.setBounds(40, 200, 120, 30);
        tema1.addMouseListener(evetema1);
        
        tema2.setBounds(40, 250, 120, 30);
        tema2.addMouseListener(evetema2);
        
        tema3.setBounds(40, 300, 120, 30);
        tema3.addMouseListener(evetema3);
       
        tema4.setBounds(40, 350, 120, 40);
        tema4.addMouseListener(evetema4);
        
        tema5.setBounds(40, 410, 120, 30);
        tema5.addMouseListener(evetema5);
        
        tema6.setBounds(40, 460, 120, 30);
        tema6.addMouseListener(evetema6);
        
        cuestionario.setBounds(40, 510, 120, 30);
        cuestionario.addMouseListener(EveExam);
        
        Salir.setBounds(50, 600, 100, 30);
        Salir.addMouseListener(EveAnt);
        
        //Boton de ingles
        English.setBounds(850, 600, 100, 30);
        English.addMouseListener(EveENG);
        
        //Boton español
        espanol.setBounds(730, 600, 100, 30);
        espanol.addMouseListener(Eveesp);
        
        sigue.setBounds(800, 500, 100, 30);
        sigue.addMouseListener(evesigue);
        
        regre.setBounds(250, 500, 100, 30);
        regre.addMouseListener(eveante);
        
        panel2.add(tema1);
        panel2.add(tema2);
        panel2.add(tema3);
        panel2.add(tema4);
        panel2.add(tema5);
        panel2.add(tema6);
        panel2.add(cuestionario);
        panel2.add(Salir);
        panel2.add(English);
        panel2.add(espanol);
        panel2.add(sigue);
        panel2.add(regre);
    
        ImageIcon Imagen4 = new ImageIcon("ondas.png");//llamado de imagen
        JLabel etiquetaI4 = new JLabel();
        etiquetaI4.setBounds(0,-5,1000,700);
        etiquetaI4.setIcon(new ImageIcon(Imagen4.getImage().getScaledInstance(1000,700,Image.SCALE_SMOOTH)));
        
        panel2.add(etiquetaconte);
        panel2.add(etiquetaI4);
        
    }
    
}