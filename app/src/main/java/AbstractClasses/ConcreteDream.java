package AbstractClasses;

import com.matrimony.android_tutorial_05.PrintOutput;

import Interfaces.Dreamer;

/**
 * Created by rahul on 28-07-2015.
 */
public class ConcreteDream extends AbstractDream implements Dreamer {

    public ConcreteDream()
   {
       PrintOutput.print(Integer.toString(dreamDuration));
   }

    @Override
    public void abstractDream() {

        PrintOutput.print("this is an abstract dream");
    }

    @Override
    public String dreamAffinity() {
        return "My dream affinity is zero, I never dream";
    }

    @Override
    public void dreamsAboutFlying() {

        PrintOutput.print("I love dreaming about flying");
    }
}
