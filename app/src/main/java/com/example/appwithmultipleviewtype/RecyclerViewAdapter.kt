package com.example.appwithmultipleviewtype

import android.content.Context
import android.content.Intent
import android.provider.ContactsContract.Data
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.myapplication.FullScreenImage
import kotlin.random.Random

class RecyclerViewAdapter(private val  context: Context, private val  list: ArrayList<Dataclass>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    var index=0
    var index1=0
    var index2=0
    var index3=0
    var index4=0
//    val randomInt = Random.nextInt(0, 15)
   companion object
   {
       const val VIEW_TYPE_ONE = 1
       const val VIEW_TYPE_TWO = 2
       const val VIEW_TYPE_THREE = 3
       const val VIEW_TYPE_FOUR= 4
       const val VIEW_TYPE_FIVE = 5
   }
    private inner class View1ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var Image1 = itemView.findViewById<ImageView>(R.id.id1)
        var Image2 = itemView.findViewById<ImageView>(R.id.id2)
        var Image3 = itemView.findViewById<ImageView>(R.id.id3)
        var Image4 = itemView.findViewById<ImageView>(R.id.id4)

        fun bind(position: Int)
        {

            val recyclerViewModel=list[position]
            val loaderimager=recyclerViewModel.image[index]
            Glide.with(context)
                .load(loaderimager)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image1)
            Image1.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager)
                context.startActivity(intent)
            }
            index++
            val loaderimager1=recyclerViewModel.image[index]
            Glide.with(context)
                .load(loaderimager1)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image2)
            Image2.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager1)
                context.startActivity(intent)
            }
            index++
            val loaderimager2=recyclerViewModel.image[index]
            Glide.with(context)
                .load(loaderimager2)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image3)
            Image3.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager2)
                context.startActivity(intent)
            }
            index++
            val loaderimager3=recyclerViewModel.image[index]
            Glide.with(context)
                .load(loaderimager3)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image4)
            Image4.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager3)
                context.startActivity(intent)
            }
            index++

        }

    }
    private inner class View2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var Image1 = itemView.findViewById<ImageView>(R.id.rv2_id1)
        var Image2 = itemView.findViewById<ImageView>(R.id.rv2_id2)
        var Image3 = itemView.findViewById<ImageView>(R.id.rv2_id3)
        var Image4 = itemView.findViewById<ImageView>(R.id.rv2_id4)
        var Image5 = itemView.findViewById<ImageView>(R.id.rv2_id5)
        var Image6 = itemView.findViewById<ImageView>(R.id.rv2_id6)

        fun bind(position: Int)
        {

            val recyclerViewModel=list[position]
            val loaderimager=recyclerViewModel.image[index1]
            Glide.with(context)
                .load(loaderimager)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image1)
            Image1.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager)
                context.startActivity(intent)
            }
            index1++
            val loaderimager1=recyclerViewModel.image[index1]
            Glide.with(context)
                .load(loaderimager1)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image2)
            Image2.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager1)
                context.startActivity(intent)
            }
            index1++
            val loaderimager2=recyclerViewModel.image[index1]
            Glide.with(context)
                .load(loaderimager2)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image3)
            Image3.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager2)
                context.startActivity(intent)
            }
            index1++
            val loaderimager3=recyclerViewModel.image[index1]
            Glide.with(context)
                .load(loaderimager3)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image4)
            Image4.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager3)
                context.startActivity(intent)
            }
            index1++
            val loaderimager4=recyclerViewModel.image[index1]
            Glide.with(context)
                .load(loaderimager4)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image5)
            Image5.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager4)
                context.startActivity(intent)
            }
            index1++
            val loaderimager5=recyclerViewModel.image[index1]
            Glide.with(context)
                .load(loaderimager5)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image6)
            Image6.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager5)
                context.startActivity(intent)
            }
            index1++

        }
    }
    private inner class View3ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var Image1 = itemView.findViewById<ImageView>(R.id.rv3_id1)
        var Image2 = itemView.findViewById<ImageView>(R.id.rv3_id2)
        var Image3 = itemView.findViewById<ImageView>(R.id.rv3_id3)

        fun bind(position: Int)
        {
            val recyclerViewModel=list[position]
            val loaderimager=recyclerViewModel.image[index2]
            Glide.with(context)
                .load(loaderimager)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image1)
            Image1.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager)
                context.startActivity(intent)
            }
            index2++
            val loaderimager1=recyclerViewModel.image[index2]
            Glide.with(context)
                .load(loaderimager1)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image2)
            Image2.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager1)
                context.startActivity(intent)
            }
            index2++
            val loaderimager2=recyclerViewModel.image[index2]
            Glide.with(context)
                .load(loaderimager2)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image3)
            Image3.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager2)
                context.startActivity(intent)
            }
            index2++

        }
    }
    private inner class View4ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var Image1 = itemView.findViewById<ImageView>(R.id.rv4_id1)
        var Image2 = itemView.findViewById<ImageView>(R.id.rv4_id2)
        var Image3 = itemView.findViewById<ImageView>(R.id.rv4_id3)
        var Image4 = itemView.findViewById<ImageView>(R.id.rv4_id4)
        var Image5 = itemView.findViewById<ImageView>(R.id.rv4_id5)


        fun bind(position: Int)
        {
            val recyclerViewModel=list[position]
            val loaderimager=recyclerViewModel.image[index3]
            Glide.with(context)
                .load(loaderimager)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image1)
            Image1.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager)
                context.startActivity(intent)
            }
            index3++
            val loaderimager1=recyclerViewModel.image[index3]
            Glide.with(context)
                .load(loaderimager1)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image2)
            Image2.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager1)
                context.startActivity(intent)
            }
            index3++
            val loaderimager2=recyclerViewModel.image[index3]
            Glide.with(context)
                .load(loaderimager2)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image3)
            Image3.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager2)
                context.startActivity(intent)
            }
            index3++
            val loaderimager3=recyclerViewModel.image[index3]
            Glide.with(context)
                .load(loaderimager3)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image4)
            Image4.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager3)
                context.startActivity(intent)
            }
            index3++
            val loaderimager4=recyclerViewModel.image[index3]
            Glide.with(context)
                .load(loaderimager4)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image5)
            Image5.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager4)
                context.startActivity(intent)
            }
            index3++

        }
    }
    private inner class View5ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var Image1 = itemView.findViewById<ImageView>(R.id.rv5_id1)
        var Image2 = itemView.findViewById<ImageView>(R.id.rv5_id2)
        var Image3 = itemView.findViewById<ImageView>(R.id.rv5_id3)

        fun bind(position: Int)
        {
            val recyclerViewModel=list[position]
            val loaderimager=recyclerViewModel.image[index4]
            Glide.with(context)
                .load(loaderimager)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image1)
            Image1.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager)
                context.startActivity(intent)
            }
            index4++
            val loaderimager1=recyclerViewModel.image[index4]
            Glide.with(context)
                .load(loaderimager1)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image2)
            Image2.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager1)
                context.startActivity(intent)
            }
            index4++
            val loaderimager2=recyclerViewModel.image[index4]
            Glide.with(context)
                .load(loaderimager2)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(Image3)
            Image3.setOnClickListener{
                val intent = Intent(context, FullScreenImage::class.java)
                intent.putExtra("url", loaderimager2)
                context.startActivity(intent)
            }
            index4++

        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType) {
            VIEW_TYPE_ONE-> return View1ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_one,parent,false))
            VIEW_TYPE_TWO ->return View2ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_two,parent,false))
            VIEW_TYPE_THREE ->return View3ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_three,parent,false))
            VIEW_TYPE_FOUR ->return View4ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_four,parent,false))
            else ->return View5ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_five,parent,false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int){
        if(list[position].viewType==VIEW_TYPE_ONE)
        {
            (holder as? View1ViewHolder)?.bind(position)
        }
        else if (list[position].viewType== VIEW_TYPE_TWO)
        {
            (holder as? View2ViewHolder)?.bind(position)
        }
        else if (list[position].viewType== VIEW_TYPE_THREE)
        {
            (holder as? View3ViewHolder)?.bind(position)
        }
        else if (list[position].viewType== VIEW_TYPE_FOUR)
        {
            (holder as? View4ViewHolder)?.bind(position)
        }
        else if (list[position].viewType== VIEW_TYPE_FIVE)
        {
            (holder as? View5ViewHolder)?.bind(position)
        }

    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun getItemViewType(position: Int): Int {
//        return super.getItemViewType(position)
        return list[position].viewType
    }


}