public class ExceptionFun {

    public void doSomethingUsers(){
        // This is where we give feedback to the user
       doSomething2();
    }
    public void doSomething2(){
        doSomething3();
    }

    public void doSomething3(){
        try {
            doSomethingWhichMightThrow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doSomethingWhichMightThrow() throws Exception {
        // bla bla bla
        boolean databaseConnection = false;
        throw new Exception("something broke somewhere again");


    }

}
