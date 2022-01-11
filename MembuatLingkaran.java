/*
 * Nama    : Fauzyah Hadirahma
 * NPM     : 20191310070
 * Tugas   : Komputer Grafis Multimedia - Membuat Lingkaran
 */

import java.applet.Applet;
import java.awt.Graphics;
/**
 *
 * @author Fauzyah
 */
public class MembuatLingkaran extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
   public void paint(Graphics g){
      //g.drawOval(x1, y1, x2, y2);
        g.drawOval(100, 20, 150, 150);
        g.drawOval(110, 30, 130, 130);
        g.drawOval(120, 40, 110, 110);
        g.drawOval(130, 50, 90, 90);
        g.drawOval(140, 60, 70, 70);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
