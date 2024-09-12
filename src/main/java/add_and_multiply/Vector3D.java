package add_and_multiply;

public class Vector3D implements Element{
    private final double x;
    private final double y;
    private final double z;
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "("+ x + ", " + y +", " + z + ")";
    }

    @Override
    public Vector3D add(Element other) {
        if (other instanceof Vector3D vOther)
            return new Vector3D(x + vOther.getX(), y + vOther.getY(), z + vOther.getZ());
        else
            throw new IllegalArgumentException("Not a Vector3D argument");
    }

    @Override
    public Vector3D multiply(Element other) {
        if (other instanceof  Vector3D vOther)
            return new Vector3D(y * vOther.getZ() - z * vOther.getY(),
                    z * vOther.getX() - x * vOther.getZ(),
                    x * vOther.getY() - y * vOther.getX());
        else
            throw new IllegalArgumentException("Not a Vector3D argument");
    }
}
