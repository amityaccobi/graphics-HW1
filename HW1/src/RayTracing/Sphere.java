package RayTracing;

public class Sphere{

	private Point centerPoint;
	private int radius;
	private int materialIndex;

	public Sphere (String[] params){
		this.setCenterPoint(Integer.parseInt(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2]));
		this.setRadius(Integer.parseInt(params[3]));
		this.setMaterialIndex(Integer.parseInt(params[4]));
	}
	
	public void setCenterPoint(int a, int b, int c) {
		this.centerPoint = new Point(a, b, c);
	}
	
	public Point getCenterPoint() {
		return centerPoint;
	}

	public int getMaterialIndex() {
		return materialIndex;
	}

	public void setMaterialIndex(int materialIndex) {
		this.materialIndex = materialIndex;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}	
	
	
}
