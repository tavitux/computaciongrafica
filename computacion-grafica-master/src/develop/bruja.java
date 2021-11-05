package develop;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;


public class bruja extends JFrame {
    public bruja() {
        super("Brujas");
        setSize(660, 660);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        

        int[][][] points = {
            // Luna
            {
                {250, 50}, {280, 50}, {300, 60},
                {310, 80}, {310, 110}, {300, 130},
                {280, 140}, {250, 140}, {270, 130},
                {280, 110}, {280, 70}, {270, 60},
                {250, 50}
            },
            // sombrero 
            {
                {130, 50}, {170, 80}, {150, 80},
                {190, 160}, {70, 160}, {130, 50}
            },
            // sombrero abajo
            {
                {30, 160}, {230, 160}, {230, 170}, 
                {30, 170}, {30, 160}
            },
            // cinta negra
            {
                {92, 120}, {170 ,120}, {180, 140},
                {81, 140}, {92, 120}
            },
            // hebilla de la cinta negra
            {
                {110, 110}, {150, 110}, {150, 150},
                {110, 150}, {110, 110}
            },
            // interna de la hebilla
            {
                {120, 120}, {140, 120}, {140, 140},
                {120, 140}, {120, 120}
            },
            // cabello
            {
                {70,170}, {10, 230}, {20, 240},
                {60, 200}, {30, 240}, {40, 250},
                {92, 170}, {65,170}
            },
            // cabello derecho
            {
                {190, 170}, {250, 230}, {240, 240},
                {200, 200}, {230, 240}, {220, 250},
        
                {168 ,170}, {195, 170}
            },
            // cara
            {
                {102, 170}, {168 ,170}, {193, 230},
                {193, 250}, {163, 280}, {103, 280},
                {80, 250}, {73, 230}, {80, 170}
            },
            // ojo izquierdo 
            {
                {93, 180}, {123, 180}, {123, 210},
                {93, 210}, {93, 180}
            },
            //iris del ojo izquierdo
            {
                {103, 190}, {123, 190}, {123, 210}, 
                {103, 210}, {103, 190}
            },
            // ojo derecho
            {
                {140, 180}, {170, 180}, {170, 210},
                {140, 210}, {140, 180}
            },
            // iris del ojo derecho
            {
                {140, 190}, {160, 190}, {160, 210},
                {140, 210}, {140, 190}
            },
            // nariz
            {
                {140, 210}, {73, 210}, {83, 230},
                {143, 230}
            },
            // boca
            {
                {103, 240}, {103, 250}, {113, 260},
                {153, 260}, {163, 250}, {163, 240}
            },
            // palo escoba
            {
                {23, 370}, {243, 370}, {243, 380},
                {43, 380}, {23, 370}
            },
            // escoba
            {
                {243, 370}, {253, 340}, {343, 340},
                {343, 410}, {253, 410}, {243, 380},
                {243, 370}
            },
            //  vestido 
            {
                {103, 280}, {163, 280}, {193, 370},
                {193, 380}, {73, 380}, {73, 370},
                {103, 280}
            },
            //  brazo izquierdo
            {
                {103, 280}, {43, 350}, {53, 360},
                {92, 315}
            },
            // mano izquierda
            {
                {43, 350}, {33, 360}, {33, 370}, 
                {53, 370}, {53, 360}, {43, 350}
            },
            // brazo derecho
            {
                {163, 280}, {233, 275}, {243, 285},
                {173, 310}, {163, 280}
            },
            // mano derecha
            {
                {233, 275}, {233, 255}, {243, 255},
                {243, 265}, {253, 255}, {263, 275},
                {243, 285}, {233, 275}
            },
            // pierna izquierda
            {
                {93, 380}, {123, 420}, {163, 420},
                {173, 440}, {173, 410}, {133, 410},
                {117, 380}, {93, 380}
            },
            // pie izquierdo
            {
                {143, 420}, {153, 420}, {153, 410},
                {143, 410}, {143, 420}
            },
            // bota pie izquierdo
            {
                {153, 420}, {163, 420}, {173, 440}, 
                {173, 410}, {153, 410}, {153, 420}
            },
            // pierna derecha
            {
                {137, 380}, {157, 410}, {197, 410}, 
                {207, 430}, {207, 400}, {167, 400},
                {157, 380}, {137, 380}
            }, 
            // media pie derecho 
            {
                {177, 410}, {187, 410}, {187, 400},
                {177, 400}, {177, 410}
            }, 
            // bota pie derecho
            {
                {187, 410}, {197, 410}, {207, 430},
                {207, 400}, {187, 400}, {187, 410}
            }
        };

        // Ciclo para colorear las diferentes partes
        for(int i = 0; i < points.length; i++) {
            if(i != 13 && i != 14) {
                Polygon figura = new Polygon();

                for(int j = 0; j < points[i].length; j++) {
                    figura.addPoint(points[i][j][0], points[i][j][1]);
                }

                if(i == 0 || i == 4 || i == 23 || i == 26) {
                    g.setColor(Color.YELLOW);
                } else if(i == 1 || i == 2 || i == 17 || i == 18 || i == 20) {
                    g.setColor(Color.getHSBColor(2.80f, 0.92f, 0.76f));
                } else if(i == 8 || i == 19 || i == 21 || i == 22 || i == 25) {
                    g.setColor(Color.getHSBColor(1.29f, 0.45f, 0.80f));
                } else if(i == 9 || i == 11) {
                    g.setColor(Color.WHITE);
                } else if(i == 15) {
                    g.setColor(Color.getHSBColor(0.10f, 0.58f, 0.75f));
                } else if(i == 16) {
                    g.setColor(Color.getHSBColor(0.15f, 0.98f, 0.85f));
                } else {
                    g.setColor(Color.BLACK);
                }

                g.fillPolygon(figura);
            }
        }

        // Ciclo para dibujar a lineas todo el contorno de la figura
        g.setColor(Color.BLACK);
        for(int i = 0; i < points.length; i++) {
            for(int j = 0; j < points[i].length; j++) {
                g.drawLine(
                    points[i][j][0], 
                    points[i][j][1], 
                    points[i][(j < points[i].length - 1) ? j + 1 : j][0],
                    points[i][(j < points[i].length - 1) ? j + 1 : j][1]
                );
            }
        }
    }
    
    public static void main(String[] args) {
        bruja appLines = new bruja();
        appLines.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
