package com.equipo4.misiontic2022.tiendasgenericas.tiendaelmercado.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Producto {
	
	@Id
	private String id;
	
	private Long codigoproducto;
	private Double ivacompra;
	private Long nitproveedor;
	private String nombreproducto;
	private Double preciocompra;
	private Double precioventa;
	
	public Producto(){
		
	}
	
	public Producto(Long codigoproducto, Double ivacompra, Long nitproveedor, String nombreproducto,
			Double preciocompra, Double precioventa) {
		super();
		this.codigoproducto = codigoproducto;
		this.ivacompra = ivacompra;
		this.nitproveedor = nitproveedor;
		this.nombreproducto = nombreproducto;
		this.preciocompra = preciocompra;
		this.precioventa = precioventa;	
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
	 * @return the codigoproducto
	 */
	public Long getCodigoproducto() {
		return codigoproducto;
	}

	/**
	 * @param codigoproducto the codigoproducto to set
	 */
	public void setCodigoproducto(Long codigoproducto) {
		this.codigoproducto = codigoproducto;
	}

	/**
	 * @return the ivacompra
	 */
	public Double getIvacompra() {
		return ivacompra;
	}

	/**
	 * @param ivacompra the ivacompra to set
	 */
	public void setIvacompra(Double ivacompra) {
		this.ivacompra = ivacompra;
	}

	/**
	 * @return the nitproveedor
	 */
	public Long getNitproveedor() {
		return nitproveedor;
	}

	/**
	 * @param nitproveedor the nitproveedor to set
	 */
	public void setNitproveedor(Long nitproveedor) {
		this.nitproveedor = nitproveedor;
	}

	/**
	 * @return the nombreproducto
	 */
	public String getNombreproducto() {
		return nombreproducto;
	}

	/**
	 * @param nombreproducto the nombreproducto to set
	 */
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}

	/**
	 * @return the preciocompra
	 */
	public Double getPreciocompra() {
		return preciocompra;
	}

	/**
	 * @param preciocompra the preciocompra to set
	 */
	public void setPreciocompra(Double preciocompra) {
		this.preciocompra = preciocompra;
	}

	/**
	 * @return the precioventa
	 */
	public Double getPrecioventa() {
		return precioventa;
	}

	/**
	 * @param precioventa the precioventa to set
	 */
	public void setPrecioventa(Double precioventa) {
		this.precioventa = precioventa;
	}
	
	

}
