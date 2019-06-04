package com.raven.appserver.upload.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.raven.appserver.user.bean.UserBean;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OutputFileInfo {

    @JsonProperty("name")
    private String name;

    @JsonProperty("size")
    private Long size;

    @JsonProperty("url")
    private String url;

}
