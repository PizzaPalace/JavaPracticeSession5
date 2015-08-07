package InnerClasses;

import com.matrimony.android_tutorial_05.PrintOutput;

/**
 * Created by rahul on 29-07-2015.
 */
public abstract class BloodGroup {

    String bloodGroupType;

    static final boolean hasWhiteCells = true;

    public abstract void bloodGroupType();

    public String bloodGroup(String bloodGroupType){

        PrintOutput.print(bloodGroupType);
        return bloodGroupType;
    }


}
