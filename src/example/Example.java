/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afrozo
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String messagge = "buena``ss noches ñññ - ".toUpperCase().replace(" ", "_");
        //System.out.println("Mensaje de Ingreso " + (messagge.replace("_", " ")));
        while ((messagge.length() % 3) != 0) {
            messagge += "_";
        }

        System.out.println("mensaje nuevo " + messagge.replace("_", " "));
        System.out.println("mensaje nuevo " + messagge.length());

//        String[] newmessagge = new String[messagge.length()];
        List<Integer> num = new ArrayList<>();
        String nummessagge = convertToNumber(messagge);

        String[] arr = nummessagge.split(",");

        ArrayList<int[]> vec = groupToNumber(arr);

        int inv = 1;

        while (((inv * 29) - 16) < 0) {
            inv++;
        }
        System.out.println("El valor inversible en modulo 27 es: " + " i= " + inv + "  " + ((inv * 29) - 16));
        System.out.println("Numero " + (nummessagge));
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 0;
        matrix[1][1] = 4;
        matrix[1][2] = 5;
        matrix[2][0] = 1;
        matrix[2][1] = 0;
        matrix[2][2] = 6;

        int[][] matrixinversa = new int[3][3];

        matrixinversa[0][0] = getNum(96);
        matrixinversa[0][1] = 10;
        matrixinversa[0][2] = 21;
        matrixinversa[1][0] = getNum(20);
        matrixinversa[1][1] = 12;
        matrixinversa[1][2] = 9;
        matrixinversa[2][0] = 13;
        matrixinversa[2][1] = 8;
        matrixinversa[2][2] = 16;
        List<Integer> matrizx = vectorEncrypt(vec, matrix);

        ArrayList<String> encrypt = new ArrayList<>();
        for (int i = 0; i < matrizx.size(); i++) {
            encrypt.add(String.valueOf(getNum(matrizx.get(i))));
        }
        String messaggeencript = convertToText(encrypt);

        System.out.println("Numeros de vector: " + encrypt.toString());
        System.out.println("Mensaje encriptado: " + messaggeencript);
        System.out.println("Cantidad de caracteres: " + messaggeencript.length());
        String[] vector = new String[encrypt.size()];
        for (int i = 0; i < encrypt.size(); i++) {
            vector[i] = encrypt.get(i);
            //System.out.println("Vector nuevo " + vector[i]);
        }

        ArrayList<int[]> vectwo = groupToNumber(vector);
        //vectwo.forEach(item -> System.out.println("Valor " + item[0] + " " + item[1] + " " + item[2]));

        List<Integer> matrizy = vectorEncrypt(vectwo, matrixinversa);
        ArrayList<String> desencrypt = new ArrayList<>();
        matrizy.forEach(item -> {
            desencrypt.add(String.valueOf(getNum(item)));
            //System.out.println("Valor " + item);
        });
        String messaggeDesencrypt = convertToText(desencrypt);
        System.out.println("Números desencriptados " + desencrypt.toString());
        System.out.println("Mensaje Desencriptado " + messaggeDesencrypt.replace("_", " "));

    }

    public static int getNum(int num) {
        return (num % 29);
    }

    public static String convertToNumber(String messagge) {
        String nummessagge = "";
        for (int i = 0; i < messagge.length(); i++) {

            switch (messagge.charAt(i)) {
                case 'A':

                    nummessagge += 0 + ",";
                    break;
                case 'B':
                    nummessagge += 1 + ",";
                    break;
                case 'C':
                    nummessagge += 2 + ",";
                    break;
                case 'D':
                    nummessagge += 3 + ",";
                    break;
                case 'E':
                    nummessagge += 4 + ",";
                    break;
                case 'F':
                    nummessagge += 5 + ",";
                    break;
                case 'G':
                    nummessagge += 6 + ",";
                    break;
                case 'H':
                    nummessagge += 7 + ",";
                    break;
                case 'I':
                    nummessagge += 8 + ",";
                    break;
                case 'J':
                    nummessagge += 9 + ",";
                    break;
                case 'K':
                    nummessagge += 10 + ",";
                    break;
                case 'L':
                    nummessagge += 11 + ",";
                    break;
                case 'M':
                    nummessagge += 12 + ",";
                    break;
                case 'N':
                    nummessagge += 13 + ",";
                    break;
                case 'O':
                    nummessagge += 14 + ",";
                    break;
                case 'P':
                    nummessagge += 15 + ",";
                    break;
                case 'Q':
                    nummessagge += 16 + ",";
                    break;
                case 'R':
                    nummessagge += 17 + ",";
                    break;
                case 'S':
                    nummessagge += 18 + ",";
                    break;
                case 'T':
                    nummessagge += 19 + ",";
                    break;
                case 'U':
                    nummessagge += 20 + ",";
                    break;
                case 'V':
                    nummessagge += 21 + ",";
                    break;
                case 'W':
                    nummessagge += 22 + ",";
                    break;
                case 'X':
                    nummessagge += 23 + ",";
                    break;
                case 'Y':
                    nummessagge += 24 + ",";
                    break;
                case 'Z':
                    nummessagge += 25 + ",";
                    break;
                case '_':
                    nummessagge += 26 + ",";
                    break;

                case 'Ñ':
                    nummessagge += 27 + ",";
                    break;
                
                default:
                    nummessagge += 28 + ",";
                    break;
            }
        }
        return nummessagge;
    }

    public static String convertToText(ArrayList<String> encrypt) {
        String messaggeencript = "";
        for (String item : encrypt) {
            switch (item) {
                case "0":
                    messaggeencript += "A";
                    break;
                case "1":
                    messaggeencript += "B";
                    break;
                case "2":
                    messaggeencript += "C";
                    break;
                case "3":
                    messaggeencript += "D";
                    break;
                case "4":
                    messaggeencript += "E";
                    break;
                case "5":
                    messaggeencript += "F";
                    break;
                case "6":
                    messaggeencript += "G";
                    break;
                case "7":
                    messaggeencript += "H";
                    break;
                case "8":
                    messaggeencript += "I";
                    break;
                case "9":
                    messaggeencript += "J";
                    break;
                case "10":
                    messaggeencript += "K";
                    break;
                case "11":
                    messaggeencript += "L";
                    break;
                case "12":
                    messaggeencript += "M";
                    break;
                case "13":
                    messaggeencript += "N";
                    break;
                case "14":
                    messaggeencript += "O";
                    break;
                case "15":
                    messaggeencript += "P";
                    break;
                case "16":
                    messaggeencript += "Q";
                    break;
                case "17":
                    messaggeencript += "R";
                    break;
                case "18":
                    messaggeencript += "S";
                    break;
                case "19":
                    messaggeencript += "T";
                    break;
                case "20":
                    messaggeencript += "U";
                    break;
                case "21":
                    messaggeencript += "V";
                    break;
                case "22":
                    messaggeencript += "W";
                    break;
                case "23":
                    messaggeencript += "X";
                    break;
                case "24":
                    messaggeencript += "Y";
                    break;
                case "25":
                    messaggeencript += "Z";
                    break;
                case "26":
                    messaggeencript += "_";
                    break;
                case "27":
                    messaggeencript += "Ñ";
                    break;
                case "28":
                    messaggeencript += "-";
                    break;

                default:

                    break;
            }
        }

        return messaggeencript;
    }

    public static ArrayList<int[]> groupToNumber(String[] arr) {
        ArrayList<int[]> vec = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                vec.add(new int[]{Integer.parseInt(arr[i]), Integer.parseInt(arr[i + 1]), Integer.parseInt(arr[i + 2])});
            }
        }

        return vec;
    }

    public static List<Integer> vectorEncrypt(ArrayList<int[]> vec, int[][] matrix) {
        List<Integer> matrizx = new ArrayList<>();
        int sum = 0;
        for (int[] is : vec) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sum += (matrix[i][j] * is[0 + j]);

                    if (j == 2) {
                        matrizx.add(sum);
                        sum = 0;
                    }
                }
            }
        }
        return matrizx;
    }
}
