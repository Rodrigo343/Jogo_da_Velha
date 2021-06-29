package jogo_da_velha.apresentacao;

import java.awt.Dimension;
import java.awt.Font;
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

        carregaJogadoresRank();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new VoltarListener());

        btnSair.setText("Sair");
        btnSair.addActionListener(new SairListener());

        jLabelPosicao1.setFont(new Font("Segoe UI", 0, 18));
        jLabelPosicao1.setText("1- ");

        jLabelPosicao2.setFont(new Font("Segoe UI", 0, 18));
        jLabelPosicao2.setText("2- ");

        jLabelPosicao3.setFont(new Font("Segoe UI", 0, 18));
        jLabelPosicao3.setText("3- ");

        jLabelPosicao4.setFont(new Font("Segoe UI", 0, 18));
        jLabelPosicao4.setText("4- ");

        jLabelPosicao5.setFont(new Font("Segoe UI", 0, 18));
        jLabelPosicao5.setText("5- ");

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
        jLabelPontuacao5.setText(jogadoresRank[4].getPontos() + "");
        
        jLabelTitulo.setFont(new Font("Segoe UI", 0, 18));
        jLabelTitulo.setText("TOP 5");

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelTitulo)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelPosicao1)
                                                        .addComponent(jLabelPosicao3)
                                                        .addComponent(jLabelPosicao2)
                                                        .addComponent(jLabelPosicao4)
                                                        .addComponent(jLabelPosicao5))
                                                .addGap(93, 93, 93)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelNick1)
                                                        .addComponent(jLabelNick3)
                                                        .addComponent(jLabelNick2)
                                                        .addComponent(jLabelNick4)
                                                        .addComponent(jLabelNick5))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelPontuacao5)
                                        .addComponent(jLabelPontuacao4)
                                        .addComponent(jLabelPontuacao2)
                                        .addComponent(jLabelPontuacao3)
                                        .addComponent(jLabelPontuacao1))
                                .addGap(70, 70, 70))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btnVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSair)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabelTitulo)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPosicao1)
                                        .addComponent(jLabelNick1)
                                        .addComponent(jLabelPontuacao1))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPosicao2)
                                        .addComponent(jLabelNick2)
                                        .addComponent(jLabelPontuacao2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPosicao3)
                                        .addComponent(jLabelNick3)
                                        .addComponent(jLabelPontuacao3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPosicao4)
                                        .addComponent(jLabelNick4)
                                        .addComponent(jLabelPontuacao4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPosicao5)
                                        .addComponent(jLabelNick5)
                                        .addComponent(jLabelPontuacao5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnVoltar)
                                        .addComponent(btnSair))
                                .addGap(35, 35, 35))
        );

        pack();
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
