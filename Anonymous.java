interface check {
    public void message();
}
public class Anonymous {
    public static void main(String[] args) {
        try {
            check t = new check() {  //how????????????????
                public void message() {
                    System.out.println("Method defined in the interface");
                }
            };
            t.message();
        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
    }
}