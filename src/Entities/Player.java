package Entities;

public class Player {
    private int x, y;
    private int velocityX, velocityY;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.velocityX = 0;
        this.velocityY = 0;
    }

    public void moveLeft() {
        velocityX = -5;
    }

    public void moveRight() {
        velocityX = 5;
    }

    public void jump() {
        velocityY = -10;
    }

    public void update() {
        x += velocityX;
        y += velocityY;
        // Apply gravity
        velocityY += 1;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
