
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
/*from   ww w .j  a  v a2  s  . com*/
import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    AffineTransform tx = new AffineTransform();
    tx.rotate(1);
    
    Rectangle shape = new Rectangle(100, 100, 200, 200);
    g2d.draw(shape);
    Shape newShape = tx.createTransformedShape(shape);

    g2d.draw(newShape);
  }
}

public class Main {
  public static void main(String[] a) {
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(30, 30, 450, 450);
    window.getContentPane().add(new MyCanvas());
    window.setVisible(true);
  }
}
