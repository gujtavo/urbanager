package com.alenasoft.urbanager.resources.primenumber;

import com.alenasoft.urbanager.api.Result;

import javax.inject.Inject;

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


    @Override
    public int[] getNPrimeNumbers(int number){

        if(number <= 0){
            return new int[]{};
        }

        int limit = 0;
        int i = 1;

        int[] PrimeNumbersList = new int[number];

        while(limit != number){
            if(Prime(i) == true){
                PrimeNumbersList[limit] = i;
                limit++;
            }
            i++;
        }

        return PrimeNumbersList;
    }

}
