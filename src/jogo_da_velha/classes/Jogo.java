package jogo_da_velha.classes;

public class Jogo {

    String tabuleiro[][] = new String[3][3];
    boolean jogador1 = true;
    boolean jogoCompleto = false;

    public Jogo() {
    }

    public void setTabuleiro(String jogador, int linha, int coluna) {
        this.tabuleiro[linha][coluna] = jogador;
    }

    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setJogador1(boolean jogador1) {
        this.jogador1 = jogador1;
    }

    public boolean isJogador1() {
        return jogador1;
    }

    public void setJogoCompleto(boolean jogoCompleto) {
        this.jogoCompleto = jogoCompleto;
    }

    public boolean isJogoCompleto() {
        return jogoCompleto;
    }

    public void inicializaTabuleiro(String valor) {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                this.tabuleiro[linha][coluna] = "";
            }
        }
    }

    public void apertaBotao(int linha, int coluna) {
        if (this.jogador1 == true) {

            setTabuleiro("X", linha, coluna);
            this.jogador1 = false;
            verificaTabuleiro("X");
        } else {

            setTabuleiro("O", linha, coluna);
            this.jogador1 = true;
            verificaTabuleiro("O");
        }
    }

    public void verificaVencedor(int linha, int coluna) {

        if (tabuleiro[linha][coluna].equals("X")) {
            System.out.print("Jogador 1 Vencedor");

        } else {

            System.out.print("Jogador 2 Vencedor");

        }
        
        inicializaTabuleiro("");
        setJogoCompleto(true);
        setJogador1(true);
    }

    public void verificaTabuleiro(String jogador) {

        //------------------ verificando linhas -----------------
        if (tabuleiro[0][0].equals(jogador)
                && tabuleiro[0][1].equals(jogador)
                && tabuleiro[0][2].equals(jogador)) {

            verificaVencedor(0, 0);

        } else if (tabuleiro[1][0].equals(jogador)
                && tabuleiro[1][1].equals(jogador)
                && tabuleiro[1][2].equals(jogador)) {

            verificaVencedor(1, 0);

        } else if (tabuleiro[2][0].equals(jogador)
                && tabuleiro[2][1].equals(jogador)
                && tabuleiro[2][2].equals(jogador)) {

            verificaVencedor(2, 0);

            /*------------------ verificando colunas ----------------- */
        } else if (tabuleiro[0][0].equals(jogador)
                && tabuleiro[1][0].equals(jogador)
                && tabuleiro[2][0].equals(jogador)) {

            verificaVencedor(0, 0);

        } else if (tabuleiro[0][1].equals(jogador)
                && tabuleiro[1][1].equals(jogador)
                && tabuleiro[2][1].equals(jogador)) {

            verificaVencedor(0, 1);

        } else if (tabuleiro[0][2].equals(jogador)
                && tabuleiro[1][2].equals(jogador)
                && tabuleiro[2][2].equals(jogador)) {

            verificaVencedor(0, 2);

            /*------------------ verificando diagonais ----------------- */
        } else if (tabuleiro[0][0].equals(jogador)
                && tabuleiro[1][1].equals(jogador)
                && tabuleiro[2][2].equals(jogador)) {

            verificaVencedor(0, 0);

        } else if (tabuleiro[0][2].equals(jogador)
                && tabuleiro[1][1].equals(jogador)
                && tabuleiro[2][0].equals(jogador)) {

            verificaVencedor(0, 2);

            /*------------------ verificando empates ----------------- */
        } else if (!tabuleiro[0][0].equals("")
                && !tabuleiro[0][1].equals("")
                && !tabuleiro[0][2].equals("")
                && !tabuleiro[1][0].equals("")
                && !tabuleiro[1][1].equals("")
                && !tabuleiro[1][2].equals("")
                && !tabuleiro[2][0].equals("")
                && !tabuleiro[2][1].equals("")
                && !tabuleiro[2][2].equals("")) {

            System.out.print("Empate");
            inicializaTabuleiro("");
            setJogoCompleto(true);
            setJogador1(true);

        }
    }

}
