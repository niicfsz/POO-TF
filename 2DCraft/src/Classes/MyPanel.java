package Classes;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private ImageIcon icon;

    public MyPanel(ImageIcon icon) {
        this.icon = icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (icon != null) {
            g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    }
}
