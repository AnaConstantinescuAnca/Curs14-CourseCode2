package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class First {

    public int sum(int a, int b) {
        return a + b;
    }

    //scriem o metoda care primeste o lista de numere si care
    // returneaza numerele pare din acea lista
    public List<Integer> getEven(List<Integer> list) {
        System.out.println("Entered getEven method");
        List<Integer> result = new ArrayList<>();

        if(validateInput(list)){
            for (Integer integer : list) {
                if (integer % 2 == 0) {
                    result.add(integer);
                }
            }
            return result;
        }
        return result;

    }

 public  boolean validateInput(List<Integer> list) {
     System.out.println("Entered validateInput method");
        if (list == null) {
            throw new RuntimeException();
            //return result;
        }
        return true;
    }

}


