package SpaceBattle;

import SpaceBattle.UI.Board;

import javax.swing.*;
import java.awt.*;

public class Launcher extends JFrame {

    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 600;
    private final String title = "SpaceBattle by Johann";

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Launcher main = new Launcher();
            main.setVisible(true);
        });
    }

    public Launcher() {
        initUI();
    }

    private void initUI() {
        add(new Board());
        pack();
        setTitle(title);
        setSize(GAME_WIDTH, GAME_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
