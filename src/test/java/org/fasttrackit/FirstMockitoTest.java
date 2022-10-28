package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class FirstMockitoTest {
    @Test
    public void getEvenInput(){
        First first = Mockito.mock(First.class);

        // atunci cand apelez getEven(null) sa apelez metoda reala
        Mockito.when(first.getEven(null)).thenCallRealMethod();
        //izolez metoda validateInput
        Mockito.when(first.validateInput(null)).thenReturn(false);

        List<Integer> even = first.getEven(null);

        Assertions.assertThat(even).isNotNull();


    }
}
