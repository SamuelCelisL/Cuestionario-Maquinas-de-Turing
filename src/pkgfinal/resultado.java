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
import javax.swing.SwingConstants;

/**
 *
 * @author USUARIO
 */
public class resultado extends JFrame {

    String[] respuestasBien = new String[5];

    public void llenar(int pos) {
        if (variables.idioma == 0) {
            respuestasBien[pos] = "Correcto";
        } else {
            respuestasBien[pos] = "Correct";
        }
    }

    public void contestar() {
        for (int i = 0; i < variables.respuestaC.length; i++) {
            if (variables.respuestaC[i] == 1) {
                llenar(i);
            }
        }
    }

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

    public resultado() {
        variables llamar = new variables();

        // Propiedades de la Ventana
        setResizable(false);
        setSize(1000, 700);
        setTitle("Maquinas de Turing");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Propiedades del Panel
        DegradadoPanel panel = new DegradadoPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);

        JLabel notaSacada = new JLabel();
        JLabel pregunta1 = new JLabel();
        JLabel pregunta2 = new JLabel();
        JLabel pregunta3 = new JLabel();
        JLabel pregunta4 = new JLabel();
        JLabel pregunta5 = new JLabel();
        JButton siguiente = new JButton();
        JButton English = new JButton();
        JButton espanol = new JButton();

        if (variables.idioma == 0) {
            for (int i = 0; i < respuestasBien.length; i++) {
                respuestasBien[i] = "Incorrecta";
            }
            contestar();
            notaSacada.setText(llamar.notaSac + ": " + variables.nota);
            pregunta1.setText(llamar.pregunta1 + " = " + respuestasBien[0]);
            pregunta2.setText(llamar.pregunta2 + " = " + respuestasBien[1]);
            pregunta3.setText(llamar.pregunta3 + " = " + respuestasBien[2]);
            pregunta4.setText(llamar.pregunta4 + " = " + respuestasBien[3]);
            pregunta5.setText(llamar.pregunta5 + " = " + respuestasBien[4]);
            siguiente.setText(llamar.botonCont_cont);
            English.setText(llamar.ingles);
            espanol.setText(llamar.espanol);
        } else {
            for (int i = 0; i < respuestasBien.length; i++) {
                respuestasBien[i] = "Incorrect";
            }
            contestar();
            notaSacada.setText(llamar.notaSac_ENG + ": " + variables.nota);
            pregunta1.setText(llamar.pregunta1_ENG + " = " + respuestasBien[0]);
            pregunta2.setText(llamar.pregunta2_ENG + " = " + respuestasBien[1]);
            pregunta3.setText(llamar.pregunta3_ENG + " = " + respuestasBien[2]);
            pregunta4.setText(llamar.pregunta4_ENG + " = " + respuestasBien[3]);
            pregunta5.setText(llamar.pregunta5_ENG + " = " + respuestasBien[4]);
            siguiente.setText(llamar.botonCont_contENG);
            English.setText(llamar.inglesENG);
            espanol.setText(llamar.espanolENG);
        }

