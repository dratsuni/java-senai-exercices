package exerciciofuncionario.manager;
import java.util.List;
import java.util.ArrayList;
import exerciciofuncionario.entities.Funcionario;


public class GerenciadorDeFuncionarios {
	private static List<Funcionario> funcionarios = new ArrayList<>();
	
	public static void addFuncionario(Funcionario funcionario) {
		if (funcionario != null) {
			funcionarios.add(funcionario);
		}
	}
	
	public static void removeFuncionario(Funcionario funcionario) {
		if (funcionario != null) {
			funcionarios.remove(funcionario);
		}
	}
	
	public static Funcionario searchFuncionario(int id) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId() == id) {
				return funcionario;
			}
		}
		return null;
	}
    
    public static void mostrarFuncionarios() {
    	System.out.println("=============Funcionarios cadastrados================");
    	for (Funcionario funcionario : funcionarios) {
    		System.out.println(funcionario);
    		System.out.println("");
    	}
    	System.out.println("===========================================");
    }

}
