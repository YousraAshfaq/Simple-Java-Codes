import java.awt.*;
import java.awt.geom.*;
/**    A scene shape that is composed of multiple geometric shapes. */
public abstract class CompoundShape extends SceneShape {

    private GeneralPath path;

    public CompoundShape() {
        path = new GeneralPath();
    }
    protected void add(Shape s) //protected-access method    
    {       
        path.append(s, false);    
    }  
    public boolean contains(Point2D aPoint) 
    {
        return path.contains(aPoint);
    }
    public void translate(int dx, int dy) 
    {
        path.transform(AffineTransform.getTranslateInstance(dx, dy));
    }
    public void draw(Graphics2D g2) 
    {
        g2.draw(path);
    }
}