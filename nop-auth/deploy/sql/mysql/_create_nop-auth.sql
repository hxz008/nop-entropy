
CREATE TABLE nop_auth_dept(
  DEPT_ID VARCHAR(50) NOT NULL    COMMENT '主键',
  DEPT_NAME VARCHAR(100) NOT NULL    COMMENT '名称',
  PARENT_ID VARCHAR(50) NULL    COMMENT '父ID',
  ORDER_NUM INTEGER NULL    COMMENT '排序',
  DEPT_TYPE VARCHAR(10) NULL    COMMENT '类型',
  MANAGER_ID VARCHAR(50) NULL    COMMENT '部门负责人',
  EMAIL VARCHAR(100) NULL    COMMENT '邮件',
  PHONE VARCHAR(50) NULL    COMMENT '电话',
  DEL_FLAG TINYINT NULL    COMMENT '删除标识',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_dept primary key (DEPT_ID)
);

CREATE TABLE nop_auth_position(
  POSITION_ID VARCHAR(50) NOT NULL    COMMENT '主键',
  NAME VARCHAR(100) NOT NULL    COMMENT '名称',
  DEL_FLAG TINYINT NULL    COMMENT '删除标识',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_position primary key (POSITION_ID)
);

CREATE TABLE nop_auth_role(
  ROLE_ID VARCHAR(50) NOT NULL    COMMENT '角色ID',
  ROLE_NAME VARCHAR(50) NOT NULL    COMMENT '角色名',
  CHILD_ROLE_IDS VARCHAR(500) NULL    COMMENT '子角色',
  IS_PRIMARY TINYINT NULL    COMMENT '是否主角色',
  DEL_FLAG TINYINT NOT NULL    COMMENT '删除标识',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint UK_NOP_AUTH_ROLE_NAME unique (ROLE_NAME),
  constraint PK_nop_auth_role primary key (ROLE_ID)
);

CREATE TABLE nop_auth_site(
  SITE_ID VARCHAR(100) NOT NULL    COMMENT '站点ID',
  DISPLAY_NAME VARCHAR(100) NOT NULL    COMMENT '显示名称',
  ORDER_NO INTEGER NOT NULL    COMMENT '排序',
  URL VARCHAR(200) NULL    COMMENT '链接',
  STATUS INTEGER NOT NULL    COMMENT '状态',
  EXT_CONFIG VARCHAR(1000) NULL    COMMENT '扩展配置',
  CONFIG_VERSION VARCHAR(20) NULL    COMMENT '配置版本',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_site primary key (SITE_ID)
);

CREATE TABLE nop_auth_tenant(
  TENANT_ID VARCHAR(32) NOT NULL    COMMENT '主键',
  NAME VARCHAR(100) NOT NULL    COMMENT '名称',
  BEGIN_TIME DATETIME NULL    COMMENT '开始时间',
  END_TIME DATETIME NULL    COMMENT '结束时间',
  STATUS INTEGER NOT NULL    COMMENT '租户状态',
  DEL_FLAG TINYINT NULL    COMMENT '删除标识',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_tenant primary key (TENANT_ID)
);

