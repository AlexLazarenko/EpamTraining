package edu.epam.decomposition.task4.service;

import edu.epam.decomposition.task4.entity.NumberArray;

public class NumberService {
  public final static int BASE_EVEN_COUNT = 2;
  public boolean isTwoEvenNumbers(NumberArray array){
    int counter = 0;
    for (int i = 0; i < array.size(); i++) {
//      if(array.getNumber(i) % 2 == 0 && counter < 2) {
//        counter++;
//      }
      int i1 = array.getNumber(i) % 2 == 0 && counter < BASE_EVEN_COUNT ? counter++ : counter;
    }
    return counter == BASE_EVEN_COUNT;
  }
}
