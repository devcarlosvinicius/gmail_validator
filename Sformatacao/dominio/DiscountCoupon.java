package maratonajava.javacore.Sformatacao.dominio;


import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class DiscountCoupon {
    private static final String coupon = "PROMO2026";
    private static final Calendar expired = Calendar.getInstance();
    private static final Locale[] locale = new Locale[3];

    static {
        expired.set(2026, Calendar.JUNE, 12);
        locale[0] = Locale.US;
        locale[1] = Locale.JAPAN;
        locale[2] = new Locale("pt", "BR");

    }

    public static void couponTest(String coupon) throws Exception {
        if (!coupon.equals(DiscountCoupon.coupon)) {
            throw new InvalidCouponException("Put a coupon valid!");
        }
        final Calendar c = Calendar.getInstance();
        if (c.after(expired)){
            throw new ExpiredCouponException("Coupon Expired!");
        }

        NumberFormat[] nf = new NumberFormat[3];
        nf[0] = NumberFormat.getCurrencyInstance(Locale.US);
        nf[1] = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        nf[2] = NumberFormat.getCurrencyInstance(locale[2]);
        System.out.println("Success using coupon!");
       for (NumberFormat numberFormat : nf){
           if (numberFormat.equals(nf[0])) {
               System.out.println("Discount:" + numberFormat.format(50 / 5.23));
           } else if (numberFormat.equals(nf[1])){
               System.out.println("Discount:" + numberFormat.format(50 * 31.87));
           } else {
               System.out.println("Discount:" + numberFormat.format(50));
           }
       }
    }
}
