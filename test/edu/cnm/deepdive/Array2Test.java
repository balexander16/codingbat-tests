package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array2Test {

  Array2 array = new Array2();

  int[] one24 = {1,2,2};
  int[] two24 = {4,4,1};
  int[] three24 = {4,4,1,2,2};
  int[] four24 = {1,2,3,4};
  int[] five24 = {3,5,9};
  int[] six24 = {1,2,3,4,4};
  int[] seven24 = {2,2,3,4};
  int[] eight24 = {1,2,3,2,2,4};
  int[] nine24 = {1,2,3,2,2,4,4};
  int[] ten24 = {1,2};
  int[] eleven24 = {2,2};
  int[] twelve24 = {4,4};
  int[] thirteen24 = {2};
  int[] fourteen24 = {};


  int[] onepre = {1, 2, 4, 1};
  int[] twopre = {3, 1, 4};
  int[] threepre = {1, 4, 4};
  int[] fourpre = {1, 4, 4, 2};
  int[] fivepre = {1, 3, 4, 2, 4};
  int[] sixpre = {4, 4};
  int[] sevenpre = {3, 3, 4};
  int[] eightpre = {1, 2, 1, 4};
  int[] ninepre = {2, 1, 4, 2};
  int[] tenpre = {2, 1, 2, 1, 4, 2};

  int[] answer1 = {1,2};
  int[] answer2 = {3,1};
  int[] answer3 = {1};
  int[] answer4 = {1};
  int[] answer5 = {1,3};
  int[] answer6 = {};
  int[] answer7 = {3,3};
  int[] answer8 = {1,2,1};
  int[] answer9 = {2,1};
  int[] answer10 = {2,1,2,1};



  @Test
  void either24() {
    assertTrue(array.either24(one24));
    assertTrue(array.either24(two24));
    assertFalse(array.either24(three24));
    assertFalse(array.either24(four24));
    assertFalse(array.either24(five24));
    assertTrue(array.either24(six24));
    assertTrue(array.either24(seven24));
    assertTrue(array.either24(eight24));
    assertFalse(array.either24(nine24));
    assertFalse(array.either24(ten24));
    assertTrue(array.either24(eleven24));
    assertTrue(array.either24(twelve24));
    assertFalse(array.either24(thirteen24));
    assertFalse(array.either24(fourteen24));
  }

  @Test
  void pre4() {
    assertArrayEquals(array.pre4(onepre),answer1);
    assertArrayEquals(array.pre4(twopre),answer2);
    assertArrayEquals(array.pre4(threepre),answer3);
    assertArrayEquals(array.pre4(fourpre),answer4);
    assertArrayEquals(array.pre4(fivepre),answer5);
    assertArrayEquals(array.pre4(sixpre),answer6);
    assertArrayEquals(array.pre4(sevenpre),answer7);
    assertArrayEquals(array.pre4(eightpre),answer8);
    assertArrayEquals(array.pre4(ninepre),answer9);
    assertArrayEquals(array.pre4(tenpre),answer10);
  }
}