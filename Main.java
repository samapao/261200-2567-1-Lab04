public class Main { //hello
    public static void main(String[] args) {
        HealthRecord sampao = new HealthRecord(180);
        HealthRecord papop = new HealthRecord(170);
        HealthRecord oak = new HealthRecord(150);
        System.out.println(sampao.getHeight()); 
        System.out.println(papop.getHeight());
        System.out.println(oak.getHeight());
        System.out.println(HealthRecord.MaxH);
    }
}
