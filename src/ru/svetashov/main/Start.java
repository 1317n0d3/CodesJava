/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.svetashov.main;

import Practice.Patterns.Adapter.RoundHole;
import Practice.Patterns.Adapter.RoundPeg;
import Practice.Patterns.Adapter.SquarePeg;
import Practice.Patterns.Adapter.SquareToRoundAdapter;
import ru.svetashov.animals.*;
import ru.svetashov.geometry.*;
import ru.svetashov.people.Karate;
import ru.svetashov.student.Checkable;
import ru.svetashov.student.Student;
import ru.svetashov.track.Album;
import ru.svetashov.track.Track;
import ru.svetashov.weapons.BestShooter;
import ru.svetashov.weapons.Gun;
import ru.svetashov.weapons.MachineGun;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.divideUnsigned;
import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Start {
    public static void main(String[] args) {

//        PolygonalChain [] lines = new PolygonalChain[3];
//        lines[0] = new Square(new Point(1, 1), 5);
//        lines[1] = new Triangle(new Point(0, 0), new Point(7, 2), new Point(10, 10));
//        lines[2] = new Line(3, 2, -8, 99);
//
//        System.out.println(getPolygonalChain(lines));

//        List<Point> points = new ArrayList<>();
//        points.add(new Point(2, 3));
//        points.add(new Point(0, 0));
//        points.add(new Point(9, 1));
//
//        BrokenLine brokenLine = new BrokenLine(points);
//        ClosedLine closedLine = new ClosedLine(points);
//
//        System.out.println(brokenLine.equals(closedLine));

//        Checkable<String> stringCheckable = new Checkable<String>() {
//            @Override
//            public boolean check(String s) {
//                return "зачтено".equals(s) || "не зачтено".equals(s);
//            }
//        };
//
//        Student<String> st1 = new Student<>(stringCheckable,"Vasya", "зачтено", "зачтено", "не зачтено");
//
//        Action<String, Integer> action = new Action<String, Integer>() {
//            @Override
//            public Integer act(String obj) {
//                return obj.length();
//            }
//        };
//
//        List<String> list = new ArrayList<>();
//        list.add("smth");
//        list.add("sdsd");
//
//        System.out.println(convert(list, action));
//
//        System.out.println(reduce(list, (t1, t2) -> t1 + t2));

//        System.out.println(sum(2, new Adapter("37")));

//        CounterMeow counter = new CounterMeow(new Cat("Boris"));
//        mew(counter);
//        System.out.println(counter.count);

//        CatDog catDog = new CatDog("CatDog");
//        catDog.voice(2);

//        Karate karate = new Karate("Man");

//        RoundHole roundHole = new RoundHole(10);
//        RoundPeg roundPeg = new RoundPeg(8);
//        SquarePeg squarePeg = new SquarePeg(100);
//        SquareToRoundAdapter squareToRoundAdapter = new SquareToRoundAdapter(squarePeg);
//
//        if(roundHole.fits(squareToRoundAdapter)){
//            System.out.println("Вошел!!! УРА!!! " + squareToRoundAdapter.getRadius());
//        } else {
//            System.out.println("Не вошел :( " + squareToRoundAdapter.getRadius());
//        }
    }

    public static <T> T reduce(List<T> list, Returning<T> type){
        if (list == null || list.size() == 0) return null;
        T res = list.get(0);
        for (int i = 1; i < list.size(); i++){
            res = type.ret(res, list.get(i));
        }
        return res;
    }

    public static <T, Q> List<Q> convert(List<T> list, Action<T, Q> act){
        List<Q> res = new ArrayList<>();
        for (T obj:list) res.add(act.act(obj));
        return res;
    }

//    public static PolygonalChain getPolygonalChain(PolygonalChain...polygonalChains){
//        List<Point> points = new ArrayList<>();
//        for (PolygonalChain polygonalChain : polygonalChains){
//            points.addAll(polygonalChain.getBrokenLine().getPoints());
//        }
//        return new BrokenLine(points);
//    }

    public static double powStr(String [] args){
        if (args.length != 2) throw new IllegalArgumentException("You must input 2 args");
        return pow(parseInt(args[0]), parseInt(args[1]));
    }

    public static void mew(Meowable...meowables){
        for (Meowable meowable : meowables){
            meowable.meow();
        }
    }

    public static double sum(Number...number){
        double res = 0;
        for (Number num : number){
            res += num.doubleValue();
        }
        return res;
    }

    public static double sumArea(Figure...figures){
        double res = 0;
        for (Figure figure : figures){
            res += figure.getArea();
        }
        return res;
    }

    public static int sumLength(Lengthable...lengthables){
        int res = 0;
        for(Lengthable lengthable : lengthables){
            res += lengthable.length();
        }
        return res;
    }

    public static void singBirds(Bird...birds){
        for (Bird bird : birds){
            bird.sing();
        }
    }
}
