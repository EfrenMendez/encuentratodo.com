package AvisoOportunoUamcc.controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import AvisoOportunoUamcc.ado.CapturaUsuario;
import AvisoOportunoUamcc.beans.UsuarioTO;
@SessionScoped

@ManagedBean(name="RegistroUsuario")




	public class RegistroUSuario {

		private UsuarioTO  usuario;
		
		  public RegistroUSuario(){
				inicializar();
			}
		    
		    
	    
		   private void inicializar() {
			   System.out.println("inicializar");
			    usuario = new UsuarioTO();
			   
			}
		   
		   
		   

		   public void guardar(){
				
				System.out.println("metodo guardar en registro usuario");
			
				CapturaUsuario capturaUsuario = new CapturaUsuario(); 
				@SuppressWarnings("unused")
				String resultado=" ";
				Integer verifica=0;
				if(verifica==0){
					resultado=capturaUsuario.guardaUsuario(usuario);
					inicializar();
				  }
				
				else{
					
					inicializar();}
		   }
		public UsuarioTO getUsuario() {  
			return usuario;
		}




		public void setUsuario(UsuarioTO usuario) {
			this.usuario = usuario;
		}
			




	}
