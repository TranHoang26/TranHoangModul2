import java.util.Arrays;

public class Class3D extends Class2D{
private float z;
    public Class3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y , float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public  float[] getXYZ(){
        return new float[]{x,y,z};
    }

    @Override
    public String toString(){
        return Arrays.toString(getXYZ());
    }

}
