/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2007 Timefields Ltd.
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

package org.sakaiproject.jcr.api;

import javax.jcr.LoginException;
import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

/**
 * @author ieb
 */
public interface JCRService
{
	public static final String NT_FOLDER = "nt:folder";

	public static final String NT_FILE = "nt:file";

	public static final String JCR_CONTENT = "jcr:content";

	public static final String JCR_DATA = "jcr:data";

	public static final String NT_ROOT = "rep:root";

	public static final String NT_RESOURCE = "nt:resource";

	public static final String JCR_LASTMODIFIED = "jcr:lastModified";

	public static final String JCR_MIMETYPE = "jcr:mimeType";

	public static final String JCR_ENCODING = "jcr:encoding";

	public static final String MIX_REFERENCEABLE = "mix:referenceable";

	public static final String JCR_UUID = "jcr:uuid";

	/**
	 * @return
	 * @throws LoginException
	 * @throws RepositoryException
	 */
	Session getSession() throws LoginException, RepositoryException;
	
	/**
	 * @return
	 * @throws LoginException
	 * @throws RepositoryException
	 */
	Session login() throws LoginException, RepositoryException;

	/**
	 * @return
	 * @throws LoginException
	 * @throws RepositoryException
	 */
	void logout() throws LoginException, RepositoryException;

	/**
	 * @param id
	 */
	void dump(String id);

	/**
	 * Get the repository
	 * 
	 * @return
	 */
	Repository getRepository();
	
	
	/**
	 * Set the current thread session and returns the previous one, setting to null will clear the current session
	 * @param session
	 * @return 
	 */
	Session setSession(Session session);


	boolean needsMixin(Node n, String mixin) throws RepositoryException;
}
