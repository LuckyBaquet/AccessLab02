package TestPackage;

import accesslab02.TestClass;

/**
 * Created by lucky on 1/25/16.
 */
public class TestTester extends TestClass {

    private TestTester(int i){
        super();
    }


    public static void main(String[] args) {

        TestTester tt = new TestTester(9);

        TestClass tc = new TestClass();

    }

}
