package io.nop.ioc.model._gen;

import io.nop.commons.collections.KeyedList; //NOPMD - suppressed UnusedImports - Used for List Prop
import io.nop.core.lang.json.IJsonHandler;



// tell cpd to start ignoring code - CPD-OFF
/**
 * generate from [228:10:0:0]/nop/schema/beans.xdef <p>
 * 如果bean是interceptor，会检查容器中所有ioc:aop=true的bean，作用于具有指定注解的方法上
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable",
    "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement"})
public abstract class _BeanPointcutModel extends io.nop.core.resource.component.AbstractComponentModel {
    
    /**
     *  
     * xml name: annotations
     * 本interceptor识别的注解类列表
     */
    private java.util.Set<java.lang.String> _annotations ;
    
    /**
     *  
     * xml name: order
     * 
     */
    private int _order  = 100;
    
    /**
     * 
     * xml name: annotations
     *  本interceptor识别的注解类列表
     */
    
    public java.util.Set<java.lang.String> getAnnotations(){
      return _annotations;
    }

    
    public void setAnnotations(java.util.Set<java.lang.String> value){
        checkAllowChange();
        
        this._annotations = value;
           
    }

    
    /**
     * 
     * xml name: order
     *  
     */
    
    public int getOrder(){
      return _order;
    }

    
    public void setOrder(int value){
        checkAllowChange();
        
        this._order = value;
           
    }

    

    public void freeze(boolean cascade){
        if(frozen()) return;
        super.freeze(cascade);

        if(cascade){ //NOPMD - suppressed EmptyControlStatement - Auto Gen Code
        
        }
    }

    protected void outputJson(IJsonHandler out){
        super.outputJson(out);
        
        out.put("annotations",this.getAnnotations());
        out.put("order",this.getOrder());
    }
}
 // resume CPD analysis - CPD-ON
