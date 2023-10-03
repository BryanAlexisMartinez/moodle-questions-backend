package com.example.questions.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ensayo")
public class Ensayo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "categoria", nullable = false)
	private int categoria;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "texto", nullable = false)
	private String texto;
	
	@Column(name = "puntuacion", nullable = false)
	private int puntuacion;
	
	@Column(name = "retroalimentacion", nullable = false)
	private String retroalimentacion;
	
	@Column(name = "formato", nullable = false)
	private int formato;
	
	@Column(name = "tamano", nullable = false)
	private int tamano;
	
	@Column(name = "permitir", nullable = false)
	private int permitir;
	
	@Column(name = "informacion", nullable = false)
	private String informacion;
	
	// Agrega una relación con Respuesta
    @OneToOne(mappedBy = "pregunta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Respuesta respuesta;

	public Ensayo() {
		super();
	}

	public Ensayo(Long id, int categoria, String nombre, String texto, int puntuacion, String retroalimentacion,
			int formato, int tamano, int permitir, String informacion) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.nombre = nombre;
		this.texto = texto;
		this.puntuacion = puntuacion;
		this.retroalimentacion = retroalimentacion;
		this.formato = formato;
		this.tamano = tamano;
		this.permitir = permitir;
		this.informacion = informacion;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getRetroalimentacion() {
		return retroalimentacion;
	}

	public void setRetroalimentacion(String retroalimentacion) {
		this.retroalimentacion = retroalimentacion;
	}

	public int getFormato() {
		return formato;
	}

	public void setFormato(int formato) {
		this.formato = formato;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public int getPermitir() {
		return permitir;
	}

	public void setPermitir(int permitir) {
		this.permitir = permitir;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Ensayo [id=" + id + ", categoria=" + categoria + ", nombre=" + nombre + ", texto=" + texto
				+ ", puntuacion=" + puntuacion + ", retroalimentacion=" + retroalimentacion + ", formato=" + formato
				+ ", tamano=" + tamano + ", permitir=" + permitir + ", informacion=" + informacion + "]";
	}
}