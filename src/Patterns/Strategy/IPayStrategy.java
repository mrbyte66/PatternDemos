package Patterns.Strategy;

/**
 * Common interface for all strategies.
 */
public interface IPayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
