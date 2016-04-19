package RayTracing;


public class Camera {
	Vector position, lookAtPosition, upVector;
	float screenDistance, screenWidth;

	public Camera (String[] params){
		SetPosition(new Vector(Double.parseDouble(params[0]),Double.parseDouble(params[1]),Double.parseDouble(params[2])));
		SetLookAtPosition(new Vector(Double.parseDouble(params[3]),Double.parseDouble(params[4]),Double.parseDouble(params[5])));
		SetUpVector(new Vector(Double.parseDouble(params[6]),Double.parseDouble(params[7]),Double.parseDouble(params[8])));
		setScreenDistance(Float.parseFloat(params[9]));
		setScreenWidth(Float.parseFloat(params[10]));
	}

	private void SetPosition(Vector position) {
		this.position = position;
		
	}
	
	public Vector getPosition() {
		return position;
	}

	private void SetLookAtPosition(Vector lookAtPosition) {
		this.lookAtPosition = lookAtPosition;
		
	}
	
	public Vector getLookAtPosition() {
		return lookAtPosition;
	}
	
	private void SetUpVector(Vector upVector) {
		this.upVector = upVector;
		
	}
	
	public Vector getUpVector() {
		return upVector;
	}
	
	public float getScreenDistance() {
		return screenDistance;
	}

	public void setScreenDistance(float screenDistance) {
		this.screenDistance = screenDistance;
	}

	public float getScreenWidth() {
		return screenWidth;
	}

	public void setScreenWidth(float screenWidth) {
		this.screenWidth = screenWidth;
	}
}
