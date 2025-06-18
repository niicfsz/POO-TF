package Classes;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class JogoGrid {
    private MyPanel[] blocos = new MyPanel[20*20];
    private int posicao;

    public JogoGrid() {
        JFrame frame = new JFrame("2DCraft");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(20,20));

        for(int i = 0; i < blocos.length; i++) {
            blocos[i] = new MyPanel(BlocoTipo.FUNDO.getIcon());
            frame.add(blocos[i]);
        }

        blocos[posicao].setIcon(BlocoTipo.AVATAR.getIcon());

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JogoGrid::new);
    }
}
