package SpaceBattle.UI;

import SpaceBattle.Launcher;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public Board() {
        initBoard();
    }

    private void initBoard() {
        setPreferredSize(new Dimension(Launcher.GAME_WIDTH, Launcher.GAME_HEIGHT));
        setMinimumSize(new Dimension(Launcher.GAME_WIDTH, Launcher.GAME_HEIGHT));
        setMaximumSize(new Dimension(Launcher.GAME_WIDTH, Launcher.GAME_HEIGHT));
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
    }
}