CREATE TABLE nop_auth_user(
  USER_ID VARCHAR(50) NOT NULL    COMMENT '用户ID',
  USER_NAME VARCHAR(50) NOT NULL    COMMENT '用户名',
  PASSWORD VARCHAR(80) NOT NULL    COMMENT '密码',
  SALT VARCHAR(32) NULL    COMMENT '密码加盐',
  NICK_NAME VARCHAR(50) NOT NULL    COMMENT '昵称',
  DEPT_ID VARCHAR(50) NULL    COMMENT '所属部门',
  OPEN_ID VARCHAR(32) NOT NULL    COMMENT '用户外部标识',
  REL_DEPT_ID VARCHAR(50) NULL    COMMENT '相关部门',
  GENDER INTEGER NOT NULL    COMMENT '性别',
  AVATAR VARCHAR(100) NULL    COMMENT '头像',
  EMAIL VARCHAR(100) NULL    COMMENT '邮件',
  EMAIL_VERIFIED TINYINT NULL    COMMENT '邮件已验证',
  PHONE VARCHAR(50) NULL    COMMENT '电话',
  PHONE_VERIFIED TINYINT NULL    COMMENT '电话已验证',
  BIRTHDAY DATE NULL    COMMENT '生日',
  USER_TYPE INTEGER NOT NULL    COMMENT '用户类型',
  STATUS INTEGER NOT NULL    COMMENT '用户状态',
  ID_TYPE VARCHAR(10) NULL    COMMENT '证件类型',
  ID_NBR VARCHAR(100) NULL    COMMENT '证件号',
  EXPIRE_AT DATETIME NULL    COMMENT '用户过期时间',
  PWD_UPDATE_TIME DATETIME NULL    COMMENT '上次密码更新时间',
  CHANGE_PWD_AT_LOGIN TINYINT NULL    COMMENT '登陆后立刻修改密码',
  REAL_NAME VARCHAR(50) NULL    COMMENT '真实姓名',
  MANAGER_ID VARCHAR(50) NULL    COMMENT '上级',
  WORK_NO VARCHAR(100) NULL    COMMENT '工号',
  POSITION_ID VARCHAR(32) NULL    COMMENT '职务',
  TELEPHONE VARCHAR(50) NULL    COMMENT '座机',
  CLIENT_ID VARCHAR(100) NULL    COMMENT '设备ID',
  DEL_FLAG TINYINT NOT NULL    COMMENT '删除标识',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  TENANT_ID VARCHAR(32) NOT NULL    COMMENT '租户ID',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint UK_NOP_AUTH_USER_NAME unique (USER_NAME),
  constraint PK_nop_auth_user primary key (USER_ID)
);

CREATE TABLE nop_auth_role_data_auth(
  SID VARCHAR(32) NOT NULL    COMMENT '主键',
  ROLE_ID VARCHAR(50) NOT NULL    COMMENT '角色ID',
  BIZ_OBJ VARCHAR(100) NULL    COMMENT '业务对象名',
  PRIORITY INTEGER NOT NULL    COMMENT '优先级',
  FILTER_CONFIG VARCHAR(4000) NOT NULL    COMMENT '业务过滤条件',
  DESCRIPTION VARCHAR(4000) NULL    COMMENT '描述',
  DEL_FLAG TINYINT NULL    COMMENT '删除标识',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_role_data_auth primary key (SID)
);

CREATE TABLE nop_auth_resource(
  RESOURCE_ID VARCHAR(100) NOT NULL    COMMENT '资源ID',
  SITE_ID VARCHAR(100) NOT NULL    COMMENT '站点ID',
  DISPLAY_NAME VARCHAR(100) NOT NULL    COMMENT '显示名称',
  ORDER_NO INTEGER NOT NULL    COMMENT '排序',
  RESOURCE_TYPE VARCHAR(4) NOT NULL    COMMENT '资源类型',
  PARENT_ID VARCHAR(100) NULL    COMMENT '父资源ID',
  ICON VARCHAR(150) NULL    COMMENT '图标',
  ROUTE_PATH VARCHAR(200) NULL    COMMENT '前端路由',
  URL VARCHAR(1000) NULL    COMMENT '链接',
  COMPONENT VARCHAR(200) NULL    COMMENT '组件名',
  TARGET VARCHAR(50) NULL    COMMENT '链接目标',
  HIDDEN TINYINT NOT NULL    COMMENT '是否隐藏',
  KEEP_ALIVE TINYINT NOT NULL    COMMENT '隐藏时保持状态',
  PERMISSIONS VARCHAR(200) NULL    COMMENT '权限标识',
  NO_AUTH TINYINT NOT NULL    COMMENT '不检查权限',
  DEPENDS VARCHAR(1000) NULL    COMMENT '依赖资源',
  IS_LEAF TINYINT NOT NULL    COMMENT '是否叶子节点',
  STATUS INTEGER NOT NULL    COMMENT '状态',
  Meta_CONFIG VARCHAR(1000) NULL    COMMENT '扩展配置',
  PROPS_CONFIG VARCHAR(1000) NULL    COMMENT '组件属性',
  DEL_FLAG TINYINT NOT NULL    COMMENT '删除标识',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_resource primary key (RESOURCE_ID)
);

