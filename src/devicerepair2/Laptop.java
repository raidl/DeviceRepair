
package devicerepair2;
import java.util.ArrayList;
public class Laptop extends device{

    
    private ArrayList<Component> Components = new ArrayList<>();

    public Laptop(String IdentificationCode, String MakeAndModel, String owner, String ProblemDescription, String RepatirNotes, int priority) {
        super(IdentificationCode, MakeAndModel, owner, ProblemDescription, RepatirNotes, priority);
    }
    public ArrayList<Component> getComponents() {
        return Components;
    }

    public void setComponents(ArrayList<Component> Components) {
        this.Components = Components;
    }
    public void addComponent(Component component){
        Components.add(component);
    }
    public void deleteComponent(int index){
        if (index>= 0 && index < Components.size())
        Components.remove(index);
    }
    
}
