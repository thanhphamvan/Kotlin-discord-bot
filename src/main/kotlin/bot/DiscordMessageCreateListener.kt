package bot

import de.btobastian.javacord.DiscordAPI
import de.btobastian.javacord.entities.message.Message
import de.btobastian.javacord.listener.message.MessageCreateListener

class DiscordMessageCreateListener: MessageCreateListener {
    override fun onMessageCreate(api: DiscordAPI?, message: Message?) {
        if (message?.content?.equals("!ping", ignoreCase = true)!!) {
            message.reply("pong!")
        }
    }
}