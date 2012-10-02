/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.globalqss.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for LCO_WithholdingType
 *  @author Adempiere (generated) 
 *  @version 3.6.0LTS+P20120111 - $Id$ */
public class X_LCO_WithholdingType extends PO implements I_LCO_WithholdingType, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120924L;

    /** Standard Constructor */
    public X_LCO_WithholdingType (Properties ctx, int LCO_WithholdingType_ID, String trxName)
    {
      super (ctx, LCO_WithholdingType_ID, trxName);
      /** if (LCO_WithholdingType_ID == 0)
        {
			setIsSOTrx (false);
// N
			setLCO_WithholdingType_ID (0);
			setLVE_IsISLR (false);
// N
			setLVE_IsIVA (false);
// N
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_LCO_WithholdingType (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_LCO_WithholdingType[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Counter.
		@param Counter 
		Count Value
	  */
	public void setCounter (int Counter)
	{
		throw new IllegalArgumentException ("Counter is virtual column");	}

	/** Get Counter.
		@return Count Value
	  */
	public int getCounter () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Counter);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Sales Transaction.
		@param IsSOTrx 
		This is a Sales Transaction
	  */
	public void setIsSOTrx (boolean IsSOTrx)
	{
		set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
	}

	/** Get Sales Transaction.
		@return This is a Sales Transaction
	  */
	public boolean isSOTrx () 
	{
		Object oo = get_Value(COLUMNNAME_IsSOTrx);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Withholding Type.
		@param LCO_WithholdingType_ID Withholding Type	  */
	public void setLCO_WithholdingType_ID (int LCO_WithholdingType_ID)
	{
		if (LCO_WithholdingType_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LCO_WithholdingType_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LCO_WithholdingType_ID, Integer.valueOf(LCO_WithholdingType_ID));
	}

	/** Get Withholding Type.
		@return Withholding Type	  */
	public int getLCO_WithholdingType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LCO_WithholdingType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LVE_IsISLR.
		@param LVE_IsISLR 
		LVE_IsISLR
	  */
	public void setLVE_IsISLR (boolean LVE_IsISLR)
	{
		set_Value (COLUMNNAME_LVE_IsISLR, Boolean.valueOf(LVE_IsISLR));
	}

	/** Get LVE_IsISLR.
		@return LVE_IsISLR
	  */
	public boolean isLVE_IsISLR () 
	{
		Object oo = get_Value(COLUMNNAME_LVE_IsISLR);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set LVE_IsIVA.
		@param LVE_IsIVA 
		LVE_IsIVA
	  */
	public void setLVE_IsIVA (boolean LVE_IsIVA)
	{
		set_Value (COLUMNNAME_LVE_IsIVA, Boolean.valueOf(LVE_IsIVA));
	}

	/** Get LVE_IsIVA.
		@return LVE_IsIVA
	  */
	public boolean isLVE_IsIVA () 
	{
		Object oo = get_Value(COLUMNNAME_LVE_IsIVA);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }
}