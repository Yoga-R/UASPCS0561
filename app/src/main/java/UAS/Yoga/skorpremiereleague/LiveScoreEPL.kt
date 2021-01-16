package UAS.Yoga.skorpremiereleague

import android.app.Application
import UAS.Yoga.skorpremiereleague.data.db.AppDatabase
import UAS.Yoga.skorpremiereleague.data.pref.PrefManager
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

class LiveScoreEPL : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@LiveScoreEPL))

    }

    companion object {
        @get:Synchronized
        lateinit var instance: LiveScoreEPL
        lateinit var prefManager: PrefManager
        lateinit var db: AppDatabase

    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        prefManager = PrefManager(this)
        db = AppDatabase(this)
    }
}