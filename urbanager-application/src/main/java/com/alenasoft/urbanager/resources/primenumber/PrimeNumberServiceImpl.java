package com.alenasoft.urbanager.resources.primenumber;

public class PrimeNumberServiceImpl implements PrimeNumberService {

    @Override
    public boolean Prime(int num) {
        if ( num <= 1 ) return false;
        int counter=2;
        while(counter<= num/2)
        {
            if(num % counter == 0)
            {
                return false;

            }
            counter++;
        }
        return true;
    }

    @Override
    public String check(int num1) {

        if ( Prime( num1 ) ) return "OK";
        return  "FAIL";
    }
}
