package InnerClasses;

import com.matrimony.android_tutorial_05.PrintOutput;

/**
 * Created by rahul on 28-07-2015.
 */
public class Pulse {

    final static float pulse = 120.0f;

    public static float getPulse(){

        PrintOutput.print("Pulse rate is:" + Float.toString(pulse));
        return pulse;
    }
}
