import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void drukujTablice(char[] tab_trasa, int a1, int a2, int a3, int a4, int b1, int b2, int b3, int b4, int c1, int c2, int c3, int c4, int d1, int d2, int d3, int d4) {


        System.out.println("\t\t       0");
        System.out.println("\t" + tab_trasa[63] + " " + tab_trasa[64]  + "    " + tab_trasa[38] + " " + tab_trasa[39] + " " + tab_trasa[0] + "\t" + tab_trasa[51] + " " + tab_trasa[52]);
        System.out.println("\t" + tab_trasa[65] + " " + tab_trasa[66] + "\t" + "   " + tab_trasa[37] + "   " + tab_trasa[1] + "\t" + tab_trasa[53] + " " + tab_trasa[54]);
        System.out.println("\t\t" + "   " + tab_trasa[36] + "   " + tab_trasa[2]);
        System.out.println("\t\t" + "   " + tab_trasa[35] + "   " + tab_trasa[3]);
        System.out.println("30 " + tab_trasa[30] + " " + tab_trasa[31] + " " + tab_trasa[32] + " " + tab_trasa[33] + " " + tab_trasa[34] + "   " + tab_trasa[4] + " " + tab_trasa[5] + " " + tab_trasa[6] + " " + tab_trasa[7] + " " + tab_trasa[8]);
        System.out.println("   " + tab_trasa[29] + "\t\t\t\t   " + tab_trasa[9]);
        System.out.println("   " + tab_trasa[28] + " " + tab_trasa[27] + " " + tab_trasa[26] + " " + tab_trasa[25] + " " + tab_trasa[24] + "   " + tab_trasa[14] + " " + tab_trasa[13] + " " + tab_trasa[12] + " " + tab_trasa[11] + " " + tab_trasa[10] + " 10");
        System.out.println("\t\t" + "   " + tab_trasa[23] + "   " + tab_trasa[15]);
        System.out.println("\t\t" + "   " + tab_trasa[22] + "   " + tab_trasa[16]);
        System.out.println("\t" + tab_trasa[59] + " " + tab_trasa[60] + "\t" + "   " + tab_trasa[21] + "   " + tab_trasa[17] + "\t" + tab_trasa[55] + " " + tab_trasa[56]);
        System.out.println("\t" + tab_trasa[61] + " " + tab_trasa[62] + "\t" + "   " + tab_trasa[20] + " " + tab_trasa[19] + " " + tab_trasa[18] + "\t" + tab_trasa[57] + " " + tab_trasa[58]);
        System.out.println("\t      20");


    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        char[] tablica = new char[70];




        int a1Index = 51;
        int a2Index = 52;
        int a3Index = 53;
        int a4Index = 54;

        int b1Index = 55;
        int b2Index = 56;
        int b3Index = 57;
        int b4Index = 58;

        int c1Index = 59;
        int c2Index = 60;
        int c3Index = 61;
        int c4Index = 62;

        int d1Index = 63;
        int d2Index = 64;
        int d3Index = 65;
        int d4Index = 66;



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

        char[] miejscaA = {tablica[51], tablica[52], tablica[53], tablica[54]};
        char[] miejscaB = {tablica[55], tablica[56], tablica[57], tablica[58]};
        char[] miejscaC = {tablica[59], tablica[60], tablica[61], tablica[62]};
        char[] miejscaD = {tablica[63], tablica[64], tablica[65], tablica[66]};





        int gracz = random.nextInt(4) + 1;


        Arrays.fill(tablica, '*');


        System.out.println("Cześć! Zagrajmy w czterech!");


//        int[] tablicaIndeksow = {a1Index, a2Index, a3Index, a4Index, b1Index, b2Index, b3Index, b4Index, c1Index, c2Index, c3Index, c4Index, d1Index, d2Index, d3Index, d4Index};
//        int[] tablicaPionkowA = {tablica[51], tablica[55], tablica[59]};


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
                    if(a1Index == 51){
                        tablica[a1Index] = ' ';
                        a1Index = 0;
                    }

                    if (a1Index + losowyRuch >= 40) {
                        int result = 40 - a1Index;
                        losowyRuch = losowyRuch - result;
                        tablica[a1Index] = '*';
                        a1Index = losowyRuch;

                    } else {
                        if(tablica[a1Index + losowyRuch] == 'b'){
                            for(int i = 0; i < miejscaB.length; i++){
                                if(miejscaB[i] == ' '){
                                    tablica[a1Index + losowyRuch] = miejscaB[i];
                                    break;
                                }
                            }

                        }
                        tablica[a1Index] = '*';
                        a1Index = a1Index + losowyRuch;
                    }
                }
                if (wyborPiona == 2) {
                    if (a2Index == 52) {
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
                    if (a3Index == 53) {
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
                    if (a4Index == 54) {
                        tablica[a4Index] = ' ';
                        a4Index = 0;
                    }
                    if (a4Index + losowyRuch >= 40) {
                        int result = 40 - a4Index;
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
                    if(b1Index == 55){
                        tablica[b1Index] = ' ';
                        b1Index = 0;
                    }

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
                if (wyborPiona == 2) {
                    if (b2Index == 56) {
                        tablica[b2Index] = ' ';
                        b2Index = 0;
                    }
                    if (b2Index + losowyRuch >= 40) {
                        int result = 40 - b2Index;
                        losowyRuch = losowyRuch - result;
                        tablica[b2Index] = '*';
                        b2Index = losowyRuch;
                    } else {
                        tablica[b2Index] = '*';
                        b2Index = b2Index + losowyRuch;
                    }
                }

                if (wyborPiona == 3) {
                    if (b3Index == 57) {
                        tablica[b3Index] = ' ';
                        b3Index = 0;
                    }
                    if (b3Index + losowyRuch >= 40) {
                        int result = 40 - b3Index;
                        losowyRuch = losowyRuch - result;
                        tablica[b3Index] = '*';
                        b3Index = losowyRuch;
                    } else {

                        tablica[b3Index] = '*';
                        b3Index = b3Index + losowyRuch;
                    }
                }

                if (wyborPiona == 4) {
                    if (b4Index == 58) {
                        tablica[b4Index] = ' ';
                        b4Index = 0;
                    }
                    if (b4Index + losowyRuch >= 40) {
                        int result = 40 - b4Index;
                        losowyRuch = losowyRuch - result;
                        tablica[b4Index] = '*';
                        b4Index = losowyRuch;
                    } else {
                        tablica[b4Index] = '*';
                        b4Index = b4Index + losowyRuch;
                    }
                }


            }
            if (gracz == 3) {
                System.out.println("Graczu 3, którym pionem chcesz się ruszyć?: ");
                int wyborPiona = scanner.nextInt();
                if (wyborPiona == 1) {
                    if(c1Index == 59){
                        tablica[c1Index] = ' ';
                        c1Index = 0;
                    }

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
                if (wyborPiona == 2) {
                    if (c2Index == 60) {
                        tablica[c2Index] = ' ';
                        c2Index = 0;
                    }
                    if (c2Index + losowyRuch >= 40) {
                        int result = 40 - c2Index;
                        losowyRuch = losowyRuch - result;
                        tablica[c2Index] = '*';
                        c2Index = losowyRuch;
                    } else {
                        tablica[c2Index] = '*';
                        c2Index = c2Index + losowyRuch;
                    }
                }

                if (wyborPiona == 3) {
                    if (c3Index == 61) {
                        tablica[c3Index] = ' ';
                        c3Index = 0;
                    }
                    if (c3Index + losowyRuch >= 40) {
                        int result = 40 - c3Index;
                        losowyRuch = losowyRuch - result;
                        tablica[c3Index] = '*';
                        c3Index = losowyRuch;
                    } else {

                        tablica[c3Index] = '*';
                        c3Index = c3Index + losowyRuch;
                    }
                }

                if (wyborPiona == 4) {
                    if (c4Index == 62) {
                        tablica[c4Index] = ' ';
                        c4Index = 0;
                    }
                    if (c4Index + losowyRuch >= 40) {
                        int result = 40 - c4Index;
                        losowyRuch = losowyRuch - result;
                        tablica[c4Index] = '*';
                        c4Index = losowyRuch;
                    } else {
                        tablica[c4Index] = '*';
                        c4Index = c4Index + losowyRuch;
                    }
                }
            }
            if (gracz == 4) {
                System.out.println("Graczu 4, którym pionem chcesz się ruszyć?: ");
                int wyborPiona = scanner.nextInt();
                if (wyborPiona == 1) {
                    if(d1Index == 63){
                        tablica[d1Index] = ' ';
                        d1Index = 0;
                    }

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
                if (wyborPiona == 2) {
                    if (d2Index == 64) {
                        tablica[d2Index] = ' ';
                        d2Index = 0;
                    }
                    if (d2Index + losowyRuch >= 40) {
                        int result = 40 - d2Index;
                        losowyRuch = losowyRuch - result;
                        tablica[d2Index] = '*';
                        d2Index = losowyRuch;
                    } else {
                        tablica[d2Index] = '*';
                        d2Index = d2Index + losowyRuch;
                    }
                }

                if (wyborPiona == 3) {
                    if (d3Index == 65) {
                        tablica[d3Index] = ' ';
                        d3Index = 0;
                    }
                    if (d3Index + losowyRuch >= 40) {
                        int result = 40 - d3Index;
                        losowyRuch = losowyRuch - result;
                        tablica[d3Index] = '*';
                        d3Index = losowyRuch;
                    } else {

                        tablica[d3Index] = '*';
                        d3Index = d3Index + losowyRuch;
                    }
                }

                if (wyborPiona == 4) {
                    if (d4Index == 66) {
                        tablica[d4Index] = ' ';
                        d4Index = 0;
                    }
                    if (d4Index + losowyRuch >= 40) {
                        int result = 40 - d4Index;
                        losowyRuch = losowyRuch - result;
                        tablica[d4Index] = '*';
                        d4Index = losowyRuch;
                    } else {
                        tablica[d4Index] = '*';
                        d4Index = d4Index + losowyRuch;
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