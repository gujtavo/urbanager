package com.alenasoft.urbanager.resources.primenumber.service;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.resources.example.dao.ExampleDao;
import com.alenasoft.urbanager.resources.example.service.ExampleService;
import com.alenasoft.urbanager.resources.example.service.ExampleServiceImpl;
import com.alenasoft.urbanager.resources.primenumber.PrimeNumberService;
import com.alenasoft.urbanager.resources.primenumber.PrimeNumberServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumberServiceTest {

    @Test
    public void testGetPrimeNumberIfNumberIsDivisibleByOneReturnsTrue() {
        PrimeNumberService service = new PrimeNumberServiceImpl();
        boolean expected = true;
        assertThat(service.Prime(6257)).isEqualTo(expected);
    }

    @Test
    public void testGetPrimeNumberIfNumberIsDivisibleByOneAndByItselfReturnsTrue() {
        PrimeNumberService service = new PrimeNumberServiceImpl();
        boolean expected = true;
        assertThat(service.Prime(31)).isEqualTo(expected);
    }

    @Test
    public void testGetPrimeNumberIfNumberIsDivisibleByOneAndByItselfAndNotByOthersReturnsTrue() {
            PrimeNumberService service = new PrimeNumberServiceImpl();
            boolean expected = true;
            assertThat(service.Prime(2)).isEqualTo(expected);
    }


    @Test
    public void testGetPrimeNumberAnalyzeIfNumberIsDivisibleByOneAndByItselfAndByOthersReturnsFalse() {
        PrimeNumberService service = new PrimeNumberServiceImpl();
        boolean expected = false;
        assertThat(service.Prime(2)).isEqualTo(expected);
    }

    @Test
    public void testGetPrimeNumberIfNumberIsNegativeReturnFail() {
        PrimeNumberService service = new PrimeNumberServiceImpl();
        boolean expected = false;
        assertThat(service.Prime(-3)).isEqualTo(expected);
    }


    @Test
    public void testGetNPrimeNumbersIfZeroIsSent(){
        PrimeNumberService service = new PrimeNumberServiceImpl();
        int[] expected = {};
        Assert.assertArrayEquals( expected, service.getNPrimeNumbers(0) );
    }

    @Test
    public void testGetNPrimeNumbersIfFiveIsSentAsParameter(){
        PrimeNumberService service = new PrimeNumberServiceImpl();
        int[] expected = {2,3,5,7,11};
        Assert.assertArrayEquals( expected, service.getNPrimeNumbers(5) );
    }

    /*@Test(expected = Num.class)
    public void testGetNPrimeNumbersIfNumberIsTooLargeDisplayError(){
        PrimeNumberService service = new PrimeNumberServiceImpl();
        service.getNPrimeNumbers(2147483648);
    }*/
}

