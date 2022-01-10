/*
 * Nama    : Fauzyah Hadirahma
 * NPM     : 20191310070
 * Tugas   : AlgoritmaSinCos
 */
package AlgoritmaSinCos;

/**
 *
 * @author Fauzyah
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grafika extends JPanel {
    int xc = 0;
    int yc = 0;
    
    public Grafika(){
        xc = 600 / 2;
        yc = 600 / 2;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D gd = (Graphics2D) g;
        
        int r = 200, x = 0, y = 0;
        
        for(int i=0; i<=360; i++){
            x=(int) ((Math.cos((int) i) *r) + xc);
            y=(int) ((Math.sin((int) i) *r) + yc);
            gd.drawLine(x, y, x, y);
        }
    }
    
    public static void main(String[] args){
        Grafika g = new Grafika();
        JFrame jf = new JFrame();
        jf.add(g);
        jf.setSize(600, 600);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
