package com.tmobile.bootcamp.tmobilebootcamp.controllers;

import com.tmobile.bootcamp.tmobilebootcamp.models.Result;
import com.tmobile.bootcamp.tmobilebootcamp.service.exception.BootcampServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.web.bind.annotation.*;

@RestController
@Api(value="bootcampWS", description="Tmobile Bootcamp Webservices")
public class TmobileBootcampController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());


    @ApiOperation(value= "Add 10 to a given input num, return result", response= Result.class)
    @RequestMapping(value={"/add/{num}"}, method={RequestMethod.GET})
    public Result addTen(@PathVariable("num") Long num) throws BootcampServiceException{

        if (num == null)
            throw new BootcampServiceException("101" , "Input number(s) shouldn't be null");

        logger.debug("Adding 10 plus " + num);
        return new Result(num + 10L);
    }

    @ApiOperation(value= "Add num1 plus num2, return result", response= Result.class)
    @RequestMapping(value={"/sum/{num1}/{num2}"}, method={RequestMethod.GET})
    public Result sumNumbers(@PathVariable("num1") Long num1, @PathVariable("num2") Long num2) throws BootcampServiceException {

        if (num1 == null || num2 == null)
            throw new BootcampServiceException("101" , "Input number(s) shouldn't be null");

        logger.debug("Adding " + num1 + " plus " + num2);
        return new Result(num1 + num2);
    }

}
