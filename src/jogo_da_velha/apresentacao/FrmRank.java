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
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import jogo_da_velha.classes.Usuario;
import jogo_da_velha.dao.UsuarioDAO;

public class FrmRank extends JFrame {

    private JLabel jLabelPosicao1;
    private JLabel jLabelPosicao2;
    private JLabel jLabelPosicao3;
    private JLabel jLabelPosicao4;
    private JLabel jLabelPosicao5;
    private JLabel jLabelNick1;
    private JLabel jLabelNick2;
    private JLabel jLabelNick3;
    private JLabel jLabelNick4;
    private JLabel jLabelNick5;
    private JLabel jLabelPontuacao1;
    private JLabel jLabelPontuacao2;
    private JLabel jLabelPontuacao3;
    private JLabel jLabelPontuacao4;
    private JLabel jLabelPontuacao5;
    private JLabel jLabelTitulo;
    private JButton btnSair;
    private JButton btnVoltar;

    private JLabel jLabelNickFixo;
    private JLabel jLabelPontosFixo;
    private JLabel jLabelPosicaoFixo;
    private JPanel jPanelRank;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JSeparator jSeparator5;
    private JLabel jLabelImg;

    private Usuario[] jogadoresRank = new Usuario[5];

    public FrmRank() {
        super("Titulo - Rank");

        initComponents();
    }

    private void initComponents() {

        jLabelPosicao1 = new JLabel();
        jLabelPosicao2 = new JLabel();
        jLabelPosicao3 = new JLabel();
        jLabelPosicao4 = new JLabel();
        jLabelPosicao5 = new JLabel();
        jLabelNick1 = new JLabel();
        jLabelNick2 = new JLabel();
        jLabelNick3 = new JLabel();
        jLabelNick4 = new JLabel();
        jLabelNick5 = new JLabel();
        jLabelPontuacao1 = new JLabel();
        jLabelPontuacao2 = new JLabel();
        jLabelPontuacao3 = new JLabel();
        jLabelPontuacao4 = new JLabel();
        jLabelPontuacao5 = new JLabel();
        jLabelTitulo = new JLabel();
        btnSair = new JButton();
        btnVoltar = new JButton();

        jLabelPosicao1 = new JLabel();
        jLabelPosicao1 = new JLabel();
        jLabelPosicao1 = new JLabel();
        jPanelRank = new JPanel();
        jSeparator1 = new JSeparator();
        jSeparator2 = new JSeparator();
        jSeparator3 = new JSeparator();
        jSeparator4 = new JSeparator();
        jSeparator5 = new JSeparator();
        jLabelImg = new JLabel();
        jLabelPontosFixo = new JLabel();
        jLabelPosicaoFixo = new JLabel();
        jLabelNickFixo = new JLabel();

        carregaJogadoresRank();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new VoltarListener());

        btnSair.setText("Sair");
        btnSair.addActionListener(new SairListener());

        jLabelTitulo.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabelTitulo.setText("X-O CONFLICT");

        jPanelRank.setBorder(BorderFactory.createTitledBorder(null, "Rank", TitledBorder.CENTER, TitledBorder.TOP, new Font("Lucida Bright", 1, 24)));

        jLabelPosicao1.setFont(new Font("Segoe UI", 0, 18));
        jLabelPosicao1.setText("1º ");

        jLabelPosicao2.setFont(new Font("Segoe UI", 0, 18));
        jLabelPosicao2.setText("2º ");

        jLabelPosicao3.setFont(new Font("Segoe UI", 0, 18));
        jLabelPosicao3.setText("3º ");

        jLabelPosicao4.setFont(new Font("Segoe UI", 0, 18));
        jLabelPosicao4.setText("4º ");

        jLabelPosicao5.setFont(new Font("Segoe UI", 0, 18));
        jLabelPosicao5.setText("5º ");

        jLabelNick1.setFont(new Font("Segoe UI", 0, 18));
        jLabelNick1.setText(jogadoresRank[0].getNick());

        jLabelNick2.setFont(new Font("Segoe UI", 0, 18));
        jLabelNick2.setText(jogadoresRank[1].getNick());

        jLabelNick3.setFont(new Font("Segoe UI", 0, 18));
        jLabelNick3.setText(jogadoresRank[2].getNick());

