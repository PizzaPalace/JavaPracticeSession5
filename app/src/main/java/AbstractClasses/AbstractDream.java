package AbstractClasses;

import com.matrimony.android_tutorial_05.PrintOutput;

/**
 * Created by rahul on 28-07-2015.
 */
public abstract class AbstractDream {

     /*AbstractDream(){

         PrintOutput.print("Abstract dream begins now...");
     }*/

    public String nameOfDream;

    public final int dreamDuration = 120;

    public abstract void abstractDream();

    public Boolean dreamsInColor(String dreamType){

        if(dreamType.equals("DayDream")) {
            PrintOutput.print("This is a day dream.");
            return true;
        }
        else if(dreamType.equals("Nightmare")) {
            PrintOutput.print("This is a nightmare.");
            return false;
        }
        else
            return false;
    }
}
