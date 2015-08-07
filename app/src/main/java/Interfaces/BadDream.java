package Interfaces;

import com.matrimony.android_tutorial_05.PrintOutput;

/**
 * Created by rahul on 28-07-2015.
 */
public class BadDream extends Dream implements Walker {

    public BadDream(){

        spiders();
        walksAndTalks("Nonsense");
        walksBackwards(2,0.5f);
        PrintOutput.print(dreamAffinity());
        dreamsAboutFlying();
    }

    protected String spiders(){

        return "spiders in my dreams";
    }

    @Override
    public String walksAndTalks(String whatAmISaying) {

        PrintOutput.print( whatAmISaying + " is what I said in my walking-talking dream!");
        return null;
    }

    @Override
    public void walksBackwards(int speed, float distance) {

        PrintOutput.print("Walks backwards at " + speed + " Km/hr " + " covering " + distance + " kms. " );
    }

    @Override
    public String dreamAffinity() {

        return "I love dreaming!";
    }

    @Override
    public void dreamsAboutFlying() {

        PrintOutput.print("Dreams about flying");
    }
}
