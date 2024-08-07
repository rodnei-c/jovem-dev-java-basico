package aula6.outros;

import java.time.LocalDateTime;

public class Evento {

	private String descricao;
	private LocalDateTime dataHora;
	private TipoDeEvento tipoDeEvento;
	
	
	public Evento(String descricao, LocalDateTime dataHora, TipoDeEvento tipoDeEvento) {
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.tipoDeEvento = tipoDeEvento;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public TipoDeEvento getTipoDeEvento() {
		return tipoDeEvento;
	}
	public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}
	
	
	
}
