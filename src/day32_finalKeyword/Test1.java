package day32_finalKeyword;

public class Test1 {
    protected void method(){
        System.out.println("A");
    }

    private void method(int a){
        System.out.println("B");
    }

    public class Test2 extends Test1{
        @Override
        protected void method() {
            System.out.println("C");
        }

        public void main(String[] args) {
            Test2 obj = new Test2();

        }
    }
}
