package hibernatemanytomany;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String SUB_NAME;
    private int DURATION;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSUB_NAME() {
        return SUB_NAME;
    }

    public void setSUB_NAME(String SUB_NAME) {
        this.SUB_NAME = SUB_NAME;
    }

    public int getDURATION() {
        return DURATION;
    }

    public void setDURATION(int DURATION) {
        this.DURATION = DURATION;
    }
}
