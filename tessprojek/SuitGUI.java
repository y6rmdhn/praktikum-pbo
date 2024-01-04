package tessprojek;

import javax.swing.*;

//frontend
public class SuitGUI extends JFrame {
    //membuat constructor dan menambahkan title
    public SuitGUI() { //constructor
        super("Game Batu Gunting Kertas"); //title

        //mengatur size GUI
        setSize(450, 574);

        //atur layout ke null untuk menonaktifkan manajement tata letak, sehingga kita dapat menggunakan pemosisian absolut untuk elemen tersebut
        setLayout(null);

        //membuat GUI di tengah layar setiap kali kita menjalankan aplikasi
        setLocationRelativeTo(null);
    }
}
