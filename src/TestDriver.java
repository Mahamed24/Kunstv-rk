﻿public class TestDriver {
    public static void main(String[] args) {

        Museum smk = new Museum("Statens Museum for Kunst", "Sølvtorvet, København");
        Museum fsm = new Museum("Fyns Stifts Museum", "Jernbanegade, Odense");
        System.out.println();
        System.out.println("Museum navn: " + smk.getNavn() + ", Adresse: " + smk.addresse);
        System.out.println("Museum navn: " + fsm.getNavn() + ", Adresse: " + fsm.addresse);
        System.out.println();

        Person lar = new Person("L.A. Ring", "dansk", 1854, 1933);
        Maleri kal = new Maleri("Kalkmanden", 1908, 80, 65, smk);
        kal.addOphavsmand(lar);

        Person cwe = new Person("C. W. Eckersberg", "dansk", 1783, 1853);
        Maleri rus = new Maleri("Et russisk linjeskib til ankers ved Helsingør", 1828, 140, 135, fsm);
        rus.addOphavsmand(cwe);

        Person køb = new Person("Christian Købke", "dansk", 1810, 1848);
        Maleri par = new Maleri("Parti fra Dosseringen mod Nørrebro", 1841, 100, 85, smk);
        par.addOphavsmand(køb);

        KunstvaerkSamling kvs = new KunstvaerkSamling();
        kvs.add(kal);
        kvs.add(rus);
        kvs.add(par);

        Person jl = new Person("John Lennon", "britisk", 1940, 1980);
        Person pm = new Person("Paul McCartney", "britisk", 1942, 0);
        Komposition y = new Komposition("Yesterday", 1965, "Rock", 211);
        y.addOphavsmand(jl);
        y.addOphavsmand(pm);

        Person db = new Person("David Bowie", "britisk", 1947, 2016);
        Komposition lom = new Komposition("Life on Mars", 1971, "Rock", 309);
        lom.addOphavsmand(db);

        kvs.add(y);
        kvs.add(lom);

        Person mah = new Person("Martin A. Hansen", "dansk", 1909, 1955);
        Bog l = new Bog("Løgneren", 1950, "Prosa", 232);
        l.addOphavsmand(mah);

        Person hs = new Person("Hans Scherfig", "dansk", 1905, 1978);
        Bog dff = new Bog("Det forsømte Forår", 1940, "Prosa", 218);
        dff.addOphavsmand(hs);

        kvs.add(l);
        kvs.add(dff);

        System.out.println("Malerier på Fyns Stifts Museum:");
        kvs.findMalerierPaaMuseum("Fyns Stifts Museum");
        System.out.println();
        System.out.println("Malerier på Statens Museum for Kunst:");
        kvs.findMalerierPaaMuseum("Statens Museum for Kunst");

        System.out.println();

        System.out.println("Sange med flere komponister:");
        kvs.findSangeMedFlereKomponister();

        System.out.println();

        System.out.println("Antal læste sider:");
        kvs.beregnAntalLaesteSider();


    }
}

