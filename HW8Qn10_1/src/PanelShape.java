import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelShape extends JPanel{
	
	Myshape[] shapes;

	public PanelShape(Myshape[] shapes) {
		this.shapes = shapes;
	}
	
	public Myshape[] getShapes() {
		return shapes;
	}
	
    //set shape
	public void setShapes(Myshape[] shapes) {
		this.shapes = shapes;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Myshape currentshape : shapes) {
			currentshape.draw(g);
		}
	}


}
