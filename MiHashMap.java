
/**
 * Francisco septiembre.
 */
public class MiHashMap
{
    private ArrayListInt valores;
    private ArrayListString claves;

    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        valores = new ArrayListInt();
        claves = new ArrayListString();
    }

    /**
     * Asocia el valor especificado con la clave especificada. Si la clave existía, entonces sobreescribe su valor y
     * devuelve el valor antiguo. Si no existía devuelve -1.
     */
    public int put(String clave, int valor){
        int conSinClave = -1;
        if(claves.indexOf(clave) == -1){//indexOf() nos devuelve el índice donde se encuentra la clave dada si existe, si nos
            claves.add(clave);//devuelve -1 quiere decir que la calve no existe y entoces la adjuntamos al mapa con su valor.
            valores.add(valor);
        }
        else{// si la invocación    del mt no es igual a -1 quiere decir que la clave existe, tenemos que devolver su valor y
            //poner el nuevo valor.
            int indice = claves.indexOf(clave);//hallo el índice dode está la clave.
            conSinClave = valores.get(indice);//guardo el valor antiguo de la clave en la VL. para retornarle.
            valores.set(indice,valor);//set() pone el valor de la clave en el indice señalado.
        }
        return conSinClave;
    } 

    /**
     *Devuelve el valor asociado con la clave especificada o -1 en caso de que la clave no exista.
     */
    public int get(String clave){
        int sol = -1;//VL para retornar como solución.
        if(claves.contains(clave)){
            sol = valores.get(claves.indexOf(clave));
        }
        return sol;
    }
    
    /**
     * devuelve true si el mapa no contiene elementos.
     */
    public boolean isEmpty(){
        return claves.size() == 0;
    }
    
    /**
     * devuelve el número de elementos del mapa.
     */
    public int size(){
        return claves.size();
    }
    
    /**
     * elimina del mapa el elemento con la clave dada y devuelve su valor. Si no hay esa clave en el mapa devuelve -1
     */
    public int remove(String clave){
        int sol = -1; //VL para devolver al solución final.
        if(claves.indexOf(clave) != -1){
            sol = valores.remove(claves.indexOf(clave));
            claves.remove(claves.indexOf(clave));
            
        }
        return sol;
    }
    
    /**
     * vacía el mapa.
     */
    public void clear(){
        valores.clear();
        claves.clear();
    }
}



































