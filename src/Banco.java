public class Banco {

	public static void main(String[] args) {
	
		Cliente clien = new Cliente();
		ContaCorrente conta = new ContaCorrente();
		
		clien.setAgencia(100);
		clien.setConta(34567);
		clien.setCpf("022.101.998-23");
		clien.setNome("Guilherme Duarte");
		clien.setNascimento("22/10/1998");
		clien.setEndereco("Av. dos Automistas 234");
		clien.setTelefone("(11)98754-2154");
		clien.setSenha("abc#1234");
		clien.setSaldo(100);
		conta.setAgencia(100);
		conta.setConta_cc(34567);
		conta.setData_ocorrencia_cc("20/10/2021");
		conta.setNumero_doc_cc(23456789);
		conta.setSaldo_cc(100);
		conta.setTipo_cc(1);
		conta.setValor_cc(50);
		
		System.out.println("--- Dados do Cliente ---");
		System.out.println("Agencia: " + clien.getAgencia());
		System.out.println("Conta: " + clien.getConta());
		System.out.println("CPF: " + clien.getCpf());
		System.out.println("Nome: " + clien.getNome());
		System.out.println("Nacimento: " + clien.getNascimento());
		System.out.println("Endereço: " + clien.getEndereco());
		System.out.println("Telefone: " + clien.getTelefone());
		System.out.println("Saldo: " + clien.getSaldo());
		System.out.println("Senha: " + clien.getSenha());
		System.out.println("--- Conta Corrente ---");
		System.out.println("Numero Documento: " + conta.getNumero_doc_cc());
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Conta: " + conta.getConta_cc());
		System.out.println("Valor: " + conta.getValor_cc());
		System.out.println("Tipo: " + conta.getTipo_cc() + " (Depósito)");
		System.out.println("Data Ocorrência: " + conta.getData_ocorrencia_cc());
		System.out.println("Saldo anterior: " + conta.getSaldo_cc());
		System.out.println("Saldo atualizado: " + conta.getSaldoFuturo());
		System.out.println("Mensagem: " + "Ocorrência Registrada");
		
		
		
		
	}

}
