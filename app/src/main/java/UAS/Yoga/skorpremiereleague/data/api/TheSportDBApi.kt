package UAS.Yoga.skorpremiereleague.data.api

object TheSportDBApi {
    const val BASE_URL = "https://www.thesportsdb.com/"
    const val TSDB_API_KEY = "1"

    fun getEvent(league: String?, event: String?): String{
        return BASE_URL + "api/v1/json/${TSDB_API_KEY}" + "/"+event+".php?id="+league
    }

    fun getEventDetail(eventId: String?): String{
        return BASE_URL + "api/v1/json/${TSDB_API_KEY}" + "/lookupevent.php?id="+eventId
    }


}