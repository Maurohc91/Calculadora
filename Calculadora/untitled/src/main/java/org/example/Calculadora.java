package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;




public class Calculadora {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double operando1 = 0;
        double operando2 = 0;
        String signo = "x";
        boolean numerovalido = false;

        System.out.println("BIENVENIDO A MI CALCULADORA.");

        while (!numerovalido) {
            try {


                System.out.println("Introduce el primer operando: ");
                operando1 = entrada.nextDouble();
                numerovalido = true;

            } catch (InputMismatchException er) {
                System.out.println("Introduce el primer operando bien.");
                entrada.nextLine();
            }
        }
        boolean signovalido = false;

        while (!signovalido) {
            System.out.println("Introduce el signo a aplicar (+,-,x,/,R)");
            signo = entrada.next();
            signo = signo.toLowerCase();

            if (!signo.equals("+") && !signo.equals("-") && !signo.equalsIgnoreCase("x") && !signo.equals("/") && !signo.equalsIgnoreCase("R")) {
                System.out.println("no es correcto.");
                entrada.nextLine();
            } else {
                signovalido = true;

            }
        }

        if (!signo.equalsIgnoreCase("r")) {

            boolean numerovalido2 = false;
            while (!numerovalido2) {
                try {

                    System.out.println("Introduce el segundo operando: ");
                    operando2 = entrada.nextDouble();
                    numerovalido2 = true;

                } catch (InputMismatchException er2) {
                    System.out.println("Introduce el segundo operando bien.");
                    entrada.nextLine();
                }
            }
        }

                switch (signo.toLowerCase()) {
                    case "+":
                        System.out.println(operando1 + operando2);
                        break;

                    case "-":
                        System.out.println(operando1 - operando2);
                        break;

                    case "x":
                        System.out.println(operando1 * operando2);
                        break;

                    case "/":
                        if (operando2 == 0) {
                            System.out.println("No se puede dividir entre 0.");
                        } else {
                            System.out.println(operando1 / operando2);
                        }
                        break;
                    case "r":
                        if (operando1 > 0) {

                            System.out.println(Math.sqrt(operando1));

                        } else {
                            System.out.println("Introduce un número correcto para este formato.");
                        }
                        break;

                    default:
                        System.out.println("Operación inválida");
                        break;
                }
            }
        }



