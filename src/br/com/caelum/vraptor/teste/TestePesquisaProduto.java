package br.com.caelum.vraptor.teste;

import br.com.caelum.vraptor.bean.Usuario;
import br.com.caelum.vraptor.dao.UsuarioDAO;

public class TestePesquisaProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//ProdutoController pc = new ProdutoController();
		//System.out.println(pc.edita((long)2).getDataInicioVenda().getTimeInMillis());
		Usuario usuario = new Usuario();
		usuario.setLogin("diego");
		usuario.setSenha("123");
		
		
		UsuarioDAO dao = new UsuarioDAO();
		System.out.println(dao.buscaUsuarioPorLoginESenha(usuario));
		
	}

}
