package ua.epam.javacore.lesson_12.patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");

        System.out.println(master);
        System.out.println(master.hashCode());

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println("\n=======================\n");
        System.out.println(masterClone);
        System.out.println(masterClone.hashCode());
    }
}
