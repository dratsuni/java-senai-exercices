package exerciciofuncionario.view;
import java.util.Scanner;
import exerciciofuncionario.entities.Cargo;
import exerciciofuncionario.entities.Funcionario;
import exerciciofuncionario.manager.GerenciadorDeFuncionarios;
import exerciciofuncionario.utils.ValidarIntervalo;

public class MenuView {
    public static int opcoesMenu(Scanner sc) {
    	int op;
    	System.out.println("[1]Cadastrar funcionario\n[2]Selecionar funcionario\n[3]Mostrar todos os funcionarios\n[4]Sair\n");
    	System.out.print("selecione > ");
    	op = sc.nextInt();
    	sc.nextLine();
    	return op;
    }
    

    
    private static Cargo selecionarCargos(Scanner sc) {
    	Cargo cargos[] = Cargo.values();
    	int i = 0;
    	int cargoIndex = 0;
    	System.out.println("Selecione o cargo");
    	System.out.println("========cargos===========");
    	for (Cargo cargo : cargos) {
    		System.out.printf("[%d] %s%n", i, cargo);
    		i++;
    	}
    	System.out.println("=====================");
    	System.out.printf("selecione [0-%d] > ", i - 1);
    	cargoIndex = sc.nextInt();
    	cargoIndex = ValidarIntervalo.validarIntervalo(sc, cargoIndex, 0, i - 1);
    
    	return cargos[cargoIndex]; 
    }
    
     public static Funcionario pesquisarFuncionario(Scanner sc) {
    	int funcionarioID;
    	System.out.println("Digite o id do funcionario: ");
    	funcionarioID = sc.nextInt();
    	Funcionario funcionario = GerenciadorDeFuncionarios.searchFuncionario(funcionarioID);

    	return funcionario;
    }
    
    public static int opcoesFuncionario(Scanner sc, Funcionario funcionario) {
    	int n;
    	
    	System.out.println("========Dados do funcionario=========");
    	System.out.println(funcionario);
    	System.out.println("======================================");
    	System.out.println("[1]Adicionar aumento\n[2]Demitir funcionario\n[3]Alterar cargo\n[4]Sair");
    	System.out.print("selecione [1-4] > ");   	
    	n = sc.nextInt();
    
 
    	return n;
    }
    
    public static Funcionario cadastrarFuncionario(Scanner sc) {
    	String nome;
    	Cargo cargo;
    	System.out.println("===========Cadastrar funcionario============");
    	System.out.print("Digite o nome do funcionario: ");
    	nome = sc.nextLine();
    	cargo = selecionarCargos(sc);
    	System.out.println("Cadastro finalizado!");
    	System.out.println("============================================");
    	return new Funcionario(nome, cargo);
    	
    }
    
    public static void mudarCargoFuncionario(Scanner sc, Funcionario funcionario) {
    		Cargo cargo = selecionarCargos(sc);
    		funcionario.setCargo(cargo);
    		System.out.printf("O funcionario %s agora está atuando no cargo de: %s%n", funcionario.getName(), funcionario.getCargo());  	
    }
    
    public static void adicionarAumento(Scanner sc, Funcionario funcionario) {
    	System.out.print("Digite a porcetagem de aumento > ");
    	double aumento = sc.nextDouble();
    	funcionario.adicionarAumento(aumento);
    	System.out.printf("Agora, o funcionario %s recebe: R$ %.2f%n", funcionario.getName(), funcionario.getSalario());
    }
   
    public static boolean confirmarEscolha(Scanner sc){
    	sc.nextLine();
    	System.out.print("Deseja mesmo fazer isso? [S/N] > ");
    	char escolha = sc.nextLine().charAt(0);
    	if (escolha == 'S' || escolha == 's') {
    		return true;
    	} else if (escolha == 'N' || escolha == 'n') {
    		return false;
    	} else {
    		return true;
    	}
    }
   
    
}

