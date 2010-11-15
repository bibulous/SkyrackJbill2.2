/*
    jBilling - The Enterprise Open Source Billing System
    Copyright (C) 2003-2009 Enterprise jBilling Software Ltd. and Emiliano Conde

    This file is part of jbilling.

    jbilling is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    jbilling is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with jbilling.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.sapienter.jbilling.server.payment.tasks.micropayment;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapienter.jbilling.common.InvalidArgumentException;
import com.sapienter.jbilling.server.mediation.db.*;
import com.sapienter.jbilling.server.mediation.task.IMediationProcess;
import com.sapienter.jbilling.server.order.db.OrderLineDTO;
import com.sapienter.jbilling.server.payment.db.PaymentAuthorizationDTO;
import com.sapienter.jbilling.server.pluggableTask.TaskException;

/**
 *
 * @author Si Bury
 * @since 05-08-2010
 **/
public interface IMicropaymentReversedSessionBean {

    public void trigger(Integer entityId, HashMap<String, Object> parameters);

    public void checkReversed(Integer entityId);
    
    public void reversePayment(PaymentAuthorizationDTO response);
    
    public void updatePaymentAuthoriaztion(PaymentAuthorizationDTO response);
    
    public void confirmCharged(Integer entityId);
    
    public PaymentAuthorizationDTO sessionGet(PaymentAuthorizationDTO paDto);
    
}
