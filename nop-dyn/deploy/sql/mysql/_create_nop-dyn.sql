
CREATE TABLE nop_dyn_app_module(
  APP_ID VARCHAR(32) NOT NULL    COMMENT '应用ID',
  MODULE_ID VARCHAR(32) NOT NULL    COMMENT '模块ID',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  constraint PK_nop_dyn_app_module primary key (APP_ID,MODULE_ID)
);

CREATE TABLE nop_dyn_page(
  PAGE_ID VARCHAR(32) NOT NULL    COMMENT '页面ID',
  MODULE_ID VARCHAR(32) NOT NULL    COMMENT '模块ID',
  PAGE_NAME VARCHAR(200) NOT NULL    COMMENT '页面名称',
  PAGE_GROUP VARCHAR(100) NOT NULL    COMMENT '页面分组',
  PAGE_SCHEMA_TYPE VARCHAR(100) NOT NULL    COMMENT '页面类型',
  PAGE_CONTENT LONGTEXT NOT NULL    COMMENT '页面内容',
  STATUS INTEGER NOT NULL    COMMENT '状态',
  OWNER_ID VARCHAR(50) NULL    COMMENT '拥有者ID',
  OWNER_NAME VARCHAR(50) NULL    COMMENT '拥有者姓名',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_dyn_page primary key (PAGE_ID)
);

CREATE TABLE nop_dyn_prop_meta(
  PROP_META_ID VARCHAR(32) NOT NULL    COMMENT '属性定义ID',
  ENTITY_META_ID VARCHAR(32) NOT NULL    COMMENT '实体定义ID',
  PROP_NAME VARCHAR(50) NOT NULL    COMMENT '属性名',
  DISPLAY_NAME VARCHAR(100) NOT NULL    COMMENT '显示名',
  STD_SQL_TYPE VARCHAR(10) NOT NULL    COMMENT '标准SQL数据类型',
  LENGTH INTEGER NOT NULL    COMMENT '长度',
  SCALE INTEGER NOT NULL    COMMENT '小数位数',
  UI_SHOW VARCHAR(10) NOT NULL    COMMENT '显示控制',
  UI_CONTROL VARCHAR(100) NULL    COMMENT '显示控件',
  STD_DOMAIN VARCHAR(50) NOT NULL    COMMENT '标准域',
  DICT_NAME VARCHAR(100) NULL    COMMENT '数据字典',
  DYN_FIELD_MAPPING VARCHAR(100) NULL    COMMENT '动态字段映射',
  TAG_SET VARCHAR(200) NULL    COMMENT '标签',
  REF_ENTITY_NAME VARCHAR(200) NULL    COMMENT '关联实体名',
  REF_PROP_NAME VARCHAR(100) NULL    COMMENT '关联属性名',
  REF_PROP_DISPLAY_NAME VARCHAR(100) NULL    COMMENT '关联属性显示名',
  STATUS INTEGER NOT NULL    COMMENT '状态',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_dyn_prop_meta primary key (PROP_META_ID)
);

CREATE TABLE nop_dyn_entity(
  SID VARCHAR(32) NOT NULL    COMMENT '主键',
  OBJ_TYPE VARCHAR(100) NOT NULL    COMMENT '对象类型',
  NAME VARCHAR(100) NOT NULL    COMMENT '名称',
  DISPLAY_NAME VARCHAR(500) NULL    COMMENT '显示名称',
  SORT_ORDER INTEGER NULL    COMMENT '排序',
  NOP_FLOW_ID VARCHAR(32) NULL    COMMENT '工作流实例ID',
  BIZ_STATUS INTEGER NULL    COMMENT '业务状态码',
  BIZ_STATE VARCHAR(50) NULL    COMMENT '业务状态',
  PARENT_ID VARCHAR(32) NULL    COMMENT '父ID',
  OWNER_NAME VARCHAR(50) NULL    COMMENT '拥有者姓名',
  OWNER_ID VARCHAR(50) NULL    COMMENT '拥有者ID',
  DEPT_ID VARCHAR(50) NULL    COMMENT '部门ID',
  STRING_FLD1 VARCHAR(4000) NULL    COMMENT '字符串字段1',
  DECIMAL_FLD1 DECIMAL(30,6) NULL    COMMENT '浮点型字段1',
  INT_FLD1 INTEGER NULL    COMMENT '整数型字段1',
  LONG_FLD1 BIGINT NULL    COMMENT '长整型字段1',
  DATE_FLD1 DATE NULL    COMMENT '日期字段1',
  TIMESTAMP_FLD1 TIMESTAMP NULL    COMMENT '时间戳字段1',
  FILE_FLD1 VARCHAR(200) NULL    COMMENT '文件字段1',
  STRING_FLD2 VARCHAR(4000) NULL    COMMENT '字符串字段2',
  DECIMAL_FLD2 DECIMAL(30,6) NULL    COMMENT '浮点型字段2',
  INT_FLD2 INTEGER NULL    COMMENT '整数型字段2',
  LONG_FLD2 BIGINT NULL    COMMENT '长整型字段2',
  DATE_FLD2 DATE NULL    COMMENT '日期字段2',
  TIMESTAMP_FLD2 TIMESTAMP NULL    COMMENT '时间戳字段2',
  FILE_FLD2 VARCHAR(200) NULL    COMMENT '文件字段2',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_dyn_entity primary key (SID)
);

CREATE TABLE nop_dyn_app(
  APP_ID VARCHAR(32) NOT NULL    COMMENT '应用ID',
  APP_NAME VARCHAR(200) NOT NULL    COMMENT '应用名',
  DISPLAY_NAME INTEGER NOT NULL    COMMENT '显示名',
  STATUS INTEGER NOT NULL    COMMENT '状态',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  constraint PK_nop_dyn_app primary key (APP_ID)
);

CREATE TABLE nop_dyn_entity_meta(
  ENTITY_META_ID VARCHAR(32) NOT NULL    COMMENT '实体定义ID',
  MODULE_ID VARCHAR(32) NOT NULL    COMMENT '模块ID',
  ENTITY_NAME VARCHAR(200) NOT NULL    COMMENT '实体名',
  DISPLAY_NAME VARCHAR(100) NOT NULL    COMMENT '显示名',
  STORE_TYPE INTEGER NOT NULL    COMMENT '存储类型',
  META_CONTENT LONGTEXT NOT NULL    COMMENT '元数据内容',
  STATUS INTEGER NOT NULL    COMMENT '状态',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_dyn_entity_meta primary key (ENTITY_META_ID)
);

CREATE TABLE nop_dyn_module(
  MODULE_ID VARCHAR(32) NOT NULL    COMMENT '模块ID',
  MODULE_NAME VARCHAR(200) NOT NULL    COMMENT '模块名',
  DISPLAY_NAME INTEGER NOT NULL    COMMENT '显示名',
  BASE_MODULE_ID VARCHAR(32) NULL    COMMENT '基础模块ID',
  STATUS INTEGER NOT NULL    COMMENT '状态',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  constraint PK_nop_dyn_module primary key (MODULE_ID)
);


   ALTER TABLE nop_dyn_app_module COMMENT '应用模块映射';
                
   ALTER TABLE nop_dyn_page COMMENT '页面定义';
                
   ALTER TABLE nop_dyn_prop_meta COMMENT '属性元数据';
                
   ALTER TABLE nop_dyn_entity COMMENT '动态实体';
                
   ALTER TABLE nop_dyn_app COMMENT '应用定义';
                
   ALTER TABLE nop_dyn_entity_meta COMMENT '实体元数据';
                
   ALTER TABLE nop_dyn_module COMMENT '模块定义';
                
