package jogo_da_velha.apresentacao;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
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
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

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
    private JButton btnRank;
    private JButton btnMenuPrincipal;
    private JButton btnSair;
    private JPanel jPanelJogador1;
    private JPanel jPanelJogador2;
    private JLabel jLabelTitulo;
    private JLabel jLabelPersonagem1;
    private JLabel jLabelPersonagem2;
    private Icon jogador1;
    private Icon jogador2;
    private Icon jogador1Mes;
    private JLabel MesagemPartidaJogo;

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
        btnRank = new JButton();
        btnMenuPrincipal = new JButton();
        btnSair = new JButton();
        jPanelJogador1 = new JPanel();
        jPanelJogador2 = new JPanel();
        jLabelTitulo = new JLabel();
        jLabelPersonagem2 = new JLabel();
        jLabelPersonagem1 = new JLabel();
        MesagemPartidaJogo = new JLabel();

        jogador1 = new ImageIcon(getClass().getResource("/jogo_da_velha/img/b48tdbdff1ux.png"));
        jogador2 = new ImageIcon(getClass().getResource("/jogo_da_velha/img/659848_jeyzor_sunset-view-pixel-art-wallpaper.png"));

        jogador1Mes = new ImageIcon(getClass().getResource("/jogo_da_velha/img/b48tdbdff1ux4.png"));

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

        btnRank.setText("Rank");
        btnRank.addActionListener(new RankListener());

        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.addActionListener(new MenuListener());

        btnSair.setText("Sair");
        btnSair.addActionListener(new SairListener());

        jLabelPersonagem1.setIcon(jogador1); // NOI18N

        jLabelPersonagem2.setIcon(jogador2);

        carregarInformacoesJogador();

        jPanelJogador1.setBorder(BorderFactory.createTitledBorder(null, jogadoresJogo[0].getNick(), TitledBorder.CENTER, TitledBorder.TOP, new Font("Lucida Bright", 1, 18)));
        jPanelJogador1.setPreferredSize(new Dimension(300, 288));

        jPanelJogador2.setBorder(BorderFactory.createTitledBorder(null, jogadoresJogo[1].getNick(), TitledBorder.CENTER, TitledBorder.TOP, new Font("Lucida Bright", 1, 18)));
        jPanelJogador2.setPreferredSize(new Dimension(300, 288));

        jogo.inicializaTabuleiro("");

        setPreferredSize(new java.awt.Dimension(750, 650));
        setUndecorated(true);

        GroupLayout jPanelJogador1Layout = new javax.swing.GroupLayout(jPanelJogador1);
        jPanelJogador1.setLayout(jPanelJogador1Layout);
        jPanelJogador1Layout.setHorizontalGroup(
            jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogador1Layout.createSequentialGroup()
                .addGroup(jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJogador1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPontos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelVitorias1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEmpates1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabelDerrotas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelJogador1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabelPersonagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanelJogador1Layout.setVerticalGroup(
            jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogador1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPersonagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPontos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVitorias1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDerrotas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmpates1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout jPanelJogador2Layout = new javax.swing.GroupLayout(jPanelJogador2);
        jPanelJogador2.setLayout(jPanelJogador2Layout);
        jPanelJogador2Layout.setHorizontalGroup(
            jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogador2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabelPersonagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPontos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDerrotas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmpates2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVitorias2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanelJogador2Layout.setVerticalGroup(
            jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogador2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPersonagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPontos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVitorias2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDerrotas2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmpates2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(284, 284, 284))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRank, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanelJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRank, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();

        centralizar();
    }

    private void centralizar() {

        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamanhoTela = getSize();

        int largura = (resolucao.width - tamanhoTela.width) / 2;
        int altura = (resolucao.height - tamanhoTela.height) / 2;

        setLocation(largura, altura);
        setResizable(false);
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

        //logica do get Text usada pois o metodo setEnable tira a cor do icon
        if (jogo.isJogador1() && btn1.getText().equals("")) {
            btn1.setIcon(jogador1);

        } else if (btn1.getText().equals("")) {
            btn1.setIcon(jogador2);
        }

        btn1.setText("  ");
        jogo.apertaBotao(0, 0);
        jogoCompleto();
    }

    private void btn2Acao(ActionEvent e) {

        if (jogo.isJogador1() && btn2.getText().equals("")) {
            btn2.setIcon(jogador1);
        } else if (btn2.getText().equals("")) {
            btn2.setIcon(jogador2);
        }
        btn2.setText("  ");
        jogo.apertaBotao(0, 1);
        jogoCompleto();
    }

    private void btn3Acao(ActionEvent e) {

        if (jogo.isJogador1() && btn3.getText().equals("")) {
            btn3.setIcon(jogador1);
        } else if (btn3.getText().equals("")) {
            btn3.setIcon(jogador2);
        }
        btn3.setText("  ");
        jogo.apertaBotao(0, 2);
        jogoCompleto();
    }

    private void btn4Acao(ActionEvent e) {

        if (jogo.isJogador1() && btn4.getText().equals("")) {
            btn4.setIcon(jogador1);
        } else if (btn4.getText().equals("")) {
            btn4.setIcon(jogador2);
        }
        btn4.setText("  ");
        jogo.apertaBotao(1, 0);
        jogoCompleto();
    }

    private void btn5Acao(ActionEvent e) {

        if (jogo.isJogador1() && btn5.getText().equals("")) {
            btn5.setIcon(jogador1);
        } else if (btn5.getText().equals("")) {
            btn5.setIcon(jogador2);
        }
        btn5.setText("  ");
        jogo.apertaBotao(1, 1);
        jogoCompleto();
    }

    private void btn6Acao(ActionEvent e) {

        if (jogo.isJogador1() && btn6.getText().equals("")) {
            btn6.setIcon(jogador1);
        } else if (btn6.getText().equals("")) {
            btn6.setIcon(jogador2);
        }
        btn6.setText("  ");
        jogo.apertaBotao(1, 2);
        jogoCompleto();
    }

    private void btn7Acao(ActionEvent e) {

        if (jogo.isJogador1() && btn7.getText().equals("")) {
            btn7.setIcon(jogador1);
        } else if (btn7.getText().equals("")) {
            btn7.setIcon(jogador2);
        }
        btn7.setText("  ");
        jogo.apertaBotao(2, 0);
        jogoCompleto();
    }

    private void btn8Acao(ActionEvent e) {

        if (jogo.isJogador1() && btn8.getText().equals("")) {
            btn8.setIcon(jogador1);
        } else if (btn8.getText().equals("")) {
            btn8.setIcon(jogador2);
        }
        btn8.setText("  ");
        jogo.apertaBotao(2, 1);
        jogoCompleto();
    }

    private void btn9Acao(ActionEvent e) {

        if (jogo.isJogador1() && btn9.getText().equals("")) {
            btn9.setIcon(jogador1);
        } else if (btn9.getText().equals("")) {
            btn9.setIcon(jogador2);
        }
        btn9.setText("  ");
        jogo.apertaBotao(2, 2);
        jogoCompleto();
    }

    private class RankListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmRank ini = new FrmRank();
            ini.setVisible(true);
            setVisible(false);
        }
    }

    private class MenuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (JOptionPane.showConfirmDialog(null, "Deseja realmente voltar ao menu principal?", "Mensagem do Programa", JOptionPane.YES_NO_OPTION) == 0) {
                FrmInicio ini = new FrmInicio();
                ini.setVisible(true);
                setVisible(false);
            }
        }
    }

    private class SairListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Mensagem do Programa", JOptionPane.YES_NO_OPTION) == 0) {
                System.exit(0);
            }
        }
    }

    private void definirMensagemVitoria(String mensagem, Icon imagem) {
        MesagemPartidaJogo = new JLabel(mensagem, imagem, SwingConstants.CENTER);
        MesagemPartidaJogo.setHorizontalTextPosition(SwingConstants.CENTER);
        MesagemPartidaJogo.setVerticalTextPosition(SwingConstants.TOP);
    }

    //confere se jogo esta completo
    private void jogoCompleto() {

        if (jogo.isJogoCompleto()) {

            if (jogo.getVencedor().equals("X")) {
                definirMensagemVitoria((jogadoresJogo[0].getNick() + " é o Vencedor!"), jogador1Mes);
                JOptionPane.showMessageDialog(null, MesagemPartidaJogo, "Ganhador da rodada", JOptionPane.UNDEFINED_CONDITION);
                jogo.setVencedor("");
            } else if (jogo.getVencedor().equals("O")) {
                 definirMensagemVitoria((jogadoresJogo[1].getNick() + " é o Vencedor!"), jogador1Mes);
                JOptionPane.showMessageDialog(null, MesagemPartidaJogo, "Ganhador da rodada", JOptionPane.UNDEFINED_CONDITION);
                jogo.setVencedor("");
            } else {
                definirMensagemVitoria("Empate", jogador1Mes);
                JOptionPane.showMessageDialog(null, MesagemPartidaJogo, "Ganhador da rodada", JOptionPane.UNDEFINED_CONDITION);
                jogo.setVencedor("");
            }

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
        jLabelPontos2.setText("Pontos: " + jogadoresJogo[1].getPontos());
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

        btn1.setIcon(null);
        btn2.setIcon(null);
        btn3.setIcon(null);
        btn4.setIcon(null);
        btn5.setIcon(null);
        btn6.setIcon(null);
        btn7.setIcon(null);
        btn8.setIcon(null);
        btn9.setIcon(null);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

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
