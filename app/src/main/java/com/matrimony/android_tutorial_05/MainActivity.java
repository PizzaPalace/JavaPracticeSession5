package com.matrimony.android_tutorial_05;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import AbstractClasses.AbstractDream;
import AbstractClasses.ConcreteDream;
import Generics.GenericDream;
import Generics.NonGenericDream;
import InnerClasses.HumanBody;
import Interfaces.BadDream;
import Interfaces.DayDream;
import Interfaces.Dream;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Log.v("name",PrintOutput.name);
        // Example interfaces, inheritance and polymorphism
        /*DayDream dayDream = new DayDream();
        dayDream.canWakeMeUp("A day dream");
        String output = dayDream.levelOfFocus();
        if(output != null)
            Log.v("DREAMS", output);*/

        //BadDream badDream = new BadDream();

        // Example: Non-Generic class
        /*Dream dream = new Dream();
        NonGenericDream nonGenericDream = new NonGenericDream(dream);
        PrintOutput.print(nonGenericDream.printNonGenericDream().toString());

        NonGenericDream nonGenericNumberDream = new NonGenericDream(1000);
        PrintOutput.print(nonGenericNumberDream.printNonGenericDream().toString());*/

        // Example: Generics
        /*GenericDream<String> genericDream = new GenericDream<String>("HELLO GENERICS");
        genericDream.kindOfDream();

        GenericDream<Integer> genericDream2 = new GenericDream<Integer>(1000000);
        genericDream2.kindOfDream();*/

        //Abstract classes - this is wrong
        //AbstractDream abstractDream = new AbstractDream();

        // Concrete class example that extends an abstract class
        /*ConcreteDream concreteDream = new ConcreteDream();
        concreteDream.dreamsAboutFlying();
        concreteDream.abstractDream();
        concreteDream.dreamAffinity();
        concreteDream.dreamsInColor("DayDream");
        concreteDream.dreamsInColor("Nightmare");
        concreteDream.dreamsInColor("Something else");*/

        // Inner classes
        HumanBody humanBody = new HumanBody();

        //  method that returs an object
        /*HumanBody.Lungs lungs = humanBody.getLungs();
        lungs.getNumberOfLungs();
        lungs.weight();*/

        // instantiating an inner class
        HumanBody.Brain<String,Integer,Float> brain = humanBody.new Brain<String,Integer,Float>("Gary kasparov's",10,120.0f);
        brain.hasNeurons();
        brain.printGenericObjects();

        // method that returns an  object
        /*HumanBody.Brain<String,Integer,String> secondBrain = humanBody.getBrain();
        secondBrain.hasNeurons();
        secondBrain.printGenericObjects();*/

        // another example of method that returns an object
        /*HumanBody.Heart heart = humanBody.getHeart();
        heart.heartBeat();*/

        // static inner class
        /*HumanBody.Stomach stomach = new HumanBody.Stomach();
        stomach.weight();*/

        // extended abstract class
        /*humanBody.bloodGroupType();
        humanBody.bloodGroup("B+ve");*/

        ArrayList<Integer> myarray= new ArrayList<Integer>();
        myarray.add(100);
        myarray.add(101);
        myarray.add(102);
        myarray.remove(Integer.valueOf(100));
        myarray.remove(Integer.valueOf(101));

        Log.v("OUTPUT",myarray.toString());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
