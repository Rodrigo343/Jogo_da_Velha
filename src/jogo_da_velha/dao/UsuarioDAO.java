package jogo_da_velha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jogo_da_velha.util.Conexao;
import jogo_da_velha.classes.Usuario;

public class UsuarioDAO {

    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public UsuarioDAO() {
        con = new Conexao().getConexao();
    }

    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt("id"), rs.getString("nome"), rs.getString("senha"), rs.getInt("vitoria"), rs.getInt("derrota"), rs.getInt("empate")
                );
                usuarios.add(usuario);
            }

        } catch (SQLException erro) {
            erro.printStackTrace();
        }

        return usuarios;
    }

    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO usuario VALUES(?, ?, ?, ?, ?, ?)";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getId());
            stmt.setString(2, usuario.getNick());
            stmt.setString(3, usuario.getSenha());
            stmt.setInt(4, usuario.getVitoria());
            stmt.setInt(5, usuario.getDerrota());
            stmt.setInt(6, usuario.getEmpate());
            stmt.execute();
        } catch (SQLException erro) {
            erro.printStackTrace();
        }
    }

    public void vitoria(Usuario usuario) {
        String sql = "UPDATE usuario SET vitoria = ? WHERE  id = ?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getPontos());
            stmt.setInt(2, usuario.getId());
            stmt.execute();
        } catch (SQLException erro) {
            erro.printStackTrace();
        }
    }

    public void derrota(Usuario usuario) {
        String sql = "UPDATE usuario SET derrota = ?  WHERE id = ?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getPontos());
            stmt.setInt(2, usuario.getId());
            stmt.execute();
        } catch (SQLException erro) {
            erro.printStackTrace();
        }
    }

    public void empate(Usuario usuario) {
        String sql = "UPDATE usuario SET empate = ? WHERE id = ?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getEmpate());
            stmt.execute();
        } catch (SQLException erro) {
            erro.printStackTrace();
        }
    }

    public Usuario selecionarJogador(String nick, String senha) {
        Usuario usuario = null;
        String sql = "SELECT id, nome, vitoria, derrota, empate FROM usuario WHERE nome = ? AND senha = ?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nick);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                usuario = new Usuario(
                        rs.getInt("id"), rs.getString("nome"), rs.getInt("vitoria"), rs.getInt("derrota"), rs.getInt("empate")
                );
            }

        } catch (SQLException erro) {
            erro.printStackTrace();
        }

        return usuario;
    }

    public Usuario selecionarInformacoesJogador(int id) {
        Usuario usuario = null;
        String sql = "SELECT id FROM usuario WHERE id = ?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                usuario = new Usuario(
                        rs.getInt("id")
                );
            }

        } catch (SQLException erro) {
            erro.printStackTrace();
        }

        return usuario;
    }

    public int lastId() {
        int id = 0;
        String sql = "SELECT max(id) FROM usuario";

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            rs.next();

            id = rs.getInt(1);
        } catch (SQLException erro) {
            erro.printStackTrace();
        }

        return id + 1;
    }

    public boolean login(String email, String senha) {

        boolean validacao = false;
        String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            validacao = rs.next();
            return validacao;

        } catch (SQLException erro) {
            erro.printStackTrace();
        }

        return false;

    }

    public boolean nomeExistente(String nome) {
        List<Usuario> usuariosNome = new ArrayList<>();
        String sql = "SELECT nome FROM usuario";

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getString("nome")
                );
                usuariosNome.add(usuario);
            }

        } catch (SQLException erro) {
            erro.printStackTrace();
        }

        for (Usuario u : usuariosNome) {
            if (nome.equals(u.getNick())) {
                return true;
            }
        }

        return false;
    }

    public void close() {
        try {
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException erro) {
            erro.printStackTrace();
        }
    }
}
