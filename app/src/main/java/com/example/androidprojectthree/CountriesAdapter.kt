package com.example.androidprojectthree

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountriesAdapter(
    var countryNameList: ArrayList<String>,
    var detailsList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context): RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>()
 {

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var textViewCountryName: TextView = itemView.findViewById(R.id.countryName)
        var textViewDetails: TextView = itemView.findViewById(R.id.textView4)
        var ImageView: CircleImageView = itemView.findViewById(R.id.imageView)
        var cardView: CardView = itemView.findViewById(R.id.cardView)
    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
         val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_design, parent, false)

         return CountryViewHolder(view)
     }

     override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
         holder.textViewCountryName.text = countryNameList.get(position)
         holder.textViewDetails.text = detailsList.get(position)
         holder.ImageView.setImageResource(imageList.get(position))

         holder.cardView.setOnClickListener {
             Toast.makeText(context, "You selected the ${countryNameList.get(position)}", Toast.LENGTH_LONG).show()
         }


     }

     override fun getItemCount(): Int {
         return countryNameList.size
     }


 }