public class BmiService {

    double IndexCalculation(double height, double weight) {
        return weight / Math.pow(height, 2);

    }
}
