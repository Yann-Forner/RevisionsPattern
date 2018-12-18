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
        Voiture voiture2 = builderDeVoiture.withMarque("lololol").build();
        System.out.println(voiture);
        System.out.println(voiture2); //attention cela affecte à cette deuxieme voiture les vars d'avant si on ne les modifie pas !!!!
    }
}
