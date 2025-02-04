public class calcularmaximinv2 {
    
    public static double calcularMinimo(double[] notas) {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }

    public static double calcularMaximo(double[] notas) {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

}
