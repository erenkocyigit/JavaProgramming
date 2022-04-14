package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA","Amazon Inc","SDET",95000,true,true,true,true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA","Sony","QA",120000, true,false,false,true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL","Apple","QE",125000,true,true,true,false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX","CapitalOne","SM",115000,false,false,true,true  );

        Offer offer5 = new Offer();
        offer5.setInfo("WA","Bank of America","BA",130000,true,true,false,true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("---------------------------------------------------");
        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p -> !p.isFullTime); // removes if the offer is not fulltime.

        System.out.println(fullTimeOffers.size());
        System.out.println("---------------------------------------------------");

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(p-> !p.location.equals("VA"));

        System.out.println(localOffers.size());
        System.out.println("---------------------------------------------------");

        ArrayList<Offer> offerWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offerWithBenefits.removeIf(p -> !p.hasBenefit);
        System.out.println(offerWithBenefits.size());

        System.out.println("---------------------------------------------------");
        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p -> p.jobTitle.equals("SDET"));
        System.out.println(sdetOffers.size());

        System.out.println("---------------------------------------------------");
        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));
        for (Offer each : myOffers) {
            if (each.salary >= 100000){
                offersWith100K.remove(each);
            }
        }
        System.out.println(offersWith100K.size());

    }
}
