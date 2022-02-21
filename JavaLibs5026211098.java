package JavaLibs5026211098.java;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nama ="";
        String nrp ="";
        String departemen ="";
        String mata_kuliah ="";
        double tugas=0, ETS=0, EAS=0, Ntugas, NETS, NEAS, Ntotal;

        JOptionPane.showMessageDialog(null, "selamat datang di kalkulator nilai mata kuliah!");
        nama = JOptionPane.showInputDialog("masukkan nama anda");
        nrp = JOptionPane.showInputDialog("masukkan nrp anda");
        departemen = JOptionPane.showInputDialog("masukkan departemen anda");
        mata_kuliah =JOptionPane.showInputDialog("masukkan mata kuliah anda");
        tugas = Double.parseDouble(JOptionPane.showInputDialog("masukkan nilai tugas anda (0 - 100)"));
        ETS = Double.parseDouble((JOptionPane.showInputDialog("masukkan nilai ETS anda(0 - 100)")));
        EAS = Double.parseDouble(JOptionPane.showInputDialog("masukkan nilai EAS anda(0 - 100)"));

        Ntugas = tugas*0.25;
        NETS = ETS*0.35;
        NEAS = EAS*0.4;
        Ntotal = Ntugas + NEAS + NETS;

        JOptionPane.showMessageDialog(null, "NILAI AKHIR MATA KULIAH ANDA \nnama      :" + nama +"\nnrp         :" + nrp +"\ndepartemen :" + departemen+"\nmata kuliah  :" + mata_kuliah +"\nnilai tugas (25%)   :" + Ntugas +"\nnilai ETS (35%)    :" + NETS +"\nnilai EAS (40%)   :" + NEAS +"\nnilai akhir  :" + Ntotal);


    }
}
