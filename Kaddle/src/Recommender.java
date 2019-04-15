/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Agrawal
 */
public class Recommender {
    public static float similarity(String u1, String u2)
{
    //loading the dataset with the values
    HashMap<String, HashMap<String, String>> map = new HashMap<String, HashMap<String,String>>();
    map.put("Yash Agrawal", new HashMap<String, String>());
    map.get("Yash Agrawal").put("Masters’ Singers", "1.46");
    map.get("Yash Agrawal").put("Basic Clarinet", "5.0");
    map.get("Yash Agrawal").put("Basic Guitar", "3.34");
    map.get("Yash Agrawal").put("Introductory Financial Accounting", "2.32");
    map.put("Isha Mittal", new HashMap<String, String>());
    map.get("Isha Mittal").put("Masters’ Singers", "5.0");
    map.get("Isha Mittal").put("Basic Clarinet", "2.54");
    map.get("Isha Mittal").put("Chinese", "4.32");
    map.get("Isha Mittal").put("Introduction to Philosophy", "2.76");
    map.put("Prithvi Nayak", new HashMap<String, String>());
    map.get("Prithvi Nayak").put("Masters’ Singers", "5.0");
    map.get("Prithvi Nayak").put("Programming language theory", "4.72");
    map.get("Prithvi Nayak").put("Basic Clarinet", "3.25");
    map.get("Prithvi Nayak").put("Concurrency", "3.61");
    map.get("Prithvi Nayak").put("Formal methods", "3.58");
    map.get("Prithvi Nayak").put("Chinese", "3.23");
    map.get("Prithvi Nayak").put("Introduction to Philosophy", "3.03");
    map.put("Tejas Kashinath", new HashMap<String, String>());
    map.get("Tejas Kashinath").put("Programming language theory", "4.34");
    map.get("Tejas Kashinath").put("Basic Clarinet", "4.52");
    map.get("Tejas Kashinath").put("Basic Guitar", "4.04");
    map.get("Tejas Kashinath").put("Concurrency", "3.97");
    map.get("Tejas Kashinath").put("Formal methods", "5.0");
    map.get("Tejas Kashinath").put("Introduction to Philosophy", "4.92");
    //need to get common keys from  two nested hashmaps
    //ArrrrayyyyyyListttt Declaration
    /**
     *
     */
    
    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    
for (Map.Entry<String, HashMap<String, String>> letterEntry : map.entrySet()) {
    String letter = letterEntry.getKey();
    
    if(letter.equals(u1))
    {
    //System.out.println(letter);
    for (Map.Entry<String, String> nameEntry : letterEntry.getValue().entrySet()) {
        list1.add(nameEntry.getKey());
    }

    }
}

for (Map.Entry<String, HashMap<String, String>> letterEntry : map.entrySet()) {
    String letter = letterEntry.getKey();
    
    if(letter.equals(u2))
    {
    //System.out.println(letter);
    for (Map.Entry<String, String> nameEntry : letterEntry.getValue().entrySet()) {
        list2.add(nameEntry.getKey());
    }
    }
}
float summ = 0; 
list1.retainAll(list2);
//System.out.println("Common elements: " + list1); 
for (int i=0; i<list1.size(); i++)
{
     //System.out.print(list1.get(i)+"\n");
    
    float yi = Float.parseFloat(map.get(u1).get(list1.get(i)));
     float ii = Float.parseFloat(map.get(u2).get(list1.get(i)));
     float diff = yi-ii;
     diff = diff*diff;
     summ+=diff;    
     
}    

    float finale = 1/(1+summ); 
    return finale;
    //System.out.println(map.get("Yash Agrawal").get("Basic Guitar"));
 }
public static HashMap<String, Float> sortByValue(HashMap<String, Float> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Float> > list = new LinkedList<Map.Entry<String, Float> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Float> >() { 
            public int compare(Map.Entry<String, Float> o1,  
                               Map.Entry<String, Float> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Float> temp = new LinkedHashMap<String, Float>(); 
        for (Map.Entry<String, Float> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
public static void main(String args[]) {
    
    HashMap<String, HashMap<String, String>> map = new HashMap<String, HashMap<String,String>>();
    map.put("Yash Agrawal", new HashMap<String, String>());
    map.get("Yash Agrawal").put("Masters’ Singers", "1.46");
    map.get("Yash Agrawal").put("Basic Clarinet", "5.0");
    map.get("Yash Agrawal").put("Basic Guitar", "3.34");
    map.get("Yash Agrawal").put("Introductory Financial Accounting", "2.32");
    map.put("Isha Mittal", new HashMap<String, String>());
    map.get("Isha Mittal").put("Masters’ Singers", "5.0");
    map.get("Isha Mittal").put("Basic Clarinet", "2.54");
    map.get("Isha Mittal").put("Chinese", "4.32");
    map.get("Isha Mittal").put("Introduction to Philosophy", "2.76");
    map.put("Prithvi Nayak", new HashMap<String, String>());
    map.get("Prithvi Nayak").put("Masters’ Singers", "5.0");
    map.get("Prithvi Nayak").put("Programming language theory", "4.72");
    map.get("Prithvi Nayak").put("Basic Clarinet", "3.25");
    map.get("Prithvi Nayak").put("Concurrency", "3.61");
    map.get("Prithvi Nayak").put("Formal methods", "3.58");
    map.get("Prithvi Nayak").put("Chinese", "3.23");
    map.get("Prithvi Nayak").put("Introduction to Philosophy", "3.03");
    map.put("Tejas Kashinath", new HashMap<String, String>());
    map.get("Tejas Kashinath").put("Programming language theory", "4.34");
    map.get("Tejas Kashinath").put("Basic Clarinet", "4.52");
    map.get("Tejas Kashinath").put("Basic Guitar", "4.04");
    map.get("Tejas Kashinath").put("Concurrency", "3.97");
    map.get("Tejas Kashinath").put("Formal methods", "5.0");
    map.get("Tejas Kashinath").put("Introduction to Philosophy", "4.92");
    
    //ArrayList<Float> scores = new ArrayList<>();
    //scores.add(similarity("Yash Agrawal","Isha Mittal"));
    //scores.add(similarity("Yash Agrawal","Tejas Kashinath"));
    //scores.add(similarity("Yash Agrawal","Prithvi Nayak"));
    
    //Collections.sort(scores);
    //Collections.reverse(scores);
    //System.out.println(scores);
    
    HashMap<String, Float> scores = new HashMap<>();
    scores.put("Isha Mittal", similarity("Yash Agrawal","Isha Mittal"));
    scores.put("Prithvi Nayak", similarity("Yash Agrawal","Prithvi Nayak"));
    scores.put("Tejas Kashinath", similarity("Yash Agrawal","Tejas Kashinath"));
    
    
    scores = sortByValue(scores);
    //System.out.println(scores);
    
    ArrayList<String> ranked = new ArrayList<>();
    ranked.add(map.get("Isha Mittal").get("Chinese"));
    ranked.add(map.get("Isha Mittal").get("Introduction To Philosophy"));
    ranked.add(map.get("Prithvi Nayak").get("Programming language theory"));
    ranked.add(map.get("Tejas Kashinath").get("Programming language theory"));
    
    HashMap<String, Float> weights = new HashMap<>();
    float weight = Float.parseFloat(ranked.get(0));
    weight = weight *similarity("Yash Agrawal","Isha Mittal");
    
    //System.out.println(isha_weight);
    float pred = scores.get("Isha Mittal");
    pred = pred * Float.parseFloat(map.get("Isha Mittal").get("Chinese"));
    pred/=weight;
    System.out.print("Chinese " + pred + "\n");
  }
}
