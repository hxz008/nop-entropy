package io.nop.dyn.dao.entity._gen;

import io.nop.orm.model.IEntityModel;
import io.nop.orm.support.DynamicOrmEntity;
import io.nop.orm.support.OrmEntitySet; //NOPMD - suppressed UnusedImports - Auto Gen Code
import io.nop.orm.IOrmEntitySet; //NOPMD - suppressed UnusedImports - Auto Gen Code
import io.nop.api.core.convert.ConvertHelper;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

import io.nop.dyn.dao.entity.NopDynEntityMeta;

// tell cpd to start ignoring code - CPD-OFF
/**
 *  实体元数据: nop_dyn_entity_meta
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable","java:S3008","java:S1602","java:S1128","java:S1161",
        "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement","java:S116","java:S115","java:S101","java:S3776"})
public class _NopDynEntityMeta extends DynamicOrmEntity{
    
    /* 实体定义ID: ENTITY_META_ID VARCHAR */
    public static final String PROP_NAME_entityMetaId = "entityMetaId";
    public static final int PROP_ID_entityMetaId = 1;
    
    /* 模块ID: MODULE_ID VARCHAR */
    public static final String PROP_NAME_moduleId = "moduleId";
    public static final int PROP_ID_moduleId = 2;
    
    /* 实体名: ENTITY_NAME VARCHAR */
    public static final String PROP_NAME_entityName = "entityName";
    public static final int PROP_ID_entityName = 3;
    
    /* 显示名: DISPLAY_NAME VARCHAR */
    public static final String PROP_NAME_displayName = "displayName";
    public static final int PROP_ID_displayName = 4;
    
    /* 存储类型: STORE_TYPE INTEGER */
    public static final String PROP_NAME_storeType = "storeType";
    public static final int PROP_ID_storeType = 5;
    
    /* 元数据内容: META_CONTENT VARCHAR */
    public static final String PROP_NAME_metaContent = "metaContent";
    public static final int PROP_ID_metaContent = 6;
    
    /* 状态: STATUS INTEGER */
    public static final String PROP_NAME_status = "status";
    public static final int PROP_ID_status = 7;
    
    /* 数据版本: VERSION INTEGER */
    public static final String PROP_NAME_version = "version";
    public static final int PROP_ID_version = 10;
    
    /* 创建人: CREATED_BY VARCHAR */
    public static final String PROP_NAME_createdBy = "createdBy";
    public static final int PROP_ID_createdBy = 11;
    
    /* 创建时间: CREATE_TIME TIMESTAMP */
    public static final String PROP_NAME_createTime = "createTime";
    public static final int PROP_ID_createTime = 12;
    
    /* 修改人: UPDATED_BY VARCHAR */
    public static final String PROP_NAME_updatedBy = "updatedBy";
    public static final int PROP_ID_updatedBy = 13;
    
    /* 修改时间: UPDATE_TIME TIMESTAMP */
    public static final String PROP_NAME_updateTime = "updateTime";
    public static final int PROP_ID_updateTime = 14;
    
    /* 备注: REMARK VARCHAR */
    public static final String PROP_NAME_remark = "remark";
    public static final int PROP_ID_remark = 15;
    

    private static int _PROP_ID_BOUND = 16;

    
    /* relation: 所属模块 */
    public static final String PROP_NAME_module = "module";
    
    /* relation:  */
    public static final String PROP_NAME_propMetas = "propMetas";
    
    /* component:  */
    public static final String PROP_NAME_metaContentComponent = "metaContentComponent";
    

    protected static final List<String> PK_PROP_NAMES = Arrays.asList(PROP_NAME_entityMetaId);
    protected static final int[] PK_PROP_IDS = new int[]{PROP_ID_entityMetaId};

    private static final String[] PROP_ID_TO_NAME = new String[16];
    private static final Map<String,Integer> PROP_NAME_TO_ID = new HashMap<>();
    static{
      
          PROP_ID_TO_NAME[PROP_ID_entityMetaId] = PROP_NAME_entityMetaId;
          PROP_NAME_TO_ID.put(PROP_NAME_entityMetaId, PROP_ID_entityMetaId);
      
          PROP_ID_TO_NAME[PROP_ID_moduleId] = PROP_NAME_moduleId;
          PROP_NAME_TO_ID.put(PROP_NAME_moduleId, PROP_ID_moduleId);
      
          PROP_ID_TO_NAME[PROP_ID_entityName] = PROP_NAME_entityName;
          PROP_NAME_TO_ID.put(PROP_NAME_entityName, PROP_ID_entityName);
      
          PROP_ID_TO_NAME[PROP_ID_displayName] = PROP_NAME_displayName;
          PROP_NAME_TO_ID.put(PROP_NAME_displayName, PROP_ID_displayName);
      
          PROP_ID_TO_NAME[PROP_ID_storeType] = PROP_NAME_storeType;
          PROP_NAME_TO_ID.put(PROP_NAME_storeType, PROP_ID_storeType);
      
          PROP_ID_TO_NAME[PROP_ID_metaContent] = PROP_NAME_metaContent;
          PROP_NAME_TO_ID.put(PROP_NAME_metaContent, PROP_ID_metaContent);
      
          PROP_ID_TO_NAME[PROP_ID_status] = PROP_NAME_status;
          PROP_NAME_TO_ID.put(PROP_NAME_status, PROP_ID_status);
      
          PROP_ID_TO_NAME[PROP_ID_version] = PROP_NAME_version;
          PROP_NAME_TO_ID.put(PROP_NAME_version, PROP_ID_version);
      
          PROP_ID_TO_NAME[PROP_ID_createdBy] = PROP_NAME_createdBy;
          PROP_NAME_TO_ID.put(PROP_NAME_createdBy, PROP_ID_createdBy);
      
          PROP_ID_TO_NAME[PROP_ID_createTime] = PROP_NAME_createTime;
          PROP_NAME_TO_ID.put(PROP_NAME_createTime, PROP_ID_createTime);
      
          PROP_ID_TO_NAME[PROP_ID_updatedBy] = PROP_NAME_updatedBy;
          PROP_NAME_TO_ID.put(PROP_NAME_updatedBy, PROP_ID_updatedBy);
      
          PROP_ID_TO_NAME[PROP_ID_updateTime] = PROP_NAME_updateTime;
          PROP_NAME_TO_ID.put(PROP_NAME_updateTime, PROP_ID_updateTime);
      
          PROP_ID_TO_NAME[PROP_ID_remark] = PROP_NAME_remark;
          PROP_NAME_TO_ID.put(PROP_NAME_remark, PROP_ID_remark);
      
    }

    
    /* 实体定义ID: ENTITY_META_ID */
    private java.lang.String _entityMetaId;
    
    /* 模块ID: MODULE_ID */
    private java.lang.String _moduleId;
    
    /* 实体名: ENTITY_NAME */
    private java.lang.String _entityName;
    
    /* 显示名: DISPLAY_NAME */
    private java.lang.String _displayName;
    
    /* 存储类型: STORE_TYPE */
    private java.lang.Integer _storeType;
    
    /* 元数据内容: META_CONTENT */
    private java.lang.String _metaContent;
    
    /* 状态: STATUS */
    private java.lang.Integer _status;
    
    /* 数据版本: VERSION */
    private java.lang.Integer _version;
    
    /* 创建人: CREATED_BY */
    private java.lang.String _createdBy;
    
    /* 创建时间: CREATE_TIME */
    private java.sql.Timestamp _createTime;
    
    /* 修改人: UPDATED_BY */
    private java.lang.String _updatedBy;
    
    /* 修改时间: UPDATE_TIME */
    private java.sql.Timestamp _updateTime;
    
    /* 备注: REMARK */
    private java.lang.String _remark;
    

    public _NopDynEntityMeta(){
        // for debug
    }

    protected NopDynEntityMeta newInstance(){
       return new NopDynEntityMeta();
    }

    @Override
    public NopDynEntityMeta cloneInstance() {
        NopDynEntityMeta entity = newInstance();
        orm_forEachInitedProp((value, propId) -> {
            entity.onInitProp(propId);
        });
        return entity;
    }

    @Override
    public String orm_entityName() {
      // 如果存在实体模型对象，则以模型对象上的设置为准
      IEntityModel entityModel = orm_entityModel();
      if(entityModel != null)
          return entityModel.getName();
      return "io.nop.dyn.dao.entity.NopDynEntityMeta";
    }

    @Override
    public int orm_propIdBound(){
      IEntityModel entityModel = orm_entityModel();
      if(entityModel != null)
          return entityModel.getPropIdBound();
      return _PROP_ID_BOUND;
    }

    @Override
    public Object orm_id() {
    
        return buildSimpleId(PROP_ID_entityMetaId);
     
    }

    @Override
    public boolean orm_isPrimary(int propId) {
        
            return propId == PROP_ID_entityMetaId;
          
    }

    @Override
    public String orm_propName(int propId) {
        if(propId >= PROP_ID_TO_NAME.length)
            return super.orm_propName(propId);
        String propName = PROP_ID_TO_NAME[propId];
        if(propName == null)
           return super.orm_propName(propId);
        return propName;
    }

    @Override
    public int orm_propId(String propName) {
        Integer propId = PROP_NAME_TO_ID.get(propName);
        if(propId == null)
            return super.orm_propId(propName);
        return propId;
    }

    @Override
    public Object orm_propValue(int propId) {
        switch(propId){
        
            case PROP_ID_entityMetaId:
               return getEntityMetaId();
        
            case PROP_ID_moduleId:
               return getModuleId();
        
            case PROP_ID_entityName:
               return getEntityName();
        
            case PROP_ID_displayName:
               return getDisplayName();
        
            case PROP_ID_storeType:
               return getStoreType();
        
            case PROP_ID_metaContent:
               return getMetaContent();
        
            case PROP_ID_status:
               return getStatus();
        
            case PROP_ID_version:
               return getVersion();
        
            case PROP_ID_createdBy:
               return getCreatedBy();
        
            case PROP_ID_createTime:
               return getCreateTime();
        
            case PROP_ID_updatedBy:
               return getUpdatedBy();
        
            case PROP_ID_updateTime:
               return getUpdateTime();
        
            case PROP_ID_remark:
               return getRemark();
        
           default:
              return super.orm_propValue(propId);
        }
    }

    

    @Override
    public void orm_propValue(int propId, Object value){
        switch(propId){
        
            case PROP_ID_entityMetaId:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_entityMetaId));
               }
               setEntityMetaId(typedValue);
               break;
            }
        
            case PROP_ID_moduleId:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_moduleId));
               }
               setModuleId(typedValue);
               break;
            }
        
            case PROP_ID_entityName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_entityName));
               }
               setEntityName(typedValue);
               break;
            }
        
            case PROP_ID_displayName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_displayName));
               }
               setDisplayName(typedValue);
               break;
            }
        
            case PROP_ID_storeType:{
               java.lang.Integer typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toInteger(value,
                       err-> newTypeConversionError(PROP_NAME_storeType));
               }
               setStoreType(typedValue);
               break;
            }
        
            case PROP_ID_metaContent:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_metaContent));
               }
               setMetaContent(typedValue);
               break;
            }
        
            case PROP_ID_status:{
               java.lang.Integer typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toInteger(value,
                       err-> newTypeConversionError(PROP_NAME_status));
               }
               setStatus(typedValue);
               break;
            }
        
            case PROP_ID_version:{
               java.lang.Integer typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toInteger(value,
                       err-> newTypeConversionError(PROP_NAME_version));
               }
               setVersion(typedValue);
               break;
            }
        
            case PROP_ID_createdBy:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_createdBy));
               }
               setCreatedBy(typedValue);
               break;
            }
        
            case PROP_ID_createTime:{
               java.sql.Timestamp typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toTimestamp(value,
                       err-> newTypeConversionError(PROP_NAME_createTime));
               }
               setCreateTime(typedValue);
               break;
            }
        
            case PROP_ID_updatedBy:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_updatedBy));
               }
               setUpdatedBy(typedValue);
               break;
            }
        
            case PROP_ID_updateTime:{
               java.sql.Timestamp typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toTimestamp(value,
                       err-> newTypeConversionError(PROP_NAME_updateTime));
               }
               setUpdateTime(typedValue);
               break;
            }
        
            case PROP_ID_remark:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_remark));
               }
               setRemark(typedValue);
               break;
            }
        
           default:
              super.orm_propValue(propId,value);
        }
    }

    @Override
    public void orm_internalSet(int propId, Object value) {
        switch(propId){
        
            case PROP_ID_entityMetaId:{
               onInitProp(propId);
               this._entityMetaId = (java.lang.String)value;
               orm_id(); // 如果是设置主键字段，则触发watcher
               break;
            }
        
            case PROP_ID_moduleId:{
               onInitProp(propId);
               this._moduleId = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_entityName:{
               onInitProp(propId);
               this._entityName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_displayName:{
               onInitProp(propId);
               this._displayName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_storeType:{
               onInitProp(propId);
               this._storeType = (java.lang.Integer)value;
               
               break;
            }
        
            case PROP_ID_metaContent:{
               onInitProp(propId);
               this._metaContent = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_status:{
               onInitProp(propId);
               this._status = (java.lang.Integer)value;
               
               break;
            }
        
            case PROP_ID_version:{
               onInitProp(propId);
               this._version = (java.lang.Integer)value;
               
               break;
            }
        
            case PROP_ID_createdBy:{
               onInitProp(propId);
               this._createdBy = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_createTime:{
               onInitProp(propId);
               this._createTime = (java.sql.Timestamp)value;
               
               break;
            }
        
            case PROP_ID_updatedBy:{
               onInitProp(propId);
               this._updatedBy = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_updateTime:{
               onInitProp(propId);
               this._updateTime = (java.sql.Timestamp)value;
               
               break;
            }
        
            case PROP_ID_remark:{
               onInitProp(propId);
               this._remark = (java.lang.String)value;
               
               break;
            }
        
           default:
              super.orm_internalSet(propId,value);
        }
    }

    
    /**
     * 实体定义ID: ENTITY_META_ID
     */
    public java.lang.String getEntityMetaId(){
         onPropGet(PROP_ID_entityMetaId);
         return _entityMetaId;
    }

    /**
     * 实体定义ID: ENTITY_META_ID
     */
    public void setEntityMetaId(java.lang.String value){
        if(onPropSet(PROP_ID_entityMetaId,value)){
            this._entityMetaId = value;
            internalClearRefs(PROP_ID_entityMetaId);
            orm_id();
        }
    }
    
    /**
     * 模块ID: MODULE_ID
     */
    public java.lang.String getModuleId(){
         onPropGet(PROP_ID_moduleId);
         return _moduleId;
    }

    /**
     * 模块ID: MODULE_ID
     */
    public void setModuleId(java.lang.String value){
        if(onPropSet(PROP_ID_moduleId,value)){
            this._moduleId = value;
            internalClearRefs(PROP_ID_moduleId);
            
        }
    }
    
    /**
     * 实体名: ENTITY_NAME
     */
    public java.lang.String getEntityName(){
         onPropGet(PROP_ID_entityName);
         return _entityName;
    }

    /**
     * 实体名: ENTITY_NAME
     */
    public void setEntityName(java.lang.String value){
        if(onPropSet(PROP_ID_entityName,value)){
            this._entityName = value;
            internalClearRefs(PROP_ID_entityName);
            
        }
    }
    
    /**
     * 显示名: DISPLAY_NAME
     */
    public java.lang.String getDisplayName(){
         onPropGet(PROP_ID_displayName);
         return _displayName;
    }

    /**
     * 显示名: DISPLAY_NAME
     */
    public void setDisplayName(java.lang.String value){
        if(onPropSet(PROP_ID_displayName,value)){
            this._displayName = value;
            internalClearRefs(PROP_ID_displayName);
            
        }
    }
    
    /**
     * 存储类型: STORE_TYPE
     */
    public java.lang.Integer getStoreType(){
         onPropGet(PROP_ID_storeType);
         return _storeType;
    }

    /**
     * 存储类型: STORE_TYPE
     */
    public void setStoreType(java.lang.Integer value){
        if(onPropSet(PROP_ID_storeType,value)){
            this._storeType = value;
            internalClearRefs(PROP_ID_storeType);
            
        }
    }
    
    /**
     * 元数据内容: META_CONTENT
     */
    public java.lang.String getMetaContent(){
         onPropGet(PROP_ID_metaContent);
         return _metaContent;
    }

    /**
     * 元数据内容: META_CONTENT
     */
    public void setMetaContent(java.lang.String value){
        if(onPropSet(PROP_ID_metaContent,value)){
            this._metaContent = value;
            internalClearRefs(PROP_ID_metaContent);
            
        }
    }
    
    /**
     * 状态: STATUS
     */
    public java.lang.Integer getStatus(){
         onPropGet(PROP_ID_status);
         return _status;
    }

    /**
     * 状态: STATUS
     */
    public void setStatus(java.lang.Integer value){
        if(onPropSet(PROP_ID_status,value)){
            this._status = value;
            internalClearRefs(PROP_ID_status);
            
        }
    }
    
    /**
     * 数据版本: VERSION
     */
    public java.lang.Integer getVersion(){
         onPropGet(PROP_ID_version);
         return _version;
    }

    /**
     * 数据版本: VERSION
     */
    public void setVersion(java.lang.Integer value){
        if(onPropSet(PROP_ID_version,value)){
            this._version = value;
            internalClearRefs(PROP_ID_version);
            
        }
    }
    
    /**
     * 创建人: CREATED_BY
     */
    public java.lang.String getCreatedBy(){
         onPropGet(PROP_ID_createdBy);
         return _createdBy;
    }

    /**
     * 创建人: CREATED_BY
     */
    public void setCreatedBy(java.lang.String value){
        if(onPropSet(PROP_ID_createdBy,value)){
            this._createdBy = value;
            internalClearRefs(PROP_ID_createdBy);
            
        }
    }
    
    /**
     * 创建时间: CREATE_TIME
     */
    public java.sql.Timestamp getCreateTime(){
         onPropGet(PROP_ID_createTime);
         return _createTime;
    }

    /**
     * 创建时间: CREATE_TIME
     */
    public void setCreateTime(java.sql.Timestamp value){
        if(onPropSet(PROP_ID_createTime,value)){
            this._createTime = value;
            internalClearRefs(PROP_ID_createTime);
            
        }
    }
    
    /**
     * 修改人: UPDATED_BY
     */
    public java.lang.String getUpdatedBy(){
         onPropGet(PROP_ID_updatedBy);
         return _updatedBy;
    }

    /**
     * 修改人: UPDATED_BY
     */
    public void setUpdatedBy(java.lang.String value){
        if(onPropSet(PROP_ID_updatedBy,value)){
            this._updatedBy = value;
            internalClearRefs(PROP_ID_updatedBy);
            
        }
    }
    
    /**
     * 修改时间: UPDATE_TIME
     */
    public java.sql.Timestamp getUpdateTime(){
         onPropGet(PROP_ID_updateTime);
         return _updateTime;
    }

    /**
     * 修改时间: UPDATE_TIME
     */
    public void setUpdateTime(java.sql.Timestamp value){
        if(onPropSet(PROP_ID_updateTime,value)){
            this._updateTime = value;
            internalClearRefs(PROP_ID_updateTime);
            
        }
    }
    
    /**
     * 备注: REMARK
     */
    public java.lang.String getRemark(){
         onPropGet(PROP_ID_remark);
         return _remark;
    }

    /**
     * 备注: REMARK
     */
    public void setRemark(java.lang.String value){
        if(onPropSet(PROP_ID_remark,value)){
            this._remark = value;
            internalClearRefs(PROP_ID_remark);
            
        }
    }
    
    /**
     * 所属模块
     */
    public io.nop.dyn.dao.entity.NopDynModule getModule(){
       return (io.nop.dyn.dao.entity.NopDynModule)internalGetRefEntity(PROP_NAME_module);
    }

    public void setModule(io.nop.dyn.dao.entity.NopDynModule refEntity){
       if(refEntity == null){
         
         this.setModuleId(null);
         
       }else{
          internalSetRefEntity(PROP_NAME_module, refEntity,()->{
             
                    this.setModuleId(refEntity.getModuleId());
                 
          });
       }
    }
       
    private final OrmEntitySet<io.nop.dyn.dao.entity.NopDynPropMeta> _propMetas = new OrmEntitySet<>(this, PROP_NAME_propMetas,
        io.nop.dyn.dao.entity.NopDynPropMeta.PROP_NAME_entityMeta, null,io.nop.dyn.dao.entity.NopDynPropMeta.class);

    /**
     * 。 refPropName: entityMeta, keyProp: {rel.keyProp}
     */
    public IOrmEntitySet<io.nop.dyn.dao.entity.NopDynPropMeta> getPropMetas(){
       return _propMetas;
    }
       
   private io.nop.orm.component.JsonOrmComponent _metaContentComponent;

   private static Map<String,Integer> COMPONENT_PROP_ID_MAP_metaContentComponent = new HashMap<>();
   static{
      
         COMPONENT_PROP_ID_MAP_metaContentComponent.put(io.nop.orm.component.JsonOrmComponent.PROP_NAME__jsonText,PROP_ID_metaContent);
      
   }

   public io.nop.orm.component.JsonOrmComponent getMetaContentComponent(){
      if(_metaContentComponent == null){
          _metaContentComponent = new io.nop.orm.component.JsonOrmComponent();
          _metaContentComponent.bindToEntity(this, COMPONENT_PROP_ID_MAP_metaContentComponent);
      }
      return _metaContentComponent;
   }

}
// resume CPD analysis - CPD-ON
