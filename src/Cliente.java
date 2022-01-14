
public class Cliente {

	private int agencia;
	private int conta;
	private String cpf;
	private String nome;
	private String nascimento;
	private String endereco;
	private String telefone;
	private float saldo;
	private String senha;
	
	public void mostrarCliente()
	{
		
	}

	//Public para implantar valores na Agencia
	public void setAgencia (int agencia)
	{
		this.agencia = agencia;	
	}		
	public int getAgencia ()
	{
		return this.agencia;
	}
	
	//Public para implantar valores Conta Cliente
	public void setConta (int conta)
	{
		this.conta = conta;	
	}		
	public int getConta ()
	{
		return this.conta;
	}
	
	//Public para implantar valores do CPF
	public void setCpf (String cpf)
	{
		this.cpf = cpf;	
	}		
	public String getCpf()
	{
		return this.cpf;
	}
	
	//Public para implantar valores no Nome
	public void setNome (String nome)
	{
		this.nome = nome;	
	}		
	public String getNome()
	{
		return this.nome;
	}
	
	//Public para implantar a data de Nacimento
	public void setNascimento (String nascimento)
	{
		this.nascimento = nascimento;	
	}		
	public String getNascimento()
	{
		return this.nascimento;
	}
	
	//Public para implantar valores no endereco
	public void setEndereco (String endereco)
	{
		this.endereco = endereco;	
	}		
	public String getEndereco()
	{
		return this.endereco;
	}
	
	//Public para implantar valores no Telefone
	public void setTelefone (String telefone)
	{
		this.telefone = telefone;	
	}		
	public String getTelefone()
	{
		return this.telefone;
	}

	//Public para implantar valores no Saldo
	public void setSaldo (float saldo)
	{
		this.saldo = saldo;	
	}		
	public Float getSaldo()
	{
		return this.saldo;
	}

	//Public para implantar valores na Senha
	public void setSenha (String senha)
	{
		this.senha = senha;	
	}		
	public String getSenha()
	{
		return this.senha;
	}

	
}
