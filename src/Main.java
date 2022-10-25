public class Main {
    public static void main(String[] args) {

                Car lada = new Car("Lada",
                        "Granta",
                        2015,
                        "Россия",
                        "белый",
                        150,
                        1.7,
                        "МКПП",
                        "седан",
                        "Р090ПР196",
                        4);

                System.out.println(lada);
                lada.refill();


                Train lastochka = new Train("Ласточка",
                        "B-901",
                        2011,
                        "Россия",
                        "",
                        301,
                        3500,
                        "каждое четное число",
                        "Белорусский вокзал",
                        "Минск-Пассажирский", 11);


                Train leningrad = new Train("Ленинград",
                "D-125",
                2019,
                "Россия",
                "",
                270,
                1700,
                "каждое нечетное число",
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8);

        System.out.println(lastochka);
        lastochka.refill();
        System.out.println(leningrad);
        leningrad.refill();



        Bus bus1 = new Bus("Mercedes-benz",
                "Conecto",
                2020,
                "Германия",
                "белый",
                150);
        Bus bus2 = new Bus("ГАЗ",
                "Газель Next A64R42",
                2019,
                "Россия",
                "желтый",
                110);
        Bus bus3 = new Bus("Hyundai",
                "Bogdan A 201",
                2018,
                "Южная Корея",
                "белый",
                150);

        System.out.println(bus1);
        bus1.refill();
        System.out.println(bus2);
        bus2.refill();
        System.out.println(bus3);
        bus3.refill();





    }
        }