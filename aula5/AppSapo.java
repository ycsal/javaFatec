import exercicio10.Sapo;

public class AppSapo {
    public static void main(String[] args) throws Exception {
        Sapo s1 = new Sapo();
        Sapo s2 = new Sapo();
        Sapo s3 = new Sapo();

        System.out.println(s1.getQtPulo());
        System.out.println(s2.getQtPulo());
        System.out.println(s3.getQtPulo());

        System.out.println(Sapo.getQtSapo());
    }
}

