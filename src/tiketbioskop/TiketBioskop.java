/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiketbioskop;

/**
 *
 * @author ghufranb
 */
public class TiketBioskop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       LoginPage LP = new LoginPage();
       LP.setVisible(true);
       LP.pack();
       LP.setLocationRelativeTo(null);
       LP.setDefaultCloseOperation(LoginPage.EXIT_ON_CLOSE);
    }
    
}
