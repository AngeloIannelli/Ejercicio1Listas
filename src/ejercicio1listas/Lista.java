/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1listas;

/**
 *
 * @author aiannelli
 */
public class Lista {
    private Nodo pFirst;
    private int length;

    public Lista() {
        this.pFirst = null;
        this.length = 0;
    }

    public Nodo getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public boolean isEmpty(){
    return getpFirst() == null;
    }

    public void insertFinal(int dato){
        Nodo nuevo = new Nodo(dato);
        if(isEmpty()){
            setpFirst(nuevo);
        }else{
            Nodo aux = getpFirst();
            while(aux.getpNext()!= null){
                aux = aux.getpNext();
            }
            aux.setpNext(nuevo);
        }
        length++;
    }
    
    public int suma(){
        Nodo aux = getpFirst();
        int suma = 0;
        if(isEmpty()){
            System.out.println("Lista vacía"+suma);   
        }else if(aux.getpNext() == null){
            suma = pFirst.getDato();
            return suma;
        }else{
            while(aux != null){
                suma += aux.getDato();
                aux = aux.getpNext();
            }
        //return suma;
        }
    return suma;
    }
    
    public void printList(){
        Nodo aux = getpFirst();
        if(isEmpty()){
            System.out.println("Lista vacía");
        }else{
            while(aux !=null){
                System.out.print(aux.getDato()+ ",");
                aux = aux.getpNext();
            }
            System.out.println("\n");
        }
    }
//    public void reverse(){
//        Nodo previo = null;
//        Nodo actual = getpFirst();
//        Nodo pNext = null;
//        if(isEmpty()){
//            System.out.println("Lista vacía");
//        }else{
//            while(actual!=null){
//                pNext = actual.getpNext();
//                actual.setpNext(previo);
//                previo = actual;
//                actual = actual.getpNext();
//            }
//            setpFirst(previo);
//        }

    public Nodo deleteBegin(){
        if(!isEmpty()){
            if(pFirst.getpNext()== null){
                setpFirst(null);
            }else{
                Nodo pointer = getpFirst();
                setpFirst(getpFirst().getpNext());
                pointer.setpNext(null);
                setLength(getLength()-1);
                return pointer;
            }
            
        }
        return null;
    }
    
   public Nodo deleteFinal(){
        if (isEmpty()){
            System.out.println("List is Empty");
        } else{
            Nodo pointer = getpFirst();
            Nodo pointer2;
   
            if (length > 1){
                while (( pointer.getpNext()).getpNext() != null) {
                    pointer = pointer.getpNext();
                }
                pointer2 = pointer.getpNext();
                pointer.setpNext(null);
            } else{
                pointer2 = deleteBegin();
        } length--;
        return pointer2;
        }
        return null;
    }
   
    public Nodo deleteInIndex(int index){
        if (isEmpty()){
            System.out.println("List Is Empty");
        } else{
            if (index==0){
                deleteBegin();
            } else{
                if (index<length){
                    Nodo pointer = getpFirst();
                    Nodo pointer2;
                    int cont = 0;
                    while (cont< index-1 && pointer != null){
                        pointer = pointer.getpNext();
                        cont++;
                    }
                    pointer2 = pointer.getpNext();
                    pointer.setpNext(pointer2.getpNext());
                    pointer2.setpNext(null);
                    return pointer2;
                } else{
                    System.out.println("Error in index");
                }
            }
        }
        length++;
        return null;
    }
    public void searchIndex(int index){
        
        if (isEmpty()){
            System.out.println("List Is Empty");
        if (index == 0){
            System.out.println("El valor encontrado es: "+getpFirst().getDato());
        }
        
        if (index >= getLength()){
            System.out.println("Error en el indice");
        }
        } else{
            Nodo aux = pFirst;
            int contador = 0;
            while(aux.getpNext()!=null || contador != index){
                aux = aux.getpNext();
                contador ++;
            }
            System.out.println("El valor encontrado es: " + aux.getDato());
        }           
}
   public void insertBegin(int dato){
        Nodo node = new Nodo (dato);
        if (isEmpty()){
            setpFirst(node);
        }else{
            node.setpNext(getpFirst());
            setpFirst(node);
        }
        length++;
    }

    public Lista inverso(){
        Lista listaInvertida = new Lista();
        Nodo actual = pFirst;
        while (actual != null) {
            listaInvertida.insertBegin(actual.getDato());
            actual = actual.getpNext();
        }
        return listaInvertida;
    }
    
    public Lista ListaFrecuencias(Lista L){
        Nodo aux = pFirst;
        Lista listafrec = new Lista();
        while(aux.getpNext()!=null){
            if(aux.getDato() != aux.getpNext().getDato()){
                listafrec.insertFinal(aux.getDato());
                aux = aux.getpNext();
            }else{
                aux = aux.getpNext();
            }
        }
        listafrec.printList();
        return listafrec;
    }
    
}
