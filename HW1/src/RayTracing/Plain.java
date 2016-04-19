package RayTracing;

public class Plain {

	private Point normalPoint;
	private int offset;
	private int materialIndex;

	public Plain (String[] params){
		setNormalPoint(Integer.parseInt(params[0]),Integer.parseInt(params[1]),Integer.parseInt(params[2]) );
		this.setOffset(Integer.parseInt(params[3]));
		this.setMaterialIndex(Integer.parseInt(params[4]));
	}
	
	public void setNormalPoint(int a, int b, int c) {
		this.normalPoint = new Point(a, b, c);
	}

	public int getMaterialIndex() {
		return materialIndex;
	}

	public void setMaterialIndex(int materialIndex) {
		this.materialIndex = materialIndex;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public Point getNormalPoint() {
		return normalPoint;
	}
	
}
