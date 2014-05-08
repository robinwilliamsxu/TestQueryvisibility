// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   BaseCustomResultExpression.java

package com.example.plugin.query;

import com.mentor.chs.api.IXObject;
import com.mentor.chs.plugin.query.IXCustomExpression;
import com.mentor.chs.plugin.query.IXCustomResultExpression;

// Referenced classes of package com.example.plugin.query:
//            BaseCustomExpression

public abstract class BaseCustomResultExpression extends BaseCustomExpression
    implements IXCustomResultExpression
{

    protected BaseCustomResultExpression(String n, String v, String d)
    {
        super(n, v, d);
    }

    public com.mentor.chs.plugin.query.IXCustomExpression.Context[] getApplicableContexts()
    {
        return new com.mentor.chs.plugin.query.IXCustomExpression.Context[0];
    }

    public Object evaluate(IXObject entity)
    {
        return "";
    }

    public Object evaluate(IXObject entity, String executionContext)
    {
        return evaluate(entity);
    }
}
