public class ServerWOFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facade = new ScheduleServerFacade(scheduleServer);

        facade.startServer();
        
        System.out.println("Start working......");
        System.out.println("After work done.........");

        facade.stopServer();
    }
    
}
