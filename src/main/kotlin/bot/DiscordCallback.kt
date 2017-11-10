package bot

import com.google.common.util.concurrent.FutureCallback
import de.btobastian.javacord.DiscordAPI
import de.btobastian.javacord.listener.message.MessageCreateListener

class DiscordCallback(private val listener: MessageCreateListener) : FutureCallback<DiscordAPI> {
    override fun onSuccess(api: DiscordAPI?) {
        api?.registerListener(listener)
    }

    override fun onFailure(t: Throwable?) {
        // TODO: Make logging available, error handler is important too.
        t?.printStackTrace()
    }
}