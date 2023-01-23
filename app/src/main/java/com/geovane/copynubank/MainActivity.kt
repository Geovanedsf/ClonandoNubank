package com.geovane.copynubank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.geovane.copynubank.Resource.AdapterPagamento
import com.geovane.copynubank.databinding.ActivityMainBinding
import com.geovane.copynubank.model.Pagamento

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private val listaPagamento: MutableList<Pagamento> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val recyclerIconesPagamento = binding.recyclerIconPagamento
        recyclerIconesPagamento.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerIconesPagamento.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this,listaPagamento)
        recyclerIconesPagamento.adapter = adapterPagamento
    }

    private fun listIconesPagamento(){
        val icone1 = Pagamento(R.drawable.ic_pix, "Área Pix")
        listaPagamento.add(icone1)

        val icone2 = Pagamento(R.drawable.barcode, "Pagar")
        listaPagamento.add(icone2)

        val icone3 = Pagamento(R.drawable.emprestimo, "Pegar Emprestado")
        listaPagamento.add(icone3)

        val icone4 = Pagamento(R.drawable.barcode, "Área Pix")
        listaPagamento.add(icone4)

        val icone5 = Pagamento(R.drawable.ic_pix, "Área Pix")
        listaPagamento.add(icone5)

        val icone6 = Pagamento(R.drawable.ic_pix, "Área Pix")
        listaPagamento.add(icone6)

        val icone7 = Pagamento(R.drawable.ic_pix, "Área Pix")
        listaPagamento.add(icone7)

        val icone8 = Pagamento(R.drawable.ic_pix, "Área Pix")
        listaPagamento.add(icone8)
    }
}