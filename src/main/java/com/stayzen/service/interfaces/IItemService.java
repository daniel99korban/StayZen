package com.stayzen.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.stayzen.model.Item;

public interface IItemService {
	Optional<Item> cadastrar(Item item);
	Optional<Item> atualizar(Item item); 
	List<Item> listar();
	void excluir(Long id);
}
