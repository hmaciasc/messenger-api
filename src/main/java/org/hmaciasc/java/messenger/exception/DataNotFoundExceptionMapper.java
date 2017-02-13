package org.hmaciasc.java.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.hmaciasc.java.messenger.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFountException>{

	@Override
	public Response toResponse(DataNotFountException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404, "http://java.com");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}

}
