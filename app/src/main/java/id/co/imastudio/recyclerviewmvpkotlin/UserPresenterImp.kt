package id.co.imastudio.recyclerviewmvpkotlin

import id.co.imastudio.recyclerviewmvpkotlin.model.Users

/**
 * Created by nandoseptianhusni on 2/17/18.
 */
class UserPresenterImp :UserPresenter {

    lateinit var userview : UserView

    constructor(userview: UserView) {
        this.userview = userview
    }


    override fun addList(nama: String, alamat: String) {
        //insert to model user
        var model = Users(nama, alamat)
        //deklrasi array
        var data : ArrayList<Users>? = null
        //add model ke array
        data?.add(model)

        userview.berhasil(data!!)



        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}