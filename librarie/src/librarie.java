import org.joda.money.*;

public class librarie {
    public static void main(String[] args) {
        Money money = Money.parse("RON 15.55");
        money = money.plus(3);
        System.out.println(money.toString());
    }
}

