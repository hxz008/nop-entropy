
CREATE TABLE nop_rule_input(
  SID VARCHAR(32) NOT NULL    COMMENT '主键',
  RULE_ID VARCHAR(32) NOT NULL    COMMENT '规则ID',
  NAME VARCHAR(50) NOT NULL    COMMENT '名称',
  IS_MANDATORY BOOLEAN NOT NULL    COMMENT '非空',
  IS_COMPUTED BOOLEAN NOT NULL    COMMENT '自动计算',
  DISPLAY_NAME VARCHAR(200) NOT NULL    COMMENT '显示名称',
  DEFAULT_VALUE VARCHAR(1000) NULL    COMMENT '缺省值',
  `SCHEMA` VARCHAR(4000) NULL    COMMENT '结构定义',
  DESCRIPTION VARCHAR(4000) NULL    COMMENT '描述',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_rule_input primary key (SID)
);

CREATE TABLE nop_rule_output(
  SID VARCHAR(32) NOT NULL    COMMENT '主键',
  RULE_ID VARCHAR(32) NOT NULL    COMMENT '规则ID',
  NAME VARCHAR(50) NOT NULL    COMMENT '名称',
  IS_MANDATORY BOOLEAN NOT NULL    COMMENT '非空',
  AGG_METHOD VARCHAR(10) NOT NULL    COMMENT '汇总方式',
  DISPLAY_NAME VARCHAR(200) NOT NULL    COMMENT '显示名称',
  DEFAULT_VALUE VARCHAR(1000) NULL    COMMENT '缺省值',
  `SCHEMA` VARCHAR(4000) NULL    COMMENT '结构定义',
  DESCRIPTION VARCHAR(4000) NULL    COMMENT '描述',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_rule_output primary key (SID)
);

CREATE TABLE nop_rule_node(
  SID VARCHAR(32) NOT NULL    COMMENT 'SID',
  RULE_ID VARCHAR(32) NOT NULL    COMMENT '规则ID',
  LABEL VARCHAR(200) NOT NULL    COMMENT '显示标签',
  SORT_NO INTEGER NOT NULL    COMMENT '排序序号',
  PREDICATE VARCHAR(4000) NOT NULL    COMMENT '判断条件',
  OUTPUTS VARCHAR(50) NULL    COMMENT '输出结果',
  PARENT_ID VARCHAR(32) NULL    COMMENT '父ID',
  IS_LEAF BOOLEAN NOT NULL    COMMENT '是否叶子节点',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_rule_node primary key (SID)
);

CREATE TABLE nop_rule_role(
  SID VARCHAR(32) NOT NULL    COMMENT '主键',
  RULE_ID VARCHAR(32) NOT NULL    COMMENT 'Rule ID',
  ROLE_ID VARCHAR(100) NOT NULL    COMMENT 'Role ID',
  IS_ADMIN TINYINT NOT NULL    COMMENT '是否管理者',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_rule_role primary key (SID)
);

CREATE TABLE nop_rule_log(
  SID VARCHAR(32) NOT NULL    COMMENT '日志ID',
  RULE_ID VARCHAR(32) NOT NULL    COMMENT '规则ID',
  LOG_LEVEL INTEGER NOT NULL    COMMENT '日志级别',
  LOG_MSG VARCHAR(4000) NULL    COMMENT '日志消息',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  constraint PK_nop_rule_log primary key (SID)
);

CREATE TABLE nop_rule_definition(
  RULE_ID VARCHAR(32) NOT NULL    COMMENT '主键',
  RULE_NAME VARCHAR(500) NOT NULL    COMMENT '规则名称',
  RULE_VERSION VARCHAR(50) NOT NULL    COMMENT '规则版本',
  DISPLAY_NAME VARCHAR(200) NOT NULL    COMMENT '显示名称',
  RULE_GROUP VARCHAR(200) NOT NULL    COMMENT '规则分组',
  RULE_TYPE VARCHAR(10) NOT NULL    COMMENT '规则类型',
  DESCRIPTION VARCHAR(1000) NULL    COMMENT '描述',
  MODEL_TEXT LONGTEXT NULL    COMMENT '模型文本',
  STATUS INTEGER NOT NULL    COMMENT '状态',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_rule_definition primary key (RULE_ID)
);


   ALTER TABLE nop_rule_input COMMENT '规则输入变量';
                
   ALTER TABLE nop_rule_output COMMENT '规则输出变量';
                
   ALTER TABLE nop_rule_node COMMENT '规则节点';
                
   ALTER TABLE nop_rule_role COMMENT '规则角色';
                
   ALTER TABLE nop_rule_log COMMENT '规则执行日志';
                
   ALTER TABLE nop_rule_definition COMMENT '规则模型定义';
                