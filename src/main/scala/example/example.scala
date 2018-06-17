package example
import info.mukel.telegrambot4s.models._

object Hello extends App {
  
  //DwBot.run();
  new EchoBot( scala.util.Properties.envOrNone("BOT_TOKEN")).run();
}
