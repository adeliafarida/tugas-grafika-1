import java.awt.*;
import java.awt.geom.*;

public class inisialA extends Frame {

    public inisialA () {
        addWindowListener(new MyFinishWindow());
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);

        // Define control points for the letter A
        int xc1 = 100;
        int yc1 = 450;

        int xc2 = 250;
        int yc2 = 50;

        int xc3 = 400;
        int yc3 = 450;

        int xc4 = 175;
        int yc4 = 250;

        int xc5 = 325;
        int yc5 = 250;

        // Draw the curves that define the letter A
        QuadCurve2D.Double d1 = new QuadCurve2D.Double(xc1, yc1, xc4, yc4, xc2, yc2);
        g2d.draw(d1);

        QuadCurve2D.Double d2 = new QuadCurve2D.Double(xc2, yc2, xc5, yc5, xc3, yc3);
        g2d.draw(d2);

        // Draw the control points
        drawSmallRect(xc1, yc1, g2d);
        drawSmallRect(xc2, yc2, g2d);
        drawSmallRect(xc3, yc3, g2d);
        drawSmallRect(xc4, yc4, g2d);
        drawSmallRect(xc5, yc5, g2d);

        // Label the control points
        g2d.setFont(new Font("serif", Font.PLAIN, 24));
        g2d.drawString("P1'", xc1 + 10, yc1 + 5);
        g2d.drawString("P2'", xc2 + 10, yc2 + 10);
        g2d.drawString("P3'", xc3 + 10, yc3 + 5);
        g2d.drawString("P4'", xc4 + 10, yc4 + 10);
        g2d.drawString("P5'", xc5 + 10, yc5 + 10);
    }

    public static void drawSmallRect(int x, int y, Graphics2D g2d) {
        Rectangle rect = new Rectangle(x - 4, y - 3, 8, 8);
        g2d.fill(rect);
    }

    public static void main(String[] argv) {
        inisialA  f = new inisialA ();
        f.setTitle("The letter A");

        f.setSize(500, 500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }
}
