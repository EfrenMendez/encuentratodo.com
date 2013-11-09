package AvisoOportunoUamcc.controlador;



import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import AvisoOportunoUamcc.ado.CapturaLogin;
@SessionScoped

	@ManagedBean(name="LoginControlador")
	
	public class LoginControlador {
		

		private Integer idUsuario;
	    private String  usuario;
		private String  pwd;
		
		
		public void cerrarSesion(){
			try{
				FacesContext context=FacesContext.getCurrentInstance();
				context.getExternalContext().invalidateSession();
				
			}catch(Exception ex){
				
			}
		}
		
		
		public boolean tieneRol(String rol){
			String valor=obtenerValorSesion(rol);
			if(valor==null)
				return false;
			if(!valor.equals("")){
				return true;
			}else{
				return false;
			}
		}
		
		
		public String obtenerValorSesion(String clave){
			try{
				FacesContext context=FacesContext.getCurrentInstance();
				String bd=(String)context.getExternalContext().getSessionMap().get(clave);
				return bd;
			}catch(Exception ex){
				return "";
			}
		}
		
		
		
		public void subirValorSesion(String clave,String valor){
			try {
				FacesContext context=FacesContext.getCurrentInstance();
				context.getExternalContext().getSessionMap().put(clave, valor);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		
		public void subirValorSesionID(String claveID,Integer idUsuario){
			try {
				FacesContext context=FacesContext.getCurrentInstance();
				context.getExternalContext().getSessionMap().put(claveID, idUsuario);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
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
		
		public void ingresar(){
			
			try{
				FacesContext context=FacesContext.getCurrentInstance();
				context.getExternalContext().invalidateSession();
			}catch(Exception ex){
				
			}
			CapturaLogin c=new CapturaLogin();
			String resultado=c.validarIngreso(idUsuario,usuario,pwd);
			Integer idUsuario=c.encontrarId(usuario,pwd);
		
			
			}
		
		
		

		public Integer getNombre() {
			return idUsuario;
		}

		public void setNombre(Integer nombre) {
			this.idUsuario = nombre;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		
		
	}
