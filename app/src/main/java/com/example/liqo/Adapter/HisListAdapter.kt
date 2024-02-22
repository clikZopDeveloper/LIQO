package com.example.liqo.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.liqo.R
import com.example.liqo.Model.AllExpnesesImageBean
import com.example.liqo.Model.ContactListBean
import com.example.liqo.Model.CustmerTelecallerBean
import com.example.liqo.Model.CustomerDetailBean

import com.example.liqo.Utills.RvStatusClickListner
import com.stpl.antimatter.Utils.ApiContants


class HisListAdapter(var context: Activity, var list: List<CustomerDetailBean.Data.LeadHistory>, var rvClickListner: RvStatusClickListner) : RecyclerView.Adapter<HisListAdapter.MyViewHolder>()
     {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder { // infalte the item Layout
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_his_list, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setIsRecyclable(false)

   /*     holder.tvAdd.background = RoundView(context.resources.getColor(R.color.orange), RoundView.getRadius(20f))
        holder.tvQtyAdd.background = RoundView(context.resources.getColor(R.color.orange), RoundView.getRadius(100f))
        holder.tvQtyMinus.background = RoundView(context.resources.getColor(R.color.orange), RoundView.getRadius(100f))
        holder.tvQty.background = RoundView(Color.TRANSPARENT, RoundView.getRadius(20f), true, R.color.orange)
        holder.tvOff.background = RoundView(context.resources.getColor(R.color.orange), RoundView.getRadius(20f))
        holder.tvAdd.visibility = View.VISIBLE*/

        holder.tvStoreName.text = list[position].storeName
        holder.tvInterestedCat.text = list[position].interestedCategory


       // holder.ivImage.setImageDrawable(context.resources.getDrawable(list[position].drawableId))

      /*  if ("Retailer"=="Retailer"){
      //      holder.itemView.visibility=View.GONE
        }*/

   /*     Glide.with(context)
            .load(ApiContants.ImgBaseUrl+list[position].imgUrl)
            .into(holder.ivImage)*/

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        val tvStoreName: TextView = itemview.findViewById(R.id.tvStoreName)
        val tvInterestedCat: TextView = itemview.findViewById(R.id.tvInterestedCat)


    }

}