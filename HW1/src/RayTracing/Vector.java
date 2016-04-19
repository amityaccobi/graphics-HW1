package RayTracing;

public class Vector {
	public double x, y, z;

    // constructors
    public Vector( ) {
    }

    public Vector(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }

    public Vector(Vector v) {
        x = v.x;
        y = v.y;
        z = v.z;
    }

    // methods
    public final double dot(Vector B) {
        return (x*B.x + y*B.y + z*B.z);
    }

    public final double dot(double Bx, double By, double Bz) {
        return (x*Bx + y*By + z*Bz);
    }

    public static final double dot(Vector A, Vector B) {
        return (A.x*B.x + A.y*B.y + A.z*B.z);
    }

    public final Vector cross(Vector B) {
        return new Vector(y*B.z - z*B.y, z*B.x - x*B.z, x*B.y - y*B.x);
    }

    public final Vector cross(double Bx, double By, double Bz) {
        return new Vector(y*Bz - z*By, z*Bx - x*Bz, x*By - y*Bx);
    }

    public final static Vector cross(Vector A, Vector B) {
        return new Vector(A.y*B.z - A.z*B.y, A.z*B.x - A.x*B.z, A.x*B.y - A.y*B.x);
    }

    public final double length( ) {
        return (double) Math.sqrt(x*x + y*y + z*z);
    }

    public final static double length(Vector A) {
        return (double) Math.sqrt(A.x*A.x + A.y*A.y + A.z*A.z);
    }

    public final void normalize( ) {
    	double t = x*x + y*y + z*z;
        if (t != 0 && t != 1) t = (double) (1 / Math.sqrt(t));
        x *= t;
        y *= t;
        z *= t;
    }

    public final static Vector normalize(Vector A) {
    	double t = A.x*A.x + A.y*A.y + A.z*A.z;
        if (t != 0 && t != 1) t = (double)(1 / Math.sqrt(t));
        return new Vector(A.x*t, A.y*t, A.z*t);
    }
    
    // return this + that
    public Vector plus(Vector B) {
        if (this.length() != B.length()) throw new RuntimeException("Dimensions don't agree");
        return new Vector(x+B.x,y+B.y,z+B.z);
    }
    
    public Vector scalarMultiply(double scalar) {
    	return new Vector(this.x*scalar,this.y*scalar,this.z*scalar);
    }

    public String toString() {
        return new String("["+x+", "+y+", "+z+"]");
    }
}
