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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Acer
 */
public class menu extends JFrame{
    
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
    
    public menu(){
        
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
        
        //creacion de botones
        JButton temas = new JButton();
        JButton examen = new JButton();
        JButton Iniciar = new JButton();
        JButton Salir = new JButton();
        JButton English = new JButton();
        JButton espanol = new JButton();
        JButton contexto = new JButton();
        
        if(variables.idioma == 0){
            etiqueta1.setText(llamar.titulo_menu);
            temas.setText(llamar.temas_menu);
            examen.setText(llamar.examen_menu);
            Salir.setText(llamar.botonFin_menu);
            Iniciar.setText(llamar.botonIni_ini);
            English.setText(llamar.ingles);
            espanol.setText(llamar.espanol);
            contexto.setText(llamar.info);

        } else {
            etiqueta1.setText(llamar.titulo_menuENG);
            temas.setText(llamar.temas_menuENG);
            examen.setText(llamar.examen_menuENG);
            Iniciar.setText(llamar.botonIni_iniENG);
            Salir.setText(llamar.botonFin_menuENG);
            English.setText(llamar.inglesENG);
            espanol.setText(llamar.espanolENG);
            contexto.setText(llamar.infoENG);
        }
        
        //Configuracion de la etiqueta1
        etiqueta1.setFont(new Font("Arial",Font.ITALIC | Font.BOLD, 50));
        etiqueta1.setBounds(440, 80, 200,100);
        //etiqueta1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));//Agregar borde
        etiqueta1.setOpaque(false);
        etiqueta1.setBackground(Color.BLUE);
    
        //COnfiguracion imagenes
        ImageIcon Imagen2 = new ImageIcon("logoup_63_png.png");//llamado de imagen
        JLabel etiquetaI = new JLabel();
        etiquetaI.setBounds(880,20,100,100);
        etiquetaI.setIcon(new ImageIcon(Imagen2.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
        
        ImageIcon Imagen = new ImageIcon("bombilla.png");//llamado de imagen
        JLabel etiquetaI2 = new JLabel();
        etiquetaI2.setBounds(580,200,100,100);
        etiquetaI2.setIcon(new ImageIcon(Imagen.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        
        ImageIcon Imagen3 = new ImageIcon("examen.png");//llamado de imagen
        JLabel etiquetaI3 = new JLabel();
        etiquetaI3.setBounds(320,310,100,100);
        etiquetaI3.setIcon(new ImageIcon(Imagen3.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        

        
        //Configuracion botones
        temas.setFont(new Font("Arial",Font.BOLD, 20));
        examen.setFont(new Font("Arial",Font.BOLD, 20));
        contexto.setFont(new Font("Arial",Font.BOLD, 20));
        
        MouseListener Eve2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                Inicio next = new Inicio();
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
        
        MouseListener Evetemas = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                informacion next = new informacion();
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
        
        MouseListener Eveconte = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                contexto next = new contexto();
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
                etiqueta1.setText(llamar.titulo_menuENG);
                temas.setText(llamar.temas_menuENG);
                examen.setText(llamar.examen_menuENG);
                Iniciar.setText(llamar.botonIni_iniENG);
                Salir.setText(llamar.botonFin_menuENG);
                English.setText(llamar.inglesENG);
                espanol.setText(llamar.espanolENG);
                contexto.setText(llamar.infoENG);
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
                etiqueta1.setText(llamar.titulo_menu);
                temas.setText(llamar.temas_menu);
                examen.setText(llamar.examen_menu);
                Salir.setText(llamar.botonFin_menu);
                Iniciar.setText(llamar.botonIni_ini);
                English.setText(llamar.ingles);
                espanol.setText(llamar.espanol);
                contexto.setText(llamar.info);
                llamar.idioma = 0;
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };     
        
        //Agregar etiquetas
        panel2.add(etiqueta1);
        panel2.add(etiquetaI);
        panel2.add(etiquetaI2);
        panel2.add(etiquetaI3);
        
        //Propiedades de los botones
        //Boton temas
        temas.setBounds(420, 240, 160, 50);
        temas.addMouseListener(Evetemas);
        
        //Boton examen
        examen.setBounds(420, 340, 160, 50);
        examen.addMouseListener(EveExam);
        
        contexto.setBounds(420, 440, 160, 50);
        contexto.addMouseListener(Eveconte);         
        
        //Boton Salir
        Salir.setBounds(80, 600, 100, 30);
        Salir.addMouseListener(Eve2);
        
        //Boton de ingles
        English.setBounds(850, 600, 100, 30);
        English.addMouseListener(EveENG);
        
        //Boton español
        espanol.setBounds(730, 600, 100, 30);
        espanol.addMouseListener(Eveesp);      
        
        panel2.add(temas);
        panel2.add(examen);
        panel2.add(Salir);
        panel2.add(English);
        panel2.add(espanol);
        panel2.add(contexto);
        
        ImageIcon Imagen4 = new ImageIcon("ondas.png");//llamado de imagen
        JLabel etiquetaI4 = new JLabel();
        etiquetaI4.setBounds(0,-5,1000,700);
        etiquetaI4.setIcon(new ImageIcon(Imagen4.getImage().getScaledInstance(1000,700,Image.SCALE_SMOOTH)));
        panel2.add(etiquetaI4);
    
    }
    
}
