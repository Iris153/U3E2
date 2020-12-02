package colas;


public class Nodo {
  private  int elemento;
   Nodo siguiente;
    int informacion;
    
    public void Nodo(){
        this.elemento=0;
        this.siguiente=null;
    }
    public int getElemento(){
        return elemento;
    }
    public void setElemento(int elemento){
        this.elemento=elemento;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
    

}
