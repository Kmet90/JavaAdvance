package LabGenerics.JarOfT01;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> jarOne = new Jar<>();
        Jar<String> jarTwo = new Jar<>();
        jarOne.add (13);
        jarTwo.add ("Pesho");
        jarTwo.add ("14");
        String remove = jarTwo.remove ();
    }
}
