package com.javarush.task.jdk13.task07.array_list_generics.generics.genericrobot;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();

        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        LargeHead largeHead = new LargeHead();
        Leg leg = new Leg();

        Robot<SmallHead> robot = new Robot<SmallHead>(body, smallHead);
        robot.getSpecificHead().burn();
        Robot<LargeHead> robot1 = new Robot<>(body, largeHead);
        System.out.println(robot1.<Leg, Head>foo(leg, mediumHead));
        //вернет среднюю голову //<Leg, Head> можно без <>

        Robot<MediumHead> robotAdd = new Robot<>(body, mediumHead);
        robot1.foo3(robotAdd);

        robot1.getSpecificHead().turn();
        //robot1 = robot; //нельзя
        Robot robot2 = new Robot(body, mediumHead); //сырой! тип
        robot2 = robot1;
        //robot2.getSpecificHead(). но - не видит методов
        //потому что вы сыром типе он ставит неявно для нас... Object как тип!

//        Robot robot3 = new Robot(body, leg);
        //когда чистая параметризация, можно сунуть вообще все что угодно... даже НОГУ! (вместо головы)
        //было можно. с extends, уже нельзя!
    }
}
