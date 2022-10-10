package variant_A.task_3;

 public class Supervisor extends Engineer {
  private final WorkType workType;

  public Supervisor(WorkType workType) {
   super();
   this.workType = workType;
  }

  @Override
  public void working() {
   System.out.println("The work type of engineer is  "+ workType);
  }

  @Override
  void info() {
   System.out.println("The name is: "+getName()+
           " experience: "+ getExperience()+
           " salary: "+ getSalary());
  }
 }
