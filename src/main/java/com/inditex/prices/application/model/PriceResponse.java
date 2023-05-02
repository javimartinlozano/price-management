package com.inditex.prices.application.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceResponse {

    private Integer productId;
    private Integer brandId;
    private BigDecimal price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
