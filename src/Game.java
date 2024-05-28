import Entities.Platform;
import Entities.Player;
import Visual.Window;

import javax.swing.*;

public class Game {
    private Player player;
    private Platform[] platforms;

    public Game() {
        player = new Player(50, 400);
        platforms = new Platform[]{
                new Platform(50, 450, 100, 10),
                new Platform(200, 350, 100, 10)
        };
    }

    public void update() {
        player.update();
        for (Platform platform : platforms) {
            if (platform.isColliding(player)) {
                // Handle collision
                player.jump();
            }
        }
    }

    public void render() {
        // Placeholder for rendering logic
        System.out.println("Entities.Player position: (" + player.getX() + ", " + player.getY() + ")");
    }

    public static void main(String[] args) {
        Game game = new Game();

        JFrame frame = new JFrame("Basic Window");
        Window panel = new Window();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);

        while (true) {
            game.update();
            game.render();
            try {
                Thread.sleep(1000 / 60); // 60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
