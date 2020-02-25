public class Bmi {
    public static void main(String[] args) {
        double height = 1.78;
        double weight = 65;
        BmiService bmiCalculator = new BmiService();
        double index = (int) bmiCalculator.indexCalculation(height, weight);

        System.out.println("Ваш Индекс  массы тела равен " + index);


    }
}
