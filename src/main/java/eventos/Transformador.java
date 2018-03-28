package eventos;

import org.mule.api.annotations.ContainsTransformerMethods;
import org.mule.api.annotations.Transformer;
import org.mule.module.json.JsonData;

import eventos.EventoBitcoin;

// ver http://www.mulesoft.org/docs/site/current3/apidocs/org/mule/module/json/JsonData.html


@ContainsTransformerMethods
public class Transformador
{
	@Transformer  
	public EventoBitcoin JSONToEventoBitcoin(JsonData obj) throws Exception 
	{	  	  
		EventoBitcoin evento = new EventoBitcoin();
		
		evento.setNombre(obj.getAsString("[0]name"));
		evento.setPrecio(Float.parseFloat(obj.getAsString("[0]price_eur")));
		evento.setCambio1h(Float.parseFloat(obj.getAsString("[0]percent_change_1h")));
		evento.setCambio24h(Float.parseFloat(obj.getAsString("[0]percent_change_24h")));
		evento.setCambio7d(Float.parseFloat(obj.getAsString("[0]percent_change_7d")));
		
		return evento; 
	}
}