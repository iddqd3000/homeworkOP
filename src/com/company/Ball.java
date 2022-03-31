public class Ball {
    public float x;
    public float y;
    public int radius;
    public float xDelta;
    public float yDelta;


    private Ball(float x, float y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        double b = Math.toRadians(direction);
        this.xDelta =  speed * (float)Math.cos(b);
        this.yDelta = -speed * (float)Math.sin(b);

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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }


    public void move(){
        x+= xDelta;
        y+= yDelta;
    }
    public void reflectHorizontal(){
        xDelta = -xDelta;
    }
    public void reflectVertical(){
        yDelta = -yDelta;
    }


    public String toString() {
        return "Ball{" + x + y + ", Speed=" + xDelta + yDelta +'}';
    }
}
class Container{
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public Container(int x,int y, int width, int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = width - x;
        this.y2 = height - y;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }
    public int getWidth(){
        return x2+x1;
    }
    public int getHeight(){
        return y2+y1;
    }
     public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }
    public int getWidth(){
        return x2+x1;
    }
    public int getHeight(){
        return y2+y1;
    }
    public boolean collides(Ball ball){
        if(ball.x - ball.radius < this.x1 & ball.x + ball.radius > this.x2 & ball.y - ball.radius < this.y1 
                & ball.y + ball.radius < this.y2){
            return true;
        }
        else{
            return false;
        }
    }
}
