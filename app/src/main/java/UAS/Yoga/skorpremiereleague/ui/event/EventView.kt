package UAS.Yoga.skorpremiereleague.ui.event

import UAS.Yoga.skorpremiereleague.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}