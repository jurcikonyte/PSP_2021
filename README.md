// Gautų testų iš kito studento apžvalga

Kodas ir patys testai buvo aiškūs ir suprantami. Tačiau juose, mano atžvilgiu, trūko šiek tiek logikos.
Pagal EmailValidator testus reikėjo sukurti konkrečių domenų list’ą, kurie būtų legalūs. Taip tikrinti ir kažkur talpinti visus “gerus” domenus nėra labai optimalu. Manyčiau, pakaktų pasižiūrėti, ar domenas nėra per trumpas ir neturi neleistinų simbolių.
PhoneChecker testuose yra paduodamas tik tel. numeris. Galbūt būtų geriau leisti vartotojui paduoti daugiau informacijos, jei tai užsienietiškas numeris, nes kitu atveju - vėlgi reikia atskiros vietos laikyti šiai informacijai, kad būtų galima identifikuoti šalies prefix’ą ir ilgį.
Taip pat testus padaryčiau parametrizuotus, kadangi kai kurie nagrinėja tuos pačius atvejus. 
Pridėčiau: 
- EmailValidator testas tikrinantis, jog nėra dviejų ‘@‘ simbolių.
- EmailValidator testas tikrinantis, jog netiktų tušti emailai (pvz. “@gmail.com”).
