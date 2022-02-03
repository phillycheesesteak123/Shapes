import javax.swing.JOptionPane;

public class Cylinder extends Shape{
	//Variables
	private float radius = (float) 0.0;
	private float height = (float) 0.0;
	
	
	// Constructor
	public Cylinder(float radius, float height) {
		setRadius(radius);
		setHeight(height);
	}
	
	
	// Getters and Setters
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	
	// Overrides
	@Override
	public float surfaceArea() {
		return (float) ((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
	}

	@Override
	public float volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}

	@Override
	public void render() {
		/*
		 String message = "Cylinder: " + "\nRadius: " + radius + "\nHeight: " + height
		 + "\nSurface Area: " + surfaceArea() + "\nVolume: " + volume();
		 */
		
		String message = "";
		
		if(radius < 0 || height < 0) {
			message = "Cylinder: \nPlease enter a number greater than 0";
			
		} else {
			message = "Cylinder: " + 
					"\nRadius: " + radius + 
					"\nHeight: " + height + 
					"\nSurface Area: " + surfaceArea() + 
					"\nVolume: " + volume();
		}
		
		JOptionPane.showMessageDialog(null, message);
	}

}// Last Bracket
