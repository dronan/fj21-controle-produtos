package br.com.caelum.vraptor.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.bean.Produto;
import br.com.caelum.vraptor.dao.ProdutoDAO;

@Resource
public class ProdutoController {
	public List<Produto> lista() {
		return new ProdutoDAO().lista();
	}
}
