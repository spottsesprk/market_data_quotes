package com.spotts.orderbook.book;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * A quote.
 */
@Data
public class Quote {
    private String symbol;
    private String marketCenter;
    private BigInteger bidQuantity;
    private BigInteger askQuantity;
    private BigDecimal bidPrice;
    private BigDecimal askPrice;
    private Timestamp startTime;
    private Timestamp endTime;
    private String quoteConditions;
    private String sipFeedSeq;
    private String sipFeed;
}
