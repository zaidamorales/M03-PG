package pr2.projecte.pkg2;

import java.util.Scanner;

/**
 *
 * @author zaida
 */
public class PR2Projecte2 {

    //Declaramos todas las constantes en mensaje.
    private static final int MINIM_ID = 111;
    private static final int MAXIM_ID = 999;
    private static final int MINIM_EDAT = 14;
    private static final int MAXIM_EDAT = 120;
    private static final int MINIMO_TIPO = 0;
    private static final int MAXIMO_TIPO = 3;
    private static final int MINIM_IMPORT = 0;
    private static final int MAXIM_IMPORT = 1000;
    private static final int MINIM_TELEFON = 111111111;
    private static final int MAXIM_TELEFON = 999999999;
    private static final String TXT_VENTALIBRE = "V.Libre";
    private static final String TXT_PENSIONISTA = "Pensión";
    private static final String TXT_CARNETJOVEN = "C.Joven";
    private static final String TXT_SOCIO = "Socio";
    //Declaramos todos los mensajes.
    private static final String MSG_1 = "Los datos de cuantos clientes quiere a introducir?";
    private static final String MSG_2 = "Introduce el ID del cliente.";
    private static final String MSG_3 = "Error. Vuelve a intentarlo";
    private static final String MSG_4 = "Introduce la edad del cliente.";
    private static final String MSG_5 = "TIPO DE VENTA.";
    private static final String MSG_6 = "Venta libre (0)";
    private static final String MSG_7 = "Pensionista (1)";
    private static final String MSG_8 = "Carnet Joven (2)";
    private static final String MSG_9 = "Socio (3)";
    private static final String MSG_10 = "Indica el numero de tipo de venta a continuacion: ";
    private static final String MSG_11 = "Introduce el importe total de la compra.";
    private static final String MSG_12 = "Introduce el numero de telefono del cliente.";
    private static final String MSG_13 = "ID" + "\t" + "EDAD" + "\t" + "TIPO" + "\t" + "IMPORTE" + "\t" + "TELÉFONO";
    private static final String MSG_14 = "La cantidad de registros de clientes introducidos es de ";
    private static final String MSG_15 = "Quieres consultar por tipo de cliente? (si: 1 / no: 0).";
    private static final String MSG_16 = "Que tipo de cliente? (V.Libre: 0 / Pensión: 1 / C.Joven: 2 / Socio: 3)";
    private static final String MSG_17 = "Error en los datos.";
    private static final String MSG_18 = "Quieres ver un resumen estadistico de los datos? (si: 1 / no: 0).";
    private static final String MSG_19 = "Numero de clientes por tipo:";
    private static final String MSG_20 = "Histograma de numero de clientes por tipo:";
    private static final String MSG_21 = "Importe total acumulado: ";
    private static final String MSG_22 = "-----------------------------";
    private static final String MSG_23 = "La edad media es: ";
    private static final String MSG_24 = "Años";

