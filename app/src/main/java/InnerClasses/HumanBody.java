package InnerClasses;

import com.matrimony.android_tutorial_05.PrintOutput;

/**
 * Created by rahul on 28-07-2015.
 */
public class HumanBody extends BloodGroup {

    BodyParameters bodyParameters;
    int numberOfEyes = 2;
    Pulse pulse;


    public HumanBody(){

        bodyParameters = new BodyParameters();
    }

    @Override
    public void bloodGroupType() {

        PrintOutput.print("My Blood Group is O+ve. I am a universal donor");

    }

    public interface Weight{

        public Integer weight();
    }

    public class Heart{

        Boolean hasVessels = true;
        // wrong don't do this
        //bodyParameters.getHeartBeat();
        public void heartBeat(){

            bodyParameters.getHeartBeat();
        }
    }

    public class Brain<T,K,S>{

        Boolean givesIntelligence = true;
        T genericObject_1;
        K genericObject_2;
        S genericObject_3;

        public Brain(T t, K k, S s){

            this.genericObject_1 = t;
            this.genericObject_2 = k;
            this.genericObject_3 = s;
        }

        public boolean hasNeurons(){

            PrintOutput.print("Brain has neurons");
            return true;
        }

        public void printGenericObjects(){

            PrintOutput.print("Generic Object T: " + genericObject_1.toString() + " Generic Object K:"  + genericObject_2.toString() + " Generic Object S:" + genericObject_3.toString());
        }
    }

    public class Lungs implements Weight{

        int numberOfLungs = 2;

        public void getNumberOfLungs(){

           PrintOutput.print("A human body has " + numberOfLungs + " lungs and weigh " + weight() + " kgs" );
        }

        @Override
        public Integer weight() {
            //PrintOutput.print("LUNGS WEIGH 10 KGS");
            return 10;
        }
    }

    public static class Stomach implements Weight{

        @Override
        public Integer weight() {
            PrintOutput.print("STOMACH WEIGHS 5 KGS");
            return 15;
        }
    }

    public int numberOfJoints(){

        PrintOutput.print("The human body has 140 joints");
        return 140;
    }

    public void numberOfLegs(){

        PrintOutput.print("Has 2 legs");
    }

    public Brain getBrain(){

        return new Brain("Einstein's",15,"Genius");
    }

    public Heart getHeart(){

         return new Heart();
    }

    public Lungs getLungs(){

        return new Lungs();
    }


}
