public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Pedro")
                .sobrenome("Vasconcelos")
                .apelido("Nenhum")
                .nacionalidade("Brasileiro")
                .criarPessoa();
        System.out.println(pessoa);
    }

}
