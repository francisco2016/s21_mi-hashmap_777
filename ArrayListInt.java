
/**
 * Write a description of class ArrayListClaves here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int[] array;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        array = new int[0];
    }

    /**
     * añade un elemento a la colección al final de la misma.----------------------------------------------- 0078
     */
    public void add(int elemento){
        int[] numeros2 = array;//VL de tipo Array que apunta al Array numeros.
        array = new int[numeros2.length +1];//numeros pasa a apuntar a numeros2 con una posición añadida.
        //bucle para iterar tantas veces como como elementos tiene numeros2.
        for(int i = 0; i < numeros2.length; i ++){
            array[i] = numeros2[i]; //pasamos los elementos de numeros2 a numeros.
        }
        array[numeros2.length] = elemento;
    }

    /**
     *añade un elemento a la colección en la posición especificada por el parámetro index. Si el valor de index no es válido, 
     *entonces no hace nada. Los elementos a continuación del añadido se desplazan una posición.
     */
    public void add(int index, int elemento){
        if(index <= array.length && index >= 0){
            int[] local = array; //ahora mismo la VL local es un Arrays con un tamaño 0.
            array= new int[local.length + 1]; // numeros es un nuevo Arrays con el tamaño del Arrays local + 1 
            for(int i = 0; i < local.length; i ++){
                if(i < index){
                    array[i] = local[i];
                }
                else{
                    array[i + 1] = local[i];
                }
            }  
            array[index] = elemento;
        }
    }

    /**
     * vacía la colección
     */
    public void clear(){
        array = new int[0];
    }

    /**
     * devuelve true si la colección contiene ese elemento, false en cualquier otro caso
     */
    public boolean contains(int elemento){
        boolean ele = false;
        for(int i = 0; i < array.length; i ++){
            if(array[i] == elemento){
                ele = true;
            }
        }
        return ele;
    }

    /**
     * devuelve el elemento existente en la posición indicada. Si el valor de index no es válido, entonces devuelve -1.
     */
    public int get(int index){
        int element = -1;
        if(index < array.length && index >= 0){
            element = array[index];                
        }
        return element;
    }

    /**
     * reemplaza el elemento en la posición index con el valor de element. Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element){
        if(index < array.length && index >= 0){
            array[index] = element;
        }
    }

    /**
     *devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 en caso de que la colección
     *no contenga el elemento especificado.
     */
    public int indexOf(int elemento){
         int cont = 0;
        boolean encontrado = false;
        while(cont < array.length && !encontrado)
        {
            if (array[cont] == elemento)
            {
                encontrado = true;
            }
            cont++;
        }
        if (!encontrado)
        {
            cont = 0;
        }
        return cont-1;
        /////////////////////////////////////////////////////////////////
        //         int indice = -1;
        //         for(int i = 0; i < array.length; i ++){
        //             if(array[i] == elemento){
        //                 indice = i;
        //             }
        //         }
        //         return indice;
    }

    /**
     * devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty(){
        return array.length == 0;//en este return java devuelve por defecto true si la colección está vacía.
    }

    /**
     * elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento. 
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index){
        int valor = -1; //variable a devolver.
        if(index < array.length && index >= 0){
            int[] copia = array;
            array = new int[copia.length -1];
            for(int i = 0; i < index; i ++){
                array[i] = copia[i];
            }
            for(int i = index; i < array.length; i ++){
                array[i] = copia[i +1];
            }
            valor = copia[index];
        }
        return valor;
    }

    /**
     * devuelve el número de elementos de la colección.
     */
    public int size(){
        //         int cont = 0;
        //         for(int i = 0; i < numeros.length; i ++){
        //             cont += numeros[i]; 
        //         }
        //         return cont;
        return array.length;
    }

}
