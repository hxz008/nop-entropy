
CREATE TABLE nop_batch_file(
  SID VARCHAR(32) NOT NULL    COMMENT '主键',
  FILE_NAME VARCHAR(500) NOT NULL    COMMENT '文件名',
  FILE_PATH VARCHAR(2000) NOT NULL    COMMENT '文件路径',
  FILE_LENGTH BIGINT NOT NULL    COMMENT '文件长度',
  FILE_CATEGORY VARCHAR(100) NOT NULL    COMMENT '文件分类',
  FILE_SOURCE VARCHAR(10) NOT NULL    COMMENT '文件来源',
  CURRENT_TASK_ID VARCHAR(32) NOT NULL    COMMENT '当前处理任务',
  PROCESS_STATE INTEGER NOT NULL    COMMENT '处理状态',
  ACCEPT_DATE DATE NOT NULL    COMMENT '文件接收时间',
  VERSION BIGINT NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_batch_file primary key (SID)
);

CREATE TABLE nop_batch_task(
  SID VARCHAR(32) NOT NULL    COMMENT 'SID',
  TASK_NAME VARCHAR(50) NOT NULL    COMMENT '任务名',
  TASK_KEY VARCHAR(100) NOT NULL    COMMENT '唯一Key',
  TASK_STATUS INTEGER NOT NULL    COMMENT '任务状态',
  START_TIME TIMESTAMP NULL    COMMENT '任务启动时间',
  END_TIME TIMESTAMP NULL    COMMENT '任务结束时间',
  TASK_PARAMS VARCHAR(4000) NULL    COMMENT '任务参数',
  WORKER VARCHAR(100) NOT NULL    COMMENT '执行者',
  INPUT_FILE_ID VARCHAR(32) NULL    COMMENT '输入文件',
  RETRY_COUNT INTEGER NOT NULL    COMMENT '重试次数',
  RESULT_STATUS INTEGER NULL    COMMENT '返回状态码',
  RESULT_CODE VARCHAR(100) NULL    COMMENT '返回码',
  RESULT_MSG VARCHAR(500) NULL    COMMENT '返回消息',
  ERROR_STACK VARCHAR(4000) NULL    COMMENT '错误堆栈',
  COMPLETED_INDEX BIGINT NULL    COMMENT '已完成记录下标',
  READ_COUNT BIGINT NULL    COMMENT '读数量',
  WRITE_COUNT BIGINT NULL    COMMENT '写数量',
  PROCESS_COUNT BIGINT NULL    COMMENT '处理数量',
  SKIP_COUNT BIGINT NULL    COMMENT '跳过数量',
  VERSION BIGINT NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_batch_task primary key (SID)
);

CREATE TABLE nop_batch_task_state(
  TASK_ID VARCHAR(32) NOT NULL    COMMENT '主键',
  FIELD_NAME VARCHAR(100) NOT NULL    COMMENT '变量名',
  FIELD_TYPE INTEGER NOT NULL    COMMENT '变量类型',
  STRING_VALUE VARCHAR(4000) NULL    COMMENT '字符串值',
  DECIMAL_VALUE DECIMAL(30,6) NULL    COMMENT '浮点值',
  LONG_VALUE BIGINT NULL    COMMENT '整数型',
  DATE_VALUE DATE NULL    COMMENT '日期值',
  TIMESTAMP_VALUE TIMESTAMP NULL    COMMENT '时间点值',
  VERSION BIGINT NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  constraint PK_nop_batch_task_state primary key (TASK_ID,FIELD_NAME)
);

CREATE TABLE nop_batch_record_result(
  TASK_ID VARCHAR(32) NOT NULL    COMMENT '主键',
  RECORD_KEY VARCHAR(200) NOT NULL    COMMENT '记录唯一键',
  RESULT_STATUS INTEGER NULL    COMMENT '返回状态码',
  RESULT_CODE VARCHAR(100) NULL    COMMENT '返回码',
  RESULT_MSG VARCHAR(500) NULL    COMMENT '返回消息',
  ERROR_STACK VARCHAR(4000) NULL    COMMENT '错误堆栈',
  VERSION BIGINT NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  constraint PK_nop_batch_record_result primary key (TASK_ID,RECORD_KEY)
);


   ALTER TABLE nop_batch_file COMMENT '批处理文件';
                
   ALTER TABLE nop_batch_task COMMENT '批处理任务';
                
   ALTER TABLE nop_batch_task_state COMMENT '批处理任务状态变量';
                
   ALTER TABLE nop_batch_record_result COMMENT '批处理记录结果';
                
