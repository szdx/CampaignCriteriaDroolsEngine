package tr.com.innova.payflex.campaignCriteria.drlGenerator.entity;

import java.util.Arrays;

public class CurrentEventCriterias {
    private Integer Recurrence;

    public Integer getRecurrence() {
        return Recurrence;
    }

    public void setRecurrence(Integer reOccurance) {
        Recurrence = reOccurance;
    }

    private Fields[] Fields;

    public Fields[] getFields() {
        return Fields;
    }

    public void setFields(Fields[] Fields) {
        this.Fields = Fields;
    }

    @Override
    public String toString() {
        return "CurrentEventCriterias{" +
                "Recurrence=" + Recurrence +
                ", Fields=" + Arrays.toString(Fields) +
                '}';
    }
}
