# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengelola data Ustad menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, Id Santri, asal dan Tahun Lulus, dan memberikan output berupa menu untuk menambah data santri dan menampilkan data santri.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Main`, `Ustad`, dan `Santri` adalah contoh dari class.

```bash
public class Main {
    ...
}


public class Ustad {
    ...
}

public class Santri extends Ustad {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarSantri[indeks] = new Santri(nama, idSantri, asal, tahunLulus);` adalah contoh pembuatan object.

```bash
daftarSantri[indeks] = new Santri(nama, idSantri, asal, tahunLulus);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `asal` dan `tahunLulus` adalah contoh atribut.

```bash
    private String asal;
    private int tahunLulus;
    
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Ustad` dan `Orang`.

```bash
 public Ustad (String asal, int tahunLulus) {
        this.asal = asal;
        this.tahunLulus = tahunLulus;
}

 public Santri(String nama, int idSantri, String asal, int tahunLulus) {
         super(asal, tahunLulus);
         this.nama = nama;
        this.idSantri = idSantri;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setIdSantri` adalah contoh method mutator.

```bash
 public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdSantri(int idSantri) {
        this.idSantri = idSantri;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama` dan `getIdSantri` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

    public int getIdSantri() {
        return idSantri;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `idSantri` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int idSantri;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Santri` mewarisi `Ustad` dengan sintaks `extends`.

```bash
public class Santri extends Ustad {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayinfo()` di `Santri` merupakan override dari method `displayInfo()` di `Ustad`.

```bash
 public void displayinfo(){
       
         System.out.println ( "Asal : "+getAsal());
         System.out.println ( " Tahun lulus : "+getTahunLulus());
}

@Override
    public void displayinfo(){
        super.displayinfo();
         System.out.println ("Nama : "+getNama());
          System.out.println (" Id Santri : "+getIdSantri());
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `main` di kelas `Main`.

```bash
if (pilihanpengguna == 1) {
    ...
} else if (pilihanpengguna == 2) {
    ...
} else if (pilihanpengguna == 3) {
    ...
} else {
    ...
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan data.

```bash
for (Santri santri : daftarSantri) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
    ...
System.out.print("Masukkan nama santri \t: ");
String nama = scanner.nextLine();
    ...
System.out.println("Santri berhasil ditambahkan!");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Santri[] daftarSantri = new Santri[30];` adalah contoh penggunaan array.

```bash
Santri[] daftarSantri = new Santri[30];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    ...
} catch (Exception e) {
    System.out.println("Kesalahan : " + e);
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Addin Husnan Nadhari
NPM: 2210010037
