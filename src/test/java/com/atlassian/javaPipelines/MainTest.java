package com.atlassian.javaPipelines;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.mongodb.*;


public class MainTest 
{
        Main test = new Main();
        @Test
        public void testAdd() {
            assertEquals(test.add(1,1),2);
        }
        @Test
        public void testSubtract() {
            assertEquals(test.subtract(1,1),0);
        }
        @Test
        public void testMultiply() {
            assertEquals(test.multiply(1,1),1);
        }
        @Test
        public void testDivide() {
            assertEquals(test.divide(1,1),1);
        }
        @Test
        public void testDB(){
            test.createDB();
        }
}
