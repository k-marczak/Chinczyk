import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void drukujTablice(char[] tab_trasa, int a1, int a2, int a3, int a4, int b1, int b2, int b3, int b4, int c1, int c2, int c3, int c4, int d1, int d2, int d3, int d4) {


        System.out.println("\t\t       0");
        System.out.println("\t " + tab_trasa[54] + " \t" + "   " + tab_trasa[38] + " " + tab_trasa[39] + " " + tab_trasa[0] + "\t" + tab_trasa[51]);
        System.out.println("\t" + tab_trasa[58] + " " + tab_trasa[62] + "\t" + "   " + tab_trasa[37] + "   " + tab_trasa[1] + "\t" + tab_trasa[55] + " " + tab_trasa[59]);
        System.out.println("\t\t" + "   " + tab_trasa[36] + "   " + tab_trasa[2]);
        System.out.println("\t\t" + "   " + tab_trasa[35] + "   " + tab_trasa[3]);
        System.out.println("30 " + tab_trasa[30] + " " + tab_trasa[31] + " " + tab_trasa[32] + " " + tab_trasa[33] + " " + tab_trasa[34] + "   " + tab_trasa[4] + " " + tab_trasa[5] + " " + tab_trasa[6] + " " + tab_trasa[7] + " " + tab_trasa[8]);
        System.out.println("   " + tab_trasa[29] + "\t\t\t\t   " + tab_trasa[9]);
        System.out.println("   " + tab_trasa[28] + " " + tab_trasa[27] + " " + tab_trasa[26] + " " + tab_trasa[25] + " " + tab_trasa[24] + "   " + tab_trasa[14] + " " + tab_trasa[13] + " " + tab_trasa[12] + " " + tab_trasa[11] + " " + tab_trasa[10] + " 10");
        System.out.println("\t\t" + "   " + tab_trasa[23] + "   " + tab_trasa[15]);
        System.out.println("\t\t" + "   " + tab_trasa[22] + "   " + tab_trasa[16]);
        System.out.println("\t" + tab_trasa[53] + " " + tab_trasa[57] + "\t" + "   " + tab_trasa[21] + "   " + tab_trasa[17] + "\t" + tab_trasa[52] + " " + tab_trasa[56]);
        System.out.println("\t" + tab_trasa[61] + " " + "\t" + "   " + tab_trasa[20] + " " + tab_trasa[19] + " " + tab_trasa[18] + "\t" + tab_trasa[60]);
        System.out.println("\t      20");


    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        char[] tablica = new char[70];

        int a1Index = 0;
        int b1Index = 10;
        int c1Index = 20;
        int d1Index = 30;

        int a2Index = 51;
        int b2Index = 52;
        int c2Index = 53;
        int d2Index = 54;

        int a3Index = 55;
        int b3Index = 56;
        int c3Index = 57;
        int d3Index = 58;

        int a4Index = 59;
        int b4Index = 60;
        int c4Index = 61;
        int d4Index = 62;


        int gracz = random.nextInt(4) + 1;


        Arrays.fill(tablica, '*');


        System.out.println("Cześć! Zagrajmy w czterech!");


        int[] tablicaIndeksow = {a1Index, a2Index, a3Index, a4Index, b1Index, b2Index, b3Index, b4Index, c1Index, c2Index, c3Index, c4Index, d1Index, d2Index, d3Index, d4Index};
        int[] tablicaPionkowA = {tablica[51], tablica[55], tablica[59]};


        while (true) {
            int losowyRuch = random.nextInt(6) + 1;
            if (gracz > 4) {
                gracz = 1;
            }
            System.out.println("Ruch gracza nr: " + gracz);
            System.out.println("Wylosowano: " + losowyRuch);

            if (gracz == 1) {

                System.out.println("Graczu 1, którym pionem chcesz się ruszyć?: ");
                int wyborPiona = scanner.nextInt();
                if (wyborPiona == 1) {
                    if (a1Index + losowyRuch >= 40) {
                        int result = 40 - a1Index;
                        losowyRuch = losowyRuch - result;
                        tablica[a1Index] = '*';
                        a1Index = losowyRuch;
                    } else {
                        tablica[a1Index] = '*';
                        a1Index = a1Index + losowyRuch;
                    }
                }
                if (wyborPiona == 2) {
                    if (a2Index == 51) {
                        tablica[a2Index] = ' ';
                        a2Index = 0;
                    }
                    if (a2Index + losowyRuch >= 40) {
                        int result = 40 - a2Index;
                        losowyRuch = losowyRuch - result;
                        tablica[a2Index] = '*';
                        a2Index = losowyRuch;
                    } else {
                        tablica[a2Index] = '*';
                        a2Index = a2Index + losowyRuch;
                    }
                }

                if (wyborPiona == 3) {
                    if (a3Index == 55) {
                        tablica[a3Index] = ' ';
                        a3Index = 0;
                    }
                    if (a3Index + losowyRuch >= 40) {
                        int result = 40 - a3Index;
                        losowyRuch = losowyRuch - result;
                        tablica[a3Index] = '*';
                        a3Index = losowyRuch;
                    } else {

                        tablica[a3Index] = '*';
                        a3Index = a3Index + losowyRuch;
                    }
                }

                if (wyborPiona == 4) {
                    if (a4Index == 59) {
                        tablica[a4Index] = ' ';
                        a4Index = 0;
                    }
                    if (a4Index + losowyRuch >= 40) {
                        int result = 40 - a2Index;
                        losowyRuch = losowyRuch - result;
                        tablica[a4Index] = '*';
                        a4Index = losowyRuch;
                    } else {
                        tablica[a4Index] = '*';
                        a4Index = a4Index + losowyRuch;
                    }
                }

            }
            if (gracz == 2) {
                System.out.println("Graczu 2, którym pionem chcesz się ruszyć?: ");
                int wyborPiona = scanner.nextInt();
                if (wyborPiona == 1) {
                    if (b1Index + losowyRuch >= 40) {
                        int result = 40 - b1Index;
                        losowyRuch = losowyRuch - result;
                        tablica[b1Index] = '*';
                        b1Index = losowyRuch;
                    } else {
                        tablica[b1Index] = '*';
                        b1Index = b1Index + losowyRuch;
                    }

                }
            }
            if (gracz == 3) {
                System.out.println("Graczu 3, którym pionem chcesz się ruszyć?: ");
                int wyborPiona = scanner.nextInt();
                if (wyborPiona == 1) {
                    if (c1Index + losowyRuch >= 40) {
                        int result = 40 - c1Index;
                        losowyRuch = losowyRuch - result;
                        tablica[c1Index] = '*';
                        c1Index = losowyRuch;
                    } else {
                        tablica[c1Index] = '*';
                        c1Index = c1Index + losowyRuch;
                    }
                }
            }
            if (gracz == 4) {
                System.out.println("Graczu 4, którym pionem chcesz się ruszyć?: ");
                int wyborPiona = scanner.nextInt();
                if (wyborPiona == 1) {
                    if (d1Index + losowyRuch >= 40) {
                        int result = 40 - d1Index;
                        losowyRuch = losowyRuch - result;
                        tablica[d1Index] = '*';
                        d1Index = losowyRuch;

                    } else {
                        tablica[d1Index] = '*';
                        d1Index = d1Index + losowyRuch;
                    }
                }
            }

            gracz++;


            tablica[a1Index] = 'a';
            tablica[b1Index] = 'b';
            tablica[c1Index] = 'c';
            tablica[d1Index] = 'd';

            tablica[a2Index] = 'a';
            tablica[b2Index] = 'b';
            tablica[c2Index] = 'c';
            tablica[d2Index] = 'd';

            tablica[a3Index] = 'a';
            tablica[b3Index] = 'b';
            tablica[c3Index] = 'c';
            tablica[d3Index] = 'd';

            tablica[a4Index] = 'a';
            tablica[b4Index] = 'b';
            tablica[c4Index] = 'c';
            tablica[d4Index] = 'd';

            drukujTablice(tablica, a1Index, a2Index, a3Index, a4Index, b1Index, b2Index, b3Index, b4Index, c1Index, c2Index, c3Index, c4Index, d1Index, d2Index, d3Index, d4Index);
        }


    }


}