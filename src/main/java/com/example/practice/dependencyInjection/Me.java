package com.example.practice.dependencyInjection;

import java.util.ArrayList;

public class Me {
    /*
    Story: for me to be happy, I need a family, job, important Numbers like passport Number, NRIC ...
    All of these are my dependencies. I depend on all of these
    Dependencies of this class are the variables included here. To create a "me" object,these are required
    ===========================
    WE WILL NO LONGER DO THIS
    String name = "Rohini"; //literal dependency
    int homeNum = 1234;
    Family fam = new Family(); //object dependency
    Job job = new Job();
    ArrayList<Integer> importantNumbers = new ArrayList(); //collection dependencies
    importantNumbers.add(12345);
    importantNumbers.add(12232);
    ================================
    WE WANT TO INITIALISE BUT NOT HARD CODE ITS VALUES
    String name;
    int homeNum;
    Family fam;
    Job job;
    ArrayList<Integer> importantNumbers;
    =================================
    With dependency injection, we do not need to hard code them. Hard code refers to:
    String name = "Rohini"; Family fam = new Family(); ...
    There are some values for all these variables. We will tell Spring and Spring will inject these values
    Spring will use setter injection or constructor injection to do this
    Dependencies can be in the form of:
    1. literals
    2. objects
    3. collections
     */
}
