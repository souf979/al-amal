package ma.ofppt.ista.alamal

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.requestProfiling

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

//        val img= findViewById<ImageView>(R.id.imgLogo)
//        val txt= findViewById<TextView>(R.id.txtInfo)
//
//        img.setOnClickListener {
//            txt.text ="8 postes,Imprimante et scanner"
//        }


        //    var numcom=1
//    var prix=0
//    fun commanderCafe(v: View) {
//
//            numcom++
//            prix+=5
//            val txtCommande = findViewById<TextView>(R.id.txtCommande)
//            txtCommande.text = "Cafe Commander n°$numcom ($prix DH)"
//
//    }


//        val btnImprimer = findViewById<Button>(R.id.btnImprimer)
//        val txtPages = findViewById<TextView>(R.id.txtPages)
//        var prix =0
//        var numpage=0
//        btnImprimer.setOnClickListener {
//            prix+=2
//            numpage++
//            txtPages.text = "$numpage pages(s): $prix DH"
//        }
//        var numclient=0
//        val fabNouveau = findViewById<View>(R.id.fabNouveau)
//        fabNouveau.setOnClickListener {
//
//            numclient++
//            txtClients.text=" clients present :$numclient"
//    }
//        val btnEntrer = findViewById<Button>(R.id.btnEntrer)
//        val txtSalut = findViewById<TextView>(R.id.txtSalut)
//        val edtPrenom = findViewById<TextView>(R.id.edtPrenom)
//        btnEntrer.setOnClickListener {
//            if (edtPrenom.text.toString().trim().isNotEmpty())  {
//                txtSalut.text="Bienvenue ${edtPrenom.text}"
//
//
//            }else{
//                edtPrenom.error="Entrer votre prenom"
//            }
//
//        }
//        val fabNouveau = findViewById<View>(R.id.fabNouveau)
//        fabNouveau.setOnClickListener {
//
//            txtSalut.text=""
//            edtPrenom.text=null
//            edtPrenom.error=null
//
//        }



    }
}