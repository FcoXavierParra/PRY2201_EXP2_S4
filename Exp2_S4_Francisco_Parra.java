/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exp2_s4_francisco_parra;

/*** @author fparraa */

import java.util.Scanner;

public class Exp2_S4_Francisco_Parra {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PRECIO_BASE = 10000;
        boolean continuarPrograma = true;

        // Carrito de compras (máximo 100 compras): zona, precio base, descuento %, precio final
        String[][] carrito = new String[100][4];
        int indiceCarrito = 0;

        System.out.println("\n      BIENVENIDO AL TEATRO MORO     ");
        System.out.println("\n===== SISTEMA DE COMPRA DE ENTRADAS=====");
        for (int i = 0; i < 100 && continuarPrograma; i++) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Finalizar compra");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    // Plano del teatro
                    System.out.println("\nZONAS DISPONIBLES: A.Premium, B.Media, C.Baja");
                    System.out.print("Ingrese la zona (A/B/C): ");
                    String zona = scanner.nextLine().toUpperCase();

                    double precioZona = 0;
                    boolean zonaValida = true;

                    if (zona.equals("A")) {
                        precioZona = PRECIO_BASE + 2000;
                    } else if (zona.equals("B")) {
                        precioZona = PRECIO_BASE;
                    } else if (zona.equals("C")) {
                        precioZona = PRECIO_BASE - 2000;
                    } else {
                        System.out.println("Zona inválida.");
                        zonaValida = false;
                    }

                    if (!zonaValida) {
                        break;
                    }

                    System.out.print("Ingrese su edad: ");
                    int edad = scanner.nextInt();
                    if (edad <= 0 || edad > 120) {
                        System.out.println("Edad no válida.");
                        break;
                    }

                    System.out.print("¿Es estudiante? (s/n): ");
                    String esEstudiante = scanner.next().toLowerCase();
                    double descuento = 0;

                    if (edad >= 60) {
                        descuento = 0.15;
                    } else if (esEstudiante.equals("s")) {
                        descuento = 0.10;
                    }

                    double precioFinal = precioZona;
                    int contador = 1;
                    while (contador <= 1) {
                        precioFinal = precioZona - (precioZona * descuento);
                        contador++;
                    }

                    // Agregar al carrito
                    carrito[indiceCarrito][0] = zona;
                    carrito[indiceCarrito][1] = String.valueOf(precioZona);
                    carrito[indiceCarrito][2] = String.valueOf(descuento * 100) + "%";
                    carrito[indiceCarrito][3] = String.valueOf(precioFinal);
                    indiceCarrito++;

                    System.out.println("\nEntrada agregada al carrito.");
                    System.out.println("  Precio Zona :  $" + precioZona);
                    System.out.println("  Descuento aplicado: " + (descuento * 100) + "%");
                    System.out.println("  Precio final: $" + precioFinal);
                    break;

                case 2:
                    // Mostrar resumen de todas las compras
                    if (indiceCarrito == 0) {
                        System.out.println("\nNo hay entradas en el carrito.");
                    } else {
                        System.out.println("\n===== RESUMEN DE COMPRAS =====");
                        double totalPagar = 0;
                        for (int j = 0; j < indiceCarrito; j++) {
                            System.out.println("Entrada " + (j + 1) + ":");
                            System.out.println("  Zona: " + carrito[j][0]);
                            System.out.println("  Precio base: $" + carrito[j][1]);
                            System.out.println("  Descuento: " + carrito[j][2]);
                            System.out.println("  Precio final: $" + carrito[j][3]);
                            totalPagar += Double.parseDouble(carrito[j][3]);
                        }
                        System.out.println("\nTotal a pagar: $" + totalPagar);
                        System.out.println("¡Gracias por su compra! ¡Esperamos que vuelva pronto!");
                        // Reiniciar programa tras finalizar compra
                        continuarPrograma = false;
                    }
                    break;

                case 3:
                    System.out.println("\n Esperamos verte pronto. Teatro Moro");
                    continuarPrograma = false;
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        scanner.close();
    }
}