package RayTracing;

import java.awt.Color;

public class Light {

	private Point lightPosition;
	private Color lightColor;
	private float specularIntensity, shadowIntensity, lightWidth;
	
	public Light (String[] params){
		setLightPosition(new Point(Integer.parseInt(params[0]),Integer.parseInt(params[1]),Integer.parseInt(params[2])));
		setLightColor(new Color(Integer.parseInt(params[3]),Integer.parseInt(params[4]),Integer.parseInt(params[5])));
		setSpecularIntensity(Float.parseFloat(params[6]));
		setShadowIntensity(Float.parseFloat(params[7]));
		setLightWidth(Float.parseFloat(params[8]));
	}
	
	public Point getLightPosition() {
		return lightPosition;
	}
	public void setLightPosition(Point lightPosition) {
		this.lightPosition = lightPosition;
	}
	public Color getLightColor() {
		return lightColor;
	}
	public void setLightColor(Color lightColor) {
		this.lightColor = lightColor;
	}
	public float getSpecularIntensity() {
		return specularIntensity;
	}
	public void setSpecularIntensity(float f) {
		this.specularIntensity = f;
	}
	public float getShadowIntensity() {
		return shadowIntensity;
	}
	public void setShadowIntensity(float f) {
		this.shadowIntensity = f;
	}
	public float getLightWidth() {
		return lightWidth;
	}
	public void setLightWidth(float f) {
		this.lightWidth = f;
	}
	
}
