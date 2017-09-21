/**
 * Created by jackbrashier on 9/15/17.
 */
public class LedgerDriver {
    public static void main(String [] args) {
        Ledger pawnShop = new Ledger(4);

        /** Making two sales worth $4.99 and $9.00 */
        pawnShop.addSale(4.99);
        pawnShop.addSale(9);

        /** Returning the amount of sales made so far, should be 2 */
        System.out.println("You've made " + pawnShop.getNumberOfSales() + " sales.");

        /** Making two sales worth $46.50 and $1.99 */
        pawnShop.addSale(46.50);
        pawnShop.addSale(1.99);

        /** Returning the amount of sales made so far, should be 4 */
        System.out.println("You've made " + pawnShop.getNumberOfSales() + " sales.");

        /** Returning the value of all sales made so far, should be $62.48 */
        System.out.println("You've made $" + pawnShop.getTotalSales() + ".");

    }
}
