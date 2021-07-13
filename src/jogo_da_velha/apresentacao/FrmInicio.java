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
import jogo_da_velha.classes.Usuario;
import jogo_da_velha.dao.UsuarioDAO;
import jogo_da_velha.apresentacao.FrmJogo;

public class FrmInicio extends JFrame {

    private JButton btnCadastro;
    private JButton btnLogin;
    private JButton btnSair;
    private JButton btnInfo;
    private JLabel jLabelTitulo;
    private JLabel jLabelImg;

    public FrmInicio() {
        super("Titulo - Inicio");
        initComponents();
    }

    private void initComponents() {

        btnCadastro = new JButton();
        btnLogin = new JButton();
        btnSair = new JButton();
        btnInfo = new JButton();
        jLabelTitulo = new JLabel();
        jLabelImg = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new Font("Lucida Bright", 1, 24)); // NOI18N
        jLabelTitulo.setText("X-O CONFLICT");

        jLabelImg.setIcon(new ImageIcon(getClass().getResource("/jogo_da_velha/img/659848_jeyzor_sunset-view-pixel-art-wallpaper.png")));

        btnCadastro.setText("Cadastro");
        btnCadastro.addActionListener(new CadastrarListener());

        btnLogin.setText("Login");
        btnLogin.addActionListener(new LogarListener());

        btnInfo.setText("Informações");
        btnInfo.addActionListener(new InfoListener());

        btnSair.setText("Sair");
        btnSair.addActionListener(new SairListener());

        setPreferredSize(new java.awt.Dimension(750, 650));
        setUndecorated(true);

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private class CadastrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmCadastroUsuario ini = new FrmCadastroUsuario();
            ini.setVisible(true);
            setVisible(false);
        }
    }

    private class LogarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrmLogin ini = new FrmLogin();
            ini.setVisible(true);
            setVisible(false);
        }
    }

    private class InfoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

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
                new FrmInicio().setVisible(true);
            }
        });
    }
    //fim 

}
