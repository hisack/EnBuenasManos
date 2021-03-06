package com.example.enbuenasmanos.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.enbuenasmanos.Model.Profesional
import com.example.enbuenasmanos.R
import com.example.enbuenasmanos.databinding.ListProfesionalItemBinding
import com.squareup.picasso.Picasso

class ProfesionalAdapter(private val profesionalItemsList: List<Profesional>) : RecyclerView.Adapter<ProfesionalAdapter.ProfesionalViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfesionalAdapter.ProfesionalViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_profesional_item, parent, false)
        return ProfesionalViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfesionalAdapter.ProfesionalViewHolder, position: Int) {
        val profesional: Profesional = profesionalItemsList[position]
        val item =  profesionalItemsList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = profesionalItemsList.size

    public class ProfesionalViewHolder(profesionalView: View) : RecyclerView.ViewHolder(profesionalView) {

        val binding = ListProfesionalItemBinding.bind(profesionalView)

        fun render(item : Profesional) {
            binding.txtTitulo.text = "usuario: "+item.nombre
            binding.txtDescripcion.text = "Tipo de usuario: "+item.tipo_user
            binding.txtCargoP.text = "Cargo: "+item.cargo
            binding.txtTelfP.text = "Teléfono: "+item.telf
            binding.txtDescP.text = item.descripcion
            Picasso.get().load(item.img).into(binding.imgNews1)
        }

    }
}

