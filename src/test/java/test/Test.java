package test;

/**
 * Description:test
 * Test.java Created on 2015/7/1615:12
 *
 * @author 蔡晓峰 Gavin.C Administrator
 * @version1.0
 * @Copyright (c)2014 Cnopens
 * 因为java属于单根继承所以枚举不能继承其他类
 */
public class Test {
    public enum Color {
        RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
        // 成员变量
        private String name;
        private int index;

        // 构造方法
        private Color(String name, int index) {
            this.name = name;
            this.index = index;
        }

        // 覆盖方法
        @Override
        public String toString() {
            return this.index + "_" + this.name;
        }
    }

    public static void main(String[] args) {
        System.out.println(Color.RED.toString());
    }
}