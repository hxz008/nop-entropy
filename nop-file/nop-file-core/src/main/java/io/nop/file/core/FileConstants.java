/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.file.core;

import io.nop.biz.BizConstants;

public interface FileConstants {
    String PATH_UPLOAD = "/f/upload";

    String PATH_DOWNLOAD = "/f/download";

    String PARAM_BIZ_OBJ_NAME = "bizObjName";
    String PARAM_FIELD_NAME = "fieldName";

    String TEMP_BIZ_OBJ_ID = BizConstants.TEMP_BIZ_OBJ_ID;

    String MEDIA_TYPE_CONFIG_PATH = "/nop/file/media-type.json";

    String OPERATION_FILE_STORE_UPLOAD = "NopFileStore__upload";

    String OPERATION_FILE_STORE_DOWNLOAD = "NopFileStore__download";
}
