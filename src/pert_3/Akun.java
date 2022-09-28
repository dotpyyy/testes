/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert_3;

/**
 *
 * @author BOBI YUSCANDRA
 */
public class Akun {
    private String username, password;
    
public Akun () {
    username = "admin";
    password = "123";
}

public Akun (String u, String p) {
    username = u;
    password = p;
}

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
