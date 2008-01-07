/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c)  2007 Timefields Ltd.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/
package org.sakaiproject.jcr.jackrabbit;

import java.io.Serializable;
import java.security.Principal;

public class JCRAnonymousPrincipal implements Principal, Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2356103533935203766L;

	private String name;

	/**
	 * Creates a <code>SystemPrincipal</code>.
	 */
	public JCRAnonymousPrincipal(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return ("AnonomousePrincipal");
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj instanceof JCRAnonymousPrincipal)
		{
			return true;
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return name.hashCode();
	}

	// ------------------------------------------------------------< Principal >
	/**
	 * {@inheritDoc}
	 */
	public String getName()
	{
		return name;
	}

}