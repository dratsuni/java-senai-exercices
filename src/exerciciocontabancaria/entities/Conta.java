package exerciciocontabancaria.entities;
import exerciciocontabancaria.utils.Utils;

public class Conta {
	private String titular;
	private int numConta;
	private double saldo;
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.numConta = Utils.gerarNumero(10000);
		depositar(saldo);
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void depositar(double valor) {
			saldo = (valor >= 0) ? saldo + valor : saldo;
	}
	
	public double sacar(double valor){
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			return valor;
		}
		
		return 0;
	}
	
	@Override
	public String toString() {
		return String.format("Titular: %s\nNúmero da conta: %d\nSaldo: %.2f", titular, numConta, saldo);
	}
}
