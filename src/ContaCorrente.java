
public class ContaCorrente {
	
	private int numero_doc_cc;
	private int agencia;
	private int conta_cc;
	private float valor_cc;
	private int tipo_cc;
	private String data_ocorrencia_cc;
	private float saldo_cc;

	public void setNumero_doc_cc (int numero_doc_cc)
	{
		this.numero_doc_cc = numero_doc_cc;	
	}		
	public int getNumero_doc_cc()
	{
		return this.numero_doc_cc;
	}
	
	public void setAgencia (int agencia)
	{
		this.agencia= agencia;	
	}		
	public int getAgencia()
	{
		return this.agencia;
	}
	
	public void setConta_cc(int conta)
	{
		this.conta_cc = conta;	
	}		
	public int getConta_cc()
	{
		return this.conta_cc;
	}

	
	public void setValor_cc (float valor)
	{
		this.valor_cc = valor;	
	}		
	public float getValor_cc()
	{
		return this.valor_cc;
	}
	
	public void setTipo_cc (int tipo)
	{
		this.tipo_cc = tipo;	
	}		
	public int getTipo_cc()
	{
		return this.tipo_cc;
	}
	
	public void setData_ocorrencia_cc(String ocorrencia)
	{
		this.data_ocorrencia_cc = ocorrencia;	
	}		
	public String getData_ocorrencia_cc()
	{
		return this.data_ocorrencia_cc;
	}

	public void setSaldo_cc (float saldo)
	{
		this.saldo_cc = saldo;	
	}		
	public float getSaldo_cc()
	{
		return this.saldo_cc;
	}
/* 
 eu tive Problemas com esse metodo!
	public void atualizarSaldo()
	{
			
			saldoFuturo = this.valor_cc + this.saldo_cc;
	}
*/
	//em tão criei esse 
	private float saldoFuturo;// sem criar essa variavel da erro
	public float getSaldoFuturo()
	{
		saldoFuturo = this.valor_cc + this.saldo_cc;
		return this.saldoFuturo; 
	}

		
	
	public void registrarOcorrencia()
	{
		
	}

	

}
