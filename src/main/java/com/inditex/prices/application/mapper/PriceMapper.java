package com.inditex.prices.application.mapper;

import org.mapstruct.Mapper;

import com.inditex.prices.application.model.PriceResponse;
import com.inditex.prices.domain.model.Price;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    PriceResponse mapperToResponse(Price price);
}
