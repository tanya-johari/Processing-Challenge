import processing.core.PApplet;

class Ball {
    public static final int DIAMETER = 20;
    private float positionX, positionY;
    private float speed;

    public Ball(float positionX, float positionY, float speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }

    public void update() {
        positionX += speed;
    }

    public void display(PApplet sketch) {
        sketch.ellipse(positionX, positionY, DIAMETER, DIAMETER);
    }
}
public class OOPApproach extends PApplet {

    public static final int HEIGHT = 500;
    public static final int WIDTH = 640;

    Ball[] balls = new Ball[4];

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        balls[0] = new Ball(0, HEIGHT / 5, 1);
        balls[1] = new Ball(0, 2 * HEIGHT / 5, 2);
        balls[2] = new Ball(0, 3 * HEIGHT / 5, 3);
        balls[3] = new Ball(0, 4 * HEIGHT / 5, 4);
    }

    @Override
    public void draw() {
//        paintWhite();
        for (Ball ball : balls) {
            ball.update();
            ball.display(this);
        }
    }

    private void paintWhite() {
        background(255);
    }

    public static void main(String[] args) {
        PApplet.main("OOPApproach", args);
    }
}
