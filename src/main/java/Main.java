import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String fac1 = "ДДС";
        String fac2 = "СДВ";
        String fac3 = "ДСФ";
        String fac4 = "РСФ";
        String prover = "ДСФ";
        if (fac1.indexOf(prover) != -1) {
            System.out.println("ДСФ есть");
        } else {
            if (fac2.indexOf(prover) != -1) {
                System.out.println("ДСФ есть");
            } else {
                if (fac3.indexOf(prover) != -1) {
                    System.out.println("ДСФ есть");
                } else {
                    if (fac4.indexOf(prover) != -1) {
                        System.out.println("ДСФ есть");
                    }
                    else {
                        System.out.println("ДСФ нет");
                    }
                }
            }
        }
    }
}