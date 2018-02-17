package id.co.imastudio.recyclerviewmvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.co.imastudio.recyclerviewmvpkotlin.model.Users

class MainActivity : AppCompatActivity(), UserView {


    //deklrasi variable
    lateinit var presenter: UserPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    private fun initView() {


    }

    private fun initPresenter() {
        presenter = UserPresenterImp(this)


    }
    override fun berhasil(data: ArrayList<Users>) {
        //masukkan ke adapter
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun noSuccess(pesan: String) {
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
