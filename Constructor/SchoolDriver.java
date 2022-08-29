public class SchoolDriver {
    public static void main(String[] args) {
        School s1=new School();

        s1.setName("UA High");
        s1.setAddress("Kyoto");
        s1.setPrinciName("Panda");
        s1.setNoOfStudents(50);

        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
        System.out.println(s1.getPrinciName());
        System.out.println(s1.getNoOfStudents());
    }
}
