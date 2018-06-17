package example
import info.mukel.telegrambot4s.api.TelegramBot

import info.mukel.telegrambot4s.api._
import info.mukel.telegrambot4s.methods._
import info.mukel.telegrambot4s.models._

// object DwBot extends TelegramBot with Polling with Commands {
//   // Use 'def' or 'lazy val' for the token, using a plain 'val' may/will
//   // lead to initialization order issues.
//   // Fetch the token from an environment variable or untracked file.

  
//   lazy val token = scala.util.Properties
//     .envOrNone("BOT_TOKEN")
//     .getOrElse(Source.fromFile("bot.token").getLines().mkString)
  
  
//   if(token.isEmpty){
//   throw new IllegalArgumentException("arg 1 was wrong...");
//   }
//   onCommand('hello) { 
//     implicit msg => reply("My token is SAFE!") }
// }
class EchoBot(token: String) extends ExampleBot(token) with Polling {

  override def receiveMessage(msg: Message): Unit = {
    
    for (text <- msg.text)
      request(SendMessage(msg.source, text.reverse))
  }
}
abstract class ExampleBot(val token: String) extends TelegramBot