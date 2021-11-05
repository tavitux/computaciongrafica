package develop;


import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;
import java.awt.BasicStroke;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JFrame;

import static java.awt.Font.PLAIN;

public class abeja extends JFrame {
    public abeja() {
        super("abejita");
        setSize(460, 500);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(4.0f));


        int[][] puntos = {
            {60, 200, 220, 135}, {240, 150, 80, 105}, // posicion cuerpo
            {178, 132, 80, 115}, {260, 190, 25, 40},  // ojo interior
            {198, 170, 35, 40} //circulo ojo
        };
        
       
        g2.draw(new Ellipse2D.Double(100, 110, 60, 180)); //posicion primer ala
        g2.draw(new Ellipse2D.Double(160, 110, 60, 120)); // posicion seguna ala

        g2.rotate(-0.077f);

        //lapiz
        g2.setColor(Color.getHSBColor(0.907f, 1, 0.73f));
        g2.fillOval(43, 330, 60, 70);
        g2.setColor(Color.BLACK);
        g2.drawOval(43, 330, 60, 70); //circulo borrador

        //conector borrador lapiz
        g2.setColor(Color.getHSBColor(0.107f, 0.2f, 0.73f));
        g2.fillOval(63, 330, 20, 70);
        g2.setColor(Color.BLACK);
        g2.drawOval(63, 330, 20, 70); 

        // punta lapiz
        Polygon figura = new Polygon();
        figura.addPoint(268, 330);
        figura.addPoint(333, 360);
        figura.addPoint(333, 370);
        figura.addPoint(268, 400);

        
        g2.setColor(Color.getHSBColor(0.107f, 0.2f, 0.73f));
        g2.fillPolygon(figura);
        g2.setColor(Color.BLACK);
        g2.drawPolygon(figura);

        // Cuerpo del lapiz
        g2.setColor(Color.getHSBColor(0.16f, 0.9f, 0.9f));
        g2.fillRoundRect(73, 330, 200, 70, 20, 20);
        g2.setColor(Color.BLACK);
        g2.drawRoundRect(73, 330, 200, 70, 20, 20);

        // color abeja
        g2.setColor(Color.getHSBColor(0.16f, 0.9f, 0.9f));
        g2.fillArc(40, 200, 220, 135, 10, 360);

        // 1 negra
        g2.setColor(Color.BLACK);
        g2.fill(new Arc2D.Double(60, 200, 220, 135, 110, 140, Arc2D.CHORD));

        // 1 amarilla
        g2.setColor(Color.getHSBColor(0.16f, 0.9f, 0.9f));
        g2.fill(new Arc2D.Double(100, 200, 120, 135, 110, 140, Arc2D.CHORD));

        // 2 negra
        g2.setColor(Color.BLACK);
        g2.fill(new Arc2D.Double(130, 200, 120, 135, 110, 360, Arc2D.CHORD));

        // 2 amarilla
        g2.setColor(Color.getHSBColor(0.16f, 0.9f, 0.9f));
        g2.fill(new Arc2D.Double(160, 206, 120, 120, 110, 360, Arc2D.CHORD));

        // cuerpo y los ojos
        for(int i = 0; i < puntos.length; i++) {
            g2.setColor(Color.WHITE);
            if(i != 0) {
                if(i == 3 || i == 4) g2.setColor(Color.BLACK);
                g2.fillOval(puntos[i][0], puntos[i][1], puntos[i][2], puntos[i][3]);
            }
                
            g2.setColor(Color.BLACK);
            g2.drawOval(puntos[i][0], puntos[i][1], puntos[i][2], puntos[i][3]);
        }

        g2.drawArc(190, 175, 80, 120, 230, 50);

        g2.setColor(Color.BLACK);
        g2.setFont(new Font("TIMES NEW ROMAN", PLAIN,30));
        g2.drawString("GUSTAVO", 110, 380);
    }
    // cierre aplicacion
    public static void main(String[] args) {
        abeja appLines = new abeja();
        appLines.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
