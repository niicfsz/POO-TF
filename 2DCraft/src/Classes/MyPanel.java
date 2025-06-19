package Classes;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private ImageIcon icon;
    private ImageIcon sobrepostoIcon;

    public MyPanel(ImageIcon icon) {
        this.icon = icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public void setSobrepostoIcon(ImageIcon icon) {
        this.sobrepostoIcon = icon;
        repaint();
    }

    public void removerSobreposto(){
        this.sobrepostoIcon = null;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (icon != null) {
            g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
        if(sobrepostoIcon != null){
            g.drawImage(sobrepostoIcon.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    }
}
