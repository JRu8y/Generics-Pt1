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
            super.add(element);
        }
        else{
            System.out.println("MySet already contains: "+ element);
        }
    }

    @Override
    public void add(int index, T element) {
        int arrayLength = lengthTotal();
        if (!contains(element)) {
            super.add(index, element);
        }
        else{
            System.out.println("MySet already contains: "+ element);

        }
    }




}
