package oop;
// TODO: CREATE A NEW "OBERON" CLASS WITH AT LEAST 6 PROPERTIES
//  THAT DESCRIBE OUR OBERON COHORT. MAKE SURE TO INCLUDE
//  AT LEAST THREE DIFFERENT TYPES OF DATA IN YOUR CLASS. IN A
//  SEPARATE FILE, CREATE 3 INSTANCES OF THE OBERON CLASS AND
//  PRINT OUT A STRING THAT USES AT LEAST 3 OF THOSE PROPERTIES
//  TO DESCRIBE THAT OBERON INSTANCE.

public class oberon {


    private int numStudents;
    private String monthStarted;
    private boolean onZoom;
    private String monthFinished;
    private String language;

    public oberon(int numStudents, String monthStarted, String monthFinished, boolean onZoom, String language){
        this.numStudents = numStudents;
        this.monthStarted = monthStarted;
        this.monthFinished = monthFinished;
        this.onZoom = onZoom;
        this.language = language;
    }

    public String listProperties(){
        return "This instance of Oberon has " + numStudents + " students. We start(ed) in " + monthStarted + " and we finish(ed) in " + monthFinished +
                ". It is " + onZoom + " that we use(d) Zoom to learn: " + language + "." ;

    }
}
