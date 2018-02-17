package id.co.imastudio.recyclerviewmvpkotlin

import id.co.imastudio.recyclerviewmvpkotlin.model.Users

/**
 * Created by nandoseptianhusni on 2/17/18.
 */
interface UserView {


  fun berhasil(data : ArrayList<Users>)

    fun noSuccess(pesan : String)



}