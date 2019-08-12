package mannus;

import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import java.awt.Graphics;

public class ProvaBufferedImages {
    public static void main(String[] args) {
        BufferedImage im = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
        Graphics g = im.getGraphics();
        JFrame f = new JFrame("La mia prova") {
                                                @Override
                                                public void paint(Graphics g) {
                                                    super.paint(g);
                                                }
                                              };
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        long t1 = System.nanoTime(), t2 = System.nanoTime();
        while(t2 - t1 < 10000000000l) {
            //drawRect​(int x, int y, int width, int height)
            g.drawRect(50, 50, 100, 50); //(int)((t2 - t1) / (long)(10000000000l / 500l))
        }
        System.exit(0);
    }
}
