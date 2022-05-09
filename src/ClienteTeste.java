
public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.nome = "Roberto";
		c1.codigo = "1";
		c1.status = StatusClientEnum.ATIVO;
		
Cliente c2 = new Cliente();
		
		c2.nome = "Adeilton";
		c2.codigo = "2";
		c2.status = StatusClientEnum.INATIVO;
		
		CartaoCliente cartao = new CartaoCliente();
		
		cartao.numero = "1";
		cartao.dataval = "06/23";
		cartao.tipo = CartaoTipo.CREDITO;
		cartao.cliente = c1;
		
	CartaoCliente cartao2 = new CartaoCliente();
		
		cartao2.numero = "2";
		cartao2.dataval = "07/23";
		cartao2.tipo = CartaoTipo.DEBITO;
		cartao2.cliente = c2;
	}
}
