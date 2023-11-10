
    alter table nop_batch_file add column NOP_TENANT_ID VARCHAR2(32) DEFAULT '0' NOT NULL;

alter table nop_batch_record_result add column NOP_TENANT_ID VARCHAR2(32) DEFAULT '0' NOT NULL;

alter table nop_batch_task add column NOP_TENANT_ID VARCHAR2(32) DEFAULT '0' NOT NULL;

alter table nop_batch_task_state add column NOP_TENANT_ID VARCHAR2(32) DEFAULT '0' NOT NULL;

alter table nop_batch_file drop constraint PK_nop_batch_file;
alter table nop_batch_file add constraint PK_nop_batch_file primary key (NOP_TENANT_ID, SID);

alter table nop_batch_record_result drop constraint PK_nop_batch_record_result;
alter table nop_batch_record_result add constraint PK_nop_batch_record_result primary key (NOP_TENANT_ID, TASK_ID,RECORD_KEY);

alter table nop_batch_task drop constraint PK_nop_batch_task;
alter table nop_batch_task add constraint PK_nop_batch_task primary key (NOP_TENANT_ID, SID);

alter table nop_batch_task_state drop constraint PK_nop_batch_task_state;
alter table nop_batch_task_state add constraint PK_nop_batch_task_state primary key (NOP_TENANT_ID, TASK_ID,FIELD_NAME);


