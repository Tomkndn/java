package BTech;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
public class currencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Amount: ");
        double amnt = sc.nextDouble();
        NumberFormat amnt1 = NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormatSymbols formatIn = new DecimalFormatSymbols();
        formatIn.setCurrencySymbol("Rs.");
        Locale IND = new Locale("en", "IN");
        NumberFormat amnt2 = NumberFormat.getCurrencyInstance(IND);
        ((DecimalFormat) amnt2).setDecimalFormatSymbols(formatIn);
//        NumberFormat amnt2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat amnt3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat amnt4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String payment1 = amnt1.format(amnt);
        String payment2 = amnt2.format(amnt);
        String payment3 = amnt3.format(amnt);
        String payment4 = amnt4.format(amnt);
        System.out.println("US: "+payment1);
        System.out.println("India: "+payment2);
        System.out.println("China: "+payment3);
        System.out.println("France: "+payment4);
        sc.close();
    }
}
