package lez17.HibernateOneToMany.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="carta_fedelta")
public class CartaFedelta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_carta")
	private int id;
	
	@Column(name="negozio")
	private String nome_store;
	
	@Column(name="n_carta")
	private String cod_carta;
	
	@Column(name="data_emissione")
	private String data_emissione;
	
	@ManyToOne
	@JoinColumn(name="cliente_rif")
	private Cliente possessoreCarta;
	
	
	
	//COSTRUTTORE
	public CartaFedelta() {
		
	}


	//COSTRUTTORE CON PARAMETRI
	public CartaFedelta(String nome_store, String cod_carta, String data_emissione) {
		super();
		this.nome_store = nome_store;
		this.cod_carta = cod_carta;
		this.data_emissione = data_emissione;
	}


	//GETTERS END SETTERS
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome_store() {
		return nome_store;
	}


	public void setNome_store(String nome_store) {
		this.nome_store = nome_store;
	}


	public String getCod_carta() {
		return cod_carta;
	}


	public void setCod_carta(String cod_carta) {
		this.cod_carta = cod_carta;
	}


	public String getData_emissione() {
		return data_emissione;
	}


	public void setData_emissione(String data_emissione) {
		this.data_emissione = data_emissione;
	}
	

	public Cliente getPossessoreCarta() {
		return possessoreCarta;
	}


	public void setPossessoreCarta(Cliente possessoreCarta) {
		this.possessoreCarta = possessoreCarta;
	}


	//TO STRING
	@Override
	public String toString() {
		return "CartaFedelta [id=" + id + ", nome_store=" + nome_store + ", cod_carta=" + cod_carta
				+ ", data_emissione=" + data_emissione + "]";
	}
	
	//DETTAGLIOCARTA
	public String StampaDettaglioCartaFedelta() {
		return "CartaFedelta [id=" + id + ", nome_store=" + nome_store + ", cod_carta=" + cod_carta
				+ ", data_emissione=" + data_emissione + ", possessoreCarta=" + possessoreCarta + "]";
	}
	
}
