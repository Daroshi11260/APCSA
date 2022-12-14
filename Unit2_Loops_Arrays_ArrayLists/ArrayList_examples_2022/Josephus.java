import java.util.ArrayList;
import acm.program.*;

public class Josephus extends ConsoleProgram
{
    
    
    public void run()
    {
        ArrayList<String> students = new ArrayList<String>();
        initializeStudents(students);

        println("Let's play the Josephus game...");
        println();

        int index = 0;
        while (students.size() > 1)
        {
            int len = students.get(index).length();
            
            println(students.get(index) + " has length " + len + ".");
            println("lets remove the student " + len + " spaces after " + students.get(index));
            println("Goodbye, " + students.get((index + len) % students.size()) + " You were removed.");
            println();
            students.remove((index + len) % students.size());
            index = (index + len) % students.size();
        }
        
        println(students.get(0) + "is the winner!");
    }
    

    public void initializeStudents(ArrayList<String> students)
    {
        students.add("Redmond Averbuck");
        students.add("Natasha Bamdad");
        students.add("Ariv Bhatnagar");
        students.add("Tina Chen");
        students.add("Neal Chopra");
        students.add("Marty Freeland");
        students.add("Kate Garlinghouse");
        students.add("Anneka Goel");   
        students.add("Yana Gulati");
        students.add("Vishnu Kagolanu");
        students.add("Nick Karros");
        students.add("Ethan Liu");
        students.add("Christina Long");
        students.add("Tynan Macaluso");
        students.add("Trent Melinauskas");
        students.add("Lily Pelham Burn");
        students.add("Thalia Stavropoulos");
        students.add("William Swart");
        students.add("Roshan Taneja");
        students.add("Naomi Watson");
        students.add("William Yen");
    }
}
