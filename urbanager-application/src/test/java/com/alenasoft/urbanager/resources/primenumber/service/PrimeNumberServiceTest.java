package com.alenasoft.urbanager.resources.primenumber.service;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.resources.example.dao.ExampleDao;
import com.alenasoft.urbanager.resources.example.service.ExampleService;
import com.alenasoft.urbanager.resources.example.service.ExampleServiceImpl;
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
        assertThat(service.isPrime(3)).isEqualTo(expected);
    }

    @Test
    public void testGetPrimeNumberIfNumberIsDivisibleByOneAndByItselfReturnsTrue() {
        PrimeNumberService service = new PrimeNumberServiceImpl();
        boolean expected = true;
        assertThat(service.isPrime(31)).isEqualTo(expected);
    }

    @Test
    public void testGetPrimeNumberIfNumberIsDivisibleByOneAndByItselfAndNotByOthersReturnsTrue() {
            PrimeNumberService service = new PrimeNumberServiceImpl();
            boolean expected = true;
            assertThat(service.isPrime(2)).isEqualTo(expected);
    }


    @Test
    public void testGetPrimeNumberAnalyzeIfNumberIsDivisibleByOneAndByItselfAndByOthersReturnsFalse() {
        PrimeNumberService service = new PrimeNumberServiceImpl();
        boolean expected = false;
        assertThat(service.isPrime(2)).isEqualTo(expected);
    }
}

