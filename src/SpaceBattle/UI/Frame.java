package SpaceBattle.UI;

import javax.swing.*;

public class Frame extends JFrame {

    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 600;
    private final String title = "SpaceBattle by Johann";

    public Frame() {
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
