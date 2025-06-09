package Classes;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Janela {
    public static void main(String[] args) {
        JFrame janela = new JFrame("2DCraft");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800, 800); // tamanho ajustado para a grade

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(20, 20)); // 20 linhas x 20 colunas

        // Criar e adicionar os 400 blocos
        for (int i = 0; i < 400; i++) {
            JPanel bloco = new JPanel();

            bloco.setBackground(Color.BLACK);

            bloco.setBorder(new LineBorder(Color.DARK_GRAY, 1)); // borda de 1 pixel

            gridPanel.add(bloco);
        }

        janela.add(gridPanel);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
