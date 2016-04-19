package RayTracing;

import java.awt.Color;

public class Material {
	
	private Color diffuseColor;
	private Color specularColor;
	private Color reflectionColor;
	private float phongSpecCoef, transparency, incidence;
	
	public Material(String[] params){
		setDiffuseColor(new Color(Integer.parseInt(params[0]),Integer.parseInt(params[1]),Integer.parseInt(params[2])));
		setSpecularColor(new Color(Integer.parseInt(params[3]),Integer.parseInt(params[4]),Integer.parseInt(params[5])));
		setReflectionColor(new Color(Integer.parseInt(params[6]),Integer.parseInt(params[7]),Integer.parseInt(params[8])));
		setPhongSpecCoef(Float.parseFloat(params[9]));
		setTransparency(Float.parseFloat(params[10]));
		//BONUS: 
		//setIncidence(Float.parseFloat(params[10]));
	}

	public Color getDiffuseColor() {
		return diffuseColor;
	}

	public void setDiffuseColor(Color diffuseColor) {
		this.diffuseColor = diffuseColor;
	}

	public Color getSpecularColor() {
		return specularColor;
	}

	public void setSpecularColor(Color specularColor) {
		this.specularColor = specularColor;
	}

	public Color getReflectionColor() {
		return reflectionColor;
	}

	public void setReflectionColor(Color reflectionColor) {
		this.reflectionColor = reflectionColor;
	}

	public float getPhongSpecCoef() {
		return phongSpecCoef;
	}

	public void setPhongSpecCoef(float phongSpecCoef) {
		this.phongSpecCoef = phongSpecCoef;
	}

	public float getTransparency() {
		return transparency;
	}

	public void setTransparency(float transparency) {
		this.transparency = transparency;
	}

	public float getIncidence() {
		return incidence;
	}

	public void setIncidence(float incidence) {
		this.incidence = incidence;
	}
	
}
