package Factory;

public class KotlinDeveloperFactory implements Developer {
    @Override
    public Developer createDeveloper(){
        return new KotlinDeveloper();
}
