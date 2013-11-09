package AvisoOportunoUamcc.ado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import AvisoOportunoUamcc.beans.publicacionTO;

public class publicarDAO {
	
private publicacionTO anuncio;
private Connection connection;
    
    	
				
				public String obtenerValorSesion(String clave){
					try{
						FacesContext context=FacesContext.getCurrentInstance();
						String bd=(String)context.getExternalContext().getSessionMap().get(clave);
						return bd;
					}catch(Exception ex){
						return "";
					}
				}
				
				
				
       
       
       
	public String guardaAnuncio(publicacionTO to){
    	   Statement stmt = null;
    	   Integer id = null;
    	   List<publicacionTO> listado = new ArrayList<publicacionTO>();
    	
    	   
    	   
    	 if(to.getId_categoria()==1){
    		
				String nombre = "administrador";
				String resul=" ";
				System.out.println(obtenerValorSesion(nombre));
				System.out.println(to.getTitulo()+" "+to.getDescripcion()+" "+to.getId_categoria());
				resul=obtenerValorSesion(nombre);
				
		try{
				
				try {
		  
		   conexion conecta = new conexion();
	       connection = conecta.getConexion();
		   
	       
		 
		    redireccionar("index.xhtml");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(to.getTitulo()));
			
			return "";
				
				    
					} catch (Exception e) {
						e.printStackTrace();
					}
				}catch(Exception ex){
					System.out.println("Erro en.."+ex.getMessage());
				}
		
				return "error";
			
    	   }

    	 	  return null;
    	   
			
		}
       
       
 
		public void redireccionar(String ruta){
			try{
				FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
				FacesContext context=FacesContext.getCurrentInstance();  
				context.getExternalContext().redirect(ruta);
			
			
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}

		
		
		
	public publicacionTO getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(publicacionTO anuncio) {
		this.anuncio = anuncio;
	}
		
       

       


	   
	   
	   
}

