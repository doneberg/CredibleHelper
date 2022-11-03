package org.example;

import java.util.Random;

public class Response {
    private Random r = new Random();
    private String[] responseM;
    private String[] responseF;

    public Response(){
        responseM = new String[]{
                " was alert and presented with a calm and congruent affect. He made appropriate eye contact and had open behavior. He was able to convey his thoughts and feelings succinctly and effectively. He is making progress as demonstrated by his engagement and participation at the C43 program. He could benefit from ongoing attendance and practicing goal-setting skills.",
                " was attentive, alert, oriented and engaged with others with a euthymic mood and no new observable impairments in cognition, perception, thoughts, behavior, insight or judgment. He benefits from participation in Community 43 services, groups and supports and should continue to do so.",
                " responded positively to the assigned tasks and participated in discussions during the workshop. He was engaged socially with his peers and the Writer for the duration of the session. He was successful in completing the tasks with the group and was pleasant to other community members. He made direct eye contact when appropriate and openly received feedback to and from other members and staff.",
                " responded well to the discussion and the intervention during the discussion. He was polite and respectful during the conversation with the writer."
        };

        responseF = new String[]{
                " was attentive, alert, oriented and engaged with others with a euthymic mood and no new observable impairments in cognition, perception, thoughts, behavior, insight or judgment. She benefits from participation in Community 43 services, groups, supports, and should continue to do so.",
                " was alert and presented with a calm and congruent affect. She made appropriate eye contact and had open behavior. She was able to convey her thoughts and feelings succinctly and effectively. She is making progress as demonstrated by her engagement and participation at the C43 program. She could benefit from ongoing attendance and practicing goal-setting skills.",
                " responded positively to the assigned tasks and participated in discussions during the workshop. She was engaged socially with her peers and the Writer for the duration of the session. She was successful in completing the tasks with the group and was pleasant to other community members. She made direct eye contact when appropriate and openly received feedback to and from other members and staff.",
                " responded positively to the discussion and the interventions during the discussion. She was polite and respectful during the conversation with the writer."
        };
    }

    public String R(Person person){
        String response;
        if(person.isMale())
            response = person.name() + responseM[r.nextInt(responseM.length)];

        else
            response = person.name() + responseF[r.nextInt(responseF.length)];

        return response;
    }
}
