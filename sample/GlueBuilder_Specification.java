package occimonitor;

import org.javabip.glue.GlueBuilder;

public class GlueBuilder_Specification extends GlueBuilder
{
    //Monitor_3
    @Override
    public void configure() {
        //(Monitor_3.switchServer)-(Switch.switchServer)
        //ALL Synchron: root.null
        port(SwitchConnector.class, "switchServer").requires(Monitor_3Connector.class, "switchServer");
        port(Monitor_3Connector.class, "switchServer").requires(SwitchConnector.class, "switchServer");

        port(SwitchConnector.class, "switchServer").accepts(Monitor_3Connector.class, "switchServer");
        port(Monitor_3Connector.class, "switchServer").accepts(SwitchConnector.class, "switchServer");
        
        //(Monitor_3.receiveSwitchConfirm)-(Switch.switchConfirm)
        //ALL Synchron: root.null
        port(Monitor_3Connector.class, "receiveSwitchConfirm").requires(SwitchConnector.class, "switchConfirm");
        port(SwitchConnector.class, "switchConfirm").requires(Monitor_3Connector.class, "receiveSwitchConfirm");

        port(Monitor_3Connector.class, "receiveSwitchConfirm").accepts(SwitchConnector.class, "switchConfirm");
        port(SwitchConnector.class, "switchConfirm").accepts(Monitor_3Connector.class, "receiveSwitchConfirm");
        
        //(Monitor_3.addDatabase)-(HerokuControlConnector.addDatabase)
        //ALL Synchron: root.null
        port(HerokuControlConnector.class, "addDatabase").requires(Monitor_3Connector.class, "addDatabase");
        port(Monitor_3Connector.class, "addDatabase").requires(HerokuControlConnector.class, "addDatabase");
        
        port(HerokuControlConnector.class, "addDatabase").accepts(Monitor_3Connector.class, "addDatabase");
        port(Monitor_3Connector.class, "addDatabase").accepts(HerokuControlConnector.class, "addDatabase");
        
        // Start of user code Developer policies
        data(Monitor_3Connector.class,"currentRequest").to(HerokuControlConnector.class, "currentRequest");

        // Start of user code Developer policies
        // TODO Declare fixed policies
        // End of user code
    }
}