package edu.pizaini.stack;

import java.util.Stack;

public class RunStack {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Ani", "Panam", "08018308101", 21);
        Mahasiswa mhs2 = new Mahasiswa("Budi", "Rumbai", "012039203902", 22);
        Mahasiswa mhs3 = new Mahasiswa("Caca", "Sukajadi", "09023423423", 23);

       Stack<Mahasiswa> stackMahasiswa = new Stack<>();
       /*
       push data 3 buah
        */
       stackMahasiswa.push(mhs1);
       stackMahasiswa.push(mhs2);
       stackMahasiswa.push(mhs3);
       // cek data
       lihatDataAntian(stackMahasiswa);


        while (!stackMahasiswa.isEmpty()) {
            Mahasiswa pop = stackMahasiswa.pop();
            System.out.println(pop.getNama());
        }

        //cek data di stack
        System.out.println("cek data stelah loop");
        lihatDataAntian(stackMahasiswa);
    }

    public static void lihatDataAntian(Stack<Mahasiswa> stack){
        for (Mahasiswa mahasiswa : stack) {
            System.out.print(mahasiswa.getNama()+" ");
        }
        System.out.println();
    }
}
