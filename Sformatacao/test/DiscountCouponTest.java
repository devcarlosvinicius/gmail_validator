package maratonajava.javacore.Sformatacao.test;

import java.util.Scanner;

import static maratonajava.javacore.Sformatacao.dominio.DiscountCoupon.couponTest;

public class DiscountCouponTest {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insert the coupon: ");
            String coupon = scanner.nextLine();
            couponTest(coupon);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
