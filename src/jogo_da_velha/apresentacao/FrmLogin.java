package jogo_da_velha.apresentacao;

import java.awt.Color;
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
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import jogo_da_velha.classes.Usuario;
import jogo_da_velha.dao.UsuarioDAO;
import jogo_da_velha.apresentacao.FrmJogo;

public class FrmLogin extends JFrame {

    public static int jogador1;
    public static int jogador2;

    private JLabel jLabelNick1;
    private JLabel jLabelSenha1;
    private JLabel jLabelNick2;
    private JLabel jLabelSenha2;
    private JTextField txtNick1;
    private JTextField txtNick2;
    private JButton btnCadastrar;
    private JButton btnVoltar;
    private JPasswordField txtSenha1;
    private JPasswordField txtSenha2;
    private JPanel jPanelLogin;
    private JLabel jLabelTitulo;
    private JLabel jLabelImgEsquerda;
    private JLabel jLabelImgDireita;
    private JLabel jLabelLinha;
    private JLabel jLabelJogador1;
    private JLabel jLabelJogador2;

    public FrmLogin() {
        super("Titulo - Login");
        initComponents();
    }

    private void initComponents() {

        jLabelNick1 = new JLabel();
        jLabelSenha1 = new JLabel();
        jLabelNick2 = new JLabel();
        jLabelSenha2 = new JLabel();
        txtNick1 = new JTextField();
        txtNick2 = new JTextField();
        txtSenha1 = new JPasswordField();
        txtSenha2 = new JPasswordField();
        btnCadastrar = new JButton();
        btnVoltar = new JButton();
        jPanelLogin = new JPanel();
        jLabelTitulo = new JLabel();
        jLabelImgEsquerda = new JLabel();
        jLabelImgDireita = new JLabel();
        jLabelLinha = new JLabel();
        jLabelJogador1 = new JLabel();
        jLabelJogador2 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrar.setText("Logar");
        btnCadastrar.addActionListener(new CadastrarListener());

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new VoltarListener());

        jLabelNick1.setFont(new Font("Lucida Bright", 1, 16));
        jLabelNick1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelNick1.setText("Nick: ");

        jLabelSenha1.setFont(new Font("Lucida Bright", 1, 16));
        jLabelSenha1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelSenha1.setText("Senha: ");

        jLabelNick2.setFont(new Font("Lucida Bright", 1, 16));
        jLabelNick2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelNick2.setText("Nick: ");

        jLabelSenha2.setFont(new Font("Lucida Bright", 1, 16));
        jLabelSenha2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelSenha2.setText("Senha: ");

        jLabelJogador1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); 
        jLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelJogador1.setText("Jogador 1");

        jLabelJogador2.setFont(new java.awt.Font("Lucida Bright", 1, 18));
        jLabelJogador2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelJogador2.setText("Jogador 2");

        jLabelTitulo.setFont(new java.awt.Font("Lucida Bright", 1, 24));
        jLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTitulo.setText("X-O CONFLICT");

        
        jPanelLogin.setBorder(BorderFactory.createTitledBorder(null, "Login", TitledBorder.CENTER, TitledBorder.TOP, new Font("Lucida Bright", 1, 24)));
        jPanelLogin.setPreferredSize(new Dimension(300, 416));
                
        jLabelLinha.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        jLabelImgEsquerda.setIcon(new ImageIcon(getClass().getResource("/jogo_da_velha/img/659848_jeyzor_sunset-view-pixel-art-wallpaper.png")));

        jLabelImgDireita.setIcon(new ImageIcon(getClass().getResource("/jogo_da_velha/img/659848_jeyzor_sunset-view-pixel-art-wallpaper.png")));

        setPreferredSize(new java.awt.Dimension(750, 650));
        setUndecorated(true);

        GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNick2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNick2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelLoginLayout.createSequentialGroup()
                            .addGap(101, 101, 101)
                            .addComponent(jLabelJogador1))
                        .addGroup(jPanelLoginLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNick1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNick1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelLoginLayout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabelJogador2))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(jLabelLinha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelJogador1)
                .addGap(18, 18, 18)
                .addComponent(jLabelNick1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNick1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSenha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelLinha)
                .addGap(20, 20, 20)
                .addComponent(jLabelJogador2)
                .addGap(18, 18, 18)
                .addComponent(jLabelNick2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNick2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSenha2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelImgEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTitulo)
                        .addGap(84, 84, 84)))
                .addComponent(jLabelImgDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImgEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addComponent(jLabelImgDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void limpar() {
        txtNick1.setText("");
        txtNick2.setText("");
        txtSenha1.setText("");
        txtSenha2.setText("");
    }

    private boolean verificarCampos() {
        if (txtNick1.getText().equals("") || txtNick2.getText().equals("") || String.copyValueOf(txtSenha1.getPassword()).equals("") || String.copyValueOf(txtSenha2.getPassword()).equals("")) {
            return false;
        }

        return true;
    }

    //ActionListener dos botões
    private class VoltarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmInicio ini = new FrmInicio();
            ini.setVisible(true);
            setVisible(false);
        }
    }

    private class CadastrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (verificarCampos()) {
                UsuarioDAO dao = new UsuarioDAO();

                if (dao.login(txtNick1.getText(), String.copyValueOf(txtSenha1.getPassword()))) {

                    if (dao.login(txtNick2.getText(), String.copyValueOf(txtSenha2.getPassword()))
                            && !txtNick1.getText().equals(txtNick2.getText())) {

                        Usuario usuario = new Usuario();

                        usuario = dao.selecionarJogadorId(txtNick1.getText(), String.copyValueOf(txtSenha1.getPassword()));
                        jogador1 = usuario.getId();

                        usuario = dao.selecionarJogadorId(txtNick2.getText(), String.copyValueOf(txtSenha2.getPassword()));
                        jogador2 = usuario.getId();
                        dao.close();

                        FrmJogo ini = new FrmJogo();
                        ini.setVisible(true);
                        setVisible(false);
                        return;
                    }

                    JOptionPane.showMessageDialog(null, "Nick e ou senha do jogador 2 inválidos\n Ou login igual ao do jogador 1!");
                } else {

                    JOptionPane.showMessageDialog(null, "Nick e ou senha do jogador 1 inválidos!");
                }

                dao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    //Executar tela 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }
    //fim 

}