        jLabelNick4.setFont(new Font("Segoe UI", 0, 18));
        jLabelNick4.setText(jogadoresRank[3].getNick());

        jLabelNick5.setFont(new Font("Segoe UI", 0, 18));
        jLabelNick5.setText(jogadoresRank[4].getNick());

        jLabelPontuacao1.setFont(new Font("Segoe UI", 0, 18));
        jLabelPontuacao1.setText(jogadoresRank[0].getPontos() + "");

        jLabelPontuacao2.setFont(new Font("Segoe UI", 0, 18));
        jLabelPontuacao2.setText(jogadoresRank[1].getPontos() + "");

        jLabelPontuacao3.setFont(new Font("Segoe UI", 0, 18));
        jLabelPontuacao3.setText(jogadoresRank[2].getPontos() + "");

        jLabelPontuacao4.setFont(new Font("Segoe UI", 0, 18));
        jLabelPontuacao4.setText(jogadoresRank[3].getPontos() + "");

        jLabelPontuacao5.setFont(new Font("Segoe UI", 0, 18));
          jLabelPosicao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPontuacao5.setText(jogadoresRank[4].getPontos() + "");

        jLabelPosicaoFixo.setFont(new Font("Lucida Bright", 1, 18)); // NOI18N
        jLabelPosicaoFixo.setText("Posição");

        jLabelNickFixo.setFont(new Font("Lucida Bright", 1, 18)); // NOI18N
        jLabelNickFixo.setText("Nick");

        jLabelPontosFixo.setFont(new Font("Lucida Bright", 1, 18)); // NOI18N
        jLabelPontosFixo.setText("Pontos");

        jLabelImg.setIcon(new ImageIcon(getClass().getResource("/jogo_da_velha/img/b48tdbdff1ux.png")));

        setPreferredSize(new java.awt.Dimension(750, 650));
        setUndecorated(true);

        GroupLayout jPanelRankLayout = new javax.swing.GroupLayout(jPanelRank);
        jPanelRank.setLayout(jPanelRankLayout);
        jPanelRankLayout.setHorizontalGroup(
            jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRankLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelPosicaoFixo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNickFixo)
                .addGap(199, 199, 199)
                .addComponent(jLabelPontosFixo)
                .addGap(78, 78, 78))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addGroup(jPanelRankLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPosicao2)
                    .addComponent(jLabelPosicao1)
                    .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelPosicao3)
                        .addComponent(jLabelPosicao4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRankLayout.createSequentialGroup()
                            .addComponent(jLabelNick1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(102, 102, 102))
                        .addGroup(jPanelRankLayout.createSequentialGroup()
                            .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNick3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNick4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(103, 103, 103)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRankLayout.createSequentialGroup()
                        .addComponent(jLabelNick2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
                .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPontuacao2)
                    .addComponent(jLabelPontuacao1)
                    .addComponent(jLabelPontuacao3)
                    .addComponent(jLabelPontuacao4))
                .addGap(73, 73, 73))
            .addComponent(jSeparator5)
            .addGroup(jPanelRankLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelPosicao5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jLabelNick5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabelPontuacao5)
                .addGap(121, 121, 121))
        );
        jPanelRankLayout.setVerticalGroup(
            jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRankLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPosicaoFixo)
                    .addComponent(jLabelNickFixo)
                    .addComponent(jLabelPontosFixo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPosicao1)
                    .addComponent(jLabelPontuacao1)
                    .addComponent(jLabelNick1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNick2)
                    .addComponent(jLabelPontuacao2)
                    .addComponent(jLabelPosicao2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPosicao3)
                    .addComponent(jLabelNick3)
                    .addComponent(jLabelPontuacao3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNick4)
                    .addComponent(jLabelPontuacao4)
                    .addComponent(jLabelPosicao4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPosicao5)
                    .addComponent(jLabelNick5)
                    .addComponent(jLabelPontuacao5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 284, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(284, 284, 284))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelRank, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelRank, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
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

    private void carregaJogadoresRank() {

        UsuarioDAO dao = new UsuarioDAO();
        jogadoresRank = dao.listarRank();
        dao.close();

    }

    //ActionListener dos botões
    private class VoltarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmJogo ini = new FrmJogo();
            ini.setVisible(true);
            setVisible(false);
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

    //Executar tela 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRank().setVisible(true);
            }
        });
    }
    //fim 

}
