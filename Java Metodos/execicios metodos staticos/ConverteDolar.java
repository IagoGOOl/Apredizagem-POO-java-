public class ConverteDolar {
    public static final double IOF = 0.06;
    public static double  ValorReal (double dolar, double valDolar){
        double valorReal = dolar * valDolar * (1.0 + IOF);
        return valorReal;
    }

  

}
