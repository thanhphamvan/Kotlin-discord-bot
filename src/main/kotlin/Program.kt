import bot.DiscordBot
import bot.DiscordCallback
import bot.DiscordMessageCreateListener

class Program(private val discordToken: String) {
    fun start() {
        DiscordBot(token = discordToken, futureCallback = DiscordCallback(listener = DiscordMessageCreateListener()))
    }
}

fun main(args: Array<String>) {
    Program("").start()
}