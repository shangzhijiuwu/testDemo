package testDemo.interfaceScript;

import sun.applet.Main;

/**
 * Created by wujing on 16/8/10.
 */
public class funOfMe {
    public String sayHello(){
        return "Hello Wujing";
    }

    public String sayYes(String a) {
        System.out.println(a);
        return a ;
    }


    public static void main (String [] args){
        funOfMe test = new funOfMe();
        System.out.println(test.sayHello());
    }
}
