// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   BaseCustomFilterExpression.java

package com.example.plugin.query;

import com.mentor.chs.api.IXObject;
import com.mentor.chs.plugin.query.IXCustomExpression;
import com.mentor.chs.plugin.query.IXCustomFilterExpression;

// Referenced classes of package com.example.plugin.query:
//            BaseCustomExpression

public abstract class BaseCustomFilterExpression extends BaseCustomExpression
    implements IXCustomFilterExpression
{

    protected BaseCustomFilterExpression(String n, String v, String d)
    {
        super(n, v, d);
    }

    public String getCollapsedForm()
    {
        return getName();
    }

    public com.mentor.chs.plugin.query.IXCustomExpression.Context[] getApplicableContexts()
    {
        return new com.mentor.chs.plugin.query.IXCustomExpression.Context[0];
    }

    public boolean isSatisfiedBy(IXObject obj)
    {
        return true;
    }
}
