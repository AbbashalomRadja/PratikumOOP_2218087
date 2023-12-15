/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9.Exception;

/**
 *
 * @author ASUS
 */
public class Login {
    private String username, password;
    public String nama;

    public Login() {
        nama = "Abbashalom Radja";
        username = "raja";
        password = "raja123";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    boolean CekLogin(String username, String password){
        if(username.equals(getUsername())&& password.equals(getPassword())){
            return true;
        }
        return false;
    }
}
