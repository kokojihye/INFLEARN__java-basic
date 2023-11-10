package java_basic.chap_07_Class;

import java_basic.chap_07_Class.camera.ActionCam;
import java_basic.chap_07_Class.camera.SlowActionCam;

public class _17_Final {
    //Final

    // public (final) class ...
    // public (final) void ...
    // public > abstract > static > final > ...
    public static void main(String[] args) {
        //Final
        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준렌즈"; -> actionCam.lens는 final이므로 값 변경 불가능
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();
    }
}
