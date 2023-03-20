public class Calcular {
    public  final double PI = 3.14159;

    public  double circuferencia(double radius){
        return 2.0 * PI * radius;
    }

    //metodos statico para calcualar o volume
    public  double volume (double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
