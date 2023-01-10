package Patterns.Strategy.PayPal;

import Patterns.Strategy.IPayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Concrete strategy
 * Implements PayPal payment method.
 */
public class PayByPayPal implements IPayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("password1","mrbyte@gmail.com");
        DATA_BASE.put("123456","beytu@amazon.eu");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn){
            System.out.println("Paying " + paymentAmount + " using PayPal");
            return true;
        }

        return false;
    }

    /**
     * Collect customers data.
     */
    @Override
    public void collectPaymentDetails() {
        try{
            while (!signedIn){
                System.out.println("Enter the user's email: ");
                email = reader.readLine();
                System.out.println("Enter the password: ");
                password = reader.readLine();

                if (verify()){
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
