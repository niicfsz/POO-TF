package Classes;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private ImageIcon icon;

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
    }
}
