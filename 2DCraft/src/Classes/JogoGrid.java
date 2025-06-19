package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JogoGrid implements KeyListener {
    private MyPanel[] blocos = new MyPanel[20*20];
    private int posicao = 0;
    private int tipoIndex = 0;

    public JogoGrid() {
        JFrame frame = new JFrame("2DCraft");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(20,20));

        for(int i = 0; i < blocos.length; i++) {
            blocos[i] = new MyPanel(BlocoTipo.FUNDO.getIcon());
            frame.add(blocos[i]);
        }

        blocos[posicao].setSobrepostoIcon(BlocoTipo.AVATAR.getIcon());

        frame.addKeyListener(this);
        frame.setFocusable(true);
        frame.requestFocusInWindow();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void moverAvatar(int novaPosicao){
        if(novaPosicao < 0 || novaPosicao >= blocos.length){
            return;
        }

        blocos[posicao].removerSobreposto();

        posicao = novaPosicao;

        blocos[posicao].setSobrepostoIcon(BlocoTipo.AVATAR.getIcon());
    }

    private void mudarBloco(){
        BlocoTipo[] blocosEnum = BlocoTipo.values();

        do {
            tipoIndex = (tipoIndex + 1) % blocosEnum.length;
        } while (blocosEnum[tipoIndex] == BlocoTipo.AVATAR);

        blocos[posicao].setIcon(blocosEnum[tipoIndex].getIcon());

        blocos[posicao].setSobrepostoIcon(BlocoTipo.AVATAR.getIcon());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int linha = posicao / 20;
        int coluna = posicao % 20;

        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                if (coluna > 0) moverAvatar(posicao - 1);
                tipoIndex = 0;
                break;
            case KeyEvent.VK_RIGHT:
                if (coluna < 19) moverAvatar(posicao + 1);
                tipoIndex = 0;
                break;
            case KeyEvent.VK_UP:
                if (linha > 0) moverAvatar(posicao - 20);
                tipoIndex = 0;
                break;
            case KeyEvent.VK_DOWN:
                if (linha < 19) moverAvatar(posicao + 20);
                tipoIndex = 0;
                break;
            case KeyEvent.VK_SPACE:
                mudarBloco();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JogoGrid::new);
    }
}
