package Company;

public class TeamLead implements TimeSheets{
    public static void main(String[] args) {
        TeamLead bob = new TeamLead();
        bob.fillOutTimeSheets();
    }

    @Override
    public void fillOutTimeSheets(){
        System.out.println("Filling Time Sheets");
    }
}
