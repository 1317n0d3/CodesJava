/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.svetashov.main;

import ru.svetashov.animals.Bird;
import ru.svetashov.animals.Cat;
import ru.svetashov.animals.Meowable;
import ru.svetashov.geometry.*;
import ru.svetashov.track.Album;
import ru.svetashov.track.Track;
import ru.svetashov.weapons.BestShooter;
import ru.svetashov.weapons.Gun;
import ru.svetashov.weapons.MachineGun;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Start {
    public static void main(String[] args) {

        // 11.7
//        PolygonalChain [] lines = new PolygonalChain[3];
//        lines[0] = new Square(new Point(1, 1), 5);
//        lines[1] = new Triangle(new Point(0, 0), new Point(7, 2), new Point(10, 10));
//        lines[2] = new Line(3, 2, -8, 99);
//
//        System.out.println(getPolygonalChain(lines));

        // 11.8
//        BestShooter shooter1 = new BestShooter("John", new Gun(3, 3));
//        BestShooter shooter2 = new BestShooter("Bob");
//        BestShooter shooter3 = new BestShooter("K", new MachineGun(6));
//
//        shooter1.shoot();
//        shooter2.shoot();
//        shooter3.shoot();
    }

    public static PolygonalChain getPolygonalChain(PolygonalChain...polygonalChains){
        List<Point> points = new ArrayList<>();
        for (PolygonalChain polygonalChain : polygonalChains){
            points.addAll(polygonalChain.getBrokenLine().getPoints());
        }
        return new BrokenLine(points);
    }

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
