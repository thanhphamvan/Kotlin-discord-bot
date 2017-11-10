package bot

import de.btobastian.javacord.DiscordAPI
import de.btobastian.javacord.Javacord

const val IS_BOT: Boolean = true

class DiscordBot(token: String, futureCallback: DiscordCallback) {

    private val api: DiscordAPI = Javacord.getApi(token, IS_BOT)

    init {
        this.api.connect(
            futureCallback
        )
    }
}
