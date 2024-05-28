package org.example;

public class App {
    public static void main(String[] args) {
        GeoNode country = new GeoNode("Україна");

        GeoNode region1 = new GeoNode("Київська область");
        GeoNode region2 = new GeoNode("Львівська область");

        GeoNode district1 = new GeoNode("Київський район");
        GeoNode district2 = new GeoNode("Бориспільський район");
        GeoNode district3 = new GeoNode("Львівський район");
        GeoNode district4 = new GeoNode("Дрогобицький район");

        GeoNode city1 = new GeoNode("Київ");
        GeoNode city2 = new GeoNode("Бориспіль");
        GeoNode city3 = new GeoNode("Львів");
        GeoNode city4 = new GeoNode("Дрогобич");

        GeoNode street1 = new GeoNode("Хрещатик");
        GeoNode street2 = new GeoNode("Володимирська");
        GeoNode street3 = new GeoNode("Бориспільська");
        GeoNode street4 = new GeoNode("Данила Галицького");
        GeoNode street5 = new GeoNode("Шевченка");

        country.addChild(region1);
        country.addChild(region2);

        region1.addChild(district1);
        region1.addChild(district2);

        region2.addChild(district3);
        region2.addChild(district4);

        district1.addChild(city1);
        district2.addChild(city2);
        district3.addChild(city3);
        district4.addChild(city4);

        city1.addChild(street1);
        city1.addChild(street2);
        city2.addChild(street3);
        city3.addChild(street4);
        city4.addChild(street5);

        GeoTreeBreadsFirstIterator iterator = new GeoTreeBreadsFirstIterator(country);
        while (iterator.hasNext()) {
            GeoNode node = iterator.next();
            System.out.println(node.getName());
        }
    }
}
