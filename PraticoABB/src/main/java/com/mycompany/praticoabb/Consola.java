/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.praticoabb;

import java.util.Scanner;
import com.mycompany.practicosarboles.*;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArbolesBinarios<Integer,String>arbol1=new ArbolesBinarios<>();
       ArbolesAVL<Integer,String> av1=new ArbolesAVL<>();
       ArbolesMVias<Integer,String>mvias=new ArbolesMVias<>(4);
       mvias.insertar(80,"a");
       mvias.insertar(120,"b");
       mvias.insertar(200,"c");
       mvias.insertar(50,"aa");
       mvias.insertar(70, "aa");
       mvias.insertar(75,"aa");
       mvias.insertar(72,"ddd");
       mvias.insertar(98,"ddd");
       mvias.insertar(110,"ddd");
       mvias.insertar(130,"ddd");
       mvias.insertar(140,"ddd");
       mvias.insertar(150,"ddd");
       mvias.insertar(134,"ddd");
       mvias.insertar(160,"ddd");
       mvias.insertar(170,"ddd");
       
       mvias.insertar(190,"ddd");
       mvias.insertar(158,"ddd");
       mvias.insertar(400,"ddd");
       mvias.insertar(500,"ddd");
       mvias.insertar(560,"ddd");
       
       
        ArbolesMVias<Integer,String>mvias2=new ArbolesMVias<>(4);
       mvias2.insertar(80,"a");
       mvias2.insertar(120,"b");
       mvias2.insertar(200,"c");
       mvias2.insertar(50,"aa");
       mvias2.insertar(70, "aa");
       mvias2.insertar(75,"aa");
       mvias2.insertar(72,"ddd");
       mvias2.insertar(98,"ddd");
       mvias2.insertar(110,"ddd");
       mvias2.insertar(130,"ddd");
       mvias2.insertar(140,"ddd");
       mvias2.insertar(150,"ddd");
       mvias2.insertar(134,"ddd");
       mvias2.insertar(160,"ddd");
       mvias2.insertar(170,"ddd");
       
       mvias2.insertar(190,"ddd");
       mvias2.insertar(158,"ddd");
       mvias2.insertar(400,"ddd");
       mvias2.insertar(500,"ddd");
       mvias2.insertar(560,"ddd");
       
       
        av1.insertar(50, "Dilker");
        av1.insertar(35, "Daniel");
        av1.insertar(28, "miguel");
       av1.insertar(25, "manuel");
        av1.insertar(30, "juana");
        av1.insertar(40, "carla");
        
       arbol1.insertar(50, "Dilker");
        arbol1.insertar(35, "Daniel");
        arbol1.insertar(28, "miguel");
       arbol1.insertar(25, "manuel");
        arbol1.insertar(30, "juana");
        arbol1.insertar(40, "carla");
          arbol1.insertar(90, "yenny");
           arbol1.insertar(95, "andrea");
            arbol1.insertar(93, "pedro");
            arbol1.insertar(60, "richard");
             arbol1.insertar(65, "richard");
              System.out.println(arbol1.mostrarNiveles());
                
             System.out.println(arbol1.mostrarNiveles()); 
             // practico 
            System.out.println(arbol1.nodosConAmbosHijos());
            System.out.println(arbol1.nodosConAmbosHijosRecursivo());
            System.out.println(arbol1.nodosConAmbosHijosEnElNivel(1));
            System.out.println(arbol1.nodosConUnHijoAntesDelNivel(3));
            System.out.println(arbol1.cantidadDeNodosConInOrden());
            System.out.println(arbol1.llaveMenorDelArbolBinario());
            
            
         ArbolesBinarios<Integer,String>arbol2=new ArbolesBinarios<>();
          arbol2.insertar(50, "Dilker");
        arbol2.insertar(35, "Daniel");
        arbol2.insertar(28, "miguel");
       arbol2.insertar(25, "manuel");
        arbol2.insertar(30, "juana");
         arbol2.insertar(40, "carla");
          arbol2.insertar(90, "yenny");
           arbol2.insertar(95, "andrea");
            arbol2.insertar(93, "pedro");
            arbol2.insertar(60, "richard");
           
        System.out.println("");    
        System.out.println("************************************************PRACTICO SOBRE ARBOLES BINARIOS DE BUSQUEDA Y MVIAS************************************************************");    
        System.out.println("");
        System.out.println("");
        System.out.println("PREGUNTA 1: INSERTAR EN UN ARBOL AVL.");
        System.out.println("PREGUNTA 2: ELIMINAR EN UN ARBOL AVL");
        System.out.println("PREGUNTA 3: Implemente un m??todo iterativo que retorne la cantidad de nodos que tienen ambos hijos \n" +
                           "distintos de vac??o en un ??rbol binario");
        System.out.println("PREGUNTA 4:  Implemente un m??todo recursivo que retorne la cantidad de nodos que tienen ambos hijos \n" +
                           "distintos de vac??o en un ??rbol binario");  
        System.out.println("PREGUNTA 5:  Implemente un m??todo iterativo que retorne la cantidad de nodos que tienen ambos hijos \n" +
                            "distintos de vac??o en un ??rbol binario, pero solo en el nivel N");
        System.out.println("PREGUNTA 6: LA PREGUNTA 5 Y 6 SON LAS MISMA EN EL ENUNCIADO ");
        System.out.println("PREGUNTA 7:  Implemente un m??todo iterativo que retorne la cantidad nodos que tienen un solo hijo \n" +
                           "diferente de vac??o en un ??rbol binario, pero solo antes del nivel N");
        System.out.println("PREGUNTA 8:  Implemente el m??todo insertar de un ??rbol m-vias de b??squeda");
        System.out.println("PREGUNTA 9 :Implemente el m??todo eliminar de un ??rbol m-vias de b??squeda");
        System.out.println("PREGUNTA 10: Implemente el m??todo insertar del ??rbol b ");
        System.out.println("PREGUNTA 11: Implemente el m??todo eliminar del ??rbol b.");
        System.out.println("PREGUNTA 12:  Implemente un m??todo iterativo con la l??gica de un recorrido en inOrden que retorne el \n" +
                           "n??mero de nodos que tiene un ??rbol binario.");
        System.out.println("PREGUNTA 13: Implemente un m??todo que reciba en listas de par??metros las llaves y valores de los \n" +
                            "recorridos en postorden e inorden respectivamente y que reconstruya el ??rbol binario \n" +
                            "original. Su m??todo no debe usar el m??todo insertar");
        System.out.println("PREGUNTA 14: Implemente un m??todo privado que reciba un nodo binario de un ??rbol binario y que \n" +
                            "retorne cual ser??a su sucesor inorden de la clave de dicho nodo");  
        System.out.println("PREGUNTA 15: Implemente un m??todo privado que reciba un nodo binario de un ??rbol binario y que \n" +
                            "retorne cu??l ser??a su predecesor inorden de la clave de dicho nodo ");
        System.out.println("PREGUNTA 16: Implemente un m??todo que retorne la menor llave en un ??rbol binario de b??squeda");
        System.out.println("PREGUNTA 17: Implemente un m??todo que retorne la mayor llave en un ??rbol m vias de b??squeda.");
        System.out.println("PREGUNTA 18:   Implemente un m??todo que retorne verdadero si solo hay hojas en el ??ltimo nivel de un \n" +
                            "??rbol m-vias de b??squeda. Falso en caso contrario.");
        System.out.println("PREGUNTA 19 :  Implemente un m??todo que retorne verdadero si un ??rbol m vias tiene solo hojas o nodos \n" +
                            "con todos sus hijos distinto de vac??o. Falso en caso contrario.");
        System.out.println("PREGUNTA 20: Para un ??rbol m v??as implementar un m??todo que reciba otro ??rbol de par??metro y que \n" +
                            "retorne verdadero si los arboles son similares. Falso en caso contrario. ");
        System.out.println("PREGUNTA 21: . Implemente un m??todo que retorne verdadero si un ??rbol binario esta lleno. Falso en caso \n" +
                            "contrario");
        
        
        
        System.out.println("");
        System.out.println("");
        System.out.print("INGRESE EL NUMERO DE PREGUNTA : ");
        Scanner entrada =new Scanner(System.in);
        String pregunta=entrada.next();
        
         System.out.println("----------------------------------------------- ");
         
        switch(pregunta){
        
            case "1":
                 System.out.println("INGRESE LA CLAVE A INSERTAR");
                 Scanner clave=new Scanner(System.in);
                 int cl=clave.nextInt();
                 System.out.println("INGRESE EL VALOR A INSERTAR");
                 Scanner valor=new Scanner(System.in);
                 String va=valor.nextLine();
                 av1.insertar(cl, va);
                 
                 System.out.println("EL ARBOL AVL EN INORDEN ES -->:"+ av1.recorridoIn());
                 break;
            case "2":
                 Scanner eliminar= new Scanner(System.in);
                 int eli=eliminar.nextInt();
                 System.out.print(av1.eliminar(eli));
                 System.out.print("EL ARBOL AVL SIN CLAVE "+eli+" ES -->: "+av1.recorridoIn());
                 break;
            case "3":
                
                 System.out.print(" es la cantidad de nodos con ambos hijos es :  ");
                  System.out.print(arbol1.nodosConAmbosHijos());
                 break;
            case "4":
                  System.out.print(" es la cantidad de nodos con ambos hijos recursivamente es  :  ");
                  System.out.print(arbol1.nodosConAmbosHijosRecursivo());
                 break;
            case "5":
                 System.out.print("ingrese el nivel en el cual buscar los nodos con ambos hijos : ");
                 Scanner b=new Scanner(System.in);
                 int nive=b.nextInt();
                 
                 System.out.print("la cantidad de nodos con ambos hijos en el  nivel "+ nive +" es : ");
                 System.out.print(arbol1.nodosConAmbosHijosEnElNivel(nive));;
                 break;
            case "6":
                 System.out.print("ingrese el nivel en el cual buscar los nodos con ambos hijos : ");
                 Scanner bd=new Scanner(System.in);
                 int nie=bd.nextInt();
                 
                 System.out.print("la cantidad de nodos con ambos hijos en el  nivel "+ nie +" es : ");
                 System.out.print(arbol1.nodosConAmbosHijosEnElNivel(nie));;
                 break;
            case "7":
                 System.out.print("ingrese el nivel hasta el cual buscar los nodos solo con un solo hijo : ");
                 Scanner x=new Scanner(System.in);
                 int niva=x.nextInt();
                 
                 System.out.print("la cantidad de nodos con un hijo antes del nivel " + niva+" es ");
                 System.out.print(arbol1.nodosConUnHijoAntesDelNivel(niva));
                 break;
                 
            case "8":
                 System.out.println("--------ingrese la clave a insertar en el arbole m-vias : ");
                 Scanner d=new Scanner(System.in);
                 int claveAInsertar=d.nextInt();
                 System.out.println("Ingrese el valor a insertar para el arbol m-vias");
                 Scanner k=new Scanner(System.in);
                 String vaM=k.nextLine();
                 mvias.insertar(claveAInsertar, vaM);
                 System.out.println(mvias.recorridoEnInOrden());
                
                 break;
            case "9":
                 System.out.println("ingrese la clave a eliminar en el arbole m-vias : ");
                 Scanner ds=new Scanner(System.in);
                 int claveAEl=ds.nextInt();
                 mvias.eliminar(claveAEl);
                 System.out.println("El arbol m-vias sin la clave "+claveAEl+"es : ");
                 System.out.println(mvias.recorridoEnInOrden());
                 break;
            case "10":
                 System.out.println("NO SE ENCUENTRA IMPLETADO EL METODO");
            case "11":
                 
                 System.out.println("NO SE ENCUENTRA IMPLETADO EL METODO");
                 break; 
                 
             case "12":
                 
                 System.out.println("LA CANTIDAD DE NODOS CON EL RECORRIO EN INORDEN ES :"+ arbol1.cantidadDeNodosConInOrden());
                 break;
             case "13":
                  System.out.println("INGRESE LA CANTIDAD DE ELEMETOS DEL ARBOL ");
                  Scanner t=new Scanner(System.in);
                  int liminte=t.nextInt();
                  
                  ArrayList<Integer>claveInOrden=new ArrayList<>();
                  ArrayList<String>valoresInOrden=new ArrayList<>();
                  ArrayList<Integer>clavesPostOrden=new ArrayList<>();
                  ArrayList<String>valoresPostOrden=new ArrayList<>();
                 
                  System.out.println("INSERTE LAS CLAVES EN INORDEN");
                  for(int i=0;i<liminte;i++){
                      Scanner tt=new Scanner(System.in);
                      int el=tt.nextInt();
                      claveInOrden.add(el);
                  }
                  System.out.println("INSERTE LOS VALORES EN INORDEN");
                  for(int i=0;i<liminte;i++){
                      Scanner tt=new Scanner(System.in);
                      String el=tt.nextLine();
                      valoresInOrden.add(el);
                  }
                  System.out.println("INSERTE LAS CLAVES EN POSTORDEN");
                  for(int i=0;i<liminte;i++){
                      Scanner tt=new Scanner(System.in);
                      int el=tt.nextInt();
                      clavesPostOrden.add(el);
                  }
                  System.out.println("INSERTE LOS VALORES EN POSTORDEN");
                  for(int i=0;i<liminte;i++){
                      Scanner tt=new Scanner(System.in);
                      String el=tt.nextLine();
                      valoresPostOrden.add(el);
                  }
                   ArbolesBinarios<Integer,String>nuevoArbol=new ArbolesBinarios(claveInOrden, valoresInOrden, clavesPostOrden, valoresInOrden);
                 System.out.println(nuevoArbol.recorridoIn());
                 break;  
              case "14":
                 System.out.println("Ingrese el elemento a busca su sucesor en InOrden");
                 Scanner su=new Scanner(System.in);
                 int da=su.nextInt();
                 System.out.println("EL sucesor en inorden del elemento "+ da +" es : "+arbol1.sucesorInOrden(da));
                 break;  
             case "15":
                 
                 System.out.println("Ingrese el elemento a busca su precesor en InOrden");
                 Scanner an=new Scanner(System.in);
                 int das=an.nextInt();
                 System.out.println("EL predecesor en inorden del elemento "+ das +" es : "+arbol1.predecesorInOrden(das));
                 break;  
                 
             case "16":
                 
                 System.out.println("El valor maximo del arbole es : "+arbol1.minimo());
                 break;  
              case "17":
                 
                 System.out.println("El valor maximo del arbol m-vias es : "+mvias.maximo());
                 break;  
              case "18":
                 
                 System.out.println("TODOS LOS NODOS EN EL ULTIMO NIVEL DE UN MVIAS SERAN HOJAS SIEMPRE");
                 break;  
             case "19":
                 
                 System.out.println("NO SE ENCUENTRA IMPLETADO EL METODO");
                 break;  
             case "20":
                 
                 System.out.println(mvias.verificarSiSonArbolesSimilares(mvias2));
                 break;  
              case "21":
                 
                 System.out.println(arbol1.verificarSiElArbolEstaLleno());
                 break;  
               
            default :
                     System.out.println("INGRESE UN OPCION VALIDA.");
                     break;
        }
         
    }
    
    
}
