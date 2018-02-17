package id.co.imastudio.recyclerviewmvpkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by nandoseptianhusni on 2/17/18.
 */
class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {

        var view = LayoutInflater.
                from(parent?.context).inflate(R.layout
                .recyclerview_item,parent,false)

    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }
}