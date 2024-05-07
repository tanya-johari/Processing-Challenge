import processing.core.PApplet;

class Ball {

    public static final int BALL_SIZE = 20;
    private float positionX;
    private final float positionY;
    private final float speed;

    public Ball(float positionX, float positionY, float speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }

    public void update() {
        positionX += speed;
    }

    public void display(PApplet sketch) {
        sketch.ellipse(positionX, positionY, BALL_SIZE, BALL_SIZE);
    }
}
public class OOPApproach extends PApplet {

    public static final int NUM_BALLS = 4;
    public static final int SCREEN_HEIGHT = 500;
    public static final int SCREEN_WIDTH = 640;
    public static final float[] HEIGHT_FRACTIONS = {1.0f/5, 2.0f/5, 3.0f/5, 4.0f/5};
    public static final float[] BALL_SPEED = {1, 2, 3, 4};

    Ball[] balls = new Ball[4];

    @Override
    public void settings() {
        size(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void setup() {
        paintWhite();
        for (int i = 0; i < NUM_BALLS; i++) {
            balls[i] = new Ball(0, HEIGHT_FRACTIONS[i] * SCREEN_HEIGHT, BALL_SPEED[i]);
        }
    }

    @Override
    public void draw() {
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
