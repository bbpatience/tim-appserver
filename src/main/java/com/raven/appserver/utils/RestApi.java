package com.raven.appserver.utils;

import com.raven.appserver.group.bean.param.GroupOutParam;
import com.raven.appserver.group.bean.param.GroupReqParam;
import com.raven.appserver.pojos.RspTokenParam;

public interface RestApi {
    RspTokenParam getToken(String userId);

    GroupOutParam createGroup(GroupReqParam reqParam);

    RestResultCode joinGroup(GroupReqParam reqParam);

    RestResultCode quitGroup(GroupReqParam reqParam);

    RestResultCode dismissGroup(GroupReqParam reqParam);
}
