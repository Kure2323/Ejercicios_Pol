package Unidad_2;

import java.util.Scanner;

public class Practica3ISBN {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        int res = 0;    //Sentencio variables que uso sobre el programa
        int j = 0;

        System.out.println("Introduzca el ISBN:");  //Pido el ISBN y saco sus valores más relevantes
        String isbn = entrada.next();
        int lisbn = isbn.length();
        isbn = isbn.toLowerCase();  //Realizo un toLowerCase para el caso de introducción de una X mayúscula que el programa se entienda

        int quest = isbn.indexOf("?"); //Posición del interrogante quest, quest + 1
        int struq = isbn.lastIndexOf("?");
        int equis = isbn.indexOf("x");

        boolean bien = true;    //Variable que sentencio para que en caso de error sea false y se repita y vuelva a pedir el ISBN

        while (true){   //TODO este while no es más que un filtro para el isbn introducido, pues no puede introducirse isbn de más de 10 caracteres o ponerle letras aleatorias.
            if(equis != -1){    //Comprueba que en caso de que exista la X que esté en la última posición
                if(equis != 9){
                    System.out.println("Error, la equis debe estar en última posición.");
                    bien = false;
                }

            }else if (lisbn != 10){ //Debe tener 10 caracteres
                System.out.println("Error, debe contener 10 caracteres.");
                bien = false;


            }else if(quest != struq){   //No puede haber más de una interrogación
                System.out.println("Error, debe contener tan solo una interrogación.");
                bien = false;

//            }else if (quest == -1 && equis == -1)  {    //Try catch para el caso de no ? ni X
//                try{
//                    int is = Integer.parseInt(isbn);
//
//                } catch (NumberFormatException e) {
//                    System.out.println("Error, no debe contener caracteres diferentes a números, ? y X.");
//                    bien = false;
//                }     //Por motivos que desconozco falla, no se traga números muy altos
            } else if (quest != -1 && equis == -1) {    //Try catch para el caso de sí ? pero no X
                try{    //Realizo substrings por un lado del interrogante, en el caso de que se pueda por ambos y fuerzo un error para el catch que pase a false la V bien
                    if (quest == 0){
                        String din = isbn.substring(quest +1);
                        int nid = Integer.parseInt(din);
                    } else if (quest == 9){
                        String la = isbn.substring(0, quest);
                        int al = Integer.parseInt(la);
                    }else{
                        String la = isbn.substring(0,quest);
                        String din = isbn.substring(quest + 1);
                        int al = Integer.parseInt(la);
                        int nid = Integer.parseInt(din);
                    }

                }catch (NumberFormatException e){
                    System.out.println("Error, no debe contener caracteres diferentes a números, ? y X.");
                    bien = false;

                }
            } else if (quest != -1 && equis != -1){     //Try catch para el caso de sí ? y sí X
                try{
                    String la = isbn.substring(0,quest);
                    String din = isbn.substring(quest + 1,9);
                    int al = Integer.parseInt(la);
                    int nid = Integer.parseInt(din);
                }catch (NumberFormatException e){
                    System.out.println("Error, no debe contener caracteres diferentes a números, ? y X.");
                    bien = false;
                }
            }

            if(bien == true){   //Realiza un break en caso de todo estar en orden
                break;
            }

            System.out.println("Introduzca de nuevo el ISBN:"); //Si no está todo en orden vuelvo a preguntar el ISBN y saco sus datos más relevantes
            isbn = entrada.next();
            lisbn = isbn.length();
            isbn = isbn.toLowerCase();
            quest = isbn.indexOf("?");
            struq = isbn.lastIndexOf("?");
            equis = isbn.indexOf("x");
            bien = true;    //Vuelto a sentenciar el valor a true para que así esté al realizar de nuevo el while
        }


        if (quest != -1) {      //En caso de haber ?

            for(int i = 0;i < 10; i++){     //Bucle en el que i comienza como 0 y que va incrementando su valor en 1 por cada repetición

                String letra = Integer.toString(i);     //Paso a String i
                String la = isbn.substring(0,quest);    //Realizo un substring al ladin izquierdo de quest
                String din = isbn.substring(quest + 1);     //Realizo un substring al lado derecho de quest

                String test = la + Integer.toString(i) + din;   //Junto el lado izquierdo con i, ahora llamado letra y el lado derecho
                res = 0;
                j = 0;

                if (isbn.substring(9,10).equals("x")){  //En caso de también haber una x

                    for (int p = 10; p > 1; p--) {      //Realiza la operación para sacar si es correcto o no el isbn en este caso concreto con interrogación y X
                        String num = test.substring(j, j + 1);
                        int nums = Integer.parseInt(num);
                        res = res + (nums * p);
                        j++;
                    }
                    res = res + 10;

                }else {     //Realiza la operación en caso de no encontrarse la X, en ambos casos el número resultado es: res

                    for (int q = 10; q > 0; q--) {
                        String num = test.substring(j, j + 1);
                        int nums = Integer.parseInt(num);
                        res = res + (nums * q);
                        j++;
                    }

                }

                if(res % 11 == 0){  //En caso de que el número resultado: res, sea divisible entre 11 pasará a revelar qué número es
                    System.out.println("Su ISBN correcto es: " + test);
                    break;
                }

            }
            if(res % 11 != 0){      //En caso de que no encontrarse nungún resultado también se dirá
                System.out.println("Su ISBN no tiene combinación correcta,");
            }

        }else{  //En caso de no haber '?'
            if (isbn.substring(9,10).equals("x")){ //Realiza la operación en caso de que exista la X

                for (int i = 10; i > 1; i--) {
                    String num = isbn.substring(j, j + 1);
                    int nums = Integer.parseInt(num);
                    res = res + (nums * i);
                    j++;
                }
                res = res + 10;


            }else {

                for (int i = 10; i > 0; i--) {  //Realiza la operación en caso de no existir la X
                    String num = isbn.substring(j, j + 1);
                    int nums = Integer.parseInt(num);
                    res = res + (nums * i);
                    j++;
                }
            }
//            System.out.println(res);


            if( res % 11 == 0){
                System.out.println("Su ISBN es correcto.");
            }else{
                System.out.println("Su ISBN NO es correcto");
            }
        }
    }
}
