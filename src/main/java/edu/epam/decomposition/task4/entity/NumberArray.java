package edu.epam.decomposition.task4.entity;

import java.util.Arrays;

public class NumberArray {
  private int[] numbers;

  public NumberArray(int... numbers) {
    this.numbers = numbers;
  }

  public int getNumber(int index) {
    return numbers[index];
  }

  public void setNumbers(int... numbers) {
    this.numbers = numbers;
  }
  public int size() {
    return numbers.length;
  }
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("NumberArray{");
    sb.append("numbers=").append(Arrays.toString(numbers));
    sb.append('}');
    return sb.toString();
  }
}
