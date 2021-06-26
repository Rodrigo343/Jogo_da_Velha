package jogo_da_velha.classes;

import com.sun.xml.internal.ws.api.ha.StickyFeature;


public class Usuario {

    private String nick;
    private String senha;
    private int id;
    private int vitoria;
    private int derrota;
    private int empate;
    
    public Usuario() {
        
    }
    
    public Usuario(int pontos) {
        
    }
    
    public Usuario(int id, String Nick, String senha,int vitorias, int derotas, int empates) {
        setId(id);
        setNick(Nick);
        setSenha(senha);
        setVitoria(vitorias);
        setDerrota(vitorias);
        setEmpate(vitorias);
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
        
    public String getSenha() {
        return senha;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }
        
    public int getVitoria() {
        return vitoria;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }
        
    public int getDerrota() {
        return derrota;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
        
    public int getEmpate() {
        return empate;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nick=" + nick + ", senha=" + senha + ", vitoria=" + vitoria + ", derrota=" + derrota + ", empate=" + empate + '}';
    }
       
  
}
