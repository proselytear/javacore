package ua.epam.javacore.lesson_03;

public class SkillDemo {
    public static void main(String[] args) {
        Skill skill = new Skill();
        Skill skill2 = new Skill();

        skill.setId(1L);
        skill2.setId(1L);
        skill.setName("java");
        skill2.setName("java");

        System.out.println(skill.hashCode());
        System.out.println(skill2.hashCode());

        System.out.println(skill.equals(skill2));
        System.out.println(skill == skill2);

        System.out.println(skill);
    }
}
