package com.alenasoft.urbanager.resources.primenumber;

import com.alenasoft.urbanager.api.Result;

public interface PrimeNumberService {
    boolean Prime( int num );
    String check( int num );
    int[] getNPrimeNumbers(int num);


}
