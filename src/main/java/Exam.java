import java.util.ArrayList;

/*
Származtasson egy UpdateRecipes osztályt a Recipes osztályból, 
melynek update metódusával lehessen módosítani a Recipes objektumban tárolt elemeket.
*/

public class Exam extends Grades {
    public static void registGradeToSubject(String[] args) {

        ArrayList<String> subject = new ArrayList<>();
        ArrayList<String> grade = new ArrayList<>();

        System.out.print("Kérem adja meg, hogy hány darab érdemjegyet szeretne megadni:\n");
        addSubject(subject,grade);

        System.out.print("Kérem adja meg a törlendő tantárgy pontos nevét:"
                + " (Ha nem akar élni az opcióval írjon - jelet) \n");
        dropSubject(subject, grade);

        System.out.print("Az aktuálisan tárolt jegyek:\n");
        getGrades(subject, grade);
    }
    }
