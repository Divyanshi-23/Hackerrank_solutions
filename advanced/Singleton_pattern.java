import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public String str;
    static Singleton s = new Singleton();
     private Singleton(){
         
     }
    static Singleton getSingleInstance(){
        return s;
    }
}
