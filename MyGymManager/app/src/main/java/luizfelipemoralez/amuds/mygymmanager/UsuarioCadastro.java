package luizfelipemoralez.amuds.mygymmanager;

public class UsuarioCadastro {


    private String usuario ;
    private String nome ;
    private String sobrenome;
    private String senha;
    private double peso ;
    private double altura;
    private double peito;
    private double quadril;
    private double panturrilha;
    private double antebraco;
    private double biceps;
    private double coxa;
    private double cintura;
    // ("","","","",10,10,10,10,10,10,10,10,10)
    public UsuarioCadastro(String usuario, String nome, String sobrenome, String senha, double peso, double altura, double peito, double quadril, double panturrilha, double antebraco, double biceps, double coxa, double cintura) {
        this.usuario = usuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.peso = peso;
        this.altura = altura;
        this.peito = peito;
        this.quadril = quadril;
        this.panturrilha = panturrilha;
        this.antebraco = antebraco;
        this.biceps = biceps;
        this.coxa = coxa;
        this.cintura = cintura;
    }

    public UsuarioCadastro(){

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeito() {
        return peito;
    }

    public void setPeito(double peito) {
        this.peito = peito;
    }

    public double getQuadril() {
        return quadril;
    }

    public void setQuadril(double quadril) {
        this.quadril = quadril;
    }

    public double getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(double panturrilha) {
        this.panturrilha = panturrilha;
    }

    public double getAntebraco() {
        return antebraco;
    }

    public void setAntebraco(double antebraco) {
        this.antebraco = antebraco;
    }

    public double getBiceps() {
        return biceps;
    }

    public void setBiceps(double biceps) {
        this.biceps = biceps;
    }

    public double getCoxa() {
        return coxa;
    }

    public void setCoxa(double coxa) {
        this.coxa = coxa;
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

}