CREATE TABLE nop_auth_ext_login(
  SID VARCHAR(32) NOT NULL    COMMENT 'ID',
  USER_ID VARCHAR(50) NOT NULL    COMMENT '用户ID',
  LOGIN_TYPE INTEGER NOT NULL    COMMENT '登录类型',
  EXT_ID VARCHAR(50) NOT NULL    COMMENT '登录标识',
  CREDENTIAL VARCHAR(50) NULL    COMMENT '登录密码',
  VERIFIED BOOLEAN NOT NULL    COMMENT '是否已验证',
  LAST_LOGIN_TIME TIMESTAMP NULL    COMMENT '上次登录时间',
  LAST_LOGIN_IP VARCHAR(20) NULL    COMMENT '上次登录IP',
  DEL_FLAG TINYINT NOT NULL    COMMENT '删除标识',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_ext_login primary key (SID)
);

CREATE TABLE nop_auth_user_role(
  USER_ID VARCHAR(32) NOT NULL    COMMENT '用户ID',
  ROLE_ID VARCHAR(50) NOT NULL    COMMENT '角色ID',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_user_role primary key (USER_ID,ROLE_ID)
);

CREATE TABLE nop_auth_user_substitution(
  SID VARCHAR(32) NOT NULL    COMMENT '主键',
  USER_ID VARCHAR(32) NOT NULL    COMMENT '用户ID',
  SUBSTITUTED_USER_ID VARCHAR(32) NOT NULL    COMMENT '被代理的用户ID',
  WORK_SCOPE VARCHAR(50) NOT NULL    COMMENT '工作范围',
  START_TIME DATETIME NULL    COMMENT '开始时间',
  END_TIME DATETIME NULL    COMMENT '结束时间',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_user_substitution primary key (SID)
);

CREATE TABLE nop_auth_session(
  SESSION_ID VARCHAR(100) NOT NULL    COMMENT '会话ID',
  USER_ID VARCHAR(32) NOT NULL    COMMENT '用户ID',
  USER_NAME VARCHAR(100) NOT NULL    COMMENT '用户名',
  TENANT_ID VARCHAR(32) NOT NULL    COMMENT '租户ID',
  LOGIN_ADDR VARCHAR(100) NULL    COMMENT '登录地址',
  LOGIN_DEVICE VARCHAR(100) NULL    COMMENT '登录设备',
  LOGIN_APP VARCHAR(100) NULL    COMMENT '应用程序',
  LOGIN_OS VARCHAR(100) NULL    COMMENT '操作系统',
  LOGIN_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '登录时间',
  LOGIN_TYPE INTEGER NOT NULL    COMMENT '登录方式',
  LOGOUT_TIME TIMESTAMP NULL    COMMENT '退出时间',
  LOGOUT_TYPE INTEGER NOT NULL    COMMENT '退出方式',
  LOGOUT_BY VARCHAR(100) NULL    COMMENT '退出操作人',
  LAST_ACCESS_TIME DATETIME NULL    COMMENT '最后访问时间',
  ACCESS_TOKEN VARCHAR(500) NULL    COMMENT '访问令牌',
  REFRESH_TOKEN VARCHAR(500) NULL    COMMENT '刷新令牌',
  CACHE_DATA VARCHAR(4000) NULL    COMMENT '缓存数据',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_session primary key (SESSION_ID)
);

CREATE TABLE nop_auth_group(
  GROUP_ID VARCHAR(50) NOT NULL    COMMENT '主键',
  NAME VARCHAR(100) NOT NULL    COMMENT '名称',
  PARENT_ID VARCHAR(50) NULL    COMMENT '父ID',
  OWNER_ID VARCHAR(50) NULL    COMMENT '所有者ID',
  DEL_FLAG TINYINT NULL    COMMENT '删除标识',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_group primary key (GROUP_ID)
);

