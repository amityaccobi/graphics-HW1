package RayTracing;

public class Point {
	private int x, y, z;
	
	public Point(int a, int b, int c){
		setX(a);
		setY(b);
		setZ(c);
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
