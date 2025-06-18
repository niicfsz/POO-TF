package Classes;

import javax.swing.*;

public enum BlocoTipo {
    FUNDO("Fundo.png"),
    TERRA("Terra.png"),
    GRAMA("Grama.png"),
    FLORES("Flores.png"),
    TIJOLOS("Tijolos.png"),
    AVATAR("Avatar.png");

    private final String nomeImagem;

    BlocoTipo(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

    public ImageIcon getIcon() {
        return new ImageIcon(getClass().getResource("/imagens/" + nomeImagem));
    }
}
