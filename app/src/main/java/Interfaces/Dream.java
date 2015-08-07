package Interfaces;

import com.matrimony.android_tutorial_05.PrintOutput;

/**
 * Created by rahul on 28-07-2015.
 */
public class Dream implements Dreamer{

    String nameOfDream;
    Boolean hasHappyEnding;

    public Dream(){

        this.nameOfDream = "Default Dream";
        this.hasHappyEnding = true;
    }

    Dream(String name){

        this.nameOfDream = name;
        this.hasHappyEnding = true;
    }

    Dream(Boolean happyEnding){

        this.nameOfDream = "Default Dream";
        this.hasHappyEnding = happyEnding;
    }

    Dream(String name, Boolean happyEnding){

        this.nameOfDream = name;
        this.hasHappyEnding = happyEnding;
    }

    public boolean inColor(Boolean dreamInColor){

        return  dreamInColor;
    }

    private void canWakeMeUp(){

        PrintOutput.print("Dreams always wake me up");
    }

    // don't do this - change access modifier and retain the name and type
    /*public void canWakeMeUp(){


    }*/

    // don't do this
    /*private String canWakeMeUp(){

        return "This is another way of saying dreams can wake me up";
    }*/

    private void canWakeMeUp(Integer i,Float f, Boolean b,BadDream badDream){

        PrintOutput.print(i.toString() + " and "+
                          f.toString() + " and "+
                          b.toString() + " and " +
                          badDream.spiders()+
                          " and other scary things can wake me up");
    }

    public String canWakeMeUp(String scaryEnding){

        PrintOutput.print(scaryEnding + " woke me up");
        //dreamsAboutFlying();
        return scaryEnding;
    }


    @Override
    public String dreamAffinity() {
        PrintOutput.print("I like dreaming");
        return null;
    }

    @Override
    public void dreamsAboutFlying() {

        PrintOutput.print("I dream about flying");
    }

    // don't do this - change scope but keep name and parameters the same
    /*private void canWakeMeUp(String nightMares){

        // do something here
    }*/
    // uncomment to implement interface




}
