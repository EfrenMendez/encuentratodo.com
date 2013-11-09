package AvisoOportunoUamcc.beans;


import java.util.Date;

import org.primefaces.model.UploadedFile;

public class publicacionTO {
		
   private Integer idAnuncio;
   private String titulo;
   private String descripcion;
   private String fecha;
   private Date vigencia;
   private String mail;
   private String telefono;
   private UploadedFile img2;
   private UploadedFile img3;
   
   private Integer id_usuario;
   private Integer id_categoria;
   
   
   private UploadedFile img1;
  
public Integer getIdAnuncio() {
	return idAnuncio;
}
public void setIdAnuncio(Integer idAnuncio) {
	this.idAnuncio = idAnuncio;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public Date getVigencia() {
	return vigencia;
}
public void setVigencia(Date vigencia) {
	this.vigencia = vigencia;
}
public UploadedFile getImg1() {
	return img1;
}
public void setImg1(UploadedFile img1) {
	this.img1 = img1;
}
public UploadedFile getImg2() {
	return img2;
}
public void setImg2(UploadedFile img2) {
	this.img2 = img2;
}
public UploadedFile getImg3() {
	return img3;
}
public void setImg3(UploadedFile img3) {
	this.img3 = img3;
}
public Integer getId_usuario() {
	return id_usuario;
}
public void setId_usuario(Integer id_usuario) {
	this.id_usuario = id_usuario;
}
public Integer getId_categoria() {
	return id_categoria;
}
public void setId_categoria(Integer id_categoria) {
	this.id_categoria = id_categoria;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}

   
   

   
}
