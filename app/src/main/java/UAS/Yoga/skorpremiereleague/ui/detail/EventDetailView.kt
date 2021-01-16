package UAS.Yoga.skorpremiereleague.ui.detail


import UAS.Yoga.skorpremiereleague.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}