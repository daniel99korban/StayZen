package com.stayzen.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name  = "reservas")
public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Cliente cliente;
	private List<Item> itens;
	private Date dataCheckIn;
	private Date dataCheckOut;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_checkin", nullable = false)
	public Date getDataCheckIn() {
		return dataCheckIn;
	}
	 
	public void setDataCheckIn(Date dataCheckIn) {
		this.dataCheckIn = dataCheckIn;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_checkout", nullable = false)
	public Date getDataCheckOut() {
		return dataCheckOut;
	}
	 
	public void setDataCheckOut(Date dataCheckOut) {
		this.dataCheckOut = dataCheckOut;
	}
	
	public Reserva() {
		this.itens = new ArrayList<>();
	}
	
	
	@Id @GeneratedValue   
	public Long getId() {
		return id;
	}	
	
	
	public void setId(Long id) {
		this.id = id;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@ManyToOne(optional = false)
	@JoinColumn(name = "cliente_id")
	public Cliente getCliente() {
		return cliente;
	}


	@Override
	public int hashCode() {
	    return id == null ? 0 : (int) (id ^ (id >>> 32));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(id, other.id);
	}
}
