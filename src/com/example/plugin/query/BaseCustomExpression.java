// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   BaseCustomExpression.java

package com.example.plugin.query;

import com.example.plugin.BasePlugin;
import com.mentor.chs.api.IXDiagramObject;
import com.mentor.chs.api.IXObject;

public abstract class BaseCustomExpression extends BasePlugin
{

    protected BaseCustomExpression(String n, String v, String d)
    {
        super(n, v, d);
    }

    public String getObjectAttribute(IXObject xObject, String attrName)
    {
        String val = null;
        if(xObject == null)
            return val;
        if(xObject instanceof IXDiagramObject)
        {
            val = xObject.getAttribute(attrName);
            if(val == null)
            {
                IXObject cObject = ((IXDiagramObject)xObject).getConnectivity();
                if(cObject != null)
                    val = cObject.getAttribute(attrName);
            }
        } else
        {
            val = xObject.getAttribute(attrName);
        }
        return val;
    }

    public void LogEntry(IXObject ixobject)
    {
    }

    public void LogExit(IXObject ixobject, String s)
    {
    }
}
