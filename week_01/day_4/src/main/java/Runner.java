public class Runner {

    public static void main(String[] args) {
      Bear bear1 = new Bear("Balu"); // construction of the bear object happens HERE, especially with the command "new"
        System.out.println(bear1.getName());

        Bear bear2 = new Bear("Pooh"); // construction of the bear object happens HERE, especially with the command "new"
        System.out.println(bear2.getName());

        bear2.setName("Pooh Bear");

        String NameWeGot = bear2.getName();
        System.out.println(NameWeGot);


    }
}
