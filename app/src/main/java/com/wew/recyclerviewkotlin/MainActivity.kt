package com.wew.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kayalist = listOf<kaya>(
            kaya(
                R.drawable.elon,
                nameKaya = "Elon Musk",
                descKaya = "Elon Reeve Musk FRS adalah Pengusaha, penemu, dan tokoh bisnis dari Amerika Serikat. Ia merupakan pendiri, CTO, dan CEO SpaceX; CEO dan arsitek produksi Tesla, Inc.; pendiri The Boring Company; dan juga pendiri Neuralink dan OpenAI."
            ),
            kaya(
                R.drawable.bill,
                nameKaya = "Bill Gates",
                descKaya = "William Henry \"Bill\" Gates III adalah seorang tokoh bisnis, investor, filantropis, penulis asal Amerika Serikat, serta mantan CEO yang saat ini menjabat sebagai ketua Microsoft, perusahaan perangkat lunak yang ia dirikan bersama Paul Allen."
            ),
            kaya(
                R.drawable.bernard,
                nameKaya = "Bernard Arnault",
                descKaya = "Bernard Jean Étienne Arnault adalah seorang pebisnis dan kolektor seni asal Prancis. Ia merupakan chairman dan CEO dari LVMH Moët Hennessy – Louis Vuitton SE, LVMH, produsen barang mewah terbesar di dunia. Pada bulan April 2018, ia menjadi orang terkaya di industri mode, mengalahkan pemilik Zara, Amancio Ortega."
            ),
            kaya(
                R.drawable.ellison,
                nameKaya = "Larry Ellison",
                descKaya = "Lawrence Joseph Ellison adalah salah satu pendiri dan CEO dari perusahaan perangkat lunak database Oracle Corporation. Ellison memiliki bakat dalam matematika, dan pada masa mudanya bekerja untuk Perusahaan Ampex. Salah satu proyeknya adalah gudang data untuk CIA yang ia beri nama \"Oracle\"."
            ),
            kaya(
                R.drawable.jeff,
                nameKaya = "Jeff Bezos",
                descKaya = "Jeffrey Preston Bezos adalah Salah Satu Pengusaha terkaya di dunia. Ia adalah pendiri, ketua, CEO, presiden dan pemilik saham mayoritas perusahaan teknologi terbesar di dunia Amazon.com. Lulusan Universitas Princeton, Bezos pernah menjadi anggota Phi Beta Kappa, bekerja sebagai analis keuangan untuk D. E."
            ),kaya(
                R.drawable.larry,
                nameKaya = "Larry Page",
                descKaya = "Lawrence Edward Page adalah salah satu pendiri dari mesin pencari internet Google bersama Sergey Brin. Sejak 4 April 2011, ia menjabat sebagai Chief Executive Officer/CEO di Google Inc. menggantikan Eric Schmidt."
            ),kaya(
                R.drawable.mukesh,
                nameKaya = "Mukesh Ambani",
                descKaya = "Mukesh Ambani adalah seorang pengusaha dan milyader asal India. Ia menjabat sebagai pemimpin, direktur pengelola, dan pemilik saham terbesar di Reliance Industries, perusahaan swasta terbesar di India yang termasuk dalam perusahaan Fortune 500."
            ),
            kaya(
                R.drawable.steve,
                nameKaya = "Steve Ballmer",
                descKaya = "Steven Anthony Ballmer adalah seorang pengusaha asal Amerika Serikat yang menjabat sebagai CEO Microsoft Corporation dari bulan Januari 2000 hingga 4 Februari 2014."
            ),
            kaya(
                R.drawable.warren,
                nameKaya = "Warren Buffet",
                descKaya = "Warren Edward Buffett adalah seorang investor, pengusaha, dan filantropis asal Amerika Serikat. Buffett adalah komisaris, direktur utama, dan sekaligus pemegang saham terbesar di Berkshire Hathaway. Dia adalah orang terkaya ketiga di dunia tahun 2015 versi Forbes."
            ),
            kaya(
                R.drawable.mark,
                nameKaya = "Mark Zuckerberg",
                descKaya = "Mark Elliot Zuckerberg adalah seorang pemrogram komputer dan pengusaha Internet. Ia dikenal karena menciptakan situs jejaring sosial Facebook bersama temannya, yang dengan itu ia menjadi pejabat eksekutif dan presiden."
            ),


        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_kaya)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KayaAdapter(this, kayalist){
            val intent = Intent (this, DetailKayaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}