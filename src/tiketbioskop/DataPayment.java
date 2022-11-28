/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiketbioskop;

/**
 *
 * @author ghufranb
 */
public class DataPayment {
    private String name, email, Payment, cardNum1,cardNum2,cardNum3,Phonenumb;

    public DataPayment() {
    }

    public DataPayment(String name, String email, String Payment, String cardNum1, String cardNum2, String cardNum3, String Phonenumb) {
        this.name = name;
        this.email = email;
        this.Payment = Payment;
        this.cardNum1 = cardNum1;
        this.cardNum2 = cardNum2;
        this.cardNum3 = cardNum3;
        this.Phonenumb = Phonenumb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPayment() {
        return Payment;
    }

    public void setPayment(String Payment) {
        this.Payment = Payment;
    }

    public String getCardNum1() {
        return cardNum1;
    }

    public void setCardNum1(String cardNum1) {
        this.cardNum1 = cardNum1;
    }

    public String getCardNum2() {
        return cardNum2;
    }

    public void setCardNum2(String cardNum2) {
        this.cardNum2 = cardNum2;
    }

    public String getCardNum3() {
        return cardNum3;
    }

    public void setCardNum3(String cardNum3) {
        this.cardNum3 = cardNum3;
    }

    public String getPhonenumb() {
        return Phonenumb;
    }

    public void setPhonenumb(String Phonenumb) {
        this.Phonenumb = Phonenumb;
    }
    
}
