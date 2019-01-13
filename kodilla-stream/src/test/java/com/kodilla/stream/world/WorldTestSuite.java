package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {


    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("The tests are beggining");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("The tests have been completed");
    }

    @Before
    public void beforeTest(){
        System.out.println("Test processing - counting population ");
    }


    @Test
    public void testGetPeopleQuantity(){

        //Given
        Continent australia = new Continent();
        Continent europe = new Continent();
        Continent southAmerica = new Continent();
        Continent northAmerica = new Continent();
        Continent antarctica = new Continent();
        Continent africa = new Continent();
        Continent asia = new Continent();

        Country commonOfAustralia = new Country(new BigDecimal("21714000"));
        Country papuaNewGuinea = new Country(new BigDecimal("5932000"));
        Country newZeland = new Country(new BigDecimal("4186320"));
        Country fiji = new Country(new BigDecimal("844330"));
        Country salomonsIsland = new Country(new BigDecimal("552000"));

        australia.addCountry(commonOfAustralia);
        australia.addCountry(papuaNewGuinea);
        australia.addCountry(newZeland);
        australia.addCountry(fiji);
        australia.addCountry(salomonsIsland);

        Country russia = new Country(new BigDecimal("142470272"));
        Country turkey = new Country(new BigDecimal("81619392"));
        Country germany = new Country(new BigDecimal("80996685"));
        Country france = new Country(new BigDecimal("66259012"));
        Country greatBritain = new Country(new BigDecimal("63742977"));

        europe.addCountry(russia);
        europe.addCountry(turkey);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(greatBritain);

        Country brasil = new Country(new BigDecimal("198739269"));
        Country columbia = new Country(new BigDecimal("43677372"));
        Country argentina = new Country(new BigDecimal("40913584"));
        Country peru = new Country(new BigDecimal("29546963"));
        Country venesuela = new Country(new BigDecimal("26814843"));

        southAmerica.addCountry(brasil);
        southAmerica.addCountry(columbia);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(peru);
        southAmerica.addCountry(venesuela);

        Country usa = new Country(new BigDecimal("308878120"));
        Country mexico = new Country(new BigDecimal("107563903"));
        Country canada = new Country(new BigDecimal("33989040"));
        Country guatemala = new Country(new BigDecimal("15655188"));
        Country cuba = new Country(new BigDecimal("13346676"));

        northAmerica.addCountry(usa);
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(guatemala);
        northAmerica.addCountry(cuba);

        Country pis = new Country(new BigDecimal("235"));

        antarctica.addCountry(pis);

        Country nigeria = new Country(new BigDecimal("190632261"));
        Country etiopia = new Country(new BigDecimal("105350020"));
        Country egipt = new Country(new BigDecimal("97041072"));
        Country kongo = new Country(new BigDecimal("83301151"));
        Country algieria = new Country(new BigDecimal("54841552"));

        africa.addCountry(nigeria);
        africa.addCountry(etiopia);
        africa.addCountry(egipt);
        africa.addCountry(kongo);
        africa.addCountry(algieria);

        Country china = new Country(new BigDecimal("1330044605"));
        Country india = new Country(new BigDecimal("1147996000"));
        Country indonesia = new Country(new BigDecimal("237512000"));
        Country pakistan = new Country(new BigDecimal("176242949"));
        Country bangladesh = new Country(new BigDecimal("153547000"));

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(indonesia);
        asia.addCountry(pakistan);
        asia.addCountry(bangladesh);

        //When
        World world = new World();
        world.addContinent(australia);
        world.addContinent(europe);
        world.addContinent(southAmerica);
        world.addContinent(northAmerica);
        world.addContinent(antarctica);
        world.addContinent(africa);
        world.addContinent(asia);

        //Then
        BigDecimal expectedAllTheWorldPeopleQuantity = new BigDecimal("4863950791");
        Assert.assertEquals(expectedAllTheWorldPeopleQuantity, world.getPeopleQuantity());

    }
}
