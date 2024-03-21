package java_basic.chap_10_LambdaAndStream;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = new HomeMadeBurger() {
            @Override
            public void cook() {

            }
        };
    }

}

abstract class HomeMadeBurger {
    public abstract void cook();
}