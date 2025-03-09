package com.stayzen.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	  
	private Long id;
	private String nome;
	private String cpf;
	private String telefone;
	private List<Reserva> reservas;

    public Cliente() {
        this.reservas = new ArrayList<>();
    }
	
	@Id @GeneratedValue 
	public Long getId() {
		return id;
	}
	
	
	
	public void setId(Long id) {
		this.id = id;
	}

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Reserva> getReservas() {
        return reservas;
    }
	
	public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
	
	@Column(length = 60, nullable = false)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(length = 20, nullable = false)
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Column(length = 20, nullable = false)
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}
	
}
