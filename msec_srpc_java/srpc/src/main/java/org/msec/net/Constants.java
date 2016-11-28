
/**
 * Tencent is pleased to support the open source community by making MSEC available.
 *
 * Copyright (C) 2016 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the GNU General Public License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. You may 
 * obtain a copy of the License at
 *
 *     https://opensource.org/licenses/GPL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the 
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */


package org.msec.net;

public class Constants {
    public static final int ATTACHMENT_BYTEBUFFER = 1;
    public static final int ATTACHMENT_CUSTOM_PROTO_FLAG = 2;
    public static final int ATTACHMENT_CUSTOM_PROTO_CODEC = 3;
    public static final int ATTACHMENT_CUSTOM_PROTO_SEQUENCE = 4;
    public static final byte PKG_START = '(';
    public static final byte PKC_END = ')';
    public static int PKG_LEAST_LENGTH = 1 + 4 + 4 + 1;
}