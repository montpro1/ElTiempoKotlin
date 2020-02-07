import org.jsoup.Jsoup
import org.jsoup.nodes.Document

object Tiempo {
    var doc  =
        Jsoup.connect(" https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get()
    var clima = doc.getElementsByClass("today_nowcard-phrase").first()

    var temperatura = doc.getElementsByClass("today_nowcard-temp").first()
    var titulo: String = doc.title()
var hoySaldraElSol = clima.text()
    var queTempHace= temperatura.text()





}





