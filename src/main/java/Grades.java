import java.util.ArrayList;
import java.util.Scanner;

public class Grades {

    public static void addSubject(ArrayList<String> subject, ArrayList<String> grade) {
        //
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        for (int i = 0; i < var; i++) {

            while (true) {
                System.out.println("Kérem adja meg a tárgy nevét: ");
                subject.add(sc.next());
                System.out.println("Kérem adja meg a jegyet: ");
                grade.add(sc.next());
                break;
            }
        }
    }

    public static void dropSubject(ArrayList<String> subject, ArrayList<String> grade) {
        //
        try {
            Scanner sc = new Scanner(System.in);
            String var = sc.next();
            int pos = subject.indexOf(var);
            subject.remove(var);
            grade.remove(pos);
        } catch (Exception e) {
            System.out.print("Ön nem adott törlésre érvényes elemet.\n");
        }
    }
    public static void getGrades(ArrayList<String> subject, ArrayList<String> grade){
        for (int i = 0 ; i < grade.size(); i++) {
            System.out.printf("%s\t%s\n", subject.get(i), grade.get(i));
        }
    }
}