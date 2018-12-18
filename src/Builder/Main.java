package Builder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Voiture.VoitureBuilder builderDeVoiture = new Voiture.VoitureBuilder();
        Voiture voiture = builderDeVoiture.withMarque("peugot")
                .withConssomationAu100(4)
                .withDateFabriquation(new Date())
                .withDescriptionText("test")
                .withIsReady(true)
                .withPrix(15)
                .build();
        System.out.println(voiture);
    }
}
