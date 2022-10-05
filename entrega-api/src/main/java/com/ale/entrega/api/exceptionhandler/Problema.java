package com.ale.entrega.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;




public class Problema {
	

	
	
	private Integer status;
	
	
	private LocalDateTime dataHora;
	
	private String titulo;
	
	@Autowired
	private List<Campo> Campos;
	

	public static class Campo{
		private String nome;
		private String mensagem;
		public Campo(String nome, String mensagem) {
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
		
		
		
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Campo> getCampos() {
		return Campos;
	}

	public void setCampos(List<Campo> campos) {
		Campos = campos;
	}

}
