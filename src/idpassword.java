import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class idpassword {
    HashMap<String , String > logininfo = new HashMap<String ,String>();
    idpassword(){

    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
