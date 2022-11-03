package org.example;

import java.util.Random;

public class Plan {
    private Random r = new Random();
    private String[] planM;
    private String[] planF;

    public Plan(){
        planM = new String[]{
                " plans to continue attending the daily group meetings at Community 43. He wants to attend the C43 program regularly as he works toward his treatment goals. Writer and staff will continue to facilitate groups and provide encouragement and support.",
                " wants to continue attending classes and groups at the C43 program in order to work toward his goals. He could benefit from support from staff and others to help him manage symptoms. Writer will continue to facilitate groups, provide support, and offer encouragement.",
                " plans to continue participating in group and individual health promotion and skill development sessions in the Tech Unit as well as individual coaching with Writer. Writer and staff will continue to coordinate care according to treatment plan, practicing effective coping skills, symptom regulation and experience ongoing growth and healthy interactions with others.",
                " plans to continue attending the daily group meetings at Community 43. He wants to attend the C43 program regularly as he works toward his treatment goals. Writer and staff will continue to facilitate groups and provide encouragement and support."
        };

        planF = new String[]{
                " plans to continue attending the daily group meetings at Community 43. She wants to attend the C43 program regularly as she works toward her treatment goals. Writer and staff will continue to facilitate groups and provide encouragement and support.",
                " wants to continue attending classes and groups at the C43 program in order to work toward her goals. She could benefit from support from staff and others to help her manage symptoms. Writer will continue to facilitate groups, provide support, and offer encouragement.",
                " plans to continue participating in group and individual health promotion and skill development sessions in the Tech Unit as well as individual coaching with Writer. Writer and staff will continue to coordinate care according to treatment plan, practicing effective coping skills, symptom regulation and experience ongoing growth and healthy interactions with others.",
                " plans to continue attending the daily group meetings at Community 43. She wants to attend the C43 program regularly as she works toward her treatment goals. Writer and staff will continue to facilitate groups and provide encouragement and support."
        };
    }

    public String P(Person person){
        String a;
        if(person.isMale())
            a = person.name() + planM[r.nextInt(planM.length)];

        else
            a = person.name() + planF[r.nextInt(planF.length)];

        return a;
    }
}
