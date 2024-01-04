package tessprojek;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        //digunakan utk memungkinkan GUI kita dibuat dan diperbaharui dengan cara yg aman
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //membuat objek
                SuitGUI batuGuntingKertasGUI = new SuitGUI();

                //untuk menampilkan GUI
                batuGuntingKertasGUI.setVisible(true);
            }
        });
    }
}
