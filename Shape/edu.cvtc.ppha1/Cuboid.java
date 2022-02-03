import javax.swing.JOptionPane;

public class Cuboid extends Shape{
	//Variables
	private float width = (float) 0.0;
	private float height = (float) 0.0;
	private float depth = (float) 0.0;
	
	
	//Constructor
	public Cuboid(float width, float height, float depth) {
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}
	
	
	// Getters and Setters
	public float getWidth() {
		return width;
	}
	
	private void setWidth(float width) {
		this.width = width;
	}
	
	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}
	
	public float getDepth() {
		return depth;
	}
	
	private void setDepth(float depth) {
		this.depth = depth;
	}

	
	// Overrides
	@Override
	public float surfaceArea() {		
		return width * height;
	}

	@Override
	public float volume() {
		return width * height * depth;
	}
	
	@Override
	public void render() {	
		String message = "";
		
		if(width < 0 || height < 0 || depth < 0) {
			message = "Cuboid: \nPlease enter a number greater than 0";
			
		} else {
			message = "Cuboid: " + 
					"\nWidth: " + width + 
					"\nHeight: " + height + 
					"\nDepth: " + depth +
					"\nSurface Area: " + surfaceArea() + 
					"\nVolume: " + volume();
		}
		
		JOptionPane.showMessageDialog(null, message);
	}

	
}// Last Bracket
