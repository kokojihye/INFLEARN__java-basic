package java_basic.chap_08_AbstractClass_Interface;

import java_basic.chap_07_Class.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; //public
        //b1.resolution = "FHD" //default
        //b1.price = 200000; //private
        //b1.color = "블랙"; //protected
        // -> public외에는 특별한 조건 없이 접근 불가!
    }
}
