import java.util.Arrays;

public class Class2D {
    public float x;
    public float y;

    public Class2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Class2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }
    @Override
    public String toString(){
        return Arrays.toString(getXY());
    }

}
