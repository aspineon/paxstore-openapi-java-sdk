/*
 * ********************************************************************************
 * COPYRIGHT
 *               PAX TECHNOLOGY, Inc. PROPRIETARY INFORMATION
 *   This software is supplied under the terms of a license agreement or
 *   nondisclosure agreement with PAX  Technology, Inc. and may not be copied
 *   or disclosed except in accordance with the terms in that agreement.
 *
 *      Copyright (C) 2017 PAX Technology, Inc. All rights reserved.
 * ********************************************************************************
 */
package com.pax.market.api.sdk.java.api.terminalGroup.dto;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Description
 * @Author: Shawn
 * @Date: 2019/11/25 17:12
 * @Version 7.1
 */
@Getter
@Setter
public class UpdateTerminalGroupRequest implements Serializable {
    private static final long serialVersionUID = 3649618122658375454L;
    private String name;
    private String description;
    private String modelName;
    private String resellerName;
    private List<String> merchantNameList;
}
