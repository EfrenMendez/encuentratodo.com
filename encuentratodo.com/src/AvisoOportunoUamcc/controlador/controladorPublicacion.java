package AvisoOportunoUamcc.controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import AvisoOportunoUamcc.beans.publicacionTO;

@SessionScoped

@ManagedBean(name="controlador")


public class controladorPublicacion {
	publicacionTO publicacion;
	
	
	   
	   
	   
public void guardar(){

		}

public publicacionTO getPublicacion() {
	return publicacion;
}





public void setPublicacion(publicacionTO publicacion) {
	this.publicacion = publicacion;
}


   






	
}
