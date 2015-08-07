package Interfaces;

import com.matrimony.android_tutorial_05.PrintOutput;

/**
 * Created by rahul on 28-07-2015.
 */
public class DayDream extends Dream {

    public DayDream(){
        PrintOutput.print("This is a day dream");
    }

    public String dreamDuringClass(){

        return "I always dream during class";
    }

    public String levelOfFocus(){
      // call method in parent class

      return super.canWakeMeUp("Dark places");
    }

    // method overriding in derived class
    public String canWakeMeUp(String dayDreams){

        PrintOutput.print(dayDreams + " can wake me up!");
        // uncomment this to test inherited interface methods
        dreamsAboutFlying();
        return "dreams";
    }




}
