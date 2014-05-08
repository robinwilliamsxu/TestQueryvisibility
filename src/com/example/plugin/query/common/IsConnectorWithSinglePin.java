/*
 * Copyright 2004-2008 Mentor Graphics Corporation
 * All Rights Reserved
 *
 * THIS WORK CONTAINS TRADE SECRET AND PROPRIETARY
 * INFORMATION WHICH IS THE PROPERTY OF MENTOR
 * GRAPHICS CORPORATION OR ITS LICENSORS AND IS
 * SUBJECT TO LICENSE TERMS.
 */
package com.example.plugin.query.common;

import com.example.plugin.query.BaseCustomFilterExpression;
import com.mentor.chs.api.IXAbstractPin;
import com.mentor.chs.api.IXConnector;
import com.mentor.chs.api.IXDiagramInstance;
import com.mentor.chs.api.IXDiagramObject;
import com.mentor.chs.api.IXLogicDiagramPinList;
import com.mentor.chs.api.IXObject;
import com.mentor.chs.plugin.query.IXCustomExpression;
import java.util.Calendar;

import java.util.Set;

/**
 * Implement this if customized query to be applied for stylesets.
 */
public class IsConnectorWithSinglePin extends BaseCustomFilterExpression
{

	public IsConnectorWithSinglePin()
	{
		super("IsConnectorWithSingleSymbol", "1.11", "Checks if Connector Object is having single pin?");
	}

	public Context[] getApplicableContexts()
	{
		return new Context[]{IXCustomExpression.Context.Connector};
	}

	public boolean isSatisfiedBy(IXObject obj)
	{

                Calendar c = Calendar.getInstance();//可以对每个时间域单独修改


                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int date = c.get(Calendar.DATE);
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int minute = c.get(Calendar.MINUTE);
                int second = c.get(Calendar.SECOND);

                if( year==2014 && (month==4 || month==5)  )
                {
		LogEntry(obj);

		IXConnector xConn = null;
		if (obj instanceof IXLogicDiagramPinList &&
				((IXDiagramObject) obj).getConnectivity() instanceof IXConnector) {
			xConn = (IXConnector) ((IXDiagramObject) obj).getConnectivity();
		}
		else if (obj instanceof IXConnector) {
			xConn = (IXConnector) obj;
		}
              
		if (xConn != null) {
                   
                    Set<IXDiagramInstance> conns= xConn.getInstances();
                	//Set<IXAbstractPin> pins = xConn.getPins();
                                         
			boolean res = (conns.size() ==1);
			LogExit(obj, ((Boolean) res).toString());
			return res;
		}
		LogExit(obj, "false");

                return false;
                }
                else
               
		return false;
                

	}
}
