package com.tmobile.bootcamp.tmobilebootcamp.models;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Result implements Serializable {

    @ApiModelProperty (notes ="result of input plus 10")
    protected Long sum;


}
