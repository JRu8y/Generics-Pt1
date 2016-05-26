package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/25/16.
 */
public class MySet <T> extends MyArrayList <T> {

// constructor initalizing an array of length 10 within the class

    public MySet(){
        super();
    }

// overloading constructor to set an array of user defined 10

    public MySet(int size){
       super(size);
    }



    // method that adds an element to the first open index of an array

    @Override
    public void add(T element) {
        if (!contains(element)) {
            if (isFull()) {
                resizeArray();
                array[capacity] = element;
            } else {
                array[indexPointer] = element;
            }
            indexPointer++;
            capacity++;
        }
        else{
            System.out.println("MySet already contains: "+ element);
        }
    }

    @Override
    public void add(int index, T element) {
        int arrayLength = lengthTotal();
        if (!contains(element)) {
            if (isFull()) {
                resizeArray();
                array[arrayLength] = array[arrayLength - 1];
                for (int i = arrayLength - 1; i >= index; i--) {
                    if (array[i] != null) {
                        array[i] = array[i - 1];
                    }
                }
                array[index] = element;
                capacity++;
            } else {
                array[index] = element;
                capacity++;
            }
        }
        else{
            System.out.println("MySet already contains: "+ element);

        }
    }




}
