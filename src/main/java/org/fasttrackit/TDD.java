package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class TDD {
    public Integer find(List<Integer> list, int number){
      if (list == null){
          return -1;
      }
        return list.indexOf(number);  // indexOf returneaza -1 daca nu gaseste

    }
}
