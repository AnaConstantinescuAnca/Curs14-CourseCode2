package org.fasttrackit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstGetEvenTest {
//    @Test
//    @DisplayName("Verific daca vine o lista null")
//    public void testGetEvenNull() {
//        //GIVEN
//        First first = new First();
//
//        //WHEN
//        List<Integer> even = first.getEven(null);
//
//        //THEN
//        Assertions.assertThat(even).isNotNull();
//        Assertions.assertThat(even).isEmpty();
//    }

    @Test
    @DisplayName("Verific daca vine o lista null")
    public void testGetEvenNullWithExceptionAssertJ() {
      //GIVEN
        First first = new First();

        //THEN
        Assertions.assertThatThrownBy(()->{
            List<Integer> even = first.getEven(null);
        }).isInstanceOf(RuntimeException.class);
    }

    @Test
    @DisplayName("Verific cand vine o lista goala")
    public void testGetEvenEmpty() {
        //GIVEN
        First first = new First();

        //WHEN
        List<Integer> even = first.getEven(new ArrayList<>());

        //THEN
        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).isEmpty();
    }

    @Test
    @DisplayName("Verific cand nu am niciun nr par in lista")
    public void testGetEvenNoEvan() {
        //GIVEN
        First first = new First();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);

        //WHEN
        List<Integer> even = first.getEven(list);

        //THEN
        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).isEmpty();
    }

    @Test
    @DisplayName("Verific cand am si numere pare in lista")
    public void testGetEven() {
        //GIVEN
        First first = new First();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(8);

        //WHEN
        List<Integer> even = first.getEven(list);

        //THEN
        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).hasSize(2);
        Assertions.assertThat(even).containsExactly(4,8);
    }
}
