package devicerepair2;


public class device {
 
    
    protected String IdentificationCode;
    protected String MakeAndModel;
    protected String owner;
    protected String ProblemDescription;
    protected String RepairNotes;
    protected int priority;
    
    
    //constructor

    public device(String IdentificationCode, String MakeAndModel, String owner, String ProblemDescription, String RepatirNotes, int priority) {
        this.IdentificationCode = IdentificationCode;
        this.MakeAndModel = MakeAndModel;
        this.owner = owner;
        this.ProblemDescription = ProblemDescription;
        this.RepairNotes = RepatirNotes;
        this.priority = priority;
    }
   public String toString(){
    return IdentificationCode + ", " + MakeAndModel + ", " + owner + ", " + ProblemDescription + ", " + RepairNotes + ", " + priority;
    }
    
    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public void setIdentificationCode(String IdentificationCode) {
        this.IdentificationCode = IdentificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public void setMakeAndModel(String MakeAndModel) {
        this.MakeAndModel = MakeAndModel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public void setProblemDescription(String ProblemDescription) {
        this.ProblemDescription = ProblemDescription;
    }

    public String getRepatirNotes() {
        return RepairNotes;
    }

    public void setRepatirNotes(String RepatirNotes) {
        this.RepairNotes = RepatirNotes;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
}
