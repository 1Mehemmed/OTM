package ProtoType;

public class VersionControlRunner {
    public static void main(String[] args) {
        var project = new Project(id1, name "First",sourceCode "code");
        var projectFactory = new ProjectFactory(project);
        var projectClone = ProjectFactory.cloneProject();
        System.out.println(projectClone);
    }
}
