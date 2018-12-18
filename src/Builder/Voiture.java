package Builder;

import java.util.Date;

public class Voiture {
    private String marque;
    private Integer prix;
    private Integer conssomationAu100;
    private String descriptionText;
    private boolean isReady;
    private Date dateFabriquation;


    public static class VoitureBuilder {
        String marque;
        Integer prix;
        Integer conssomationAu100;
        String descriptionText;
        boolean isReady;
        Date dateFabriquation;

        VoitureBuilder withMarque(String marque){
            this.marque=marque;
            return this;
        }
        VoitureBuilder withPrix(Integer prix){
            this.prix=prix;
            return this;
        }
        VoitureBuilder withConssomationAu100(Integer conssomationAu100){
            this.conssomationAu100=conssomationAu100;
            return this;
        }
        VoitureBuilder withDescriptionText(String descriptionText){
            this.descriptionText=descriptionText;
            return this;
        }
        VoitureBuilder withIsReady(boolean isReady){
            this.isReady=isReady;
            return this;
        }
        VoitureBuilder withDateFabriquation(Date dateFabriquation){
            this.dateFabriquation=dateFabriquation;
            return this;
        }
        Voiture build(){
            Voiture voiture = new Voiture();
            voiture.setMarque(marque);
            voiture.setConssomationAu100(conssomationAu100);
            voiture.setDateFabriquation(dateFabriquation);
            voiture.setDescriptionText(descriptionText);
            voiture.setPrix(prix);
            voiture.setReady(isReady);
            return voiture;
        }
    }//BUILDER








    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getConssomationAu100() {
        return conssomationAu100;
    }

    public void setConssomationAu100(Integer conssomationAu100) {
        this.conssomationAu100 = conssomationAu100;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public Date getDateFabriquation() {
        return dateFabriquation;
    }

    public void setDateFabriquation(Date dateFabriquation) {
        this.dateFabriquation = dateFabriquation;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", prix=" + prix +
                ", conssomationAu100=" + conssomationAu100 +
                ", descriptionText='" + descriptionText + '\'' +
                ", isReady=" + isReady +
                ", dateFabriquation=" + dateFabriquation +
                '}';
    }
}
