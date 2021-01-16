package UAS.Yoga.skorpremiereleague.ui.detail

import com.google.gson.Gson
import UAS.Yoga.skorpremiereleague.data.api.ApiRepository
import UAS.Yoga.skorpremiereleague.data.api.TheSportDBApi
import UAS.Yoga.skorpremiereleague.data.model.EventDetailResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class EventDetailPresenter(private val view: EventDetailView,
                           private val apiRepository: ApiRepository,
                           private val gson: Gson){

    fun getEventDetail(eventId: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getEventDetail(eventId)),
                    EventDetailResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showEventDetail(data.events)
            }
        }
    }
}