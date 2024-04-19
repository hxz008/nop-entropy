package io.nop.batch.dsl.model._gen;

import io.nop.commons.collections.KeyedList; //NOPMD NOSONAR - suppressed UnusedImports - Used for List Prop
import io.nop.core.lang.json.IJsonHandler;
import io.nop.batch.dsl.model.BatchReaderModel;
import io.nop.commons.util.ClassHelper;



// tell cpd to start ignoring code - CPD-OFF
/**
 * generate from [42:6:0:0]/nop/schema/task/batch.xdef <p>
 * 
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable",
    "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement","java:S116","java:S101","java:S1128","java:S1161"})
public abstract class _BatchReaderModel extends io.nop.batch.dsl.model.BatchListenersModel {
    
    /**
     *  
     * xml name: bean
     * 
     */
    private java.lang.String _bean ;
    
    /**
     *  
     * xml name: file-reader
     * 
     */
    private io.nop.batch.dsl.model.BatchFileReaderModel _fileReader ;
    
    /**
     *  
     * xml name: jdbc-reader
     * 
     */
    private io.nop.batch.dsl.model.BatchJdbcReaderModel _jdbcReader ;
    
    /**
     *  
     * xml name: orm-reader
     * 
     */
    private io.nop.batch.dsl.model.BatchOrmReaderModel _ormReader ;
    
    /**
     *  
     * xml name: source
     * 
     */
    private io.nop.core.lang.eval.IEvalAction _source ;
    
    /**
     * 
     * xml name: bean
     *  
     */
    
    public java.lang.String getBean(){
      return _bean;
    }

    
    public void setBean(java.lang.String value){
        checkAllowChange();
        
        this._bean = value;
           
    }

    
    /**
     * 
     * xml name: file-reader
     *  
     */
    
    public io.nop.batch.dsl.model.BatchFileReaderModel getFileReader(){
      return _fileReader;
    }

    
    public void setFileReader(io.nop.batch.dsl.model.BatchFileReaderModel value){
        checkAllowChange();
        
        this._fileReader = value;
           
    }

    
    /**
     * 
     * xml name: jdbc-reader
     *  
     */
    
    public io.nop.batch.dsl.model.BatchJdbcReaderModel getJdbcReader(){
      return _jdbcReader;
    }

    
    public void setJdbcReader(io.nop.batch.dsl.model.BatchJdbcReaderModel value){
        checkAllowChange();
        
        this._jdbcReader = value;
           
    }

    
    /**
     * 
     * xml name: orm-reader
     *  
     */
    
    public io.nop.batch.dsl.model.BatchOrmReaderModel getOrmReader(){
      return _ormReader;
    }

    
    public void setOrmReader(io.nop.batch.dsl.model.BatchOrmReaderModel value){
        checkAllowChange();
        
        this._ormReader = value;
           
    }

    
    /**
     * 
     * xml name: source
     *  
     */
    
    public io.nop.core.lang.eval.IEvalAction getSource(){
      return _source;
    }

    
    public void setSource(io.nop.core.lang.eval.IEvalAction value){
        checkAllowChange();
        
        this._source = value;
           
    }

    

    @Override
    public void freeze(boolean cascade){
        if(frozen()) return;
        super.freeze(cascade);

        if(cascade){ //NOPMD - suppressed EmptyControlStatement - Auto Gen Code
        
           this._fileReader = io.nop.api.core.util.FreezeHelper.deepFreeze(this._fileReader);
            
           this._jdbcReader = io.nop.api.core.util.FreezeHelper.deepFreeze(this._jdbcReader);
            
           this._ormReader = io.nop.api.core.util.FreezeHelper.deepFreeze(this._ormReader);
            
        }
    }

    @Override
    protected void outputJson(IJsonHandler out){
        super.outputJson(out);
        
        out.putNotNull("bean",this.getBean());
        out.putNotNull("fileReader",this.getFileReader());
        out.putNotNull("jdbcReader",this.getJdbcReader());
        out.putNotNull("ormReader",this.getOrmReader());
        out.putNotNull("source",this.getSource());
    }

    public BatchReaderModel cloneInstance(){
        BatchReaderModel instance = newInstance();
        this.copyTo(instance);
        return instance;
    }

    protected void copyTo(BatchReaderModel instance){
        super.copyTo(instance);
        
        instance.setBean(this.getBean());
        instance.setFileReader(this.getFileReader());
        instance.setJdbcReader(this.getJdbcReader());
        instance.setOrmReader(this.getOrmReader());
        instance.setSource(this.getSource());
    }

    protected BatchReaderModel newInstance(){
        return (BatchReaderModel) ClassHelper.newInstance(getClass());
    }
}
 // resume CPD analysis - CPD-ON
