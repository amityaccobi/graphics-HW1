package RayTracing;

public class Cylinder {


	private Point centerPoint;
	private int length;
	private int radius;
	private int rotationX, rotationY, rotationZ;
	private int materialIndex;

	public Cylinder (String[] params){
		this.setCenterPoint(Integer.parseInt(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2]));
		this.setLength(Integer.parseInt(params[3]));
		this.setRadius(Integer.parseInt(params[4]));
		this.setRotationX(Integer.parseInt(params[5]));
		this.setRotationY(Integer.parseInt(params[6]));
		this.setRotationZ(Integer.parseInt(params[7]));
		this.setMaterialIndex(Integer.parseInt(params[8]));
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

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getRotationX() {
		return rotationX;
	}

	public void setRotationX(int rotationX) {
		this.rotationX = rotationX;
	}

	public int getRotationY() {
		return rotationY;
	}

	public void setRotationY(int rotationY) {
		this.rotationY = rotationY;
	}

	public int getRotationZ() {
		return rotationZ;
	}

	public void setRotationZ(int rotationZ) {
		this.rotationZ = rotationZ;
	}
	
	
}
