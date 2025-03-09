package com.stayzen.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicos_adicionais")
public class ServicoAdicional implements Serializable, Item{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@Id @GeneratedValue   
	public Long getId() {
		return id;
	}
	
	

	public void setId(Long id) {
		this.id = id;
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
		ServicoAdicional other = (ServicoAdicional) obj;
		return Objects.equals(id, other.id);
	}
}
