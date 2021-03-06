package tr.com.innova.payflex.campaignCriteria.drlGenerator.entity;

import java.util.Arrays;

public class Campaign {
    private String CampaignId;

    private String CampaignName;

    private Rule[] Rule;

    public String getCampaignId() {
        return CampaignId;
    }

    public void setCampaignId(String CampaignId) {
        this.CampaignId = CampaignId;
    }

    public String getCampaignName() {
        return CampaignName;
    }

    public void setCampaignName(String CampaignName) {
        this.CampaignName = CampaignName;
    }

    public Rule[] getRules() {
        return Rule;
    }

    public void setRules(Rule[] Rule) {
        this.Rule = Rule;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "CampaignId='" + CampaignId + '\'' +
                ", CampaignName='" + CampaignName + '\'' +
                ", Rule=" + Arrays.toString(Rule) +
                '}';
    }
}