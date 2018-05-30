package SpaceBattle.UI;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public Board() {
        initBoard();
    }

    private void initBoard() {
        setPreferredSize(new Dimension(Frame.GAME_WIDTH, Frame.GAME_HEIGHT));
        setMinimumSize(new Dimension(Frame.GAME_WIDTH, Frame.GAME_HEIGHT));
        setMaximumSize(new Dimension(Frame.GAME_WIDTH, Frame.GAME_HEIGHT));
        setBackground(Color.GRAY);
        setDoubleBuffered(true);
    }
}
