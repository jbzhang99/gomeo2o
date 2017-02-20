package io.terminus.ecp.trade.dto.club;

import io.terminus.ecp.trade.model.club.ClubActivityOwner;
import io.terminus.ecp.user.model.CopartnerInfo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Author:Guo Chaopeng
 * Created on 12/25/14.
 */
public class ClubCopartnerInfo implements Serializable {

    private static final long serialVersionUID = -6449781638114770807L;

    @Setter
    @Getter
    private ClubActivityOwner clubActivityOwner;

    @Setter
    @Getter
    private CopartnerInfo copartnerInfo;
}
