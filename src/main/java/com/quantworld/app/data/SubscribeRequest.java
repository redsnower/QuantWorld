/*
 * Copyright 2019-2020 Shawn Peng
 * Email: shawnpeng@yeah.net
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.quantworld.app.data;

import com.quantworld.app.data.constants.ExchangeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Shawn
 * @Date: 10/17/2019
 * @Description:
 */
public class SubscribeRequest extends BaseData {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  private String symbol;
  private ExchangeEnum exchange;

  public SubscribeRequest(String symbol, ExchangeEnum exchange) {
    this.symbol = symbol;
    this.exchange = exchange;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public ExchangeEnum getExchange() {
    return exchange;
  }

  public void setExchange(ExchangeEnum exchange) {
    this.exchange = exchange;
  }

  public String getQwSymbol() {
    return (symbol + "." + exchange.name()).toLowerCase();
  }

  public SubscribeRequest deepClone() {
    return (SubscribeRequest) super.deepClone();
  }

  @Override
  public String toString() {
    return "SubscribeRequest{" +
        "symbol='" + symbol + '\'' +
        ", exchange=" + exchange +
        ", gatewayName='" + gatewayName + '\'' +
        '}';
  }
}
