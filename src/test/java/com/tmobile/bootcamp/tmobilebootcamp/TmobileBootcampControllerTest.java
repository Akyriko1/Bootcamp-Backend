package com.tmobile.bootcamp.tmobilebootcamp;

import com.tmobile.bootcamp.tmobilebootcamp.controllers.TmobileBootcampController;
import com.tmobile.bootcamp.tmobilebootcamp.models.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TmobileBootcampControllerTest {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Mock
    private TmobileBootcampController tmobileBootcampController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addTenTest() throws Exception {
        Result sum = new Result(15L);
        when(tmobileBootcampController.addTen(5L)).thenReturn(sum);

        Result calc = tmobileBootcampController.addTen(5L);
        Assert.assertEquals("Both sums are the same ", sum.getSum(), calc.getSum());

    }

    @Test
    public void sumNumbersTest() throws Exception {

       Result sum = new Result(10L);
       when(tmobileBootcampController.sumNumbers(3L,7L)).thenReturn(sum);

       Result calc = tmobileBootcampController.sumNumbers(3L, 7L);
       Assert.assertEquals("Both sums are the same ", sum.getSum(), calc.getSum());

    }


    @Test
    public void addTenNullTest() throws Exception {

        Result sum = new Result(15L);
        when(tmobileBootcampController.addTen(5L)).thenReturn(sum);
        Long num = null;

        Result calc = tmobileBootcampController.addTen(num);
        Assert.assertNull("Input number is null", num);

    }



    @Test
    public void sumNumbersNullTest() throws Exception {

        Result sum = new Result(10L);
        when(tmobileBootcampController.sumNumbers(3L, 7L)).thenReturn(sum);

        Long num1 = null;
        Long num2 = null;
        Result calc = tmobileBootcampController.sumNumbers(num1, num2);

        Assert.assertNull("Input number is null", num1);
        Assert.assertNull("Input number is null", num2);
    }

}
