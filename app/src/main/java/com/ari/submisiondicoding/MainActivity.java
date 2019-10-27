package com.ari.submisiondicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {
    ListView list;
    Toolbar toolbar;
    ImageButton ibprofile;

    String[] namahewan = {
            "Ayam ",
            "Kambing ",
            "Sapi ",
            "Kuda ",
            "Katak dan Kodok",
            "Buaya ",
            "Banteng ",
            "Singa ",
            "Macan Tutul ",
            "Harimau "
    };

    String[] asalhewan ={
            "Ayam peliharaan (Gallus gallus domesticus) adalah unggas yang biasa dipelihara orang untuk dimanfaatkan untuk keperluan hidup pemeliharanya. ",
            "Kambing adalah hewan paling awal yang di ternakkan oleh manusia. Analisis genetik paling terkini mengesahkan bukti penelitian purbakala bahwa kambing gurun Bezoar dari Zagros di duga merupakan asal-usul hampir semua kambing ternak saat ini. ",
            "Di sejumlah tempat, sapi juga dipakai sebagai penggerak alat transportasi, pengolahan lahan tanam (bajak), dan alat industri lain (seperti peremas tebu). Karena banyak kegunaan ini, sapi telah menjadi bagian dari berbagai kebudayaan manusia sejak lama. ",
            "Kuda (Equus caballus atau Equus ferus caballus) adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus. ",
            "Katak dan Kodok adalah hewan Amfibia atau amfibi (Amphibia), umumnya didefinisikan sebagai hewan bertulang belakang (vertebrata) yang hidup di dua alam. ",
            "Buaya adalah adalah reptil bertubuh besar yang hidup di air. ",
            "Banteng adalah hewan yang sekerabat dengan sapi dan ditemukan di Myanmar, Thailand, Kamboja, Laos, Vietnam, Kalimantan, Jawa, dan Bali. Banteng dibawa ke Australia Utara pada masa kolonisasi Britania Raya pada tahun 1849 dan sampai sekarang masih lestari. ",
            "Singa (bahasa Sanskerta: Siṃha, atau dalam bahasa Latin: Panthera leo) adalah spesies hewan dari keluarga felidae atau jenis kucing. ",
            "Macan tutul (bahasa Latin: Panthera pardus) adalah salah satu dari empat kucing besar. Hewan ini dikenal juga dengan sebutan harimau dahan karena kemampuannya memanjat. ",
            "Harimau adalah jenis kucing terbesar dari spesiesnya, bahkan lebih besar dari singa. "
    };

    int[] gambarhewan = {
            R.drawable.ayam,
            R.drawable.kambing,
            R.drawable.sapi,
            R.drawable.kuda,
            R.drawable.kodok,
            R.drawable.buaya,
            R.drawable.banteng,
            R.drawable.singa,
            R.drawable.macan,
            R.drawable.harimau
    };

    String[] detailhewan ={
            "Ayam berasal dari domestikasi ayam hutan merah (ayam bangkiwa, Gallus gallus) yang hidup di India. Namun demikian, pengujian molekular menunjukkan kemungkinan sumbangan plasma nutfah dari G. sonneratii, karena ayam hutan merah tidak memiliki sifat kulit warna kuning yang menjadi salah satu ciri ayam peliharaan. Ayam menunjukkan perbedaan morfologi di antara kedua tipe kelamin (dimorfisme seksual). Ayam jantan (jago, rooster) lebih atraktif, berukuran lebih besar, memiliki jalu panjang, berjengger lebih besar, dan bulu ekornya panjang menjuntai. Ayam betina (babon, hen) relatif kecil, berukuran kecil, jalu pendek atau nyaris tidak kelihatan, berjengger kecil, dan bulu ekor pendek. Perkelaminan ini diatur oleh sistem hormon. Apabila terjadi gangguan pada fungsi fisiologi tubuhnya, ayam betina dapat berganti kelamin menjadi jantan karena ayam dewasa masih memiliki ovotestis yang dorman dan sewaktu-waktu dapat aktif. ",
            "Kaum petani Neolitik mulai menggembalakan kambing liar terutama untuk mudah memperoleh susu dan daging, di samping juga kotoran yang digunakan sebagai bahan api, tulang, bulu dan bahan tambahan untuk pakaian, bangunan dan peralatan. Peninggalan kambing ternak yang berasal dari 10,000 tahun yang lalu ditemukan di Ganj Dareh, Iran. Kerangka kambing dapat ditemui dalam jejak-jejak penelitian purbakala di Jericho, Choga Mami Djeitun dan Çayönü, membuktikan bahwa peternakan kambing di Asia Barat telah ada sejak antara 8000 hingga 9000 tahun yang lalu. ",
            "Sapi adalah hewan ternak anggota suku Bovidae dan anak suku Bovinae. Sapi yang telah dikebiri dan biasanya digunakan untuk membajak sawah dinamakan Lembu. Sapi dipelihara terutama untuk dimanfaatkan susu dan dagingnya sebagai pangan manusia. Hasil sampingannya seperti kulit, jeroan, tanduk, dan kotorannya juga dimanfaatkan untuk berbagai keperluan manusia. ",
            "Hewan ini telah lama merupakan salah satu hewan peliharaan yang penting secara ekonomis dan historis, dan telah memegang peranan penting dalam pengangkutan orang dan barang selama ribuan tahun. ",
            "Kodok dan katak mengawali hidupnya sebagai telur yang diletakkan induknya di air, di sarang busa, atau di tempat-tempat basah lainnya. Beberapa jenis kodok pegunungan menyimpan telurnya di antara lumut-lumut yang basah di pepohonan. Sementara jenis kodok hutan yang lain menitipkan telurnya di punggung kodok jantan yang lembap, yang akan selalu menjaga dan membawanya hingga menetas bahkan hingga menjadi kodok kecil.Sekali bertelur katak bisa menghasilkan 5000-20000 telur, tergantung dari kualitas induk dan berlangsung sebanyak tiga kali dalam setahun. ",
            "Buaya Secara ilmiah, buaya meliputi seluruh spesies anggota suku Crocodylidae, termasuk pula buaya sepit (Tomistoma schlegelii). Meski demikian nama ini dapat pula dikenakan secara longgar untuk menyebut ‘buaya’ aligator, kaiman dan gavial; yakni kerabat-kerabat buaya yang berlainan suku. ",
            "Banteng telah didomestikasi di beberapa daerah di Asia Tenggara dan Australia dan dikenal sebagai sapi bali. Hingga tahun 2009 diperkirakan jumlahnya di Indonesia mencapai sekitar 4,5 juta ekor. Banteng ternak dan liar dapat saling kawin dan keturunan yang dihasilkannya sering kali subur (fertil). Ada 11 provinsi utama yang memiliki populasi sapi Bali terbanyak. Populasi terbanyak di Sulawesi Selatan, Bali, NTT, NTB, Sumsel, Sultra, Gorontalo, Kalsel, Sulteng, Sulbar, dan Lampung. Sapi Bali merupakan sumberdaya genetik hewan asli Indonesia, karena kerabat liarnya ada di Indonesia. Sapi Bali merupakan sapi asli Indonesia yang ciri - cirinya khas dan berbeda dari bangsa sapi lainnya. ",
            "Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalm penangkaran memungkinkan lebih dari 20 tahun. ",
            "Pada mulanya, orang berpikiran bahwa macan tutul adalah hibrida dari singa dan harimau, sehingga muncul nama \"leopard\" di kalangan peneliti Eropa awal. Macan tutul jawa (P. p. melas) adalah fauna identitas Jawa Barat dan termasuk hewan yang terancam punah di Indonesia. ",
            "Harimau adalah kucing tercepat kedua dalam berlari, setelah citah. Dalam keseluruhan karnivora, harimau adalah kucing karnivora terbesar dan karnivora terbesar ketiga setelah beruang kutub dan beruang coklat. "

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list =findViewById(R.id.list_view);
        ListAdapter adapter = new ListAdapter(MainActivity.this, namahewan, gambarhewan, asalhewan);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("DataNama", namahewan[position]);
                pindah.putExtra("DataGambar", gambarhewan[position]);
                pindah.putExtra("DetailHewan", detailhewan[position]);
                pindah.putExtra("AsalHewan", asalhewan[position]);
                startActivity(pindah);
            }
        });

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ibprofile = findViewById(R.id.iv_toolbar);
        ibprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prof = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(prof);
            }
        });
    }
}
