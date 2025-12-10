class one {    //parent class
    public void parent() {
        System.out.println("parents");
    }
}
    class two extends one {   //child1
        public void child1() {
            System.out.println("Child 1");
        }
    }

    class three extends one {   //child2
        public void child2() {
            System.out.println("Child 2");
        }
    }

    public class hirerichical {
        public static void main(String[] args) {
            two obj = new two();
            obj.parent();
            obj.child1();
            three obj1 = new three();
            obj1.child2();
        }
    }