/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * License). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
@ExceptionMapping(mappings = { 	@Mapping(	exception = BusinessException.class,
											toException = PlisBusinessToException.class),
								@Mapping(	exception = TechnicalException.class,
											toException = PlisTechnicalToException.class)},
					technicalToException = PlisTechnicalToException.class)
package de.bund.bva.isyfact.serviceapi.core.serviceimpl.test.impl;

import de.bund.bva.isyfact.exception.BusinessException;
import de.bund.bva.isyfact.exception.TechnicalException;
import de.bund.bva.isyfact.serviceapi.core.serviceimpl.ExceptionMapping;
import de.bund.bva.isyfact.serviceapi.core.serviceimpl.Mapping;
import de.bund.bva.pliscommon.exception.service.PlisBusinessToException;
import de.bund.bva.pliscommon.exception.service.PlisTechnicalToException;
