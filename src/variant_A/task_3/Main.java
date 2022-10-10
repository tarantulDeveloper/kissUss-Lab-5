package variant_A.task_3;

public class Main {
    public static void main(String[] args) {
        WorkType workType=WorkType.MANAGE;
        Supervisor supervisor=new Supervisor(workType);
        supervisor.setName("Asan");
        supervisor.setExperience(10);
        supervisor.setSalary(50000);
        supervisor.info();
        supervisor.working();

    }
}
