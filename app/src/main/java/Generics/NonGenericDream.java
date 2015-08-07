package Generics;

import Interfaces.Dream;

/**
 * Created by rahul on 28-07-2015.
 */
public class NonGenericDream {

    Object nonGenericDream;

    public NonGenericDream(Dream dream){

        this.nonGenericDream = (Dream) dream;
    }

    public NonGenericDream(Integer i){

        this.nonGenericDream = (Integer) i;
    }

    public Object printNonGenericDream(){

       if(nonGenericDream instanceof Dream) {
           Dream myDream = (Dream) nonGenericDream;
           return myDream.canWakeMeUp("SCARY STUFF");
       }

        else if(nonGenericDream instanceof Integer){
           Integer sampleInt = (Integer)nonGenericDream;
           return sampleInt;
       }
       else
           return null;
    }

}
