package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner productOwner = new ProductOwner("Suhaib",29,'M',1,160000,company);
        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Cihad", 30, 'M', 2,150000,company);
        ScrumMaster scrumMaster = new ScrumMaster("Anel",26,'F',3,145000,company);
        Tester tester1 = new Tester("Chinara", 32 ,'F', "QA",1415,125000,company);
        Tester tester2 = new Tester("Yasaman", 31 ,'F', "QE",1415,130000,company);
        Tester tester3 = new Tester("Iran", 29 ,'F', "SDET",1415,128000,company);
        Tester tester4 = new Tester("Cihad", 26 ,'M', "QA",1415,125000,company);
        Tester[] testers = {tester1,tester2,tester3,tester4};

        Developer developer1 =new Developer("Daniela",27,'F',"Java Developer",9,125000,company);

        ScrumTeam scrumTeam  =new ScrumTeam(productOwner,businessAnalyst,scrumMaster);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name);
        }

    }
}
