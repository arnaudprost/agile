// MockCreator v2.9.0 build 3065; HashCode:597576501; net.sf.pmr.keopsframework.domain.object.GhostDomainObject
package net.sf.pmr.keopsframework.domain.object;

import de.abstrakt.mock.MockCore;

public class MockGhostDomainObject implements net.sf.pmr.keopsframework.domain.object.GhostDomainObject, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject",null);
        return this;
    }

    public net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject",th);
        return this;
    }

public void expectSetMapper(net.sf.pmr.keopsframework.data.GhostDomainObjectMapper p0_GhostDomainObjectMapper)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_GhostDomainObjectMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params );
}
public void expectSetMapper(net.sf.pmr.keopsframework.data.GhostDomainObjectMapper p0_GhostDomainObjectMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_GhostDomainObjectMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params,toThrow );
}
public void acceptSetMapper(Object p0_GhostDomainObjectMapper)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_GhostDomainObjectMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params );
}
public void acceptSetMapper(Object p0_GhostDomainObjectMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_GhostDomainObjectMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params,toThrow );
}
public void setSetMapperDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),null,null);
}
public void setSetMapperDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),null,toThrow);
}
public void setSetMapperDummy(net.sf.pmr.keopsframework.data.GhostDomainObjectMapper p0_GhostDomainObjectMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_GhostDomainObjectMapper);

    MockCore.setDummy( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params,toThrow);
}


public void acceptSetMapperDummy(Object p0_GhostDomainObjectMapper, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_GhostDomainObjectMapper);

    MockCore.setDummy(getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params,valueToThrow);
}


public void expectLoadForThisObject(java.lang.Object p0_Object)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForThisObject(Object)"),params );
}
public void expectLoadForThisObject(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForThisObject(Object)"),params,toThrow );
}
public void acceptLoadForThisObject(Object p0_Object)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForThisObject(Object)"),params );
}
public void acceptLoadForThisObject(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForThisObject(Object)"),params,toThrow );
}
public void setLoadForThisObjectDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("loadForThisObject(Object)"),null,null);
}
public void setLoadForThisObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("loadForThisObject(Object)"),null,toThrow);
}
public void setLoadForThisObjectDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("loadForThisObject(Object)"),params,toThrow);
}


public void acceptLoadForThisObjectDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("loadForThisObject(Object)"),params,valueToThrow);
}


public void expectGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void expectGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void acceptGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void acceptGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void setGetPersistanceIdDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,new Integer(toReturn));
}
public void setGetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,toThrow);
}



public void acceptGetPersistanceIdDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),params,valueToThrow);
}


public void expectSetPersistanceId(int p0_int)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void expectSetPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void acceptSetPersistanceId(Object p0_int)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void acceptSetPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void setSetPersistanceIdDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,null);
}
public void setSetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,toThrow);
}
public void setSetPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow);
}


public void acceptSetPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),params,valueToThrow);
}


public void expectGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void expectGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void acceptGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void acceptGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void setGetPersistanceVersionDummy(long toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,new Long(toReturn));
}
public void setGetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,toThrow);
}



public void acceptGetPersistanceVersionDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),params,valueToThrow);
}


public void expectSetPersistanceVersion(long p0_long)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void expectSetPersistanceVersion(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void acceptSetPersistanceVersion(Object p0_long)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void acceptSetPersistanceVersion(Object p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void setSetPersistanceVersionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,null);
}
public void setSetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,toThrow);
}
public void setSetPersistanceVersionDummy(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow);
}


public void acceptSetPersistanceVersionDummy(Object p0_long, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.keopsframework.domain.object.GhostDomainObject";
}
    public MockGhostDomainObject()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject",params);
        return new net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject",null);
        return new net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject",th);
        return new net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject.PreMock(id);
    }

    public void setMapper(net.sf.pmr.keopsframework.data.GhostDomainObjectMapper p0_GhostDomainObjectMapper)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_GhostDomainObjectMapper);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetMapper(net.sf.pmr.keopsframework.data.GhostDomainObjectMapper p0_GhostDomainObjectMapper)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_GhostDomainObjectMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params );
}
public void expectSetMapper(net.sf.pmr.keopsframework.data.GhostDomainObjectMapper p0_GhostDomainObjectMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_GhostDomainObjectMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params,toThrow );
}
public void acceptSetMapper(Object p0_GhostDomainObjectMapper)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_GhostDomainObjectMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params );
}
public void acceptSetMapper(Object p0_GhostDomainObjectMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_GhostDomainObjectMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params,toThrow );
}
public void setSetMapperDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),null,null);
}
public void setSetMapperDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),null,toThrow);
}
public void setSetMapperDummy(net.sf.pmr.keopsframework.data.GhostDomainObjectMapper p0_GhostDomainObjectMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_GhostDomainObjectMapper);

    MockCore.setDummy( getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params,toThrow);
}


public void acceptSetMapperDummy(Object p0_GhostDomainObjectMapper, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_GhostDomainObjectMapper);

    MockCore.setDummy(getClassObjectMethodSignature("setMapper(GhostDomainObjectMapper)"),params,valueToThrow);
}


    public void loadForThisObject(java.lang.Object p0_Object)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("loadForThisObject(Object)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectLoadForThisObject(java.lang.Object p0_Object)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForThisObject(Object)"),params );
}
public void expectLoadForThisObject(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForThisObject(Object)"),params,toThrow );
}
public void acceptLoadForThisObject(Object p0_Object)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForThisObject(Object)"),params );
}
public void acceptLoadForThisObject(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForThisObject(Object)"),params,toThrow );
}
public void setLoadForThisObjectDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("loadForThisObject(Object)"),null,null);
}
public void setLoadForThisObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("loadForThisObject(Object)"),null,toThrow);
}
public void setLoadForThisObjectDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("loadForThisObject(Object)"),params,toThrow);
}


public void acceptLoadForThisObjectDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("loadForThisObject(Object)"),params,valueToThrow);
}


    public int getPersistanceId()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getPersistanceId()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getPersistanceId: called but not prepared");
    return ((Integer)returnValue).intValue();
}
public void expectGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void expectGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void acceptGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void acceptGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void setGetPersistanceIdDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,new Integer(toReturn));
}
public void setGetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,toThrow);
}



public void acceptGetPersistanceIdDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),params,valueToThrow);
}


    public void setPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setPersistanceId(int)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetPersistanceId(int p0_int)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void expectSetPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void acceptSetPersistanceId(Object p0_int)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void acceptSetPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void setSetPersistanceIdDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,null);
}
public void setSetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,toThrow);
}
public void setSetPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow);
}


public void acceptSetPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),params,valueToThrow);
}


    public long getPersistanceVersion()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getPersistanceVersion()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getPersistanceVersion: called but not prepared");
    return ((Long)returnValue).longValue();
}
public void expectGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void expectGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void acceptGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void acceptGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void setGetPersistanceVersionDummy(long toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,new Long(toReturn));
}
public void setGetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,toThrow);
}



public void acceptGetPersistanceVersionDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),params,valueToThrow);
}


    public void setPersistanceVersion(long p0_long)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetPersistanceVersion(long p0_long)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void expectSetPersistanceVersion(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void acceptSetPersistanceVersion(Object p0_long)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void acceptSetPersistanceVersion(Object p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void setSetPersistanceVersionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,null);
}
public void setSetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,toThrow);
}
public void setSetPersistanceVersionDummy(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow);
}


public void acceptSetPersistanceVersionDummy(Object p0_long, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.keopsframework.domain.object.MockGhostDomainObject"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.keopsframework.domain.object.GhostDomainObject";
}
