package ProtoType;

public class ProjectFactory {
    private final Project project;
    public ProjectFactory(Project project){
        this.project=project;
    }
    public Project cloneProcect(){
        return(Project) project.copy();
    }
}
