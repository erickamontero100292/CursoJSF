/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ErickaMontero
 */
@ManagedBean(name="user")
@SessionScoped
public class PersonaBean implements Serializable {
    private String name;
    private String password;

    public PersonaBean() {
        this.name = "";
        
    }
    
    
    
    public String getGreeting() {
        if (name.length() == 0)
            return "";
        else 
            return "Welcome to JSF2 + Ajax, " + name + "!";
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
