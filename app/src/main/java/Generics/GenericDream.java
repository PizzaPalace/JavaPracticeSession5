package Generics;

import com.matrimony.android_tutorial_05.PrintOutput;

/**
 * Created by rahul on 28-07-2015.
 */
public class GenericDream<T> {

    T kindOfDream;

    public GenericDream(T value){

        kindOfDream  = value;
        PrintOutput.print("This is a generic dream ");
    }

    public String kindOfDream(){

        PrintOutput.print(kindOfDream.toString());
        return "";
    }
}
