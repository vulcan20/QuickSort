package com.assignment.two;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PartitionTest {

	@Test
	void testPartition_path1() {
		 	
		Integer[] arr = { 3, 1, 6, 2, 4, 5};
	    int pivotIndex = Quick.partition(arr, 0, arr.length - 1);
	        
	    Assertions.assertEquals(2,pivotIndex );
          
	}
	
	
	@Test
	void testPartition_path2() {
		
		Integer[] arr = { 3, 1, 6};
        int pivotIndex = Quick.partition(arr, 0, arr.length - 1);
        
        Assertions.assertEquals(1,pivotIndex );
        
	}
	
	@Test
	void testPartition_path3() {
        
		Integer[] arr = { 1, 2, 3, 4, 5};
        int pivotIndex = Quick.partition(arr, 0, arr.length - 1);
        
        Assertions.assertEquals(0,pivotIndex );
        
	}
	
	@Test
	void testPartition_path4() {
        Integer[] arr = { 5,4,3,2,1};
        int pivotIndex = Quick.partition(arr, 0, arr.length - 1);
        
        Assertions.assertEquals(4,pivotIndex );
        
	}
	
	@Test
	void testPartition_path5() {
        Integer[] arr = {5, 4};
        int pivotIndex = Quick.partition(arr, 0, arr.length - 1);
        
        Assertions.assertEquals(1,pivotIndex );
        
	}
	
	@Test
	void testPartition_path6() {
        Integer[] arr = { 1,1,1,1,1};
        int pivotIndex = Quick.partition(arr, 0, arr.length - 1);
        
        Assertions.assertEquals(2,pivotIndex );
        
	}


	@Test
	void testPartition_path7() {
        Integer[] arr = { 1,0,1,0,1};
        int pivotIndex = Quick.partition(arr, 0, arr.length - 1);
        
        Assertions.assertEquals(3,pivotIndex );
        
	}
	
	
	@Test
	void testPartition_Path8() {
        Integer[] arr = {1,2,3,3,2,1};
        int pivotIndex = Quick.partition(arr, 0, arr.length - 1);
        
        Assertions.assertEquals(1,pivotIndex );
        
	}

	@Test
	void testPartition_path9() {
        Integer[] arr = {0};
       
        assertThrows(ArrayIndexOutOfBoundsException.class,()->{
        	 int pivotIndex = Quick.partition(arr, 0, arr.length - 1);
        	 Assertions.assertEquals(1,pivotIndex );
             
        });
       
	}

}
