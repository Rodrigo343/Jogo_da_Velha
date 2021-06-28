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
import javax.swing.JPasswordField;
import jogo_da_velha.classes.Usuario;
import jogo_da_velha.dao.UsuarioDAO;
import jogo_da_velha.apresentacao.FrmJogo;

public class FrmLogin extends JFrame {

    public static int id1;
    public static int id2;

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
    private JPanel jPanelJogador1;
    private JPanel jPanelJogador2;

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
        jPanelJogador1 = new JPanel();
        jPanelJogador2 = new JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new CadastrarListener());

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new VoltarListener());

        jLabelNick1.setFont(new Font("Segoe UI", 0, 18));
        jLabelNick1.setText("Nick: ");

        jLabelSenha1.setFont(new Font("Segoe UI", 0, 18));
        jLabelSenha1.setText("Senha: ");

        jLabelNick2.setFont(new Font("Segoe UI", 0, 18));
        jLabelNick2.setText("Nick: ");

        jLabelSenha2.setFont(new Font("Segoe UI", 0, 18));
        jLabelSenha2.setText("Senha: ");

        jPanelJogador1.setBorder(BorderFactory.createTitledBorder("Jogador 1"));
        jPanelJogador2.setBorder(BorderFactory.createTitledBorder("Jogador 2"));

        GroupLayout jPanelJogador1Layout = new javax.swing.GroupLayout(jPanelJogador1);
        jPanelJogador1.setLayout(jPanelJogador1Layout);
        jPanelJogador1Layout.setHorizontalGroup(
                jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelJogador1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelSenha1)
                                        .addComponent(jLabelNick1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNick1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanelJogador1Layout.setVerticalGroup(
                jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador1Layout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addGroup(jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNick1)
                                        .addComponent(txtNick1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSenha1)
                                        .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
        );

        GroupLayout jPanelJogador2Layout = new javax.swing.GroupLayout(jPanelJogador2);
        jPanelJogador2.setLayout(jPanelJogador2Layout);
        jPanelJogador2Layout.setHorizontalGroup(
                jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelJogador2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNick2)
                                        .addComponent(jLabelSenha2))
                                .addGap(44, 44, 44)
                                .addGroup(jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNick2)
                                        .addComponent(txtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJogador2Layout.setVerticalGroup(
                jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelJogador2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNick2)
                                        .addComponent(txtNick2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSenha2)
                                        .addComponent(txtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanelJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanelJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
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

                        usuario = dao.selecionarJogador(txtNick1.getText(), String.copyValueOf(txtSenha1.getPassword()));
                        id1 = usuario.getId();

                        usuario = dao.selecionarJogador(txtNick2.getText(), String.copyValueOf(txtSenha2.getPassword()));
                        id2 = usuario.getId();

                        FrmJogo ini = new FrmJogo();
                        ini.setVisible(true);
                        setVisible(false);
                        dao.close();
                        return;
                    }

                    JOptionPane.showMessageDialog(null, "Nick e ou senha do jogador 2 inválidos\n Ou login igual ao do jogador 1!");

                } else {
                    JOptionPane.showMessageDialog(null, "Nick e ou senha do jogador 1 inválidos!");
                }

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
