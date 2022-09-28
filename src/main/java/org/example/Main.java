package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Assessment a = new Assessment();
        Response r = new Response();
        Plan p = new Plan();

        try {
            File list = new File("list.txt");
            Scanner in = new Scanner(list);
            boolean isMale;
            while (in.hasNext()) {
                String name = in.next();
                String gender = in.next();
                isMale = genderCheck(gender);
                people.add(new Person(name, isMale));
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File couldn't be read");
            e.printStackTrace();
        }

        for(int i = 0; i < people.size(); i++){

        }

        try {
            String newline = System.getProperty("line.separator");
            String output = "notes.txt";
            BufferedWriter writer = new BufferedWriter(new PrintWriter(output));
            writer.append("Group size: " + people.size() + " members\n\n");
            for(int i = 0; i < people.size(); i++){
                writer.append(people.get(i).name());
                writer.newLine();
                writer.append("******************");
                writer.newLine();
                    writer.append("Assessment: ");
                    writer.append(a.A(people.get(i)));
                    writer.newLine();
                    writer.newLine();

                    writer.append("Response: ");
                    writer.append(r.R(people.get(i)));
                    writer.newLine();
                    writer.newLine();

                    writer.append("Plan: ");
                    writer.append(p.P(people.get(i)));
                    writer.newLine();
                    writer.newLine();


                writer.newLine();
                writer.newLine();
                writer.newLine();
            }
            writer.append("Assessment: ");
            for(int i = 0; i < people.size(); i++){
                writer.append(a.A(people.get(i)));
                writer.newLine();
            }
            writer.newLine();
            writer.newLine();
            writer.append("Response: ");
            for(int i = 0; i < people.size(); i++){
                writer.append(r.R(people.get(i)));
                writer.newLine();
            }
            writer.newLine();
            writer.newLine();
            writer.append("Plan: ");
            for(int i = 0; i < people.size(); i++){
                writer.append(p.P(people.get(i)));
                writer.newLine();
            }

            writer.close();
        }
        catch (IOException e){
            System.out.println("Problem writing file");
            e.printStackTrace();
        }
    }

    public static boolean genderCheck(String gender){
        boolean isMale;
        isMale = false;
        if(gender.equalsIgnoreCase("m"))
            isMale = true;
        else if(gender.equalsIgnoreCase("f"))
            isMale = false;
        else System.out.println("Bad input. Check gender in list.txt.");

        return isMale;
    }
}