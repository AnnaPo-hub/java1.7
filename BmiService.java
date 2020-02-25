public class BmiService {

    double indexCalculation(double height, double weight) {
        return weight / Math.pow(height, 2);

    }
}
