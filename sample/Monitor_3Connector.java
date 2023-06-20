@Ports({
@Port(name = "receiveRandomNumberRequest", type = PortType.spontaneous)
, @Port(name = "sendRandomNumberRequest", type = PortType.enforceable)
, @Port(name = "addDatabase", type = PortType.enforceable), @Port(name = "switchServer", type = PortType.enforceable)
, @Port(name = "receiveSwitchConfirm", type = PortType.enforceable) , @Port(name = "resetMonitor", type = PortType.spontaneous)
})
@ComponentType(initial = "MonitorInit", name = "monitorswitch.connector.Monitor_3")
public class Monitor_3 extends HttpServlet{

  @Transitions({
		@Transition(name = "sendRandomNumberRequest", source = "RandomNumberRequestReceived", target = "SwitchReady", guard = "!is_reached_the_threshold"),
	})
	public void sendRandomNumberRequest() throws IOException {...}
	//similarly for the other kind-specific actions
	
	@Guard(name = "is_reached_the_threshold")
	public boolean is_reached_the_threshold(){...}
	
	@Guard(name="can_add_database_through")
	public boolean can_add_database_through(@Data(name="HerokuController2Monitor_3_data") HerokuController HerokuController_ins) {}
}