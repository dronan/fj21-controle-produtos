package br.com.caelum.vraptor.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.caelum.vraptor.bean.Produto;

public class GeraTabelas {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Produto.class);
				
		SchemaExport se = new SchemaExport(cfg);
		se.create(true, true);
	}
}

