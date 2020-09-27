package Infrastructure;

public class FractionNumberApp {

        public static void main(String[] args) {
            FractionNumber number1 = new FractionNumber(1, 2);
            FractionNumber number2 = new FractionNumber(1, 4);

            FractionNumber plusResult = number1.plus(number2);
            System.out.println(plusResult);

            FractionNumber minusResult = number1.minus(number2);
            System.out.println(minusResult);

            FractionNumber multiplyResult = number1.multiply(number2);
            System.out.println(multiplyResult);

            FractionNumber devideResult = number1.devide(number2);
            System.out.println(devideResult);
        }

}
