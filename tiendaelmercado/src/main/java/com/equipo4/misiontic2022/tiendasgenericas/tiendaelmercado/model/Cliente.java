package com.equipo4.misiontic2022.tiendasgenericas.tiendaelmercado.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")
public class Cliente {
	
	@Id
	private String id;
	
	private Long cedula;
	private String nombrecompleto;
	private String direccioncliente;
	private Integer telefonocliente;
	private String correocliente;
	
	public Cliente(){
		
	}

	public Cliente(Long cedula, String nombrecompleto, String direccioncliente, Integer telefonocliente,
			String correocliente) {
		super();
		this.cedula = cedula;
		this.nombrecompleto = nombrecompleto;
		this.direccioncliente = direccioncliente;
		this.telefonocliente = telefonocliente;
		this.correocliente = correocliente;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the cedula
	 */
	public Long getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the nombrecompleto
	 */
	public String getNombrecompleto() {
		return nombrecompleto;
	}

	/**
	 * @param nombrecompleto the nombrecompleto to set
	 */
	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}

	/**
	 * @return the direccioncliente
	 */
	public String getDireccioncliente() {
		return direccioncliente;
	}

	/**
	 * @param direccioncliente the direccioncliente to set
	 */
	public void setDireccioncliente(String direccioncliente) {
		this.direccioncliente = direccioncliente;
	}

	/**
	 * @return the telefonocliente
	 */
	public Integer getTelefonocliente() {
		return telefonocliente;
	}

	/**
	 * @param telefonocliente the telefonocliente to set
	 */
	public void setTelefonocliente(Integer telefonocliente) {
		this.telefonocliente = telefonocliente;
	}

	/**
	 * @return the correocliente
	 */
	public String getCorreocliente() {
		return correocliente;
	}

	/**
	 * @param correocliente the correocliente to set
	 */
	public void setCorreocliente(String correocliente) {
		this.correocliente = correocliente;
	}
	
	
}
