package com.geovane.copynubank.Resource

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geovane.copynubank.databinding.ProdutoItemBinding
import com.geovane.copynubank.model.Produto

class AdapterProduto(private val context: Context, private val listaProdutos: MutableList<Produto>) :
    RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProdutoViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.txtInformativo.text = listaProdutos[position].text
    }

    override fun getItemCount() = listaProdutos.size

    class ProdutoViewHolder(binding: ProdutoItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val txtInformativo = binding.txtInformativo
    }
}