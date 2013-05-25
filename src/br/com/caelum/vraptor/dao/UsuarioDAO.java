package br.com.caelum.vraptor.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.caelum.vraptor.bean.Usuario;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.caelum.vraptor.util.HibernateUtil;

@Component
@RequestScoped
public class UsuarioDAO {

	private Session session;

	public UsuarioDAO() {
		this.session = new HibernateUtil().getSession();
	}

	public Usuario buscaUsuarioPorLoginESenha(Usuario usuario) {
		Query query = this.session
				.createQuery("from Usuario where login = :pLogin and senha = :pSenha");
		query.setParameter("pLogin", usuario.getLogin());
		query.setParameter("pSenha", usuario.getSenha());
		return (Usuario) query.uniqueResult();
	}

}
