// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   BasePlugin.java

package com.example.plugin;

import com.mentor.chs.api.IXObject;

public class BasePlugin
{

    protected static final String ATTRIBUTE_NAME = "NAME";
    protected static final String ATTRIBUTE_WIRE_COLOR = "WireColor";
    protected static final String ATTRIBUTE_PARTNUMBER = "PartNumber";
    protected static final String ATTRIBUTE_SLIT = "Slit";
    protected final String name;
    protected final String version;
    protected final String description;

    protected BasePlugin(String n, String v, String d)
    {
        name = n;
        version = v;
        description = d;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public String getVersion()
    {
        return version;
    }

    public static String getObjectName(IXObject xObject)
    {
        if(xObject == null)
            return null;
        else
            return xObject.getAttribute("NAME");
    }

    protected boolean isEmpty(String str)
    {
        if(str == null)
            return true;
        else
            return "".equals(str);
    }
}
