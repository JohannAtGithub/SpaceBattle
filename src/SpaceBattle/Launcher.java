package SpaceBattle;

import SpaceBattle.UI.Frame;

import java.awt.*;

public class Launcher {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Frame main = new Frame();
            main.setVisible(true);
        });
    }
}
