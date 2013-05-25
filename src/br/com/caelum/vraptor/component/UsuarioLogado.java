package br.com.caelum.vraptor.component;

import br.com.caelum.vraptor.bean.Usuario;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;

@Component
@RequestScoped
public class UsuarioLogado {

	private Usuario usuarioLogado;
	
	public void efetuaLogin(Usuario usuario){
		this.usuarioLogado = usuario;
	}

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	
}
