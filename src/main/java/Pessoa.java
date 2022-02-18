public class Pessoa {
    private String nome;
    private String sobrenome;
    private String apelido;
    private String nacionalidade;

    private Pessoa(String nome, String sobrenome, String apelido, String nacionalidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.nacionalidade = nacionalidade;
    }

    public static class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private String apelido;
        private String nacionalidade;

        public PessoaBuilder() {
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilder nacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
            return this;
        }

        public Pessoa criarPessoa() {
            return new Pessoa(nome,sobrenome,apelido,nacionalidade);
        }
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