CREATE TABLE nop_auth_role_resource(
  SID VARCHAR(32) NOT NULL    COMMENT '主键',
  ROLE_ID VARCHAR(50) NOT NULL    COMMENT '角色ID',
  RESOURCE_ID VARCHAR(100) NULL    COMMENT '资源ID',
  DEL_FLAG TINYINT NULL    COMMENT '删除标识',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_role_resource primary key (SID)
);

CREATE TABLE nop_auth_op_log(
  LOG_ID VARCHAR(32) NOT NULL    COMMENT '主键',
  USER_NAME VARCHAR(32) NOT NULL    COMMENT '用户名',
  USER_ID VARCHAR(50) NULL    COMMENT '用户ID',
  SESSION_ID VARCHAR(100) NULL    COMMENT '会话ID',
  OPERATION VARCHAR(1000) NULL    COMMENT '业务操作',
  DESCRIPTION VARCHAR(2000) NULL    COMMENT '操作描述',
  ACTION_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '操作时间',
  USED_TIME BIGINT NOT NULL    COMMENT '操作时长',
  RESULT_STATUS INTEGER NOT NULL    COMMENT '操作状态',
  ERROR_CODE VARCHAR(200) NULL    COMMENT '错误码',
  RET_MESSAGE VARCHAR(1000) NULL    COMMENT '返回消息',
  OP_REQUEST VARCHAR(8000) NULL    COMMENT '请求参数',
  OP_RESPONSE VARCHAR(4000) NULL    COMMENT '响应数据',
  constraint PK_nop_auth_op_log primary key (LOG_ID)
);

CREATE TABLE nop_auth_group_dept(
  DEPT_ID VARCHAR(50) NOT NULL    COMMENT '部门ID',
  GROUP_ID VARCHAR(50) NOT NULL    COMMENT '分组ID',
  INCLUDE_CHILD TINYINT NOT NULL    COMMENT '是否包含下级',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_group_dept primary key (DEPT_ID,GROUP_ID)
);

CREATE TABLE nop_auth_group_user(
  USER_ID VARCHAR(50) NOT NULL    COMMENT '用户ID',
  GROUP_ID VARCHAR(50) NOT NULL    COMMENT '分组ID',
  VERSION INTEGER NOT NULL    COMMENT '数据版本',
  CREATED_BY VARCHAR(50) NOT NULL    COMMENT '创建人',
  CREATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '创建时间',
  UPDATED_BY VARCHAR(50) NOT NULL    COMMENT '修改人',
  UPDATE_TIME TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP    COMMENT '修改时间',
  REMARK VARCHAR(200) NULL    COMMENT '备注',
  constraint PK_nop_auth_group_user primary key (USER_ID,GROUP_ID)
);


   ALTER TABLE nop_auth_dept COMMENT '部门';
                
   ALTER TABLE nop_auth_position COMMENT '岗位';
                
   ALTER TABLE nop_auth_role COMMENT '角色';
                
   ALTER TABLE nop_auth_site COMMENT '子站点';
                
   ALTER TABLE nop_auth_tenant COMMENT '租户';
                
   ALTER TABLE nop_auth_user COMMENT '用户';
                
   ALTER TABLE nop_auth_role_data_auth COMMENT '角色数据权限';
                
   ALTER TABLE nop_auth_resource COMMENT '菜单资源';
                
   ALTER TABLE nop_auth_ext_login COMMENT '扩展登录方式';
                
   ALTER TABLE nop_auth_user_role COMMENT '用户角色';
                
   ALTER TABLE nop_auth_user_substitution COMMENT '用户代理';
                
   ALTER TABLE nop_auth_session COMMENT '会话日志';
                
   ALTER TABLE nop_auth_group COMMENT '用户组';
                
   ALTER TABLE nop_auth_role_resource COMMENT '角色可访问资源';
                
   ALTER TABLE nop_auth_op_log COMMENT '操作日志';
                
   ALTER TABLE nop_auth_group_dept COMMENT '分组部门';
                
   ALTER TABLE nop_auth_group_user COMMENT '分组用户';
                
