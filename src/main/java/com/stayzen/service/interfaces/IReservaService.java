package com.stayzen.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.stayzen.model.Reserva;

public interface IReservaService {
	Optional<Reserva> cadastrarReserva(Reserva reserva);
	Optional<Reserva> atualizarReserva(Reserva reserva);
	List<Reserva> listarReservas();
	void excluirReserva(Long id);
}
