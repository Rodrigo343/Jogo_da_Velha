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
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import jogo_da_velha.classes.Usuario;
import jogo_da_velha.dao.UsuarioDAO;

public class FrmCadastroUsuario extends JFrame {

    private JLabel jLabelNick;
    private JLabel jLabelSenha;
    private JTextField txtNick;
    private JButton btnCadastrar;
    private JButton btnVoltar;
    private JPasswordField txtSenha;
    private JPanel jPanelCadastro;
    private JLabel jLabelImgEsquerda;
    private JLabel jLabelImgDireita;
    private JLabel jLabelTitulo;

    public FrmCadastroUsuario() {
        super("Titulo - Cadastro");
        initComponents();
    }

    private void initComponents() {

        jLabelNick = new JLabel();
        jLabelSenha = new JLabel();
        txtNick = new JTextField();
        txtSenha = new JPasswordField();
        btnCadastrar = new JButton();
        btnVoltar = new JButton();
        jPanelCadastro = new JPanel();
        jLabelImgEsquerda = new JLabel();
        jLabelImgDireita = new JLabel();
        jLabelTitulo = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new CadastrarListener());

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new VoltarListener());

        jLabelNick.setFont(new Font("Segoe UI", 0, 18));
        jLabelNick.setText("Nick: ");

        jLabelSenha.setFont(new Font("Segoe UI", 0, 18));
        jLabelSenha.setText("Senha: ");

        jLabelTitulo.setFont(new Font("Lucida Bright", 1, 24)); // NOI18N
        jLabelTitulo.setText("X-O CONFLICT");

        jLabelImgEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo_da_velha/img/659848_jeyzor_sunset-view-pixel-art-wallpaper.png")));

        jLabelImgDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo_da_velha/img/659848_jeyzor_sunset-view-pixel-art-wallpaper.png")));

        jPanelCadastro.setBorder(BorderFactory.createTitledBorder(null, "Cadastro", TitledBorder.CENTER, TitledBorder.TOP, new Font("Lucida Bright", 1, 24)));

        setPreferredSize(new java.awt.Dimension(750, 650));
        setUndecorated(true);

        GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtNick, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabelNick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelNick)
                .addGap(18, 18, 18)
                .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabelSenha)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelImgEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelTitulo)
                                .addGap(84, 84, 84)))))
                .addComponent(jLabelImgDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
            .addComponent(jLabelImgDireita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelImgEsquerda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        txtNick.setText("");
        txtSenha.setText("");
    }

    private boolean verificarCampos() {
        if (txtNick.getText().equals("") || String.copyValueOf(txtSenha.getPassword()).equals("")) {
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

                if (dao.nomeExistente(txtNick.getText())) {
                    JOptionPane.showMessageDialog(null, "Nick ja existente!", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Usuario usuario = new Usuario(
                        dao.lastId(), txtNick.getText(), String.copyValueOf(txtSenha.getPassword())
                );

                dao.inserir(usuario);
                dao.close();

                JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!", "Mensagem de Sucesso", JOptionPane.INFORMATION_MESSAGE);
                limpar();

                FrmLogin ini = new FrmLogin();
                ini.setVisible(true);
                setVisible(false);
                return;

            } else {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    //Executar tela 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroUsuario().setVisible(true);
            }
        });
    }
    //fim 

}
