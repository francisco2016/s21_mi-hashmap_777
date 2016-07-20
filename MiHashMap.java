
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

}





