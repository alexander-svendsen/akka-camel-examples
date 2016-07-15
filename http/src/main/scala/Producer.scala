import akka.actor.Actor
import akka.actor.{ Props, ActorSystem }
import akka.camel.{ Producer, CamelMessage }
import akka.util.Timeout


class MyCustomProducer extends Actor with Producer {
  def endpointUri = "http://localhost:8080/news"
}