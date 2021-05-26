package ti2;

import java.time.LocalDate;

public class Compras {
	private  int codPro;
	private float valorAquisicao;
	private String descricao;
	private LocalDate dataVal;
	private String categoria;
	private int quantidade;
	private LocalDate dataAquisicao;
	private String fornecedor;
	private  int estoqueCodProdu;
	private String estoqueUserMail;
	public Compras(int codPro, float valorAquisicao, String descricao, LocalDate dataVal, String categoria,
			int quantidade, LocalDate dataAquisicao, String fornecedor, int estoqueCodProdu, String estoqueUserMail) {
		super();
		this.codPro = codPro;
		this.valorAquisicao = valorAquisicao;
		this.descricao = descricao;
		this.dataVal = dataVal;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.dataAquisicao = dataAquisicao;
		this.fornecedor = fornecedor;
		this.estoqueCodProdu = estoqueCodProdu;
		this.estoqueUserMail = estoqueUserMail;
	}
	@Override
	public String toString() {
		return "Compras [codPro=" + codPro + ", valorAquisicao=" + valorAquisicao + ", descricao=" + descricao
				+ ", dataVal=" + dataVal + ", categoria=" + categoria + ", quantidade=" + quantidade
				+ ", dataAquisicao=" + dataAquisicao + ", fornecedor=" + fornecedor + ", estoqueCodProdu="
				+ estoqueCodProdu + ", estoqueUserMail=" + estoqueUserMail + "]";
	}
	public int getCodPro() {
		return codPro;
	}
	public float getValorAquisicao() {
		return valorAquisicao;
	}
	public String getDescricao() {
		return descricao;
	}
	public LocalDate getDataVal() {
		return dataVal;
	}
	public String getCategoria() {
		return categoria;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public int getEstoqueCodProdu() {
		return estoqueCodProdu;
	}
	public String getEstoqueUserMail() {
		return estoqueUserMail;
	}
	public void setCodPro(int codPro) {
		this.codPro = codPro;
	}
	public void setValorAquisicao(float valorAquisicao) {
		this.valorAquisicao = valorAquisicao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setDataVal(LocalDate dataVal) {
		this.dataVal = dataVal;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public void setEstoqueCodProdu(int estoqueCodProdu) {
		this.estoqueCodProdu = estoqueCodProdu;
	}
	public void setEstoqueUserMail(String estoqueUserMail) {
		this.estoqueUserMail = estoqueUserMail;
	}
	
	
	
	

}
