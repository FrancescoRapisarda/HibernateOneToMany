package lez17.HibernateOneToMany.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lez17.HibernateOneToMany.models.CartaFedelta;
import lez17.HibernateOneToMany.models.Cliente;

public class GestoreSessioni {
	
	private static GestoreSessioni ogg_gestore;
	private SessionFactory factory;

	public static GestoreSessioni getIstanza() {
		if(ogg_gestore == null) {
			ogg_gestore = new GestoreSessioni();
		}
		
		return ogg_gestore;
	}
	
	public SessionFactory getFactory() {
		if(factory == null) {
			factory = new Configuration().configure("lez17/HibernateOneToMany/resources/carta_fedelta.cfg.xml")
					.addAnnotatedClass(Cliente.class)
					.addAnnotatedClass(CartaFedelta.class)
					.buildSessionFactory();
		}
		
		return factory;
	}

}
