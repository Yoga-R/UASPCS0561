package UAS.Yoga.skorpremiereleague.ui.favorite

import UAS.Yoga.skorpremiereleague.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}