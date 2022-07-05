package calculadorauno;


/**
 *
 * @author natalia
 */
public class Operacion {
    
    public Operacion() {
    }

    public double sumar(double numero1, double numero2) {

        return (numero1 + numero2);

    }

    public double resta(double numero1, double numero2) {

        return (numero1 - numero2);

    }

    public double multiplicacion(double numero1, double numero2) {

        return (numero1 * numero2);

    }

    public double division(double numero1, double numero2) {

        return (numero1 / numero2);

    }

    public double potencia(double numero1, double numero2) {

        return Math.pow(numero1, numero2);

    }

    public double raizCuadrada(double numero1) {

        return Math.sqrt(numero1);

    }

}
