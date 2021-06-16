package lez17.HibernateOneToMany.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="codice_fiscale")
	private String cod_fis;

	@OneToMany(mappedBy = "possessoreCarta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    //oppure fetch = FetchType.EAGER
	private List<CartaFedelta> elencoCarteFedelta;
	
	
	//COSTRUTTORE
	public Cliente() {
		
	}

	
	
	//COSTRUTTORE CON PARAMENTRI
	public Cliente(String nome, String cognome, String cod_fis) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cod_fis = cod_fis;
	}



	//GETTERS END SETTERS
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public String getCod_fis() {
		return cod_fis;
	}



	public void setCod_fis(String cod_fis) {
		this.cod_fis = cod_fis;
	}
	
	

	public List<CartaFedelta> getElencoCarteFedelta() {
		return elencoCarteFedelta;
	}



	public void setElencoCarteFedelta(List<CartaFedelta> elencoCarteFedelta) {
		this.elencoCarteFedelta = elencoCarteFedelta;
	}



	//TOSTRING
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", cod_fis=" + cod_fis + "]";
	}
	
	
	public String stampaDettaglioCliente() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", cod_fis=" + cod_fis
				+ ", elencoCarteFedelta=" + elencoCarteFedelta + "]";
	}
		
}
