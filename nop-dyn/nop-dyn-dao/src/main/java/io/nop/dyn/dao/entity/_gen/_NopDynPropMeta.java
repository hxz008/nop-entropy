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

import io.nop.dyn.dao.entity.NopDynPropMeta;

// tell cpd to start ignoring code - CPD-OFF
/**
 *  属性元数据: nop_dyn_prop_meta
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable","java:S3008","java:S1602","java:S1128","java:S1161",
        "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement","java:S116","java:S115","java:S101","java:S3776"})
public class _NopDynPropMeta extends DynamicOrmEntity{
    
    /* 属性定义ID: PROP_META_ID VARCHAR */
    public static final String PROP_NAME_propMetaId = "propMetaId";
    public static final int PROP_ID_propMetaId = 1;
    
    /* 属性名: PROP_NAME VARCHAR */
    public static final String PROP_NAME_propName = "propName";
    public static final int PROP_ID_propName = 2;
    
    /* 显示名: DISPLAY_NAME VARCHAR */
    public static final String PROP_NAME_displayName = "displayName";
    public static final int PROP_ID_displayName = 3;
    
    /* 实体定义ID: ENTITY_META_ID VARCHAR */
    public static final String PROP_NAME_entityMetaId = "entityMetaId";
    public static final int PROP_ID_entityMetaId = 4;
    
    /* 标准SQL数据类型: STD_SQL_TYPE VARCHAR */
    public static final String PROP_NAME_stdSqlType = "stdSqlType";
    public static final int PROP_ID_stdSqlType = 5;
    
    /* 长度: LENGTH INTEGER */
    public static final String PROP_NAME_length = "length";
    public static final int PROP_ID_length = 6;
    
    /* 小数位数: SCALE INTEGER */
    public static final String PROP_NAME_scale = "scale";
    public static final int PROP_ID_scale = 7;
    
    /* 显示控制: UI_SHOW VARCHAR */
    public static final String PROP_NAME_uiShow = "uiShow";
    public static final int PROP_ID_uiShow = 8;
    
    /* 显示控件: UI_CONTROL VARCHAR */
    public static final String PROP_NAME_uiControl = "uiControl";
    public static final int PROP_ID_uiControl = 9;
    
    /* 标准域: STD_DOMAIN VARCHAR */
    public static final String PROP_NAME_stdDomain = "stdDomain";
    public static final int PROP_ID_stdDomain = 10;
    
    /* 数据字典: DICT_NAME VARCHAR */
    public static final String PROP_NAME_dictName = "dictName";
    public static final int PROP_ID_dictName = 11;
    
    /* 动态字段映射: DYN_FIELD_MAPPING VARCHAR */
    public static final String PROP_NAME_dynFieldMapping = "dynFieldMapping";
    public static final int PROP_ID_dynFieldMapping = 12;
    
    /* 标签: TAG_SET VARCHAR */
    public static final String PROP_NAME_tagSet = "tagSet";
    public static final int PROP_ID_tagSet = 13;
    
    /* 关联实体名: REF_ENTITY_NAME VARCHAR */
    public static final String PROP_NAME_refEntityName = "refEntityName";
    public static final int PROP_ID_refEntityName = 14;
    
    /* 关联属性名: REF_PROP_NAME VARCHAR */
    public static final String PROP_NAME_refPropName = "refPropName";
    public static final int PROP_ID_refPropName = 15;
    
    /* 关联属性显示名: REF_PROP_DISPLAY_NAME VARCHAR */
    public static final String PROP_NAME_refPropDisplayName = "refPropDisplayName";
    public static final int PROP_ID_refPropDisplayName = 16;
    
    /* 关联属性标签: REF_TAG_SET VARCHAR */
    public static final String PROP_NAME_refTagSet = "refTagSet";
    public static final int PROP_ID_refTagSet = 17;
    
    /* 状态: STATUS INTEGER */
    public static final String PROP_NAME_status = "status";
    public static final int PROP_ID_status = 18;
    
    /* 数据版本: VERSION INTEGER */
    public static final String PROP_NAME_version = "version";
    public static final int PROP_ID_version = 19;
    
    /* 创建人: CREATED_BY VARCHAR */
    public static final String PROP_NAME_createdBy = "createdBy";
    public static final int PROP_ID_createdBy = 20;
    
    /* 创建时间: CREATE_TIME TIMESTAMP */
    public static final String PROP_NAME_createTime = "createTime";
    public static final int PROP_ID_createTime = 21;
    
    /* 修改人: UPDATED_BY VARCHAR */
    public static final String PROP_NAME_updatedBy = "updatedBy";
    public static final int PROP_ID_updatedBy = 22;
    
    /* 修改时间: UPDATE_TIME TIMESTAMP */
    public static final String PROP_NAME_updateTime = "updateTime";
    public static final int PROP_ID_updateTime = 23;
    
    /* 备注: REMARK VARCHAR */
    public static final String PROP_NAME_remark = "remark";
    public static final int PROP_ID_remark = 24;
    

    private static int _PROP_ID_BOUND = 25;

    
    /* relation: 所属模块 */
    public static final String PROP_NAME_entityMeta = "entityMeta";
    

    protected static final List<String> PK_PROP_NAMES = Arrays.asList(PROP_NAME_propMetaId);
    protected static final int[] PK_PROP_IDS = new int[]{PROP_ID_propMetaId};

    private static final String[] PROP_ID_TO_NAME = new String[25];
    private static final Map<String,Integer> PROP_NAME_TO_ID = new HashMap<>();
    static{
      
          PROP_ID_TO_NAME[PROP_ID_propMetaId] = PROP_NAME_propMetaId;
          PROP_NAME_TO_ID.put(PROP_NAME_propMetaId, PROP_ID_propMetaId);
      
          PROP_ID_TO_NAME[PROP_ID_propName] = PROP_NAME_propName;
          PROP_NAME_TO_ID.put(PROP_NAME_propName, PROP_ID_propName);
      
          PROP_ID_TO_NAME[PROP_ID_displayName] = PROP_NAME_displayName;
          PROP_NAME_TO_ID.put(PROP_NAME_displayName, PROP_ID_displayName);
      
          PROP_ID_TO_NAME[PROP_ID_entityMetaId] = PROP_NAME_entityMetaId;
          PROP_NAME_TO_ID.put(PROP_NAME_entityMetaId, PROP_ID_entityMetaId);
      
          PROP_ID_TO_NAME[PROP_ID_stdSqlType] = PROP_NAME_stdSqlType;
          PROP_NAME_TO_ID.put(PROP_NAME_stdSqlType, PROP_ID_stdSqlType);
      
          PROP_ID_TO_NAME[PROP_ID_length] = PROP_NAME_length;
          PROP_NAME_TO_ID.put(PROP_NAME_length, PROP_ID_length);
      
          PROP_ID_TO_NAME[PROP_ID_scale] = PROP_NAME_scale;
          PROP_NAME_TO_ID.put(PROP_NAME_scale, PROP_ID_scale);
      
          PROP_ID_TO_NAME[PROP_ID_uiShow] = PROP_NAME_uiShow;
          PROP_NAME_TO_ID.put(PROP_NAME_uiShow, PROP_ID_uiShow);
      
          PROP_ID_TO_NAME[PROP_ID_uiControl] = PROP_NAME_uiControl;
          PROP_NAME_TO_ID.put(PROP_NAME_uiControl, PROP_ID_uiControl);
      
          PROP_ID_TO_NAME[PROP_ID_stdDomain] = PROP_NAME_stdDomain;
          PROP_NAME_TO_ID.put(PROP_NAME_stdDomain, PROP_ID_stdDomain);
      
          PROP_ID_TO_NAME[PROP_ID_dictName] = PROP_NAME_dictName;
          PROP_NAME_TO_ID.put(PROP_NAME_dictName, PROP_ID_dictName);
      
          PROP_ID_TO_NAME[PROP_ID_dynFieldMapping] = PROP_NAME_dynFieldMapping;
          PROP_NAME_TO_ID.put(PROP_NAME_dynFieldMapping, PROP_ID_dynFieldMapping);
      
          PROP_ID_TO_NAME[PROP_ID_tagSet] = PROP_NAME_tagSet;
          PROP_NAME_TO_ID.put(PROP_NAME_tagSet, PROP_ID_tagSet);
      
          PROP_ID_TO_NAME[PROP_ID_refEntityName] = PROP_NAME_refEntityName;
          PROP_NAME_TO_ID.put(PROP_NAME_refEntityName, PROP_ID_refEntityName);
      
          PROP_ID_TO_NAME[PROP_ID_refPropName] = PROP_NAME_refPropName;
          PROP_NAME_TO_ID.put(PROP_NAME_refPropName, PROP_ID_refPropName);
      
          PROP_ID_TO_NAME[PROP_ID_refPropDisplayName] = PROP_NAME_refPropDisplayName;
          PROP_NAME_TO_ID.put(PROP_NAME_refPropDisplayName, PROP_ID_refPropDisplayName);
      
          PROP_ID_TO_NAME[PROP_ID_refTagSet] = PROP_NAME_refTagSet;
          PROP_NAME_TO_ID.put(PROP_NAME_refTagSet, PROP_ID_refTagSet);
      
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

    
    /* 属性定义ID: PROP_META_ID */
    private java.lang.String _propMetaId;
    
    /* 属性名: PROP_NAME */
    private java.lang.String _propName;
    
    /* 显示名: DISPLAY_NAME */
    private java.lang.String _displayName;
    
    /* 实体定义ID: ENTITY_META_ID */
    private java.lang.String _entityMetaId;
    
    /* 标准SQL数据类型: STD_SQL_TYPE */
    private java.lang.String _stdSqlType;
    
    /* 长度: LENGTH */
    private java.lang.Integer _length;
    
    /* 小数位数: SCALE */
    private java.lang.Integer _scale;
    
    /* 显示控制: UI_SHOW */
    private java.lang.String _uiShow;
    
    /* 显示控件: UI_CONTROL */
    private java.lang.String _uiControl;
    
    /* 标准域: STD_DOMAIN */
    private java.lang.String _stdDomain;
    
    /* 数据字典: DICT_NAME */
    private java.lang.String _dictName;
    
    /* 动态字段映射: DYN_FIELD_MAPPING */
    private java.lang.String _dynFieldMapping;
    
    /* 标签: TAG_SET */
    private java.lang.String _tagSet;
    
    /* 关联实体名: REF_ENTITY_NAME */
    private java.lang.String _refEntityName;
    
    /* 关联属性名: REF_PROP_NAME */
    private java.lang.String _refPropName;
    
    /* 关联属性显示名: REF_PROP_DISPLAY_NAME */
    private java.lang.String _refPropDisplayName;
    
    /* 关联属性标签: REF_TAG_SET */
    private java.lang.String _refTagSet;
    
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
    

    public _NopDynPropMeta(){
        // for debug
    }

    protected NopDynPropMeta newInstance(){
       return new NopDynPropMeta();
    }

    @Override
    public NopDynPropMeta cloneInstance() {
        NopDynPropMeta entity = newInstance();
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
      return "io.nop.dyn.dao.entity.NopDynPropMeta";
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
    
        return buildSimpleId(PROP_ID_propMetaId);
     
    }

    @Override
    public boolean orm_isPrimary(int propId) {
        
            return propId == PROP_ID_propMetaId;
          
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
        
            case PROP_ID_propMetaId:
               return getPropMetaId();
        
            case PROP_ID_propName:
               return getPropName();
        
            case PROP_ID_displayName:
               return getDisplayName();
        
            case PROP_ID_entityMetaId:
               return getEntityMetaId();
        
            case PROP_ID_stdSqlType:
               return getStdSqlType();
        
            case PROP_ID_length:
               return getLength();
        
            case PROP_ID_scale:
               return getScale();
        
            case PROP_ID_uiShow:
               return getUiShow();
        
            case PROP_ID_uiControl:
               return getUiControl();
        
            case PROP_ID_stdDomain:
               return getStdDomain();
        
            case PROP_ID_dictName:
               return getDictName();
        
            case PROP_ID_dynFieldMapping:
               return getDynFieldMapping();
        
            case PROP_ID_tagSet:
               return getTagSet();
        
            case PROP_ID_refEntityName:
               return getRefEntityName();
        
            case PROP_ID_refPropName:
               return getRefPropName();
        
            case PROP_ID_refPropDisplayName:
               return getRefPropDisplayName();
        
            case PROP_ID_refTagSet:
               return getRefTagSet();
        
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
        
            case PROP_ID_propMetaId:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_propMetaId));
               }
               setPropMetaId(typedValue);
               break;
            }
        
            case PROP_ID_propName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_propName));
               }
               setPropName(typedValue);
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
        
            case PROP_ID_entityMetaId:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_entityMetaId));
               }
               setEntityMetaId(typedValue);
               break;
            }
        
            case PROP_ID_stdSqlType:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_stdSqlType));
               }
               setStdSqlType(typedValue);
               break;
            }
        
            case PROP_ID_length:{
               java.lang.Integer typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toInteger(value,
                       err-> newTypeConversionError(PROP_NAME_length));
               }
               setLength(typedValue);
               break;
            }
        
            case PROP_ID_scale:{
               java.lang.Integer typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toInteger(value,
                       err-> newTypeConversionError(PROP_NAME_scale));
               }
               setScale(typedValue);
               break;
            }
        
            case PROP_ID_uiShow:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_uiShow));
               }
               setUiShow(typedValue);
               break;
            }
        
            case PROP_ID_uiControl:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_uiControl));
               }
               setUiControl(typedValue);
               break;
            }
        
            case PROP_ID_stdDomain:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_stdDomain));
               }
               setStdDomain(typedValue);
               break;
            }
        
            case PROP_ID_dictName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_dictName));
               }
               setDictName(typedValue);
               break;
            }
        
            case PROP_ID_dynFieldMapping:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_dynFieldMapping));
               }
               setDynFieldMapping(typedValue);
               break;
            }
        
            case PROP_ID_tagSet:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_tagSet));
               }
               setTagSet(typedValue);
               break;
            }
        
            case PROP_ID_refEntityName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_refEntityName));
               }
               setRefEntityName(typedValue);
               break;
            }
        
            case PROP_ID_refPropName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_refPropName));
               }
               setRefPropName(typedValue);
               break;
            }
        
            case PROP_ID_refPropDisplayName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_refPropDisplayName));
               }
               setRefPropDisplayName(typedValue);
               break;
            }
        
            case PROP_ID_refTagSet:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_refTagSet));
               }
               setRefTagSet(typedValue);
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
        
            case PROP_ID_propMetaId:{
               onInitProp(propId);
               this._propMetaId = (java.lang.String)value;
               orm_id(); // 如果是设置主键字段，则触发watcher
               break;
            }
        
            case PROP_ID_propName:{
               onInitProp(propId);
               this._propName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_displayName:{
               onInitProp(propId);
               this._displayName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_entityMetaId:{
               onInitProp(propId);
               this._entityMetaId = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_stdSqlType:{
               onInitProp(propId);
               this._stdSqlType = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_length:{
               onInitProp(propId);
               this._length = (java.lang.Integer)value;
               
               break;
            }
        
            case PROP_ID_scale:{
               onInitProp(propId);
               this._scale = (java.lang.Integer)value;
               
               break;
            }
        
            case PROP_ID_uiShow:{
               onInitProp(propId);
               this._uiShow = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_uiControl:{
               onInitProp(propId);
               this._uiControl = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_stdDomain:{
               onInitProp(propId);
               this._stdDomain = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_dictName:{
               onInitProp(propId);
               this._dictName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_dynFieldMapping:{
               onInitProp(propId);
               this._dynFieldMapping = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_tagSet:{
               onInitProp(propId);
               this._tagSet = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_refEntityName:{
               onInitProp(propId);
               this._refEntityName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_refPropName:{
               onInitProp(propId);
               this._refPropName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_refPropDisplayName:{
               onInitProp(propId);
               this._refPropDisplayName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_refTagSet:{
               onInitProp(propId);
               this._refTagSet = (java.lang.String)value;
               
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
     * 属性定义ID: PROP_META_ID
     */
    public java.lang.String getPropMetaId(){
         onPropGet(PROP_ID_propMetaId);
         return _propMetaId;
    }

    /**
     * 属性定义ID: PROP_META_ID
     */
    public void setPropMetaId(java.lang.String value){
        if(onPropSet(PROP_ID_propMetaId,value)){
            this._propMetaId = value;
            internalClearRefs(PROP_ID_propMetaId);
            orm_id();
        }
    }
    
    /**
     * 属性名: PROP_NAME
     */
    public java.lang.String getPropName(){
         onPropGet(PROP_ID_propName);
         return _propName;
    }

    /**
     * 属性名: PROP_NAME
     */
    public void setPropName(java.lang.String value){
        if(onPropSet(PROP_ID_propName,value)){
            this._propName = value;
            internalClearRefs(PROP_ID_propName);
            
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
            
        }
    }
    
    /**
     * 标准SQL数据类型: STD_SQL_TYPE
     */
    public java.lang.String getStdSqlType(){
         onPropGet(PROP_ID_stdSqlType);
         return _stdSqlType;
    }

    /**
     * 标准SQL数据类型: STD_SQL_TYPE
     */
    public void setStdSqlType(java.lang.String value){
        if(onPropSet(PROP_ID_stdSqlType,value)){
            this._stdSqlType = value;
            internalClearRefs(PROP_ID_stdSqlType);
            
        }
    }
    
    /**
     * 长度: LENGTH
     */
    public java.lang.Integer getLength(){
         onPropGet(PROP_ID_length);
         return _length;
    }

    /**
     * 长度: LENGTH
     */
    public void setLength(java.lang.Integer value){
        if(onPropSet(PROP_ID_length,value)){
            this._length = value;
            internalClearRefs(PROP_ID_length);
            
        }
    }
    
    /**
     * 小数位数: SCALE
     */
    public java.lang.Integer getScale(){
         onPropGet(PROP_ID_scale);
         return _scale;
    }

    /**
     * 小数位数: SCALE
     */
    public void setScale(java.lang.Integer value){
        if(onPropSet(PROP_ID_scale,value)){
            this._scale = value;
            internalClearRefs(PROP_ID_scale);
            
        }
    }
    
    /**
     * 显示控制: UI_SHOW
     */
    public java.lang.String getUiShow(){
         onPropGet(PROP_ID_uiShow);
         return _uiShow;
    }

    /**
     * 显示控制: UI_SHOW
     */
    public void setUiShow(java.lang.String value){
        if(onPropSet(PROP_ID_uiShow,value)){
            this._uiShow = value;
            internalClearRefs(PROP_ID_uiShow);
            
        }
    }
    
    /**
     * 显示控件: UI_CONTROL
     */
    public java.lang.String getUiControl(){
         onPropGet(PROP_ID_uiControl);
         return _uiControl;
    }

    /**
     * 显示控件: UI_CONTROL
     */
    public void setUiControl(java.lang.String value){
        if(onPropSet(PROP_ID_uiControl,value)){
            this._uiControl = value;
            internalClearRefs(PROP_ID_uiControl);
            
        }
    }
    
    /**
     * 标准域: STD_DOMAIN
     */
    public java.lang.String getStdDomain(){
         onPropGet(PROP_ID_stdDomain);
         return _stdDomain;
    }

    /**
     * 标准域: STD_DOMAIN
     */
    public void setStdDomain(java.lang.String value){
        if(onPropSet(PROP_ID_stdDomain,value)){
            this._stdDomain = value;
            internalClearRefs(PROP_ID_stdDomain);
            
        }
    }
    
    /**
     * 数据字典: DICT_NAME
     */
    public java.lang.String getDictName(){
         onPropGet(PROP_ID_dictName);
         return _dictName;
    }

    /**
     * 数据字典: DICT_NAME
     */
    public void setDictName(java.lang.String value){
        if(onPropSet(PROP_ID_dictName,value)){
            this._dictName = value;
            internalClearRefs(PROP_ID_dictName);
            
        }
    }
    
    /**
     * 动态字段映射: DYN_FIELD_MAPPING
     */
    public java.lang.String getDynFieldMapping(){
         onPropGet(PROP_ID_dynFieldMapping);
         return _dynFieldMapping;
    }

    /**
     * 动态字段映射: DYN_FIELD_MAPPING
     */
    public void setDynFieldMapping(java.lang.String value){
        if(onPropSet(PROP_ID_dynFieldMapping,value)){
            this._dynFieldMapping = value;
            internalClearRefs(PROP_ID_dynFieldMapping);
            
        }
    }
    
    /**
     * 标签: TAG_SET
     */
    public java.lang.String getTagSet(){
         onPropGet(PROP_ID_tagSet);
         return _tagSet;
    }

    /**
     * 标签: TAG_SET
     */
    public void setTagSet(java.lang.String value){
        if(onPropSet(PROP_ID_tagSet,value)){
            this._tagSet = value;
            internalClearRefs(PROP_ID_tagSet);
            
        }
    }
    
    /**
     * 关联实体名: REF_ENTITY_NAME
     */
    public java.lang.String getRefEntityName(){
         onPropGet(PROP_ID_refEntityName);
         return _refEntityName;
    }

    /**
     * 关联实体名: REF_ENTITY_NAME
     */
    public void setRefEntityName(java.lang.String value){
        if(onPropSet(PROP_ID_refEntityName,value)){
            this._refEntityName = value;
            internalClearRefs(PROP_ID_refEntityName);
            
        }
    }
    
    /**
     * 关联属性名: REF_PROP_NAME
     */
    public java.lang.String getRefPropName(){
         onPropGet(PROP_ID_refPropName);
         return _refPropName;
    }

    /**
     * 关联属性名: REF_PROP_NAME
     */
    public void setRefPropName(java.lang.String value){
        if(onPropSet(PROP_ID_refPropName,value)){
            this._refPropName = value;
            internalClearRefs(PROP_ID_refPropName);
            
        }
    }
    
    /**
     * 关联属性显示名: REF_PROP_DISPLAY_NAME
     */
    public java.lang.String getRefPropDisplayName(){
         onPropGet(PROP_ID_refPropDisplayName);
         return _refPropDisplayName;
    }

    /**
     * 关联属性显示名: REF_PROP_DISPLAY_NAME
     */
    public void setRefPropDisplayName(java.lang.String value){
        if(onPropSet(PROP_ID_refPropDisplayName,value)){
            this._refPropDisplayName = value;
            internalClearRefs(PROP_ID_refPropDisplayName);
            
        }
    }
    
    /**
     * 关联属性标签: REF_TAG_SET
     */
    public java.lang.String getRefTagSet(){
         onPropGet(PROP_ID_refTagSet);
         return _refTagSet;
    }

    /**
     * 关联属性标签: REF_TAG_SET
     */
    public void setRefTagSet(java.lang.String value){
        if(onPropSet(PROP_ID_refTagSet,value)){
            this._refTagSet = value;
            internalClearRefs(PROP_ID_refTagSet);
            
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
    public io.nop.dyn.dao.entity.NopDynEntityMeta getEntityMeta(){
       return (io.nop.dyn.dao.entity.NopDynEntityMeta)internalGetRefEntity(PROP_NAME_entityMeta);
    }

    public void setEntityMeta(io.nop.dyn.dao.entity.NopDynEntityMeta refEntity){
       if(refEntity == null){
         
         this.setEntityMetaId(null);
         
       }else{
          internalSetRefEntity(PROP_NAME_entityMeta, refEntity,()->{
             
                    this.setEntityMetaId(refEntity.getEntityMetaId());
                 
          });
       }
    }
       
}
// resume CPD analysis - CPD-ON
