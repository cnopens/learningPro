package test;

/**
 * Description:util
 * EnumVar.java Created on 2015/7/1615:06
 *
 * @author 蔡晓峰 Gavin.C Administrator
 * @version1.0
 * @Copyright (c)2014 Cnopens
 */
enum Signal {
    GREEN, YELLOW, RED
}

public class EnumVar{
    Signal color = Signal.RED;

    public void change() {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
        }
    }





    public static void main(String[] args) {
        System.out.println(String.valueOf(Signal.GREEN));
    }

}