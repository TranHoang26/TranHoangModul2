import java.util.Arrays;

public class MovablePoint extends Point {
    private float xspeed;
    private float yspeed;
    public MovablePoint(float x, float y, float xspeed, float yspeed){
        this.xspeed=xspeed;
        this.yspeed=yspeed;
        this.x=x;
        this.y=y;
    }

    public MovablePoint(float xspeed, float yspeed){
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }
    public  MovablePoint(){
    }

    public float getXspeed() {
        return xspeed;
    }
    public void setXspeed(float xspeed){
        this.xspeed=xspeed;
    }
    public float getYspeed(){
        return yspeed;
    }
    public void setYspeed(float yspeed){
        this.yspeed=yspeed;
    }
    public void setSpeed(float xspeed, float yspeed){
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }
    public float[] getSpeed(){
        return new float[]{xspeed,yspeed};
    }

    @Override
    public String toString(){
        return Arrays.toString(getSpeed());
    }
}
