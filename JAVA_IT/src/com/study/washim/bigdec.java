package com.study.washim;

import java.math.BigDecimal;
import java.math.*;

public class bigdec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal fees = BigDecimal.valueOf(200).setScale(2);
		BigDecimal peoples = BigDecimal.valueOf(3).setScale(2);
		BigDecimal charge = fees.divide(peoples,RoundingMode.HALF_DOWN);
		System.out.println(charge);
		
		
		BigDecimal first = BigDecimal.valueOf(99).setScale(3);
		BigDecimal second2 = BigDecimal.valueOf(56.2680000).setScale(3);
		System.out.println(first.subtract(second2));
		
				

	}

}
