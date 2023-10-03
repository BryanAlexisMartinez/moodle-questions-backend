package com.example.questions.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "respuesta")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "nombre_alumno", nullable = false)
    private String nombreAlumno;

    @Lob // Utiliza la anotación @Lob para almacenar archivos binarios en la base de datos
    @Column(name = "archivo")
    private byte[] archivo;

    @Column(name = "texto_html", columnDefinition = "TEXT") // Define el tipo de columna como "TEXT" para texto HTML
    private String textoHtml;

    @Column(name = "texto_normal", columnDefinition = "TEXT") // Define el tipo de columna como "TEXT" para texto normal
    private String textoNormal;
    
    @OneToOne
    
    @JoinColumn(name = "pregunta_id")
    private Ensayo pregunta;

    // Campos adicionales relacionados con la pregunta
    @Column(name = "nombre_pregunta")
    private String nombrePregunta;

    @Column(name = "texto_pregunta", columnDefinition = "TEXT")
    private String textoPregunta;

    @Column(name = "retroalimentacion_pregunta", columnDefinition = "TEXT")
    private String retroalimentacionPregunta;

    @Column(name = "informacion_pregunta", columnDefinition = "TEXT")
    private String informacionPregunta;

    public Respuesta() {
        // Constructor sin argumentos requerido por JPA
    }

    public Respuesta(String nombreAlumno, byte[] archivo, String textoHtml, String textoNormal) {
        this.nombreAlumno = nombreAlumno;
        this.archivo = archivo;
        this.textoHtml = textoHtml;
        this.textoNormal = textoNormal;
    }

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public String getTextoHtml() {
		return textoHtml;
	}

	public void setTextoHtml(String textoHtml) {
		this.textoHtml = textoHtml;
	}

	public String getTextoNormal() {
		return textoNormal;
	}

	public void setTextoNormal(String textoNormal) {
		this.textoNormal = textoNormal;
	}

	public Ensayo getPregunta() {
		return pregunta;
	}

	public void setPregunta(Ensayo pregunta) {
		this.pregunta = pregunta;
	}

	public String getNombrePregunta() {
		return nombrePregunta;
	}

	public void setNombrePregunta(String nombrePregunta) {
		this.nombrePregunta = nombrePregunta;
	}

	public String getTextoPregunta() {
		return textoPregunta;
	}

	public void setTextoPregunta(String textoPregunta) {
		this.textoPregunta = textoPregunta;
	}

	public String getRetroalimentacionPregunta() {
		return retroalimentacionPregunta;
	}

	public void setRetroalimentacionPregunta(String retroalimentacionPregunta) {
		this.retroalimentacionPregunta = retroalimentacionPregunta;
	}

	public String getInformacionPregunta() {
		return informacionPregunta;
	}

	public void setInformacionPregunta(String informacionPregunta) {
		this.informacionPregunta = informacionPregunta;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Respuesta [id=" + id + ", nombreAlumno=" + nombreAlumno + ", archivo=" + Arrays.toString(archivo)
				+ ", textoHtml=" + textoHtml + ", textoNormal=" + textoNormal + ", pregunta=" + pregunta
				+ ", nombrePregunta=" + nombrePregunta + ", textoPregunta=" + textoPregunta
				+ ", retroalimentacionPregunta=" + retroalimentacionPregunta + ", informacionPregunta="
				+ informacionPregunta + "]";
	}

}