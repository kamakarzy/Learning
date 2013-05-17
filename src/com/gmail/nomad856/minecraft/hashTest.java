package com.gmail.nomad856.minecraft;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
 
 
public class hashTest {
    public static void main(String [] Args){
        try {
 
            HashMap<Integer, data> map = new HashMap<Integer, data>();
            for(int i = 0; i < 20; i++){
                map.put(i, new data("data" + i, i*10, i*100, i*1000));
            }
             
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("map.txt"));
            obj.writeObject(map);
            obj.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
         
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("map.txt"));
            HashMap<Integer, data> map = (HashMap<Integer, data>)obj.readObject();
            for(data d : map.values())
                System.out.println(d.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }
}
 
 
class data implements Serializable {
    private static final long serialVersionUID = 1L;
     
     
    String s;
    int a,b,c;
     
    public data(String s, int a, int b, int c){
        this.s = s;
        this.a = a;
        this.b = b;
        this.c = c;
    }
     
    public String toString(){
        return s + " " + a + " " + b + " " + c;
    }
}