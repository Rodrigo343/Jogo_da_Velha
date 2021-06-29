package jogo_da_velha.classes;

import jogo_da_velha.dao.UsuarioDAO;
import jogo_da_velha.classes.Usuario;

public class Jogo {

    private String tabuleiro[][] = new String[3][3];
    private boolean jogador1 = true;
    private boolean jogoCompleto = false;
    private Usuario[] jogadores = new Usuario[2];

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

    public void setJogadores(Usuario jogadores, int pos) {
        this.jogadores[pos] = jogadores;
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

    private void verificaTabuleiro(String jogador) {

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

            empate();
        }
    }

    private void verificaVencedor(int linha, int coluna) {

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();

        if (tabuleiro[linha][coluna].equals("X")) {
            System.out.print("Jogador 1 Vencedor");

            jogadores[0].setVitoria((jogadores[0].getVitoria() + 1));
            dao.vitoria(jogadores[0]);
            jogadores[0].setPontos((jogadores[0].getPontos() + 2));
            dao.vitoria(jogadores[0]);

            jogadores[1].setDerrota((jogadores[1].getDerrota() + 1));
            jogadores[1].setPontos((jogadores[1].getPontos()- 2));
            dao.derrota(jogadores[1]);
        } else {

            System.out.print("Jogador 2 Vencedor");

            jogadores[0].setDerrota((jogadores[0].getDerrota() + 1));
            jogadores[0].setPontos((jogadores[0].getPontos() - 2));
            dao.derrota(jogadores[0]);

            jogadores[1].setVitoria((jogadores[1].getVitoria() + 1));
            jogadores[1].setPontos((jogadores[1].getPontos()+ 2));
            dao.vitoria(jogadores[1]);

        }
        inicializaTabuleiro("");
        setJogoCompleto(true);
        setJogador1(true);
    }

    private void empate() {

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();

        jogadores[0].setEmpate((jogadores[0].getEmpate() + 1));
        jogadores[0].setPontos((jogadores[0].getPontos() + 1));
        dao.empate(jogadores[0]);

        jogadores[1].setEmpate((jogadores[1].getEmpate() + 1));
        jogadores[1].setPontos((jogadores[1].getPontos()+ 1));
        dao.empate(jogadores[1]);

        System.out.print("Empate");
        inicializaTabuleiro("");
        setJogoCompleto(true);
        setJogador1(true);
    }

}