    public static void main(String[] args) {
        int clientes, error = 0, error1, a = 1, consulta = 0, tipoCliente = 0, contador = 0, contador1 = 0, contador2 = 0, contador3 = 0, total = 0, cambio = 0;
        boolean dadaCorrecta = true;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        clientes = sc.nextInt();
        int[] id = new int[clientes];
        int[] edad = new int[clientes];
        int[] tipo = new int[clientes];
        String[] tipoString = new String[clientes];
        int[] importeCompra = new int[clientes];
        int[] telefono = new int[clientes];
        int[] histograma = new int[4];
        for (int i = 0; i < id.length; i++, a++) {
            error = 0;
            error1 = 0;
            System.out.println("CLIENTE " + a);
            do {
                System.out.println(MSG_2);
                dadaCorrecta = sc.hasNextInt();
                if (dadaCorrecta) {
                    id[i] = sc.nextInt();
                    if ((id[i] < MINIM_ID) || (id[i] > MAXIM_ID)) {
                        dadaCorrecta = false;
                        System.out.println(MSG_3);
                        error1++;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_3);
                    error1++;
                }
                error++;
            } while ((!dadaCorrecta) && (error < 3));
            error = 0;
            if (error < 3 && dadaCorrecta) {
                error1 = 0;
                do {
                    System.out.println(MSG_4);
                    dadaCorrecta = sc.hasNextInt();
                    if (dadaCorrecta) {
                        edad[i] = sc.nextInt();
                        if ((edad[i] < MINIM_EDAT) || (edad[i] > MAXIM_EDAT)) {
                            dadaCorrecta = false;
                            System.out.println(MSG_3);
                            error1++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                        error1++;
                    }
                    error++;
                } while ((!dadaCorrecta) && (error < 3));
            }
            error = 0;
            if (error < 3 && dadaCorrecta) {
                error1 = 0;
                do {
                    System.out.println(MSG_5);
                    System.out.println(MSG_6);
                    System.out.println(MSG_7);
                    System.out.println(MSG_8);
                    System.out.println(MSG_9);
                    System.out.println(MSG_10);
                    dadaCorrecta = sc.hasNextInt();
                    if (dadaCorrecta) {
                        tipo[i] = sc.nextInt();
                        if ((tipo[i] < MINIMO_TIPO) || (tipo[i] > MAXIMO_TIPO)) {
                            dadaCorrecta = false;
                            System.out.println(MSG_3);
                            error1++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                        error1++;
                    }
                    error++;
                } while ((!dadaCorrecta) && (error < 3));
            }
            error = 0;
            if (error < 3 && dadaCorrecta) {
                error1 = 0;
                do {
                    System.out.println(MSG_11);
                    dadaCorrecta = sc.hasNextInt();
                    if (dadaCorrecta) {
                        importeCompra[i] = sc.nextInt();
                        if ((importeCompra[i] < MINIM_IMPORT) || (importeCompra[i] > MAXIM_IMPORT)) {
                            dadaCorrecta = false;
                            System.out.println(MSG_3);
                            error1++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                        error1++;
                    }
                    error++;
                } while ((!dadaCorrecta) && (error < 3));
            }
            error = 0;
            if (error < 3 && dadaCorrecta) {
                error1 = 0;
                do {
                    System.out.println(MSG_12);
                    dadaCorrecta = sc.hasNextInt();
                    if (dadaCorrecta) {
                        telefono[i] = sc.nextInt();
                        if ((telefono[i] < MINIM_TELEFON) || (telefono[i] > MAXIM_TELEFON)) {
                            dadaCorrecta = false;
                            System.out.println(MSG_3);
                            error1++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                        error1++;
                    }
                    error++;
                } while ((!dadaCorrecta) && (error < 3));
            }
            if (error1 >= 3) {
                i = i - 1;
                a = a - 1;
            }
        }
        for (int i = 0; i < edad.length - 1; i++) {
            for (int j = i + 1; j < edad.length; j++) {
                if (edad[i] > edad[j]) {
                    cambio = id[i];
                    id[i] = id[j];
                    id[j] = cambio;
                    cambio = edad[i];
                    edad[i] = edad[j];
                    edad[j] = cambio;
                    cambio = tipo[i];
                    tipo[i] = tipo[j];
                    tipo[j] = cambio;
                    cambio = importeCompra[i];
                    importeCompra[i] = importeCompra[j];
                    importeCompra[j] = cambio;
                    cambio = telefono[i];
                    telefono[i] = telefono[j];
                    telefono[j] = cambio;
                }
            }
        }
        for (int i = 0; i < tipo.length; i++) {
            switch (tipo[i]) {
                case 0 ->
                    tipoString[i] = TXT_VENTALIBRE;
                case 1 ->
                    tipoString[i] = TXT_PENSIONISTA;
                case 2 ->
                    tipoString[i] = TXT_CARNETJOVEN;
                case 3 ->
                    tipoString[i] = TXT_SOCIO;
            }
        }
        if (error < 3 && dadaCorrecta) {
            System.out.println("");
            System.out.println(MSG_13);
            for (int i = 0; i < clientes; i++) {
                System.out.print(id[i]);
                System.out.print("\t");
                System.out.print(edad[i]);
                System.out.print("\t");
                System.out.print(tipoString[i]);
                System.out.print("\t");
                System.out.print(importeCompra[i]);
                System.out.print("\t");
                System.out.print(telefono[i]);
                System.out.println();
            }
        }
        if (error < 3 && dadaCorrecta) {
            System.out.println("");
            System.out.println(MSG_14 + clientes);
            System.out.println("");
            do {
                System.out.println(MSG_15);
                dadaCorrecta = sc.hasNextInt();
                if (dadaCorrecta) {
                    consulta = sc.nextInt();
                    if ((consulta < 0) || (consulta > 1)) {
                        dadaCorrecta = false;
                        System.out.println(MSG_17);
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_17);
                }
            } while ((!dadaCorrecta));
            if (consulta == 1) {
                do {
                    System.out.println(MSG_16);
                    dadaCorrecta = sc.hasNextInt();
                    if (dadaCorrecta) {
                        tipoCliente = sc.nextInt();
                        if ((tipoCliente < 0) || (tipoCliente > 3)) {
                            dadaCorrecta = false;
                            System.out.println(MSG_17);
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_17);
                    }
                } while ((!dadaCorrecta));
                if (tipoCliente == 0) {
                    System.out.println(MSG_13);
                    for (int i = 0; i < tipo.length; i++) {
                        if (tipo[i] == 0) {
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edad[i]);
                            System.out.print("\t");
                            System.out.print(tipoString[i]);
                            System.out.print("\t");
                            System.out.print(importeCompra[i]);
                            System.out.print("\t");
                            System.out.print(telefono[i]);
                            System.out.println();
                        }
                    }
                }
                if (tipoCliente == 1) {
                    System.out.println(MSG_13);
                    for (int i = 0; i < tipo.length; i++) {
                        if (tipo[i] == 1) {
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edad[i]);
                            System.out.print("\t");
                            System.out.print(tipoString[i]);
                            System.out.print("\t");
                            System.out.print(importeCompra[i]);
                            System.out.print("\t");
                            System.out.print(telefono[i]);
                            System.out.println();
                        }
                    }
                }
                if (tipoCliente == 2) {
                    System.out.println(MSG_13);
                    for (int i = 0; i < tipo.length; i++) {
                        if (tipo[i] == 2) {
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edad[i]);
                            System.out.print("\t");
                            System.out.print(tipoString[i]);
                            System.out.print("\t");
                            System.out.print(importeCompra[i]);
                            System.out.print("\t");
                            System.out.print(telefono[i]);
                            System.out.println();
                        }
                    }
                }
                if (tipoCliente == 3) {
                    System.out.println(MSG_13);
                    for (int i = 0; i < tipo.length; i++) {
                        if (tipo[i] == 3) {
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edad[i]);
                            System.out.print("\t");
                            System.out.print(tipoString[i]);
                            System.out.print("\t");
                            System.out.print(importeCompra[i]);
                            System.out.print("\t");
                            System.out.print(telefono[i]);
                            System.out.println();
                        }
                    }
                }
            }
            System.out.println("");
            System.out.println(MSG_18);
            consulta = sc.nextInt();
            if (consulta == 1) {
                System.out.println("");
                System.out.println(MSG_14 + a);
                System.out.println("");
                for (int i = 0; i < edad.length; i++) {
                    total = total + edad[i];
                }
                System.out.println(MSG_23 + (float) total / clientes + MSG_24);
                System.out.println("");
                System.out.println(MSG_19);
                System.out.println("");
                for (int i = 0; i < tipo.length; i++) {
                    if (tipo[i] == 0) {
                        contador = contador + 1;
                    }
                    if (tipo[i] == 1) {
                        contador1 = contador1 + 1;
                    }
                    if (tipo[i] == 2) {
                        contador2 = contador2 + 1;
                    }
                    if (tipo[i] == 3) {
                        contador3 = contador3 + 1;
                    }
                }
                if (contador > 0) {
                    System.out.println("V.Libre: " + contador);
                    System.out.println("");
                }
                if (contador1 > 0) {
                    System.out.println("Pensionista: " + contador1);
                    System.out.println("");
                }
                if (contador2 > 0) {
                    System.out.println("C.Joven: " + contador2);
                    System.out.println("");
                }
                if (contador3 > 0) {
                    System.out.println("Socio: " + contador3);
                    System.out.println("");
                }
                histograma[0] = contador;
                histograma[1] = contador1;
                histograma[2] = contador2;
                histograma[3] = contador3;
                System.out.println(MSG_20);
                System.out.println(MSG_22);
                for (int i = 0; i < histograma.length; i++) {
                    switch (i) {
                        case 0:
                            if (histograma[i] > 0) {
                                System.out.print("V.Libre: ");
                                break;
                            }
                        case 1:
                            if (histograma[i] > 0) {
                                System.out.print("Pensión: ");
                                break;
                            }
                        case 2:
                            if (histograma[i] > 0) {
                                System.out.print("C.Joven: ");
                                break;
                            }
                        case 3:
                            if (histograma[i] > 0) {
                                System.out.print("Socio: ");
                                break;
                            }
                    }
                    for (int j = 0; j < histograma[i]; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                total = 0;
                for (int i = 0; i < importeCompra.length; i++) {
                    total = total + importeCompra[i];
                }
                System.out.println("");
                System.out.println(MSG_21 + total);
                System.out.print("");
            }
        }

    }
}
