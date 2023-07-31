/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

/**
 *
 * @author ayamo
 */
public class CreditCardStrategy implements PaymentStrategy{

    private String name,cardNumber,cvv, dateExpiry;

    public CreditCardStrategy() {
    }

    
    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateExpiry = dateExpiry;
    }
    
    
    
    @Override
    public void pay(double price) {
        System.out.println("Paid with credit card: "+ price);
    }
    
}
