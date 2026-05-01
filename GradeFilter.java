import java.util.HashMap;

@FunctionalInterface
interface GradeRule {
    boolean test(int grade);
}

public class GradeFilter {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();

        grades.put("Ali", 85);
        grades.put("Leyla", 92);
        grades.put("Murad", 55);
        grades.put("Nigar", 70);
        grades.put("Kamran", 40);

        GradeRule passedRule = grade -> grade >= 60;
        GradeRule excellentRule = grade -> grade >= 90;

        System.out.println("Passed students:");
        grades.forEach((name, grade) -> {
            if (passedRule.test(grade)) {
                System.out.println(name + ": " + grade);
            }
        });

        System.out.println("\nExcellent students:");
        grades.forEach((name, grade) -> {
            if (excellentRule.test(grade)) {
                System.out.println(name + ": " + grade);
            }
        });
    }
}