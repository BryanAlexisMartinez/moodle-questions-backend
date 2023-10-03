package com.example.questions.model;

public class RespuestaDetallesDTO {
    private Long idPregunta;
    private String nombrePregunta;
    private String textoPregunta;
    private String retroalimentacionPregunta;
    private String informacionPregunta;
    private Long idRespuesta;
    private String nombreAlumno;
    private String textoHtml;
    private String textoNormal;

    public RespuestaDetallesDTO() {
    }

    public RespuestaDetallesDTO(Long idPregunta, String nombrePregunta, String textoPregunta,
            String retroalimentacionPregunta, String informacionPregunta, Long idRespuesta, String nombreAlumno,
            String textoHtml, String textoNormal) {
        this.idPregunta = idPregunta;
        this.nombrePregunta = nombrePregunta;
        this.textoPregunta = textoPregunta;
        this.retroalimentacionPregunta = retroalimentacionPregunta;
        this.informacionPregunta = informacionPregunta;
        this.idRespuesta = idRespuesta;
        this.nombreAlumno = nombreAlumno;
        this.textoHtml = textoHtml;
        this.textoNormal = textoNormal;
    }

    public Long getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Long idPregunta) {
        this.idPregunta = idPregunta;
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

    public Long getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Long idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
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
}
