package com.zhangqi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTests {

//    @Test
//    public void testGreet() {
//        HelloWorld helloWorld = new HelloWorld();
//        // 由于greet方法没有返回值，我们无法直接测试输出，但可以验证是否有输出
//        // 这里使用System.setOut重定向输出流到ByteArrayOutputStream，然后读取输出内容
//        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outContent));
//        helloWorld.greet();
//        assertEquals("hello world\n", outContent.toString());
//        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out))); // 恢复标准输出
//    }

    @Test
    public void testGetOne() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.getOne();
        assertEquals("one", result);
    }

    @Test
    public void testGetTwo() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.getTwo();
        assertEquals("two", result);
    }
}

