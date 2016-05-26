package io.dimitrivaughn;


/**
 * Created by dimitrivaughn on 5/25/16.
 */
public class MyArrayList<T> {


// declaring fields

    protected Object[] array;
    protected int indexPointer;
    protected int capacity;

// constructor initalizing an array of length 10 within the class

    public MyArrayList(){
        array = new Object[10];
        indexPointer = 0;
        capacity = 0;
    }

// overloading constructor to set an array of user defined 10

    public MyArrayList(int size){
        array =  new Object[size];
        indexPointer = 0;
        capacity = 0;
    }

// method that adds an element to the first open index of an array

    public void add(T element){

            resizeArray();
            array[capacity] = element;

        indexPointer++;
        capacity++;

    }

    public void add(int index, T element) {
        int arrayLength = lengthTotal();
        if (isFull()){
            resizeArray();
            array[arrayLength] = array[arrayLength-1];
            for (int i = arrayLength - 1; i >= index; i--) {
                if (array[i] != null) {
                    array[i] = array[i-1];
                }
            }
            array[index] = element;
            capacity++;
        }
        else{
            array[index] = element;
            capacity++;
        }
    }


    public T get(int index){
        return (T) array[index];
    }

    public void set(int index, T element){
        array[index] = element;
    }

    public void clear(){
        int index = 0;
        for(Object object : array) {
            array[index] = null;
            index++;
        }
        indexPointer = 0;
        capacity = 0;
    }

    public void remove(int index){
        if(array[index]!=null){
            array[index] = null;

        }

    }

    public boolean isEmpty(){
        return capacity == 0;
    }

    public boolean contains(T element){
        for(int i = 0; i<array.length; i++){
            if(element.equals(array[i])){
                return true;
            }
        }
        return false;
    }

    public int lengthTotal(){
        return array.length;
    }

    public int size(){
        return capacity;
    }

    public boolean isFull(){
        return size() == lengthTotal();
    }

    public void resizeArray(){
        Object[] arrayDoubled = new Object[array.length*2];

        if(isFull()) {
            for (int i = 0; i < array.length; i++) {
                arrayDoubled[i] = array[i];
            }
            array = arrayDoubled;
        }
    }

}


