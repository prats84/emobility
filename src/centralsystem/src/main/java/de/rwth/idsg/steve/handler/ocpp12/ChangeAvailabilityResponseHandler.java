package de.rwth.idsg.steve.handler.ocpp12;

import de.rwth.idsg.steve.handler.AbstractOcppResponseHandler;
import de.rwth.idsg.steve.web.RequestTask;
import ocpp.cp._2010._08.ChangeAvailabilityResponse;

/**
 * @author Sevket Goekay <goekay@dbis.rwth-aachen.de>
 * @since 29.12.2014
 */
public class ChangeAvailabilityResponseHandler extends AbstractOcppResponseHandler<ChangeAvailabilityResponse> {

    public ChangeAvailabilityResponseHandler(RequestTask requestTask, String chargeBoxId) {
        super(requestTask, chargeBoxId);
    }

    @Override
    public void handleResult(ChangeAvailabilityResponse response) {
        requestTask.addNewResponse(chargeBoxId, response.getStatus().value());
    }
}
