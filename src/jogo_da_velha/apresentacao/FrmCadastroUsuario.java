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
import javax.swing.JPasswordField;
import jogo_da_velha.classes.Usuario;
import jogo_da_velha.dao.UsuarioDAO;

public class FrmCadastroUsuario extends JFrame {

    private JLabel jLabelNick;
    private JLabel jLabelSenha;
    private JTextField txtNick;
    private JButton btnCadastrar;
    private JButton btnVoltar;
    private JPasswordField txtSenha;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new CadastrarListener());

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new VoltarListener());

        jLabelNick.setFont(new Font("Segoe UI", 0, 18));
        jLabelNick.setText("Nick: ");

        jLabelSenha.setFont(new Font("Segoe UI", 0, 18));
        jLabelSenha.setText("Senha: ");

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelNick)
                                                        .addComponent(jLabelSenha))
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNick, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                                        .addComponent(txtSenha)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(btnCadastrar)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnVoltar)))
                                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNick)
                                        .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSenha)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCadastrar)
                                        .addComponent(btnVoltar))
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
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
