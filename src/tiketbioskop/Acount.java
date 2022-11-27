/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiketbioskop;
import java.io.*;
import java.util.*;
/**
 *
 * @author ghufranb
 */
public class Acount implements Serializable{
    private String Name,Username,Password; 

    public Acount(String Name, String Username, String Password) {
        this.Name = Name;
        this.Username = Username;
        this.Password = Password;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
            
}
