public class MethodPracticeTestOne {


    static int menthodint1 = 11;
    private int methodint2 = 22;

    public void runner( int x)
    {
        MethodPracticeTestOne m = new MethodPracticeTestOne();
        this.menthodint1 = 33;
        //internet didn't show int as required but Intellij does, probably just pisses it off because it's bad code
        int methodint2 = 44;

        System.out.println((MethodPracticeTestOne.menthodint1 +" This is a class running a it's on (static int 1) even though it can't really use the orginal method one because it's static" ));
        System.out.println(m.menthodint1);
        System.out.println(methodint2 + " y");
        System.out.println((m.methodint2 +" m.a declared but private interger in this case m, is an object"));
        System.out.println("This method of method practie test one cannot see the static interger because  ");
        System.out.println("there is only one for the program and this method can not change or even really interact with it and it's outside the scope of this class but can be used in solution");


    }

    public void runner2( int x) {
        MethodPracticeTestOne m = new MethodPracticeTestOne();
        this.menthodint1 = 32;

        System.out.println((MethodPracticeTestOne.menthodint1));
        System.out.println((m.menthodint1));
    }

    /*public void runner3( int x) {
            MethodPracticeTestOne m = new MethodPracticeTestOne();
            this.menthodint2 = 32;

            System.out.println(( MethodPracticeTestOne.menthodint1));
            System.out.println((m.menthodint1));

    }*/
    public static void main(String args[]){
        MethodPracticeTestOne m = new MethodPracticeTestOne();
        m.runner(8);
        m.runner2(7);
    }


}
