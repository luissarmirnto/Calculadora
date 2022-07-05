/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorauno;

import javax.swing.JOptionPane;

/**
 *
 * @author natalia
 */
public class CalculadoraUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final String menuInicial = "Selecciona una opcion:"
                + "\n"
                + "\n"
                + "1. Realizar una operacion"
                + "\n"
                + "2. Salir";

        int num;

        String opcion1 = JOptionPane.showInputDialog(null, menuInicial, "Menú Inicial", 0);
        num = Integer.parseInt(opcion1);

        if (num == 1) {
            mostarMenuOperaciones();
        }

    }

    public static void mostarMenuOperaciones() {

        while (true) {

            final String menuOperacion = "Selecciona una opcion:"
                    + "\n"
                    + "\n"
                    + "1. Suma"
                    + "\n"
                    + "2. Resta"
                    + "\n"
                    + "3. Multiplicacion"
                    + "\n"
                    + "4. Division"
                    + "\n"
                    + "5. Potencia"
                    + "\n"
                    + "6. Raiz cuadrada"
                    + "\n"
                    + "7. Salir";

            String opcion2 = JOptionPane.showInputDialog(null, menuOperacion, "Menú Operacion", JOptionPane.DEFAULT_OPTION);
            int operacion = Integer.parseInt(opcion2);

            Operacion operation = new Operacion();
            double resultado = 0;
            if (operacion == 7) {
                break;
            }

            if (operacion >= 1 && operacion <= 6) {

                if (operacion == 6) {
                    String strNum1 = JOptionPane.showInputDialog("Ingrese el numero 1");
                    try {
                        double numero1 = Double.parseDouble(strNum1);
                        resultado = operation.raizCuadrada(numero1);
                        resultado = Math.round(resultado * 100.0) / 100.0;
                        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Deben ser solo valor numerico");
                    }
                    //double numero1 = Double.parseDouble(strNumero1);
                    //resultado = operation.raizCuadrada(numero1);
                } else {
                    String strNumero1 = JOptionPane.showInputDialog("Ingrese el numero 1");
                    String strNumero2 = JOptionPane.showInputDialog("Ingrese el numero 2");
                    try {
                        double numero1 = Double.parseDouble(strNumero1);
                        double numero2 = Double.parseDouble(strNumero2);

                        if (operacion == 1) {
                            resultado = operation.sumar(numero1, numero2);
                            resultado = Math.round(resultado * 100.0) / 100.0;
                            JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
                        } else if (operacion == 2) {
                            resultado = operation.resta(numero1, numero2);
                            resultado = Math.round(resultado * 100.0) / 100.0;
                            JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
                        } else if (operacion == 3) {
                            resultado = operation.multiplicacion(numero1, numero2);
                            resultado = Math.round(resultado * 100.0) / 100.0;
                            JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
                        } else if (operacion == 4) {
                            if (numero2 != 0) {
                                resultado = operation.division(numero1, numero2);
                                resultado = Math.round(resultado * 100.0) / 100.0;
                                JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
                            } else {
                                JOptionPane.showMessageDialog(null, "No se permiten divisiones por cero: " + resultado);

                            }

                        } else if (operacion == 5) {
                            resultado = operation.potencia(numero1, numero2);
                            resultado = Math.round(resultado * 100.0) / 100.0;
                            JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Deben ser solo valor numerico");
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Opción incorrecta");
            }

        }
    }

}
