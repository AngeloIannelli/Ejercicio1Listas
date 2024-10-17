/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1listas;

/**
 *
 * @author aiannelli
 */
public class Ejercicio1Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.insertFinal(1);
        lista1.insertFinal(2);
        lista1.insertFinal(3);
        lista1.insertFinal(3);
        lista1.insertFinal(4);
        lista1.insertFinal(5);
        
        
        System.out.println("Lista original:");
        lista1.printList();
        
        System.out.println("Los valores introducidos suman: " + lista1.suma());
        
//        for (int i = 0; i < lista1.getLength(); i++) {
//            lista1.deleteBegin();
//            lista1.printList();
//        }
//         lista1.deleteInIndex(2);
//         lista1.printList();
         
//         lista1.inverso();
//         lista1.printList();
         
         lista1.ListaFrecuencias(lista1).printList();
    }
}
