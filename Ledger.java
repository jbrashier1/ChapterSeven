import java.util.ArrayList;
/**
 * Created by Jack Brashier
 * Date: 09/15/2017
 * Professor Kanchanawanchai
 * Purpose: To demonstrate understanding of arrays as attributes in Object Oriented Programming.
 */
public class Ledger {
    private int salesMade;
    private int maxSales;
    private double[] sale;
    private static int saleNum = 0;

    /** Constructor with one attribute "max" */
    public Ledger(int max) {
        this.maxSales = max;
        this.sale = new double[max];
    }

    /** Adds a sale of <value> dollars to the ledger */
    public void addSale(double value) {
        if(saleNum <= this.maxSales) {
            this.sale[saleNum] = value;
            saleNum++;
        }
    }

    /** returns the amount of sales executed thus far */
    public int getNumberOfSales() {
        return saleNum;
    }

    /** returns the total value of all sales executed thus far */
    public double getTotalSales() {
        double total = 0;
        for(int i = 0; i < this.maxSales; i++) {
            total += this.sale[i];
        }
        return (Math.floor(total * 100) / 100);
    }
}
