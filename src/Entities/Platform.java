package Entities;

public class Platform {
    private int x, y, width, height;

    public Platform(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean isColliding(Player player) {
        int playerX = player.getX();
        int playerY = player.getY();
        // Simple collision logic
        return (playerX >= x && playerX <= x + width) && (playerY >= y && playerY <= y + height);
    }
}
