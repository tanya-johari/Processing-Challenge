import processing.core.PApplet;
public class ProceduralApproach extends PApplet{

    public static final int HEIGHT = 500;
    public static final int WIDTH = 560;
    float ball1X, ball2X, ball3X, ball4X;
    float ball1Speed, ball2Speed, ball3Speed, ball4Speed;

    public static void main(String[] args) {
        PApplet.main("ProceduralApproach", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1X = 0;
        ball2X = 0;
        ball3X = 0;
        ball4X = 0;
        ball1Speed = 1;
        ball2Speed = 2;
        ball3Speed = 3;
        ball4Speed = 4;
    }

    @Override
    public void draw() {
//        paintWhite();
        drawBalls();
    }

    private void drawBalls() {
        ellipse(ball1X, HEIGHT / 5, 20 , 20);
        ellipse(ball2X, 2 * HEIGHT / 5, 20 , 20);
        ellipse(ball3X, 3 * HEIGHT / 5, 20 , 20);
        ellipse(ball4X, 4 * HEIGHT / 5, 20 , 20);
        ball1X += ball1Speed;
        ball2X += ball2Speed;
        ball3X += ball3Speed;
        ball4X += ball4Speed;
    }

    private void paintWhite() {
        background(255);
    }
}
