/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007 The Sakai Foundation.
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

package org.sakaiproject.jcr.support.api;

import java.io.InputStream;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

/**
 * @author ieb
 */
public interface JCRNodeFactoryService
{

	/**
	 * @param id
	 * @param type
	 * @return
	 * @throws NodeFactoryServiceException
	 */
	Node createNode(String id, String type) throws JCRNodeFactoryServiceException;

	/**
	 * @param id
	 * @param in
	 * @throws NodeFactoryServiceException
	 * @throws RepositoryException
	 */
	Node setInputStream(String id, InputStream in) throws JCRNodeFactoryServiceException,
			RepositoryException;

	/**
	 * @param id
	 * @return
	 * @throws RepositoryException
	 * @throws NodeFactoryServiceException
	 */
	InputStream getOutputStream(String id) throws RepositoryException,
			JCRNodeFactoryServiceException;

	/**
	 * @param id
	 * @return
	 * @throws RepositoryException
	 * @throws NodeFactoryServiceException
	 */
	Node getNode(String id) throws RepositoryException, JCRNodeFactoryServiceException;

}
