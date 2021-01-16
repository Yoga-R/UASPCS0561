package UAS.Yoga.skorpremiereleague.ui.event

import com.google.gson.Gson
import UAS.Yoga.skorpremiereleague.data.api.ApiRepository
import UAS.Yoga.skorpremiereleague.data.api.TheSportDBApi
import UAS.Yoga.skorpremiereleague.data.model.EventResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class EventPresenter(private val view: EventView,
                     private val apiRepository: ApiRepository,
                     private val gson: Gson){
    fun getEventList(league: String?, event: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getEvent(league, event)),
                    EventResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showEventList(data.events)
            }
        }
    }
}
