/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4.Enkapsulasi;

/**
 *
 * @author ASUS
 */
public class Login {
    
    private String username, password;
    public String nama;
    
    public Login(){
        nama = "ShalomRadja";
        username = "Radja";
        password = "rdja123";
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(){
        this.username = username;
        
    }
    public String getPassword(){
        return password;
    }
    
    public void setPassword(){
        this.password = password;
    }
    
    boolean CekLogin(String Username, String password){
        if(username.equals(getUsername()) && password.equals(getPassword())){
            return true;
        }
        return false;
    }
}
