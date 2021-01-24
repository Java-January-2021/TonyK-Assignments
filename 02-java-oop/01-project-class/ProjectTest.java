public class ProjectTest {
    public static void main(String[] args) {
        Project projectTestOne = new Project();
        projectTestOne.setName("Florida Panthers");
        projectTestOne.setDescription("Bobrovskiy, Barkov, Yandle");
        System.out.println(projectTestOne.getName());
        System.out.println(projectTestOne.getDescription());
        System.out.println(projectTestOne.elevatorPitch());

        Project projectTestTwo = new Project("San Jose Sharks");
        projectTestTwo.setDescription("Marleau, Couture, Jones");
        System.out.println(projectTestTwo.getName());
        System.out.println(projectTestTwo.getDescription());
        System.out.println(projectTestTwo.elevatorPitch());

        Project projectTestThree = new Project("Washington Capitals", "Ovechkin, Kuznetsov, Wilson");
        System.out.println(projectTestThree.getName());
        System.out.println(projectTestThree.getDescription());
        System.out.println(projectTestThree.elevatorPitch());
    }
}