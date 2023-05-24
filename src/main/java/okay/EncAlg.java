package okay;

public class EncAlg {

    private String description;
    private String aOrS;


    public EncAlg(String description, String aOrS) {
        this.description = description;
        this.aOrS = aOrS;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getaOrS() {
        return aOrS;
    }

    public void setaOrS(String aOrS) {
        this.aOrS = aOrS;
    }
}
