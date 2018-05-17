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
    
    public void registrarse(){
        
        UsuarioVo miUsuario;
            
        miLista = new ArrayList<UsuarioVo>();
        
        miUsuario = new UsuarioVo(getUser()+" ", getTlf()+"");
        miLista.add(miUsuario);       
        
    }
    
    
}
