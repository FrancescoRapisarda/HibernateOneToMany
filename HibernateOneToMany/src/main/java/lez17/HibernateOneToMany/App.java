package lez17.HibernateOneToMany;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import lez17.HibernateOneToMany.db.GestoreSessioni;
import lez17.HibernateOneToMany.models.CartaFedelta;
import lez17.HibernateOneToMany.models.Cliente;

public class App 
{
    public static void main( String[] args )
    {
     
Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
    	


    	/**
    	 * INSERT
    	 */
//    	Cliente clienteUno = new Cliente("Giovanni", "Pace", "PACGIO89M02A028F");
//    	
//    	CartaFedelta cartaUno = new CartaFedelta("Conad", "CONA0001", "2021-06-16");
//    	cartaUno.setPossessoreCarta(clienteUno);
//    	
//    	CartaFedelta cartaDue = new CartaFedelta("Coop", "COOP0001", "2021-06-02");
//    	cartaDue.setPossessoreCarta(clienteUno);
//    	
//    	try {
//    		sessione.beginTransaction();
//    		
//    		sessione.save(clienteUno);
//    		sessione.save(cartaUno);
//    		sessione.save(cartaDue);
//    		
//    		sessione.getTransaction().commit();
//    	} catch (Exception e) {
//    		System.out.println(e.getMessage());
//    	} finally {
//			sessione.close();
//		}
    	


    	/**
    	 * FINDBYID
    	 */
//    	try {
//    		sessione.beginTransaction();
//    		
//    		CartaFedelta tempCarta = sessione.get(CartaFedelta.class, 2);
//    		System.out.println(tempCarta.StampaDettaglioCartaFedelta());
//    		
//    		Cliente tempCliente = sessione.get(Cliente.class, 1);
//    		System.out.println(tempCliente.stampaDettaglioCliente());
//    		
//    		sessione.getTransaction().commit();
//    		
//    	} catch (Exception e) {
//    		System.out.println(e.getMessage());
//    	} finally {
//			sessione.close();
//		}
    	
    	
    	
    	/**
    	 * FINDALL
    	 */
//    	try {
//    		sessione.beginTransaction();
//    		
//    		TypedQuery<CartaFedelta> cartafedelta = sessione.createQuery("FROM CartaFedelta", CartaFedelta.class);
//    		List<CartaFedelta> ricercaAllCarte = cartafedelta.getResultList();
//    		for(int i = 0; i < ricercaAllCarte.size(); i++) {
//    	    	CartaFedelta temp = ricercaAllCarte.get(i);
//    	    	System.out.println(temp);
//    	    }
//    		
//    		
//    		TypedQuery<Cliente> cliente = sessione.createQuery("FROM Cliente", Cliente.class);
//    		List<Cliente> ricercaAllCliente = cliente.getResultList();
//    		for(int i = 0; i < ricercaAllCliente.size(); i++) {
//    	    	Cliente temp = ricercaAllCliente.get(i);
//    	    	System.out.println(temp);
//    	    }
//    		
//    		sessione.getTransaction().commit();
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		} finally {
//			sessione.close();
//    	}
    	
    	
    	
    	/**
    	 * DELETE ID
    	 */
//    	try {
//    		sessione.beginTransaction();
//    		
//    		CartaFedelta temp = sessione.load(CartaFedelta.class, 1);
//			sessione.delete(temp);
//			
//			sessione.getTransaction().commit();
//			System.out.println("Eliminazione CARTA FEDELTA eseguita con successo!");
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		} finally {
//			sessione.close();
//		}

    	
    	
    	
    	/**
    	 * DELETE OGGETTO 
    	 */
//    	try {
//    		sessione.beginTransaction();
//    		CartaFedelta temp = sessione.load(CartaFedelta.class, 1);
//    		sessione.delete(temp);
//    		
//    		sessione.getTransaction().commit();
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		} finally {
//			sessione.close();
//		}
    	
    	
    	
    	/**
    	 * UPDATE
    	 */
    	try {
    		sessione.beginTransaction();
    		
    		Cliente clienteDue = new Cliente("Davide", "Rapisarda", "RPSDVD89M02A028F");
    	    CartaFedelta updateCarta = sessione.load(CartaFedelta.class, 3);
    	    updateCarta.setCod_carta("COAD0001");
    	    updateCarta.setNome_store("Conad");
    	    updateCarta.setData_emissione("2021-05-16");
    	    updateCarta.setPossessoreCarta(clienteDue);
    	    
    	    sessione.save(clienteDue);
    		sessione.update(updateCarta);
    		
    		sessione.getTransaction().commit();
    		System.out.println("Modifica CARTA FEDELTA' effettuata con successo!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
    	
    }
    	
}
