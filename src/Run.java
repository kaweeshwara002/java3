 class Run {
    void go(){
        System.out.println("Can Run");
    }
}
 class Jump extends Run{
    void goes(){
        System.out.println("Can Jump");
    }
}
class Climb extends Jump{
    void went(){
        System.out.println("Can't Climb");
    }
}
class Testmethod{
    public static void main(String[] args) {
       Climb c = new Climb();
       c.go();
       c.goes();
       c.went();
    }
}
