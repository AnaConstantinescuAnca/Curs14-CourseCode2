package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.fasttrackit.TDD;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TDDTest {
    /**
     * Create a function TDD.find that receives a list and a number
     * and returns the index or -1 if not found
     */
    @Test
    //testez instantierea clasei
    public void instantiateClass(){
        TDD tdd = new TDD();
    }

    @Test
    //testez metoda find
    public void callMethod(){
        TDD tdd = new TDD();  // instantiere clasa
        tdd.find(new ArrayList<>(), 2);
    }

    @Test
    public void methodReturnAnInt(){
        TDD tdd = new TDD();
        Integer result = tdd.find(new ArrayList<>() , 2);
    }

    @Test
    public void returnMinusIntegerIfNotFound(){
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> arrayList = new ArrayList<>();
        int element = 2;

        //WHEN
        Integer result = tdd.find(arrayList, element);

        //THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void returnIndexIfFound(){
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> arrayList = Arrays.asList(1,3,6);
        int element = 3;

        //WHEN
        Integer result = tdd.find(arrayList, element);

        //THEN
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void returnMinusOneIfListIsNull(){
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> arrayList = null;
        int element = 3;

        //WHEN
        Integer result = tdd.find(arrayList, element);

        //THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void returnMinusOneIfNumberIsNull(){
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> arrayList = Arrays.asList(1,3,6);
        Integer element = null;

        //WHEN
        Integer result = tdd.find(arrayList, element);

        //THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

}
