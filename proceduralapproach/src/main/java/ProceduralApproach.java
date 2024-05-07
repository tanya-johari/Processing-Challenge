import processing.core.PApplet;

import java.util.Arrays;

public class ProceduralApproach extends PApplet{

    public static final int NUM_BALLS = 4;
    public static final int SCREEN_HEIGHT = 500;
    public static final int SCREEN_WIDTH = 660;
    public static final float[] HEIGHT_FRACTIONS = { 1.0f/5, 2.0f/5, 3.0f/5, 4.0f/5};
    public static final float[] BALL_SPEEDS = {1, 2, 3, 4};
    public static final int BALL_SIZE = 20;

    float[] ballX = new float[NUM_BALLS];

    public static void main(String[] args) {
        PApplet.main("ProceduralApproach", args);
    }

    @Override
    public void settings() {
        size(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void setup() {
        background(255);
        Arrays.fill(ballX, 0);
    }

    @Override
    public void draw() {
        for (int i = 0; i < NUM_BALLS; i++) {
            drawBalls(ballX[i], HEIGHT_FRACTIONS[i] * SCREEN_HEIGHT);
            ballX[i] += BALL_SPEEDS[i];
        }
    }

    private void drawBalls(float speed, float height) {
        ellipse(speed, height, BALL_SIZE, BALL_SIZE);
    }
}
