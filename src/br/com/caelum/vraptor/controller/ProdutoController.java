package br.com.caelum.vraptor.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.bean.Produto;
import br.com.caelum.vraptor.dao.ProdutoDAO;

@Resource
public class ProdutoController {

	private Result result;
	private ProdutoDAO dao; // = new ProdutoDAO();
	
	public ProdutoController(Result result, ProdutoDAO dao){
		this.result = result;
		this.dao = dao;
	}
	
	public ProdutoController(){
	}
	
	public List<Produto> lista() {
		return dao.lista();
	}

	public void adiciona(Produto produto){
		dao.adiciona(produto);
		result.redirectTo(ProdutoController.class).lista();
	}
	

	public void remove(Produto produto){
		dao.remove(produto);
		//result.redirectTo(ProdutoController.class).lista();
	}
	
	public Produto edita(Long id){
		return dao.carrega(id);
	}

	public void altera(Produto produto) {
		dao.atualiza(produto);
		result.redirectTo(ProdutoController.class).lista();
	}

	
	public void formulario() {
	}
}
