/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.savings.exception;

import org.mifosplatform.infrastructure.core.exception.AbstractPlatformDomainRuleException;

public class InvalidSavingsAccountStateTransitionException extends AbstractPlatformDomainRuleException {

	public InvalidSavingsAccountStateTransitionException(final String action, String postFix, String defaultUserMessage, Object... defaultUserMessageArgs) {
		super("error.msg.saving." + action + "." + postFix, defaultUserMessage, defaultUserMessageArgs);
	}

}
