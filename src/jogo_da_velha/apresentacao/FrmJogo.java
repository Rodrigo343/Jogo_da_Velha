package jogo_da_velha.apresentacao;

import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.JToggleButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jogo_da_velha.classes.Jogo;
import jogo_da_velha.classes.Usuario;
import jogo_da_velha.dao.UsuarioDAO;

public class FrmJogo extends JFrame {

    private JToggleButton btn1;
    private JToggleButton btn2;
    private JToggleButton btn3;
    private JToggleButton btn4;
    private JToggleButton btn5;
    private JToggleButton btn6;
    private JToggleButton btn7;
    private JToggleButton btn8;
    private JToggleButton btn9;
    private JLabel jLabelNick1;
    private JLabel jLabelPontos1;
    private JLabel jLabelVitorias1;
    private JLabel jLabelDerrotas1;
    private JLabel jLabelEmpates1;
    private JLabel jLabelNick2;
    private JLabel jLabelPontos2;
    private JLabel jLabelVitorias2;
    private JLabel jLabelDerrotas2;
    private JLabel jLabelEmpates2;

    private Jogo jogo = new Jogo();
    private Usuario[] jogadoresJogo = new Usuario[2];

    public FrmJogo() {
        super("Titulo - Titulo");
        setJogadorLogado();
        carregaJogadorClasse();
        initComponents();
    }

