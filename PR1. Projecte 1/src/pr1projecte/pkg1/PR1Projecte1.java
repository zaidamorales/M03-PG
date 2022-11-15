/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pr1projecte.pkg1;

import java.util.Scanner;

/**
 *
 * @author zaida
 */
public class PR1Projecte1 {
    
    private static final int MINIM_ID = 111;
    private static final int MAXIM_ID = 999;
    private static final int MINIM_EDAT = 14;
    private static final int MAXIM_EDAT = 120;
    private static final int MINIM_TIPUS = 0;
    private static final int MAXIM_TIPUS = 3;
    private static final int MINIM_IMPORT = 0;
    private static final int MAXIM_IMPORT = 1000;
    private static final int MINIM_TELEFON = 111111111;
    private static final int MAXIM_TELEFON = 999999999;
    private static final String MSG_1 = "Introdueix el id:";
    private static final String MSG_2 = "Introdueix l'edat:";
    private static final String MSG_3 = "Selecciona un tipus de venda";
    private static final String MSG_8 = "Venda lliure (0)";
    private static final String MSG_9 = "Pensionista (1)";
    private static final String MSG_10 = "Carnet jove (2)";
    private static final String MSG_11 = "Soci (3)";
    private static final String MSG_4 = "Introdueix el import de la compra";
    private static final String MSG_5 = "Introdueix un telefon de contacte";
    private static final String MSG_6 = "Error, torna a intentar-ho";
    private static final String MSG_7 = "Programa finalizado";

    public static void main(String[] args) {
        boolean dadaCorrecta;
        long telefon;
        int id = 0, tipus = 0, edat = 0, importcompra = 0, i = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(MSG_1);
            dadaCorrecta = sc.hasNextInt();
            if (dadaCorrecta) {
                
                id = sc.nextInt();
                if (id < MINIM_ID || id > MAXIM_ID) {
                    dadaCorrecta = false;
                    System.out.println(MSG_6);
                }
            }
            i++;
        } while ((!dadaCorrecta) && (i < 3));

        if (i <= 3 && dadaCorrecta) {
            i = 0;
            do {
                System.out.println(MSG_2);
                dadaCorrecta = sc.hasNextInt();
                if (dadaCorrecta) {
                    edat = sc.nextInt();
                    if (edat < MINIM_EDAT || edat > MAXIM_EDAT) {
                        dadaCorrecta = false;
                        System.out.println(MSG_6);
                    }
                }
                i++;
            } while ((!dadaCorrecta) && (i < 3));
        }

        if (i <= 3 && dadaCorrecta) {
            i = 0;
            do {
                System.out.println(MSG_3);
                System.out.println(MSG_8);
                System.out.println(MSG_9);
                System.out.println(MSG_10);
                System.out.println(MSG_11);

                dadaCorrecta = sc.hasNextInt();
                if (dadaCorrecta) {
                    tipus = sc.nextInt();
                    if (tipus < MINIM_TIPUS || tipus > MAXIM_TIPUS) {
                        dadaCorrecta = false;
                        System.out.println(MSG_6);
                    }
                }
                i++;
            } while ((!dadaCorrecta) && (i < 3));
            
            switch (tipus) {
            case 0 ->
                System.out.println("Has seleccionado la opcion Venda lliure (0)");
            case 1 ->
                System.out.println("Has seleccionado la opcion Pensionista (1)");
            case 2 ->
                System.out.println("Has seleccionado la opcion Carnet jove (2)");
            case 3 ->
                System.out.println("Has seleccionado la opcion Soci (3)");    
            default ->
                System.out.println("Solo números entre 0 y 3");
            }
        }
        
        if (i <= 3 && dadaCorrecta) {
            i = 0;
            do {
                System.out.println(MSG_4);
                dadaCorrecta = sc.hasNextInt();
                if (dadaCorrecta) {
                    importcompra = sc.nextInt();
                    if (importcompra < MINIM_IMPORT || importcompra > MAXIM_IMPORT) {
                        dadaCorrecta = false;
                        System.out.println(MSG_6);
                    }
                }
                i++;
            } while ((!dadaCorrecta) && (i < 3));
        }
        if (i <= 3 && dadaCorrecta) {
            i = 0;
            do {
                System.out.println(MSG_5);
                dadaCorrecta = sc.hasNextLong();
                if (dadaCorrecta) {
                    telefon = sc.nextLong();
                    if (telefon < MINIM_TELEFON || telefon > MAXIM_TELEFON) {
                        dadaCorrecta = false;
                        System.out.println(MSG_6);
                    }
                    System.out.println("id\tedat\ttipus\timportcompra\ttelefon");
                    System.out.println(id + "\t" + edat + "\t" + tipus + "\t" + importcompra + "\t\t" + telefon);
                }
                i++;
            } while ((!dadaCorrecta) && (i < 3));
        }
        System.out.println(MSG_7);

    }
}
