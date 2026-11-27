package ma.ofppt.ista.alamal

import android.os.Bundle
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


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
        //etape 1 CHECKBOXES!!!!!!!!!!
//        val imp = findViewById<CheckBox>(R.id.chkImpression)
//        val cas = findViewById<CheckBox>(R.id.chkCasque)
//        val scan = findViewById<CheckBox>(R.id.chkScanner)
//        val btntotal = findViewById<Button>(R.id.btntotal)
//        val txtotal = findViewById<TextView>(R.id.txtotal)
//        btntotal.setOnClickListener {
//            var prix = 0
//            var option = 0
//            if (imp.isChecked) {
//                prix += 2
//                option++
//            }
//            if (cas.isChecked) {
//                prix += 2
//                option++
//            }
//            if (scan.isChecked) {
//                prix += 2
//                option++
//            }
//            txtotal.text = "$option option(s) $prix DH"


        //etape 2  RADIO BUTTONS
//        val grpForfait = findViewById<RadioGroup>(R.id.grpForfait)
//        val txtForfait = findViewById<TextView>(R.id.txtForfait)
//
//        grpForfait.setOnCheckedChangeListener { _, checkedId ->
//            when (checkedId) {
//                R.id.rad30 -> txtForfait.text = "Forfait 30 min : 6 DH"
//                R.id.rad60 -> txtForfait.text = "Forfait 1 heure : 10 DH"
//                R.id.rad120 -> txtForfait.text = "Forfait 2 heures : 18 DH"
//            }
//        }
        //etape 3 TOGGLE BUTTONS ET SWITCH

//        val tglClim = findViewById<ToggleButton>(R.id.tglClim)
//        val swSilence = findViewById<MaterialSwitch>(R.id.swSilence)
//        val txtEtat = findViewById<TextView>(R.id.txtEtat)
//
//        tglClim.setOnCheckedChangeListener { _, estActif ->
//            if (estActif) {
//                txtEtat.text = "Climatisation allumee"
//            } else {
//                txtEtat.text = "Climatisation eteinte"
//            }
//        }
//
//        swSilence.setOnCheckedChangeListener { _, estActif ->
//            if (estActif) {
//                txtEtat.text = "Mode silencieux active"
//            } else {
//                txtEtat.text = "Mode silencieux desactive"
//            }
//        }
        //etape 4 Spinner
//        val sp01 = findViewById<Spinner>(R.id.spPostes)
//        val txtPoste = findViewById<TextView>(R.id.txtPoste)
//        sp01.onItemSelectedListener=object :AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//
//            ) {
//                parent?.getItemAtPosition(position).toString()
//                txtPoste.text=parent?.getItemAtPosition(position).toString()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//
//
//        }
//           //00 acceder au elements par id
//        val sp02=findViewById<Spinner>(R.id.spPosteCode)
//        val txtpost02=findViewById<TextView>(R.id.txtPosteCode)
//           //01 liste des choix poste1 2 3
//        val postes= mutableListOf<String>("poste1","poste2","poste3")
//        val lstpostesFromRes=resources.getStringArray(R.array.s02_postes)
//           //02 adapter
//        val adaptateur1=ArrayAdapter(this,android.R.layout.simple_spinner_item,postes)
//        val adaptateur2=ArrayAdapter(this,android.R.layout.simple_spinner_item,lstpostesFromRes)
//           // utiliser ladaptateur dans le spinner
//        sp02.adapter=adaptateur1
//           // changer le text en fct du spinner
//        sp02.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                txtpost02.text=parent?.getItemAtPosition(position).toString()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                txtpost02.text="aucun poste choisi"
//            }
//
//
//        }
//        // on click listener dans le button vider la liste
//        val btnvider=findViewById<Button>(R.id.btnvalider)
//        btnvider.setOnClickListener {
//            adaptateur1.clear()
//        }
//        val textcontexte=findViewById<TextView>(R.id .poste3)
//        registerForContextMenu(textcontexte)
//        val txtresa = findViewById<TextView>(R.id.txtresa)
//        val txtaction = findViewById<TextView>(R.id.txtaction)
//        txtresa.setOnLongClickListener {
//            startSupportActionMode(classdecallback(txtresa, txtaction))
//            true
//        }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.s02_menu_principal, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        val t = findViewById<TextView>(R.id.txtmenu)
//        when (item.itemId) {
//            R.id.menu_tarifs -> t.text = "voilaa les tarifs"
//            R.id.menu_aide -> t.text = "appelez 0777777 pour laide"
//            R.id.menu_apropos -> t.text = "nous sommes cybercafe"
//
//
//        }
//        return true
//    }


//    override fun onCreateContextMenu(
//        menu: ContextMenu?,
//        v: View?,
//        menuInfo: ContextMenu.ContextMenuInfo?
//    ) {
//        menuInflater.inflate(R.menu.s02_menu_principal, menu)
//    }
//
//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        val textaff = findViewById<TextView>(R.id.txtcontexte)
//        when (item.itemId) {
//            R.id.poste_prolonger -> textaff.text = "prolonger"
//            R.id.poste_liberer -> textaff.text = "libere"
//
//        }
//        return true
//    }
//override fun onCreateContextMenu(
//    menu: ContextMenu?,
//    v: View?,
//    menuInfo: ContextMenu.ContextMenuInfo?
//) {
//    menuInflater.inflate(R.menu.menu_action, menu)
//
//}

//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        val textaff = findViewById<TextView>(R.id.txtresa)
//        when (item.itemId) {
//            R.id.action_partager -> textaff.text = "partager"
//            R.id.action_supprimer -> textaff.text = "supprimer"
//
//        }
//        return true
//    }
        val img = findViewById<ImageButton>(R.id.btnPlus)
        val txtimg = findViewById<TextView>(R.id.txtPopup)
        img.setOnClickListener { view ->
            // 2. Créer le PopupMenu rattaché à la vue cliquée
            val popup = PopupMenu(this, img)
            true

            // 3. Gonfler le menu XML (ex: menu_popup.xml)
            popup.menuInflater.inflate(R.menu.menupopup, popup.menu)


            // 4. Gérer le clic sur les options du popup
            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.popup_message -> {
                        txtimg.text = "Action : Envoyer un message"
                        true
                    }

                    R.id.popup_ticket -> {
                        txtimg.text = "Action : Imprimer le ticket"
                        true
                    }

                    else -> false
                }
            }

            // 5. Afficher le popup
            popup.show()
        }

    }

//    fun startActionMode(callback: Any) {
//        TODO("Not yet implemented")
//    }
//
//    class classdecallback(val txtresa: TextView, val txtaction: TextView) : ActionMode.Callback {
//        override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean {
//            txtaction.text = "vous avez choisi ${item?.title}"
//            mode?.finish()
//            return true
//        }
//
//        override fun onCreateActionMode(
//            mode: ActionMode?,
//            menu: Menu?
//        ): Boolean {
//            mode?.menuInflater?.inflate(R.menu.s02_menu_principal, menu)
//            return true
//        }
//
//        override fun onDestroyActionMode(mode: ActionMode?) {
//            return
//        }
//
//        override fun onPrepareActionMode(
//            mode: ActionMode?,
//            menu: Menu?
//        ): Boolean {
//            return false
//
//        }


}







