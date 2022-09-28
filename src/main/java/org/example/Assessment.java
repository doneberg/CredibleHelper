package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Assessment {
    private Random r = new Random();
    private String[] assessmentM;
    private String[] assessmentF;

    public Assessment(){
        assessmentM = new String[]{
                " was alert and presented with a calm and congruent affect. He made appropriate eye contact and had open behavior. He was able to convey his thoughts and feelings succinctly and effectively. He is making progress as demonstrated by his engagement and participation at the C43 program. He could benefit from ongoing attendance and practicing goal-setting skills.",
                " was attentive, alert, oriented x3 and engaged with others with a euthymic mood and no new observable impairments in cognition, perception, thoughts, behavior, insight or judgment. He benefits from participation in Community 43 services, groups and supports and should continue to do so.",
                " was alert, oriented x3 with a calm affect and no new or significant changes in cognition, perception, thoughts, behavior, insight or judgment. They had appropriate behavior and were able to convey thoughts and feelings and participate as they felt comfortable.",
                " was alert and oriented. He presented with a calm and euthymic affect. He was able to convey his thoughts and feelings effectively and participated fully in the group. He has been making progress in how he responds to other members and in his regular attendance."
        };

        assessmentF = new String[]{
                " was attentive, alert, oriented x3 and engaged with others with a euthymic mood and no new observable impairments in cognition, perception, thoughts, behavior, insight or judgment. She benefits from participation in Community 43 services, groups, supports, and should continue to do so.",
                " was alert and presented with a calm and congruent affect. She made appropriate eye contact and had open behavior. She was able to convey her thoughts and feelings succinctly and effectively. She is making progress as demonstrated by her engagement and participation at the C43 program. She could benefit from ongoing attendance and practicing goal-setting skills.",
                " was alert, oriented x3 with a calm affect and no new or significant changes in cognition, perception, thoughts, behavior, insight or judgment. They had appropriate behavior and were able to convey thoughts and feelings and participate as they felt comfortable.",
                " was alert and oriented. She presented with a calm and euthymic affect. She was able to convey her thoughts and feelings effectively and participated fully in the group. She has been making progress in how she responds to other members and in her regular attendance."
        };
    }

    public String A(Person person){
        String a;
        if(person.isMale())
            a = person.name() + assessmentM[r.nextInt(assessmentM.length)];

        else
            a = person.name() + assessmentF[r.nextInt(assessmentF.length)];

        return a;
    }

}
