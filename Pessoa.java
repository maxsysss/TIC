public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Getter para a idade
    public int getIdade() {
        return idade;
    }

    // Método para exibir as informações
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Método main
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 22);
        Pessoa p2 = new Pessoa("Maria", 23);
        Pessoa p3 = new Pessoa("Carlos", 24);
        
        GerenciadorDePessoas gP = new GerenciadorDePessoas();
		gP.add(p1);
		gP.add(p2);
		gP.add(p3);

		gP.exibirPessoa();
    }
}

import java.util.*

public class GerenciadorDePessoas{
	private ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
	public void add(Pessoa p){
		listaPessoas.add(p);
	}

	public void exibirPessoa(){
		for(int i = 0; i < listaPessoas.size(); i++)
			System.out.println(listaPessoas.get(i).exibirInfo());
	}
}

public class GerenciadorDePessoas{
	private ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
	public void add(Pessoa p){
		listaPessoas.add(p);
	}
	
	public void exibirPessoa(){
		for(int i = 0; i < listaPessoas.size(); i++)
			listaPessoas.get(i).exibirInfo();
	}
}