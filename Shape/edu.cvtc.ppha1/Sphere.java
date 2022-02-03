import javax.swing.JOptionPane;

public class Sphere extends Shape{
	// Variables
	private float radius = (float) 0.0;
	
	
	// Constructor
	public Sphere(float radius) {
		setRadius(radius);
	}
	
	
	// Getters and Setters
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	
	// Overrides
	@Override
	public float surfaceArea() {
		return (float)(4 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	public float volume() {
		return (float) (1.33333 * Math.PI * Math.pow(radius, 3));
	}

	@Override
	public void render() {
		String message = "";
		
		if(radius < 0) {
			message = "Sphere: \nPlease enter numbers greater than 0";
			
		} else {
			message = "Sphere: " + 
					"\nRadius: " + radius + 
					"\nSurface Area: " + surfaceArea() + 
					"\nVolume: " + volume();
		}
		
		JOptionPane.showMessageDialog(null, message);
	}
	
}// Last Bracket
