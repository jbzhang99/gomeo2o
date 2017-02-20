package io.terminus.ecp.marketing.model.condition;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Desc:满足数量的条件
 * Mail:v@terminus.io
 * author:Michael Zhao
 * Date:2015-03-09.
 */
@ToString
public class FullNumberCondition implements Serializable {
    private static final long serialVersionUID = 8703621975571041222L;

    @Setter
    @Getter
    private Long id;

    @Setter
    @Getter
    private Long number;    //满多少件条件

    @Setter
    @Getter
    private Integer scope;      //作用域（1：订单，2：商品）
}
