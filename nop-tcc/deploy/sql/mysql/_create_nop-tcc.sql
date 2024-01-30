
CREATE TABLE nop_tcc_record(
  TXN_ID VARCHAR(50) NOT NULL    COMMENT '事务ID',
  TXN_GROUP VARCHAR(50) NOT NULL    COMMENT '事务分组',
  TXN_NAME VARCHAR(128) NULL    COMMENT '事务名',
  STATUS INTEGER NOT NULL    COMMENT '状态',
  EXPIRE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '过期时间',
  APP_ID VARCHAR(200) NOT NULL    COMMENT '应用ID',
  APP_DATA VARCHAR(2000) NULL    COMMENT '应用数据',
  BEGIN_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '开始时间',
  END_TIME TIMESTAMP NULL    COMMENT '结束时间',
  ERROR_CODE VARCHAR(200) NULL    COMMENT '错误码',
  ERROR_MESSAGE VARCHAR(1000) NULL    COMMENT '错误消息',
  ERROR_STACK VARCHAR(1000) NULL    COMMENT '错误堆栈',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  constraint PK_nop_tcc_record primary key (TXN_ID)
);

CREATE TABLE nop_tcc_branch_record(
  BRANCH_ID VARCHAR(50) NOT NULL    COMMENT '事务分支ID',
  TXN_ID VARCHAR(50) NOT NULL    COMMENT '事务ID',
  BRANCH_NO INTEGER NOT NULL    COMMENT '事务分支序号',
  PARENT_BRANCH_ID VARCHAR(50) NULL    COMMENT '父分支ID',
  STATUS INTEGER NOT NULL    COMMENT '状态',
  EXPIRE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '过期时间',
  SERVICE_NAME VARCHAR(200) NOT NULL    COMMENT '服务名',
  SERVICE_METHOD VARCHAR(200) NULL    COMMENT '服务方法',
  CONFIRM_METHOD VARCHAR(200) NULL    COMMENT '确认方法',
  CANCEL_METHOD VARCHAR(200) NULL    COMMENT '取消方法',
  REQUEST_DATA MEDIUMTEXT NULL    COMMENT '请求数据',
  ERROR_CODE VARCHAR(200) NULL    COMMENT '错误码',
  ERROR_MESSAGE VARCHAR(1000) NULL    COMMENT '错误消息',
  ERROR_STACK VARCHAR(1000) NULL    COMMENT '错误堆栈',
  BEGIN_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '开始时间',
  END_TIME TIMESTAMP NULL    COMMENT '结束时间',
  COMMIT_ERROR_CODE VARCHAR(200) NULL    COMMENT '提交阶段错误码',
  COMMIT_ERROR_MESSAGE VARCHAR(1000) NULL    COMMENT '提交阶段错误消息',
  COMMIT_ERROR_STACK VARCHAR(1000) NULL    COMMENT '提交阶段错误堆栈',
  CANCEL_ERROR_CODE VARCHAR(200) NULL    COMMENT '取消阶段错误码',
  CANCEL_ERROR_MESSAGE VARCHAR(1000) NULL    COMMENT '取消阶段错误消息',
  CANCEL_ERROR_STACK VARCHAR(1000) NULL    COMMENT '取消阶段错误堆栈',
  RETRY_TIMES INTEGER NULL    COMMENT '重试次数',
  MAX_RETRY_TIMES INTEGER NOT NULL    COMMENT '最大重试次数',
  NEXT_RETRY_TIME TIMESTAMP NULL    COMMENT '下次重试时间',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  constraint PK_nop_tcc_branch_record primary key (BRANCH_ID)
);


   ALTER TABLE nop_tcc_record COMMENT 'TCC事务记录';
                
   ALTER TABLE nop_tcc_branch_record COMMENT 'TCC事务分支记录';
                
