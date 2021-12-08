public class calc_controller {
    private calc_model calculator;
    private calc_view calculatorView;

    public calc_controller(calc_model calculator, calc_view calculatorView) {
        this.calculator = calculator;
        this.calculatorView = calculatorView;
    }

    public void calculate() {
        try {
            String expression = calculatorView.getExpression();
            int result = calculator.calculate(expression);
            calculatorView.printResult(result);
        } catch (Exception e) {
            calculatorView.printException(e);
        }
    }

    public static void main(String[] args) {
        new calc_controller(
                new calc_model(),
                new calc_view()
        ).calculate();
    }
}