    private void initComponents() {

        System.out.println(jogadoresJogo[0]);
        System.out.println(jogadoresJogo[1]);

        btn5 = new JToggleButton();
        btn6 = new JToggleButton();
        btn7 = new JToggleButton();
        btn8 = new JToggleButton();
        btn4 = new JToggleButton();
        btn3 = new JToggleButton();
        btn9 = new JToggleButton();
        btn1 = new JToggleButton();
        btn2 = new JToggleButton();
        jLabelNick1 = new JLabel();
        jLabelPontos1 = new JLabel();
        jLabelVitorias1 = new JLabel();
        jLabelDerrotas1 = new JLabel();
        jLabelEmpates1 = new JLabel();
        jLabelNick2 = new JLabel();
        jLabelPontos2 = new JLabel();
        jLabelVitorias2 = new JLabel();
        jLabelDerrotas2 = new JLabel();
        jLabelEmpates2 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.addActionListener(new btn1Listener());

        btn2.addActionListener(new btn2Listener());

        btn3.addActionListener(new btn3Listener());

        btn4.addActionListener(new btn4Listener());

        btn5.addActionListener(new btn5Listener());

        btn6.addActionListener(new btn6Listener());

        btn7.addActionListener(new btn7Listener());

        btn8.addActionListener(new btn8Listener());

        btn9.addActionListener(new btn9Listener());

        carregarInformacoesJogador();
        jogo.inicializaTabuleiro("");

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 109, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNick1)
                                        .addComponent(jLabelVitorias2)
                                        .addComponent(jLabelDerrotas2)
                                        .addComponent(jLabelEmpates2)
                                        .addComponent(jLabelDerrotas1)
                                        .addComponent(jLabelEmpates1)
                                        .addComponent(jLabelVitorias1)
                                        .addComponent(jLabelPontos1)
                                        .addComponent(jLabelNick2)
                                        .addComponent(jLabelPontos2))
                                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(59, Short.MAX_VALUE)
                                .addComponent(jLabelNick1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelPontos1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelVitorias1)
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabelDerrotas1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelEmpates1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(94, 94, 94))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelNick2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelPontos2)
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabelVitorias2)
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabelDerrotas2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelEmpates2)
                                                .addGap(106, 106, 106))))
        );

        pack();
    }

    //ActionListener dos botões
    private class btn1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn1Acao(e);
        }
    }

    private class btn2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn2Acao(e);
        }
    }

    private class btn3Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn3Acao(e);
        }
    }

    private class btn4Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn4Acao(e);
        }
    }

    private class btn5Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn5Acao(e);
        }
    }

    private class btn6Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn6Acao(e);
        }
    }

    private class btn7Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn7Acao(e);
        }
    }

    private class btn8Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn8Acao(e);
        }
    }

    private class btn9Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            btn9Acao(e);
        }
    }

    //Ações nos botãos
    private void btn1Acao(ActionEvent e) {

        if (jogo.isJogador1()) {
            btn1.setText("X");
        } else {
            btn1.setText("O");
        }
        btn1.setEnabled(false);
        jogo.apertaBotao(0, 0);
        jogoCompleto();
    }

    private void btn2Acao(ActionEvent e) {

        if (jogo.isJogador1()) {
            btn2.setText("X");
        } else {
            btn2.setText("O");
        }
        btn2.setEnabled(false);
        jogo.apertaBotao(0, 1);
        jogoCompleto();
    }

    private void btn3Acao(ActionEvent e) {

        if (jogo.isJogador1()) {
            btn3.setText("X");
        } else {
            btn3.setText("O");
        }
        btn3.setEnabled(false);
        jogo.apertaBotao(0, 2);
        jogoCompleto();
    }

    private void btn4Acao(ActionEvent e) {

        if (jogo.isJogador1()) {
            btn4.setText("X");
        } else {
            btn4.setText("O");
        }
        btn4.setEnabled(false);
        jogo.apertaBotao(1, 0);
        jogoCompleto();
    }

    private void btn5Acao(ActionEvent e) {

        if (jogo.isJogador1()) {
            btn5.setText("X");
        } else {
            btn5.setText("O");
        }
        btn5.setEnabled(false);
        jogo.apertaBotao(1, 1);
        jogoCompleto();
    }

    private void btn6Acao(ActionEvent e) {

        if (jogo.isJogador1()) {
            btn6.setText("X");
        } else {
            btn6.setText("O");
        }
        btn6.setEnabled(false);
        jogo.apertaBotao(1, 2);
        jogoCompleto();
    }

    private void btn7Acao(ActionEvent e) {

        if (jogo.isJogador1()) {
            btn7.setText("X");
        } else {
            btn7.setText("O");
        }
        btn7.setEnabled(false);
        jogo.apertaBotao(2, 0);
        jogoCompleto();
    }

    private void btn8Acao(ActionEvent e) {

        if (jogo.isJogador1()) {
            btn8.setText("X");
        } else {
            btn8.setText("O");
        }
        btn8.setEnabled(false);
        jogo.apertaBotao(2, 1);
        jogoCompleto();
    }

    private void btn9Acao(ActionEvent e) {

        if (jogo.isJogador1()) {
            btn9.setText("X");
        } else {
            btn9.setText("O");
        }
        btn9.setEnabled(false);
        jogo.apertaBotao(2, 2);
        jogoCompleto();
    }

    //confere se jogo esta completo
    private void jogoCompleto() {
        if (jogo.isJogoCompleto()) {
            recomecaJogo();
            jogo.setJogoCompleto(false);
        }
    }

    //pegar jogadores logados
    private void setJogadorLogado() {

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();

        usuario = dao.selecionarInformacoesJogador(FrmLogin.jogador1);
        jogadoresJogo[0] = usuario;

        usuario = dao.selecionarInformacoesJogador(FrmLogin.jogador2);
        jogadoresJogo[1] = usuario;
        dao.close();

    }

    private void carregarInformacoesJogador() {

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();

        usuario = dao.selecionarInformacoesJogador(jogadoresJogo[0].getId());
        jogadoresJogo[0] = usuario;

        usuario = dao.selecionarInformacoesJogador(jogadoresJogo[1].getId());
        jogadoresJogo[1] = usuario;
        dao.close();

        jLabelNick1.setText("Nick: " + jogadoresJogo[0].getNick());
        jLabelPontos1.setText("Pontos: " + jogadoresJogo[0].getPontos());
        jLabelVitorias1.setText("Vitórias: " + jogadoresJogo[0].getVitoria());
        jLabelDerrotas1.setText("Derrotas: " + jogadoresJogo[0].getDerrota());
        jLabelEmpates1.setText("Empates: " + jogadoresJogo[0].getEmpate());

        jLabelNick2.setText("Nick: " + jogadoresJogo[1].getNick());
        jLabelPontos2.setText("Pontos: " + jogadoresJogo[0].getPontos());
        jLabelVitorias2.setText("Vitórias: " + jogadoresJogo[1].getVitoria());
        jLabelDerrotas2.setText("Derrotas: " + jogadoresJogo[1].getDerrota());
        jLabelEmpates2.setText("Empates:" + jogadoresJogo[1].getEmpate());

    }

    private void carregaJogadorClasse() {

        jogo.setJogadores(jogadoresJogo[0], 0);
        jogo.setJogadores(jogadoresJogo[1], 1);
    }

    //resetar botões
    private void recomecaJogo() {

        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);

        btn1.setSelected(false);
        btn2.setSelected(false);
        btn3.setSelected(false);
        btn4.setSelected(false);
        btn5.setSelected(false);
        btn6.setSelected(false);
        btn7.setSelected(false);
        btn8.setSelected(false);
        btn9.setSelected(false);

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        carregarInformacoesJogador();

    }

    //Executar tela 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJogo().setVisible(true);
            }
        });
    }
    //fim 

}