        // Propiedades de las Notas
        notaSacada.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 40));
        notaSacada.setBounds(100, 50, 400, 50);
        notaSacada.setHorizontalAlignment(SwingConstants.LEFT);
        notaSacada.setOpaque(false);
        notaSacada.setBackground(Color.red);
        panel.add(notaSacada);

        // Propiedades de las preguntas
        pregunta1.setFont(new Font("Arial", Font.PLAIN, 25));
        pregunta1.setBounds(100, 160, 400, 50);
        pregunta1.setHorizontalAlignment((SwingConstants.LEFT));
        pregunta1.setOpaque(false);
        pregunta1.setBackground(Color.red);
        panel.add(pregunta1);

        pregunta2.setFont(new Font("Arial", Font.PLAIN, 25));
        pregunta2.setBounds(100, 210, 400, 50);
        pregunta2.setHorizontalAlignment((SwingConstants.LEFT));
        pregunta2.setOpaque(false);
        pregunta2.setBackground(Color.red);
        panel.add(pregunta2);

        pregunta3.setFont(new Font("Arial", Font.PLAIN, 25));
        pregunta3.setBounds(100, 260, 400, 50);
        pregunta3.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta3.setOpaque(false);
        pregunta3.setBackground(Color.red);
        panel.add(pregunta3);

        pregunta4.setFont(new Font("Arial", Font.PLAIN, 25));
        pregunta4.setBounds(100, 310, 400, 50);
        pregunta4.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta4.setOpaque(false);
        pregunta4.setBackground(Color.red);
        panel.add(pregunta4);

        pregunta5.setFont(new Font("Arial", Font.PLAIN, 25));
        pregunta5.setBounds(100, 360, 400, 50);
        pregunta5.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta5.setOpaque(false);
        pregunta5.setBackground(Color.red);
        panel.add(pregunta5);

        MouseListener Eve = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                despedida next = new despedida();
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

        MouseListener EveENG;
        EveENG = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                for (int i = 0; i < respuestasBien.length; i++) {
                    if (variables.idioma == 0) {
                        if ("Correcto".equals(respuestasBien[i])) {
                            respuestasBien[i] = "Correct";
                        } else {
                            respuestasBien[i] = "Incorrect";
                        }
                    }
                }
                notaSacada.setText(llamar.notaSac_ENG + ": " + variables.nota);
                pregunta1.setText(llamar.pregunta1_ENG + " = " + respuestasBien[0]);
                pregunta2.setText(llamar.pregunta2_ENG + " = " + respuestasBien[1]);
                pregunta3.setText(llamar.pregunta3_ENG + " = " + respuestasBien[2]);
                pregunta4.setText(llamar.pregunta4_ENG + " = " + respuestasBien[3]);
                pregunta5.setText(llamar.pregunta5_ENG + " = " + respuestasBien[4]);
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
                for (int i = 0; i < respuestasBien.length; i++) {
                    if (variables.idioma == 1) {
                        if ("Correct".equals(respuestasBien[i])) {
                            respuestasBien[i] = "Correcto";
                        } else {
                            respuestasBien[i] = "Incorrecta";
                        }
                    }
                }
                notaSacada.setText(llamar.notaSac + ": " + variables.nota);
                pregunta1.setText(llamar.pregunta1 + " = " + respuestasBien[0]);
                pregunta2.setText(llamar.pregunta2 + " = " + respuestasBien[1]);
                pregunta3.setText(llamar.pregunta3 + " = " + respuestasBien[2]);
                pregunta4.setText(llamar.pregunta4 + " = " + respuestasBien[3]);
                pregunta5.setText(llamar.pregunta5 + " = " + respuestasBien[4]);
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

        // Boton Siguiente
        siguiente.setBounds(80, 600, 100, 30);
        siguiente.addMouseListener(Eve);

        // Boton de ingles
        English.setBounds(850, 600, 100, 30);
        English.addMouseListener(EveENG);

        // Boton español
        espanol.setBounds(730, 600, 100, 30);
        espanol.addMouseListener(Eveesp);

        ImageIcon Imagen2 = new ImageIcon("logoup_63_png.png");// llamado de imagen
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(880, 20, 100, 100);
        etiqueta4.setIcon(new ImageIcon(Imagen2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))); // tamaño
                                                                                                              // de la
                                                                                                              // imgaen
                                                                                                              // (
                                                                                                              // largo,
                                                                                                              // ancho,
                                                                                                              // escalar)
        panel.add(etiqueta4);

        ImageIcon Imagen = new ImageIcon("foto0.png");
        ImageIcon ImagenA = new ImageIcon("foto1.png");
        ImageIcon ImagenB = new ImageIcon("foto2.png");
        ImageIcon ImagenC = new ImageIcon("foto3.png");
        ImageIcon ImagenD = new ImageIcon("foto4.png");
        ImageIcon ImagenE = new ImageIcon("foto5.png");

        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(450, 140, 450, 300);
        switch (variables.nota) {
            case 0:
                etiqueta.setIcon(new ImageIcon(Imagen.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH)));
                break;
            case 1:
                etiqueta.setIcon(new ImageIcon(ImagenA.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH)));
                break;
            case 2:
                etiqueta.setIcon(new ImageIcon(ImagenB.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH)));
                break;
            case 3:
                etiqueta.setIcon(new ImageIcon(ImagenC.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH)));
                break;
            case 4:
                etiqueta.setIcon(new ImageIcon(ImagenD.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH)));
                break;
            case 5:
                etiqueta.setIcon(new ImageIcon(ImagenE.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH)));
                break;
            default:
                break;
        }

        panel.add(etiqueta);

        panel.add(siguiente);
        panel.add(English);
        panel.add(espanol);

        ImageIcon Imagen4 = new ImageIcon("ondas.png");// llamado de imagen
        JLabel etiquetaI4 = new JLabel();
        etiquetaI4.setBounds(0, -5, 1000, 700);
        etiquetaI4.setIcon(new ImageIcon(Imagen4.getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH)));
        panel.add(etiquetaI4);
    }

}
