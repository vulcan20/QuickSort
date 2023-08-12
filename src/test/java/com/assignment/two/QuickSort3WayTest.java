package com.assignment.two;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QuickSort3WayTest {
	
	@DisplayName("Sort Integer array with one element")
	@Test
    public void testSortInput_Sort_SingleElementArray() {
		Integer[] input = {1};
        Quick3.sort(input);
        Quick.sort(input);
        assertTrue(Quick.isSorted(input));
        assertTrue(Quick3.isSorted(input));
    }
	
	@DisplayName("Sort Integer array with two element")
	@Test
    public void testSortInput_Sort_TwoElementArray() {
		Integer[] input = {5, 4};
        Quick3.sort(input);
        Quick.sort(input);
        assertTrue(Quick.isSorted(input));
        assertTrue(Quick3.isSorted(input));
    }
	
	@DisplayName("Sort Integer array with three element")
	@Test
    public void testSortInput_Sort_ThreeElementArray() {
		Integer[] input = {5, 4};
        Quick3.sort(input);
        Quick.sort(input);
        assertTrue(Quick.isSorted(input));
        assertTrue(Quick3.isSorted(input));
    }
	
	@DisplayName("Sort array with null value")
	@Test
    public void testSortInput_null() {
		Integer[] input = {null};
        Quick3.sort(input);
        Quick.sort(input);
        assertTrue(Quick.isSorted(input));
        assertTrue(Quick3.isSorted(input));
    }
	
	@DisplayName("Sort the sorted array_ascending")
	@Test
    public void testSortInput_sorted_ascending() {
		Integer[] input = {1,2,3,4,5};
        Quick3.sort(input);
        Quick.sort(input);
        assertTrue(Quick.isSorted(input));
        assertTrue(Quick3.isSorted(input));
    }
	
	@DisplayName("Sort the sorted array_descending")
	@Test
    public void testSortInput_sorted_decending() {
		Integer[] input = {5, 4, 3, 2, 1};
        Quick3.sort(input);
        Quick.sort(input);
        assertTrue(Quick.isSorted(input));
        assertTrue(Quick3.isSorted(input));
    }
	
	@DisplayName("Sort array with same values")
	@Test
    public void testSortInput_sameValues() {
		Integer[] input = {2,2,2};
        Quick3.sort(input);
        Quick.sort(input);
        assertTrue(Quick.isSorted(input));
        assertTrue(Quick3.isSorted(input));
    }
	
	@DisplayName("Sort array with duplicate values")
	@Test
    public void testSortInput_duplicateValues() {
		Integer[] input = {1,0,1,0,1};
        Quick3.sort(input);
        Quick.sort(input);
        assertTrue(Quick.isSorted(input));
        assertTrue(Quick3.isSorted(input));
    }
	
	
	
	
	
	

}
