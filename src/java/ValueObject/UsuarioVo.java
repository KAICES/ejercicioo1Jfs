/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObject;
/**
 *
 * @author cesar.ramirez
 */
public class UsuarioVo {
    
    private String userVo;
    
    private String telefonoVo;

    public String getUserVo() {
        return userVo;
    }

    public void setUserVo(String userVo) {
        this.userVo = userVo;
    }

    public String getTelefonoVo() {
        return telefonoVo;
    }

    public void setTelefonoVo(String telefonoVo) {
        this.telefonoVo = telefonoVo;
    }

    public UsuarioVo(String userVo, String telefonoVo) {
        this.userVo = userVo;
        this.telefonoVo = telefonoVo;
    }
    
    
    
    
    
    
    
    
    
    
    
}
