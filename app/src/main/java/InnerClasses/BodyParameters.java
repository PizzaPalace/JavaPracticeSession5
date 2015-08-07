package InnerClasses;

import com.matrimony.android_tutorial_05.PrintOutput;

/**
 * Created by rahul on 28-07-2015.
 */
public class BodyParameters {

    int heartBeat;


    BodyParameters(){
        this.heartBeat = 340;
    }

    public int getHeartBeat(){

        PrintOutput.print("Heart beat is: " + Integer.toString(heartBeat));
        return this.heartBeat;
    }

    public void setHeartBeat(int beat){

        this.heartBeat = beat;
    }

    public void getPulse(){

        PrintOutput.print(Float.toString(Pulse.getPulse()));
    }

}
