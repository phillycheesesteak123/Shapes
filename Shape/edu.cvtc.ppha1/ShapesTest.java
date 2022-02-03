

public class ShapesTest {
	
	public static void main(String[] args) {
		// Classes
		Cuboid cuboid = new Cuboid((float) (2.3), (float) (5.1), (float) (3.3));
		Cylinder cylinder = new Cylinder((float) (4.3), (float) (5.5));
		Sphere sphere = new Sphere((float) (6.3));
		
		cuboid.render();
		cylinder.render();
		sphere.render();
		
		
		
	}

}// Last Bracket
