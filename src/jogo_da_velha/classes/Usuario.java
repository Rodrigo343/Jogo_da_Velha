package jogo_da_velha.classes;

public class Usuario {

    private String nick;
    private String senha;
    private int id;
    private int vitoria;
    private int derrota;
    private int empate;
    private int pontos;

    public Usuario() {

    }

    //Validar nome existente
    public Usuario(String nick) {
        setNick(nick);
    }

    //Pegar jogadores logados
    public Usuario(int id) {
        setId(id);
    }

    //Verificar login
    public Usuario(String nick, String senha) {
        setNick(nick);
        setSenha(senha);
    }

    //Verificar login
    public Usuario(String nick, int pontos) {
        setNick(nick);
        setPontos(pontos);
    }

    //Criar jogador na camada visual
    public Usuario(int id, String nick, String senha) {
        setId(id);
        setNick(nick);
        setSenha(senha);
        setVitoria(0);
        setDerrota(0);
        setEmpate(0);
        setPontos(0);
    }

    //Setar usuarios logados
    public Usuario(int id, String nick, int vitorias, int derotas, int empates, int pontos) {
        setId(id);
        setNick(nick);
        setVitoria(vitorias);
        setDerrota(derotas);
        setEmpate(empates);
        setPontos(pontos);
    }

    //cadastrar jogador no banco
    public Usuario(int id, String nick, String senha, int vitorias, int derotas, int empates, int pontos) {
        setId(id);
        setNick(nick);
        setSenha(senha);
        setVitoria(vitorias);
        setDerrota(derotas);
        setEmpate(empates);
        setPontos(pontos);
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

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    @Override
    public String toString() {
        return "Usuario " + "nick=" + nick + ", senha=" + senha + ", vitoria=" + vitoria + ", derrota=" + derrota + ", empate=" + empate + '}';
    }

}
