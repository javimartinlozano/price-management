package com.inditex.prices.infrastructure.rest.input.port;

import java.sql.SQLException;
import java.time.LocalDateTime;

import com.inditex.prices.application.model.PriceResponse;

public interface PriceInputPort {
    PriceResponse obtainProductPrice(Integer brandId, Integer productId,
                                     LocalDateTime date) throws SQLException;
}
