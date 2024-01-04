package tugasPbo;

public class Kalkulator {
        private double value1;
        private double value2;
        private String namaProjek;
        private String noteProjek;

        public double getValue1() {
            return value1;
        }

        public void setValue1(double value1) {
            this.value1 = value1;
        }

        public double getValue2() {
            return value2;
        }

        public void setValue2(double value2) {
            this.value2 = value2;
        }

        public void setNamaProjek(String namaProjek) {
            this.namaProjek = namaProjek;
        }

        public void setNoteProjek(String noteProjek) {
            this.noteProjek = noteProjek;
        }

        public double add(double val1, double val2) {
            return val1 + val2;
        }

        public double minus(double val1, double val2) {
            return val1 - val2;
        }

        public double multiplication(double val1, double val2) {
            return val1 * val2;
        }

        public double division(double val1, double val2) {
            if (val2 != 0) {
                return val1 / val2;
            } else {
                System.out.println("Cannot divide by zero.");
                return Double.NaN; // Not-a-Number
            }
        }

        public static void main(String[] args) {
            Kalkulator kalkulator = new Kalkulator();

            kalkulator.setValue1(7.2);
            kalkulator.setValue2(5.0);
            kalkulator.setNamaProjek("Calculator");
            kalkulator.setNoteProjek("This project shows you how to manage methods in Java");

            double addResult = kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2());
            double minusResult = kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2());
            double multiplicationResult = kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2());
            double divisionResult = kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2());

            System.out.println("VALUE 1 = " + kalkulator.getValue1());
            System.out.println("VALUE 2 = " + kalkulator.getValue2());
            System.out.println("Project " + kalkulator.namaProjek + " " + kalkulator.noteProjek);
            System.out.println("Result Add is = " + addResult);
            System.out.println("Result Minus is = " + minusResult);
            System.out.println("Result multiplication is = " + multiplicationResult);
            System.out.println("Result Division = " + divisionResult);
        }
}
