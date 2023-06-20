public class GlueBuilder_Specification extends GlueBuilder {
 @Override
 public void configure(){
  //addDB_3: (Monitor_3.addDatabase)-(HerokuController.addDatabase)
  port(HerokuController.class, "addDatabase").requires(Monitor_3.class, "addDatabase");
  port(Monitor_3.class, "addDatabase").requires(HerokuController.class, "addDatabase");
  port(Monitor_3.class, "addDatabase").accepts(HerokuController.class, "addDatabase");
  port(HerokuController.class, "addDatabase").accepts(Monitor_3.class, "addDatabase");
 
  data(HerokuController.class,"HC2Monitor3_data").to(Monitor_3.class,"HC2Monitor3_data");
 }
}	