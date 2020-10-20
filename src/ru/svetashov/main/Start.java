/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.svetashov.main;

import ru.svetashov.animals.Bird;
import ru.svetashov.animals.Cat;
import ru.svetashov.animals.Meowable;
import ru.svetashov.geometry.Figure;
import ru.svetashov.geometry.Lengthable;

import java.awt.*;
import java.math.BigInteger;
import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Start {
    public static void main(String[] args) {
        Point point = new Point(1, 1);
        ru.svetashov.geometry.Point point1 = new ru.svetashov.geometry.Point(0, 0);

        System.out.println(point);
        System.out.println(point1);
    }

    public static int powStr(String [] str){
        return (int) pow(parseInt(str[0]), parseInt(str[1]));
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
