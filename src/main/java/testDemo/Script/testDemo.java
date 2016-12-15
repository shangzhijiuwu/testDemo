package testDemo.Script;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testDemo.interfaceScript.funOfMe;

/**
 * Created by wujing on 16/8/10.
 */
public class testDemo {

    //private static final Logger logR = Logger.getLogger(testDemo.class);
    funOfMe me = new funOfMe();

    @Test
    @Parameters({"test1","test2"})
    public void testHello(String test1,String test2){

        Assert.assertEquals(me.sayYes(test1),"abcdefg");
        Assert.assertEquals(me.sayYes(test2),"higklmn");
        Assert.assertEquals(me.sayHello(),"Hello Wujing");
        Reporter.log("测试方法已经验证通过test");
    }

}
