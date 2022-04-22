package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;


public class Testovi {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    //[1,2,3,13]
    @Test
    public void test1() throws IOException {
        File file=new File("C:\\Users\\Zafir\\Desktop\\Skit_Lab2\\test01.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader inFile=new BufferedReader(fileReader);
        Stutter.stut(inFile);
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
    }

    //[1,2,3,4,5,11,12,3,13]
    @Test
    public void test2() throws IOException{
        File file=new File("C:\\Users\\Zafir\\Desktop\\Skit_Lab2\\test02.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader inFile=new BufferedReader(fileReader);
        Stutter.stut(inFile);
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
    }

    //[1,2,3,4,5,6,7,8,10,5,11,12,3,13]
    @Test
    public void test3() throws IOException{
        File file=new File("C:\\Users\\Zafir\\Desktop\\Skit_Lab2\\test03.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader inFile=new BufferedReader(fileReader);
        Stutter.stut(inFile);
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
    }

    //[1,2,3,4,5,11,12,3,4,5,11,12,3,13]
    @Test
    public void test4() throws IOException{
        File file=new File("C:\\Users\\Zafir\\Desktop\\Skit_Lab2\\test04.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader inFile=new BufferedReader(fileReader);
        Stutter.stut(inFile);
        outputStreamCaptor.toString().trim();
        Assert.assertEquals("",outputStreamCaptor.toString().trim());
    }

    //[1,2,3,4,5,11,12,3,4,5,6,7,8,10,5,11,12,3,13]
    @Test
    public void test5() throws IOException{
        File file=new File("C:\\Users\\Zafir\\Desktop\\Skit_Lab2\\test05.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader inFile=new BufferedReader(fileReader);
        Stutter.stut(inFile);
        outputStreamCaptor.toString().trim();
        Assert.assertEquals("",outputStreamCaptor.toString().trim());
    }

    //[1,2,3,4,5,6,7,9,10,5,11,12,3,13]
    @Test
    public void test6() throws IOException{
        File file=new File("C:\\Users\\Zafir\\Desktop\\Skit_Lab2\\test06.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader inFile=new BufferedReader(fileReader);
        Stutter.stut(inFile);
        outputStreamCaptor.toString().trim();
        Assert.assertEquals("",outputStreamCaptor.toString().trim());
    }

    //[1,2,3,4,5,6,7,8,10,5,6,7,8,10,5,11,12,3,13]
    @Test
    public void test7() throws IOException{
        File file=new File("C:\\Users\\Zafir\\Desktop\\Skit_Lab2\\test07.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader inFile=new BufferedReader(fileReader);
        Stutter.stut(inFile);
        outputStreamCaptor.toString().trim();
        Assert.assertEquals("Repeated word on line 2: promenliva promenliva",outputStreamCaptor.toString().trim());
    }

    //[1,2,3,4,5,6,7,9,10,5,6,7,9,10,5,11,12,3,13]
    @Test
    public void test8() throws IOException{
        File file=new File("C:\\Users\\Zafir\\Desktop\\Skit_Lab2\\test08.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader inFile=new BufferedReader(fileReader);
        Stutter.stut(inFile);
        outputStreamCaptor.toString().trim();
        Assert.assertEquals("Repeated word on line 2: proba proba",outputStreamCaptor.toString().trim());
    }

    //[1,2,3,4,5,6,7,8,10,5,6,7,9,10,5,11,12,3,13]
    @Test
    public void test9() throws IOException{
        File file=new File("C:\\Users\\Zafir\\Desktop\\Skit_Lab2\\test09.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader inFile=new BufferedReader(fileReader);
        Stutter.stut(inFile);
        outputStreamCaptor.toString().trim();
        Assert.assertEquals("Repeated word on line 2: zbor zbor",outputStreamCaptor.toString().trim());
    }

}
