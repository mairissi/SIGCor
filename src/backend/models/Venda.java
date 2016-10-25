package backend.models;

import java.text.DecimalFormat;

public class Venda {
	private int idVenda;
	private Usuario usuario;
	private Seguro seguro;
	private double valorLiquido;
	
	public Venda(Usuario usuario, Seguro seguro, double valorLiquido){
		this.usuario = usuario;
		this.seguro = seguro;
		this.valorLiquido = valorLiquido;
		cadastrarVenda();
	}

	public int getIdVenda() {
		return idVenda;
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	public Seguro getSeguro() {
		return seguro;
	}
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	
	
	public double getValorLiquido() {
		return valorLiquido;
	}
	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	
	@Override
	public String toString(){
		DecimalFormat valorTotal = new DecimalFormat("#.00");
		if(seguro.getPessoa()!= null){
			return "Usuario: " + usuario.getNome() + "\nSeguro do veiculo " + seguro.getVeiculoSeguro().getModelo() + " do cliente "
					+ seguro.getPessoa().getNome() + "\nValor Liquido: " + this.valorLiquido + "\nValor total: " + 
					valorTotal.format(valorLiquido*1.0738) + "\n";
		}
		else {
			return "Usuario: " + usuario.getNome() + "\nSeguro do veiculo " + seguro.getVeiculoSeguro().getModelo() + " do cliente "
					+ seguro.getEmpresa().getRazaoSocial() + "\nValor Liquido: " + this.valorLiquido + "\nValor total: " + 
					valorTotal.format(valorLiquido*1.0738) + "\n";
		}
	}
	
	public void cadastrarVenda(){
		System.out.println("Venda cadastrada com sucesso!\n");
	}
}