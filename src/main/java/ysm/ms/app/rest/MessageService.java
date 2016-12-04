package ysm.ms.app.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Named
@Path("/")
public class MessageService {

	private List<Message> messageList = new ArrayList<Message>();
	public MessageService() {
	}

	@GET
	@Path("addMessage")
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(@QueryParam("message") String message,
			@QueryParam("type") String type) {

		// process the message
		MessageType t = MessageType.valueOf(type);
		Message mes = new Message(t, message);
		return mes;
	}

}
