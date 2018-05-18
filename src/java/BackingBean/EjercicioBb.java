/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBean;

import ValueObject.UsuarioVo;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author cesar.ramirez
 */
@ManagedBean
@RequestScoped
public class EjercicioBb {

    
    private String user;
    
    private String tlf;
    
    private List<UsuarioVo>miLista;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public List<UsuarioVo> getMiLista() {
        return miLista;
    }

    public void setMiLista(List<UsuarioVo> miLista) {
        this.miLista = miLista;
    }
        
    public EjercicioBb() {
    }
    
    public String comprobar(){
        
        UsuarioVo miUsuario;
            
        miLista = new ArrayList<UsuarioVo>();
        
        miUsuario = new UsuarioVo("Hola señor "+getUser(),", su numero es "+getTlf()+"");
        miLista.add(miUsuario); 
        
        
        String retorno = "";
      
        if (getTlf().endsWith("0") || getTlf().endsWith("1")){
            retorno = "amarillo";
        }else if(getTlf().endsWith("2") || getTlf().endsWith("3")){
                retorno = "azul";     
        }else if(getTlf().endsWith("4") || getTlf().endsWith("5")){
                retorno = "violeta";     
        }else if(getTlf().endsWith("6") || getTlf().endsWith("7")){
                retorno = "rojo";     
        }else if(getTlf().endsWith("8") || getTlf().endsWith("9")){
                retorno = "gris";     
        }        
        return retorno;
    }
    
    
}
